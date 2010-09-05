/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.preferences;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.IConnectionData;

import org.junit.Before;
import org.junit.Test;

/**
 * Test case for the {@link PreferencesConnectionProvider}
 * @author vwegert
 *
 */
public class PreferencesConnectionProviderTest extends AbstractPreferencesConnectionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		createTestConnections();
	}
	
	/**
	 * Tests the direct connection.
	 * @throws Exception
	 */
	@Test
	public void testDirectConnection() throws Exception {
		
		final ConnectionRegistry registry = ConnectionRegistry.getInstance();
		final String CONNECTION_DATA_ID = "net.sf.rcer.conn.preferences#1";
		
		final Set<String> connectionIDs = registry.getConnectionDataIDs();
		assertTrue("Direct connection ID is missing", 
				connectionIDs.contains(CONNECTION_DATA_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_DATA_ID);
		assertNotNull("Direct connection is missing", conn);
		checkDirectConnection(CONNECTION_DATA_ID, conn, true);
	}

	/**
	 * Tests the load-balancing connection.
	 * @throws Exception
	 */
	@Test
	public void testLoadBalancingConnection() throws Exception {
		
		final ConnectionRegistry registry = ConnectionRegistry.getInstance();
		final String CONNECTION_ID = "net.sf.rcer.conn.preferences#2";
		
		final Set<String> connectionIDs = registry.getConnectionDataIDs();
		assertTrue("Load-balanced connection ID is missing", 
				connectionIDs.contains(CONNECTION_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Load-balanced connection is missing", conn);
		checkLoadBalancedConnection(CONNECTION_ID, conn, true);
	}

	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDNonNumeric() throws Exception {
		ConnectionRegistry.getInstance().getConnectionData("net.sf.rcer.conn.preferences#may_only_contain_numbers");
	}
	
	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDBelowZero() throws Exception {
		ConnectionRegistry.getInstance().getConnectionData("net.sf.rcer.conn.preferences#-1");
	}
	
	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDMaxExceeded() throws Exception {
		ConnectionRegistry.getInstance().getConnectionData("net.sf.rcer.conn.preferences#9999");
	}
	
	/**
	 * Tests whether a connection with an invalid locale is handled correctly (that is, whether the locale is ignored).
	 * @throws Exception
	 */
	@Test
	public void testInvalidConnectionInvalidLocale() throws Exception {
		IConnectionData conn = ConnectionRegistry.getInstance().getConnectionData("net.sf.rcer.conn.preferences#3");
		assertNotNull("Connection with invalid locale not loaded", conn);
		assertNull("Default locale should not be set", conn.getDefaultLocale());
	}
	
	/**
	 * Tests whether a connection with an invalid type is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionInvalidType() throws Exception {
		ConnectionRegistry.getInstance().getConnectionData("net.sf.rcer.conn.preferences#4");
	}
	

}
