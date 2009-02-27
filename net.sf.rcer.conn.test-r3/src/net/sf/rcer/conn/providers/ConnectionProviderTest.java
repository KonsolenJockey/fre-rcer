/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.providers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.test.provider.ConnectionProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test class to ensure that the {@link ConnectionProvider} works correctly.
 * @author vwegert
 *
 */
public class ConnectionProviderTest {

	private static final String CONNECTION_ID = ConnectionProvider.PROVIDER_ID + "#1";
	
	private ConnectionRegistry registry;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		registry = ConnectionRegistry.getInstance();
		assertNotNull(registry);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		registry = null;
	}

	/**
	 * Ensure that the provider exists. 
	 * @throws Exception
	 */
	@Test
	public void testProviderExists() throws Exception {
		assertTrue("Provider not registered", registry.getProviderIDs().contains(ConnectionProvider.PROVIDER_ID));
	}
	
	/**
	 * Ensure that the connection is hidden if required. 
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testConnectionHidden() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		registry.getConnectionData(CONNECTION_ID);
	}

	/**
	 * Ensure that the connection exists if required. 
	 * @throws Exception
	 */
	@Test
	public void testConnectionExists() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Connection not registered", conn);
		assertEquals("Connection ID", CONNECTION_ID, conn.getConnectionDataID());
		assertFalse("System ID should not be the dummy ID", conn.getSystemID().equals("DMY"));
		assertFalse("Application server should not be dummy", conn.getSystemID().equals("dummy"));
	}

	/**
	 * Ensure that the connection exists if required. 
	 * @throws Exception
	 */
	@Test
	public void testMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Connection not registered", conn);
		assertEquals("Connection ID", CONNECTION_ID, conn.getConnectionDataID());
		assertFalse("System ID should not be the dummy ID", conn.getSystemID().equals("DMY"));
		assertFalse("Application server should not be dummy", conn.getSystemID().equals("dummy"));
	}
	
}
