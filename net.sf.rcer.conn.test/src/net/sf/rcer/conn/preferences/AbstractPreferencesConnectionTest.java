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

import net.sf.rcer.conn.Activator;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.BackingStoreException;

/**
 * TODO Write documentation for type AbstractPreferencesConnectionTest.
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
	 * Creates the connection data in the preference store to test the components operating on this data.
	 * @throws BackingStoreException 
	 * @throws InterruptedException 
	 */
	protected void createTestConnections() throws BackingStoreException, InterruptedException {

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

}
