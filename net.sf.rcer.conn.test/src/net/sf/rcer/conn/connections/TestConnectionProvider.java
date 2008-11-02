/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $$Id$$
 */
package net.sf.rcer.conn.connections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A connection provider for testing purposes.
 * @author vwegert
 *
 */
public class TestConnectionProvider implements IConnectionProvider {

	/**
	 * The IDs of the connections supplied by this provider.
	 */
	private static String CONNECTION_ID_1 = "CONN_DIRECT";
	private static String CONNECTION_ID_2 = "CONN_LOAD_BALANCED";
	
	/**
	 * The map of connections supplied by this provider.
	 */
	private Map<String, IConnectionData> connections;
	
	/**
	 * Default constructor.
	 */
	public TestConnectionProvider() {
		connections = new HashMap<String, IConnectionData>();
		connections.put(CONNECTION_ID_1, 
				new ConnectionData(CONNECTION_ID_1, "Direct Connection", 
						"S01", "router1", "appserv1", 01));
		connections.put(CONNECTION_ID_2, 
				new ConnectionData(CONNECTION_ID_2, "Load-Balancing Connection", 
						"S02", "router2", "messageserv2", 3456, "PUBLIC"));
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionProvider#getConnectionData(java.lang.String)
	 */
	public IConnectionData getConnectionData(String connectionID) throws ConnectionNotFoundException {
		if (!connections.containsKey(connectionID)) {
			throw new ConnectionNotFoundException(connectionID);
		}
		return connections.get(connectionID);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionProvider#getConnectionIDs()
	 */
	public Set<String> getConnectionIDs() {
		return connections.keySet();
	}

}
