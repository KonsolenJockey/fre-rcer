/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Abstract superclass of {@link PreferencesConnectionManagerTest} and {@link PreferencesConnectionProviderTest}.
 * @author vwegert
 *
 */ 
public abstract class AbstractPreferencesConnectionTest implements IPreferenceConstants {

	protected final static String DESCRIPTION     = "Connection Description";
	protected final static String SYSTEM_ID       = "SID";
	protected final static String ROUTER          = "/H/foo/H/";
	protected final static String APP_SERVER      = "appserv1";
	protected final static int    SYSTEM_NUMBER   = 1;
	protected final static String MSG_SERVER      = "msgserv1";
	protected final static int    MSG_SERVER_PORT = 3456;
	protected final static String LB_GROUP        = "PUBLIC";
	protected final static String DEFAULT_USER    = "foo";
	protected final static String DEFAULT_CLIENT  = "123";
	protected final static String DEFAULT_LOCALE  = "DE";

	/**
	 * Removes all stored connections. 
	 * @throws BackingStoreException 
	 */
	protected void clearConnections() throws BackingStoreException {
		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);
		prefs.clear();
		prefs.flush();
	}

	/**
	 * Creates the connection data in the preference store to test the components operating on this data.
	 * @throws BackingStoreException 
	 * @throws InterruptedException 
	 */
	protected void createTestConnections() throws BackingStoreException {

		IEclipsePreferences prefs = new InstanceScope().getNode(Activator.PLUGIN_ID);

		// remove all connection preferences
		prefs.clear();

		prefs.putInt(CONNECTION_NUMBER, 4);

		// a valid direct connection
		prefs.put(CONNECTION_TYPE                 + ".1", CONNECTION_TYPE_DIRECT);
		prefs.put(CONNECTION_DESCRIPTION          + ".1", DESCRIPTION);
		prefs.put(CONNECTION_SYSTEM_ID            + ".1", SYSTEM_ID);
		prefs.put(CONNECTION_ROUTER               + ".1", ROUTER);
		prefs.put(CONNECTION_APPLICATION_SERVER   + ".1", APP_SERVER);
		prefs.putInt(CONNECTION_SYSTEM_NUMBER     + ".1", SYSTEM_NUMBER);
		prefs.put(CONNECTION_DEFAULT_USER         + ".1", DEFAULT_USER);
		prefs.put(CONNECTION_DEFAULT_CLIENT       + ".1", DEFAULT_CLIENT);
		prefs.put(CONNECTION_DEFAULT_LOCALE       + ".1", DEFAULT_LOCALE);

		// a valid load-balancing connection 
		prefs.put(CONNECTION_TYPE                   + ".2", CONNECTION_TYPE_LOAD_BALANCING);
		prefs.put(CONNECTION_DESCRIPTION            + ".2", DESCRIPTION);
		prefs.put(CONNECTION_SYSTEM_ID              + ".2", SYSTEM_ID);
		prefs.put(CONNECTION_ROUTER                 + ".2", ROUTER);
		prefs.put(CONNECTION_MESSAGE_SERVER         + ".2", MSG_SERVER);
		prefs.putInt(CONNECTION_MESSAGE_SERVER_PORT + ".2", MSG_SERVER_PORT);
		prefs.put(CONNECTION_LOAD_BALANCING_GROUP   + ".2", LB_GROUP);
		prefs.put(CONNECTION_DEFAULT_USER           + ".2", DEFAULT_USER);
		prefs.put(CONNECTION_DEFAULT_CLIENT         + ".2", DEFAULT_CLIENT);
		prefs.put(CONNECTION_DEFAULT_LOCALE         + ".2", DEFAULT_LOCALE);

		// a semi-valid connection (wrong default locale, should be ignored) 
		prefs.put(CONNECTION_TYPE                 + ".3", CONNECTION_TYPE_DIRECT);
		prefs.put(CONNECTION_DESCRIPTION          + ".3", DESCRIPTION);
		prefs.put(CONNECTION_SYSTEM_ID            + ".3", SYSTEM_ID);
		prefs.put(CONNECTION_ROUTER               + ".3", ROUTER);
		prefs.put(CONNECTION_APPLICATION_SERVER   + ".3", APP_SERVER);
		prefs.putInt(CONNECTION_SYSTEM_NUMBER     + ".3", SYSTEM_NUMBER);
		prefs.put(CONNECTION_DEFAULT_USER         + ".3", DEFAULT_USER);
		prefs.put(CONNECTION_DEFAULT_CLIENT       + ".3", DEFAULT_CLIENT);
		prefs.put(CONNECTION_DEFAULT_LOCALE       + ".3", "ZZZ_INVALID");

		// an invalid connection (invalid type) that should not be loaded
		prefs.put(CONNECTION_TYPE                 + ".4", "foobar");

		prefs.flush();
	}

	/**
	 * Checks whether the given connection data corresponds with the testing data of a direct connection.
	 * @param id
	 * @param connection
	 * @param checkUser
	 * @throws LocaleNotFoundException
	 */
	protected void checkDirectConnection(final String id, IConnectionData connection, boolean checkUser) throws LocaleNotFoundException {
		if (id != null) {
			assertEquals("Connection ID of direct connection",      
					id, connection.getConnectionDataID());
		}
		assertEquals("Description of direct connection", 
				DESCRIPTION, connection.getDescription());
		assertEquals("System ID of direct connection", 
				SYSTEM_ID, connection.getSystemID());
		assertTrue("Connection type of direct connection", 
				connection.isDirectConnection());
		assertEquals("Router of direct connection", 
				ROUTER, connection.getRouter());
		assertEquals("Application server of direct connection", 
				APP_SERVER, connection.getApplicationServer());
		assertEquals("System number of direct connection", 
				SYSTEM_NUMBER, connection.getSystemNumber());
		if (checkUser) {
			assertEquals("Default user of direct connection", 
					DEFAULT_USER, connection.getDefaultUser());
			assertTrue("Default user changeability of direct connection", 
					connection.isDefaultUserEditable());
			assertEquals("Default client of direct connection", 
					DEFAULT_CLIENT, connection.getDefaultClient());
			assertTrue("Default client changeability of direct connection",         
					connection.isDefaultClientEditable());
			assertEquals("Default locale of direct connection",  
					LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE), connection.getDefaultLocale());
			assertTrue("Default locale changeability of direct connection",         
					connection.isDefaultLocaleEditable());
		}
	}

	/**
	 * Checks whether the given connection data corresponds with the testing data of a load-balanced connection
	 * @param id
	 * @param connection
	 * @param checkUser
	 * @throws LocaleNotFoundException
	 */
	protected void checkLoadBalancedConnection(final String id, IConnectionData connection, boolean checkUser) throws LocaleNotFoundException {
		if (id != null) {
			assertEquals("Connection ID of load-balanced connection", 
					id, connection.getConnectionDataID());
		}
		assertEquals("Description of load-balanced connection", 
				DESCRIPTION, connection.getDescription());
		assertEquals("System ID of load-balanced connection", 
				SYSTEM_ID, connection.getSystemID());
		assertFalse("Connection type of load-balanced connection", 
				connection.isDirectConnection());
		assertEquals("Router of load-balanced connection", 
				ROUTER, connection.getRouter());
		assertEquals("Message server of load-balanced connection", 
				MSG_SERVER, connection.getMessageServer());
		assertEquals("Message server port of load-balanced connection", 
				MSG_SERVER_PORT, connection.getMessageServerPort());
		assertEquals("Load-balancing group of load-balanced connection", 
				LB_GROUP, connection.getLoadBalancingGroup());
		if (checkUser) {
			assertEquals("Default user of load-balanced connection", 
					DEFAULT_USER, connection.getDefaultUser());
			assertTrue("Default user changeability of load-balanced connection", 
					connection.isDefaultUserEditable());
			assertEquals("Default client of load-balanced connection", 
					DEFAULT_CLIENT, connection.getDefaultClient());
			assertTrue("Default client changeability of load-balanced connection",         
					connection.isDefaultClientEditable());
			assertEquals("Default locale of load-balanced connection",  
					LocaleRegistry.getInstance().getLocaleByISO(DEFAULT_LOCALE), connection.getDefaultLocale());
			assertTrue("Default locale changeability of load-balanced connection",         
					connection.isDefaultLocaleEditable());
		}
	}

}
