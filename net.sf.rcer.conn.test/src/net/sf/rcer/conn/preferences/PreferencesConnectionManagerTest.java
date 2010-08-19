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


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionData;
import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.locales.LocaleRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * Test case for the {@link PreferencesConnectionProvider}
 * @author vwegert
 *
 */
public class PreferencesConnectionManagerTest extends AbstractPreferencesConnectionTest {

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

		final PreferencesConnectionManager manager = PreferencesConnectionManager.getInstance();
		final String CONNECTION_DATA_ID = "1";

		final Set<String> connectionIDs = manager.getConnectionIDs();
		assertTrue("Direct connection ID is missing", 
				connectionIDs.contains(CONNECTION_DATA_ID));

		IConnectionData conn = manager.getConnectionData(CONNECTION_DATA_ID);
		assertNotNull("Direct connection is missing", conn);
		assertEquals("Connection ID of direct connection",      
				CONNECTION_DATA_ID, conn.getConnectionDataID());
		assertEquals("Description of direct connection", 
				DESCRIPTION, conn.getDescription());
		assertEquals("System ID of direct connection", 
				SYSTEM_ID, conn.getSystemID());
		assertTrue("Connection type of direct connection", 
				conn.isDirectConnection());
		assertEquals("Router of direct connection", 
				ROUTER, conn.getRouter());
		assertEquals("Application server of direct connection", 
				APP_SERVER, conn.getApplicationServer());
		assertEquals("System number of direct connection", 
				SYSTEM_NUMBER, conn.getSystemNumber());
		assertEquals("Default user of direct connection", 
				DEFAULT_USER, conn.getDefaultUser());
		assertTrue("Default user changeability of direct connection", 
				conn.isDefaultUserEditable());
		assertEquals("Default client of direct connection", 
				DEFAULT_CLIENT, conn.getDefaultClient());
		assertTrue("Default client changeability of direct connection",         
				conn.isDefaultClientEditable());
		assertEquals("Default locale of direct connection",  
				LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE), conn.getDefaultLocale());
		assertTrue("Default locale changeability of direct connection",         
				conn.isDefaultLocaleEditable());

	}

	/**
	 * Tests the load-balancing connection.
	 * @throws Exception
	 */
	@Test
	public void testLoadBalancingConnection() throws Exception {

		final PreferencesConnectionManager manager = PreferencesConnectionManager.getInstance();
		final String CONNECTION_DATA_ID = "2";

		final Set<String> connectionIDs = manager.getConnectionIDs();
		assertTrue("Load-balanced connection ID is missing", 
				connectionIDs.contains(CONNECTION_DATA_ID));

		IConnectionData conn = manager.getConnectionData(CONNECTION_DATA_ID);
		assertNotNull("Load-balanced connection is missing", conn);
		assertEquals("Connection ID of load-balanced connection", 
				CONNECTION_DATA_ID, conn.getConnectionDataID());
		assertEquals("Description of load-balanced connection", 
				DESCRIPTION, conn.getDescription());
		assertEquals("System ID of load-balanced connection", 
				SYSTEM_ID, conn.getSystemID());
		assertFalse("Connection type of load-balanced connection", 
				conn.isDirectConnection());
		assertEquals("Router of load-balanced connection", 
				ROUTER, conn.getRouter());
		assertEquals("Message server of load-balanced connection", 
				MSG_SERVER, conn.getMessageServer());
		assertEquals("Message server port of load-balanced connection", 
				MSG_SERVER_PORT, conn.getMessageServerPort());
		assertEquals("Load-balancing group of load-balanced connection", 
				LB_GROUP, conn.getLoadBalancingGroup());
		assertEquals("Default user of load-balanced connection", 
				DEFAULT_USER, conn.getDefaultUser());
		assertTrue("Default user changeability of load-balanced connection", 
				conn.isDefaultUserEditable());
		assertEquals("Default client of load-balanced connection", 
				DEFAULT_CLIENT, conn.getDefaultClient());
		assertTrue("Default client changeability of load-balanced connection",         
				conn.isDefaultClientEditable());
		assertEquals("Default locale of load-balanced connection",  
				LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE), conn.getDefaultLocale());
		assertTrue("Default locale changeability of load-balanced connection",         
				conn.isDefaultLocaleEditable());

	}

	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDNonNumeric() throws Exception {
		PreferencesConnectionManager.getInstance().getConnectionData("may_only_contain_numbers");
	}

	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDBelowZero() throws Exception {
		PreferencesConnectionManager.getInstance().getConnectionData("-1");
	}

	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDZero() throws Exception {
		PreferencesConnectionManager.getInstance().getConnectionData("0");
	}

	/**
	 * Tests whether an invalid connection ID is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionIDMaxExceeded() throws Exception {
		PreferencesConnectionManager.getInstance().getConnectionData("9999");
	}

	/**
	 * Tests whether a connection with an invalid type is handled correctly.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidConnectionInvalidType() throws Exception {
		PreferencesConnectionManager.getInstance().getConnectionData("4");
	}

	/**
	 * Tests whether a connection with an invalid locale is handled correctly (that is, whether the locale is ignored).
	 * @throws Exception
	 */
	@Test
	public void testInvalidConnectionInvalidLocale() throws Exception {
		IConnectionData conn = PreferencesConnectionManager.getInstance().getConnectionData("3");
		assertNotNull("Connection with invalid locale not loaded", conn);
		assertNull("Default locale should not be set", conn.getDefaultLocale());
	}

	/**
	 * Test whether the read method for all connections works.
	 * @throws Exception
	 */
	@Test
	public void testGetConnectionData() throws Exception {
		final Collection<ConnectionData> connections = PreferencesConnectionManager.getInstance().getConnectionData();
		assertEquals("Number of connections", 3, connections.size());
	}

	/**
	 * Test for {@link PreferencesConnectionManager#getConnectionIDs()}
	 * @throws Exception
	 */
	@Test
	public void testGetConnectionIDs() throws Exception {
		final Set<String> ids = PreferencesConnectionManager.getInstance().getConnectionIDs();
		for(int i = 1; i <= 4; i++) {
			assertTrue(MessageFormat.format("Connection {0} is missing.", i), ids.contains(Integer.toString(i)));
		}
	}

}
