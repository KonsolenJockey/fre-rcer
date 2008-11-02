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
package net.sf.rcer.conn.preferences;

import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.IConnectionProvider;

/**
 * A connection provider that accesses the preferences.
 * @author vwegert
 *
 */
public class PreferencesConnectionProvider implements IConnectionProvider {

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionProvider#getConnectionData(java.lang.String)
	 */
	public IConnectionData getConnectionData(String connectionID) throws ConnectionNotFoundException {
		return PreferencesConnectionManager.getInstance().getConnectionData(connectionID);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionProvider#getConnectionIDs()
	 */
	public Set<String> getConnectionIDs() {
		return PreferencesConnectionManager.getInstance().getConnectionIDs();
	}

}

