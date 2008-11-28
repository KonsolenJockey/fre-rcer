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

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.connections.Connection;
import net.sf.rcer.conn.connections.ConnectionData;
import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.Credentials;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.IConnectionProvider;
import net.sf.rcer.conn.connections.ICredentials;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

/**
 * A connection provider that reads the connection used for testing from a file.
 * @author vwegert
 *
 */
public class ConnectionProvider implements IConnectionProvider {

	/**
	 * The ID of the provider.
	 */
	public static final String PROVIDER_ID = "net.sf.rcer.conn.unitTestProvider";

	private static Map<String, ICredentials> allConnections = new TreeMap<String, ICredentials>(); 
	private static Map<String, ICredentials> activeConnections = new TreeMap<String, ICredentials>(); 

	static {
		Properties props = new Properties();
		try {
			props.load(FileLocator.openStream(Activator.getDefault().getBundle(), 
					new Path("connection.properties"), false));

			int i = 1;
			while (props.containsKey(MessageFormat.format("{0}.type", i))) {
				if (props.getProperty(MessageFormat.format("{0}.type", i)).equalsIgnoreCase("direct")) {
					ConnectionData connData = new ConnectionData(Integer.toString(i), 
							"JUnit Test Connection",
							props.getProperty(MessageFormat.format("{0}.system_id", i), "SID"),
							props.getProperty(MessageFormat.format("{0}.router", i), ""),
							props.getProperty(MessageFormat.format("{0}.application_server", i)), 
							Integer.parseInt(props.getProperty(MessageFormat.format("{0}.system_number", i), "0")));
					Connection conn = new Connection(connData);
					conn.setClient(props.getProperty(MessageFormat.format("{0}.client", i)));
					conn.setUserName(props.getProperty(MessageFormat.format("{0}.user", i)));
					Credentials cred = new Credentials(conn);
					cred.setPassword(props.getProperty(MessageFormat.format("{0}.password", i)));
					allConnections.put(Integer.toString(i), cred);
				} else {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					"Unknown connection type in properties file."));
				}
				i++;
			}
		} catch (Exception e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}
	
	/**
	 * Changes the number of active connections. If less than <code>connections</code> connections are available,
	 * the maximum number available is activated.  
	 * @param connections
	 * @return the actual number of connections.
	 */
	public static int setAvailableConnections(int connections) {
		activeConnections.clear();
		if (connections > allConnections.size()) {
			activeConnections.putAll(allConnections);
		} else {
			Iterator<String> it = allConnections.keySet().iterator();
			while (activeConnections.size() < connections) {
				final String key = it.next();
				activeConnections.put(key, allConnections.get(key));
			}
		}
		return activeConnections.size(); 
	}
	
	/**
	 * @param connectionID
	 * @return the credentials to use for the connection
	 */
	public static ICredentials getCredentials(String connectionID) {
		String id = connectionID;
		if (id.startsWith(PROVIDER_ID)) {
			id = id.substring(PROVIDER_ID.length() + 1);
		}
		return activeConnections.get(id);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionProvider#getConnectionData(java.lang.String)
	 */
	public IConnectionData getConnectionData(String connectionID) throws ConnectionNotFoundException {
		if (!activeConnections.containsKey(connectionID)) {
			throw new ConnectionNotFoundException(connectionID);
		}
		return activeConnections.get(connectionID).getConnection();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionProvider#getConnectionIDs()
	 */
	public Set<String> getConnectionIDs() {
		return activeConnections.keySet();
	}

}
