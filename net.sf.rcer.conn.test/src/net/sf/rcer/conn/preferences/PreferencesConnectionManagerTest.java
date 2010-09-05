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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.connections.ConnectionData;
import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.junit.Before;
import org.junit.Test;
import org.osgi.service.prefs.BackingStoreException;

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
		checkDirectConnection(CONNECTION_DATA_ID, conn, true);
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
		checkLoadBalancedConnection(CONNECTION_DATA_ID, conn, true);
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
	
	/**
	 * Tests whether the {@link PreferencesConnectionManager} correctly handles external changes to the 
	 * preferences store.
	 * @throws BackingStoreException 
	 */
	@Test
	public void testPreferencesSynchronisation() throws BackingStoreException {
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		assertEquals("Initial number of connections", 3, pcm.getConnectionData().size());
		clearConnections();
		assertEquals("Number of connections after external change", 0, pcm.getConnectionData().size());
	}
	
	/**
	 * TODO Write documentation for method. 
	 * @throws BackingStoreException 
	 * @throws LocaleNotFoundException 
	 * @throws ConnectionNotFoundException 
	 */
	@Test
	public void testSavePreferences() throws BackingStoreException, LocaleNotFoundException, ConnectionNotFoundException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		
		// try to save an empty list
		pcm.saveConnectionData(new ArrayList<IConnectionData>());
		prefs.sync();
		assertEquals("Number of connections after saving an empty list", 0, prefs.getInt(CONNECTION_NUMBER, -1));
		
		// create the demo connections to store
		ArrayList<IConnectionData> demoConnections = new ArrayList<IConnectionData>(2);
		final String CONNECTION_ID_DIRECT = "1";
		ConnectionData demoConnection = new ConnectionData(CONNECTION_ID_DIRECT, DESCRIPTION, 
				SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER);
		demoConnection.setDefaultUser(DEFAULT_USER);
		demoConnection.setDefaultClient(DEFAULT_CLIENT);
		demoConnection.setDefaultLocale(LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE));
		demoConnections.add(demoConnection);
		final String CONNECTION_ID_LOAD_BALANCING = "2";
		demoConnection = new ConnectionData(CONNECTION_ID_LOAD_BALANCING, DESCRIPTION, 
				SYSTEM_ID, ROUTER, MSG_SERVER, MSG_SERVER_PORT, LB_GROUP);
		demoConnection.setDefaultUser(DEFAULT_USER);
		demoConnection.setDefaultClient(DEFAULT_CLIENT);
		demoConnection.setDefaultLocale(LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE));
		demoConnections.add(demoConnection);
		
		// try to save the connections
		pcm.saveConnectionData(demoConnections);
		prefs.sync();
		assertEquals("Number of connections after saving two connections", 2, prefs.getInt(CONNECTION_NUMBER, -1));

		// try to read the direct connection
		IConnectionData conn = pcm.getConnectionData(CONNECTION_ID_DIRECT);
		assertNotNull("Direct connection is missing", conn);
		checkDirectConnection(CONNECTION_ID_DIRECT, conn, true);

		// try to read the load-balanced connection
		conn = pcm.getConnectionData(CONNECTION_ID_LOAD_BALANCING);
		assertNotNull("Load-balanced connection is missing", conn);
		checkLoadBalancedConnection(CONNECTION_ID_LOAD_BALANCING, conn, true);
	}

	
	/**
	 * Tests whether the {@link PreferencesConnectionManager} is able to handle incoming non-numeric 
	 * connection IDs and assign a numeric id. 
	 * @throws BackingStoreException
	 * @throws LocaleNotFoundException
	 * @throws ConnectionNotFoundException
	 */
	@Test
	public void testConnectionIDHandlingNonNumeric() throws BackingStoreException, LocaleNotFoundException, ConnectionNotFoundException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		
		// first check what happens if a non-numeric connection ID is added
		ArrayList<IConnectionData> demoConnections = new ArrayList<IConnectionData>(2);
		final String CONNECTION_ID_DIRECT = "foo";
		demoConnections.add(new ConnectionData(CONNECTION_ID_DIRECT, DESCRIPTION, SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER));
		
		clearConnections();
		pcm.saveConnectionData(demoConnections);

		prefs.sync();
		assertEquals("Number of connections after saving", 1, prefs.getInt(CONNECTION_NUMBER, -1));

		// try to read the connection 
		assertEquals("Size of connection collection", 1, pcm.getConnectionData().size());
		IConnectionData conn = pcm.getConnectionData().iterator().next();
		checkDirectConnection(null, conn, false);
	}
	
	/**
	 * Tests whether the {@link PreferencesConnectionManager} is able to handle incoming negative 
	 * connection IDs and assign a numeric id. 
	 * @throws BackingStoreException
	 * @throws LocaleNotFoundException
	 * @throws ConnectionNotFoundException
	 */
	@Test
	public void testConnectionIDHandlingNegative() throws BackingStoreException, LocaleNotFoundException, ConnectionNotFoundException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		
		// first check what happens if a non-numeric connection ID is added
		ArrayList<IConnectionData> demoConnections = new ArrayList<IConnectionData>(2);
		final String CONNECTION_ID_DIRECT = "-42";
		demoConnections.add(new ConnectionData(CONNECTION_ID_DIRECT, DESCRIPTION, SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER));
		
		clearConnections();
		pcm.saveConnectionData(demoConnections);

		prefs.sync();
		assertEquals("Number of connections after saving", 1, prefs.getInt(CONNECTION_NUMBER, -1));

		// try to read the connection 
		assertEquals("Size of connection collection", 1, pcm.getConnectionData().size());
		IConnectionData conn = pcm.getConnectionData().iterator().next();
		checkDirectConnection(null, conn, false);
	}
	
	/**
	 * Tests whether the {@link PreferencesConnectionManager} is able to handle incoming numeric IDs with gaps
	 * and re-order them.
	 * @throws BackingStoreException
	 * @throws LocaleNotFoundException
	 * @throws ConnectionNotFoundException
	 */
	@Test
	public void testConnectionIDHandlingFragmented() throws BackingStoreException, LocaleNotFoundException, ConnectionNotFoundException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		
		ArrayList<IConnectionData> demoConnections = new ArrayList<IConnectionData>(2);
		final String CONNECTION_ID_DIRECT = "1";
		demoConnections.add(new ConnectionData(CONNECTION_ID_DIRECT, DESCRIPTION, SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER));
		final String CONNECTION_ID_LOAD_BALANCING = "3";
		demoConnections.add(new ConnectionData(CONNECTION_ID_LOAD_BALANCING, DESCRIPTION, SYSTEM_ID, ROUTER, MSG_SERVER, MSG_SERVER_PORT, LB_GROUP));
		clearConnections();
		pcm.saveConnectionData(demoConnections);

		prefs.sync();
		assertEquals("Number of connections after saving", 2, prefs.getInt(CONNECTION_NUMBER, -1));

		// try to read the connections 
		assertEquals("Size of connection collection", 2, pcm.getConnectionData().size());
		assertTrue("Connection ID 1 present", pcm.getConnectionIDs().contains("1"));
		assertTrue("Connection ID 2 present", pcm.getConnectionIDs().contains("2"));
	}
	
	/**
	 * Tests whether the {@link PreferencesConnectionManager} is able to handle duplicate incoming numeric IDs
	 * and re-order them.
	 * @throws BackingStoreException
	 * @throws LocaleNotFoundException
	 * @throws ConnectionNotFoundException
	 */
	@Test
	public void testConnectionIDHandlingDuplicate() throws BackingStoreException, LocaleNotFoundException, ConnectionNotFoundException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		PreferencesConnectionManager pcm = PreferencesConnectionManager.getInstance();
		
		ArrayList<IConnectionData> demoConnections = new ArrayList<IConnectionData>(2);
		final String CONNECTION_ID_DIRECT = "42";
		demoConnections.add(new ConnectionData(CONNECTION_ID_DIRECT, DESCRIPTION, SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER));
		final String CONNECTION_ID_LOAD_BALANCING = "42";
		demoConnections.add(new ConnectionData(CONNECTION_ID_LOAD_BALANCING, DESCRIPTION, SYSTEM_ID, ROUTER, MSG_SERVER, MSG_SERVER_PORT, LB_GROUP));
		clearConnections();
		pcm.saveConnectionData(demoConnections);

		prefs.sync();
		assertEquals("Number of connections after saving", 2, prefs.getInt(CONNECTION_NUMBER, -1));

		// try to read the connections 
		assertEquals("Size of connection collection", 2, pcm.getConnectionData().size());
		assertTrue("Connection ID 1 present", pcm.getConnectionIDs().contains("1"));
		assertTrue("Connection ID 2 present", pcm.getConnectionIDs().contains("2"));
	}
	
}
