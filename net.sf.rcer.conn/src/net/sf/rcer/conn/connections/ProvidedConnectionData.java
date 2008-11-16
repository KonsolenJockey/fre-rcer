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
package net.sf.rcer.conn.connections;

import net.sf.rcer.conn.locales.Locale;

/**
 * A wrapper for the connection data provided by a {@link IConnectionProvider} to ensure that
 * the provider ID is supplied with the connection ID.
 * @author vwegert
 *
 */
public class ProvidedConnectionData implements IConnectionData {

	/**
	 * The ID of the connection data provider.
	 */
	private String providerID;
	
	/**
	 * The wrapped connection. 
	 */
	private IConnectionData connectionData;

	/**
	 * @param providerID
	 * @param connection
	 */
	public ProvidedConnectionData(String providerID, IConnectionData connection) {
		super();
		this.providerID = providerID;
		this.connectionData = connection;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getApplicationServer()
	 */
	public String getApplicationServer() {
		return connectionData.getApplicationServer();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getConnectionDataID()
	 */
	public String getConnectionDataID() {
		return providerID + "#" + connectionData.getConnectionDataID();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultClient()
	 */
	public String getDefaultClient() {
		return connectionData.getDefaultClient();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultLocale()
	 */
	public Locale getDefaultLocale() {
		return connectionData.getDefaultLocale();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultUser()
	 */
	public String getDefaultUser() {
		return connectionData.getDefaultUser();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDescription()
	 */
	public String getDescription() {
		return connectionData.getDescription();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getLoadBalancingGroup()
	 */
	public String getLoadBalancingGroup() {
		return connectionData.getLoadBalancingGroup();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getMessageServer()
	 */
	public String getMessageServer() {
		return connectionData.getMessageServer();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getMessageServerPort()
	 */
	public int getMessageServerPort() {
		return connectionData.getMessageServerPort();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getRouter()
	 */
	public String getRouter() {
		return connectionData.getRouter();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getSystemID()
	 */
	public String getSystemID() {
		return connectionData.getSystemID();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getSystemNumber()
	 */
	public int getSystemNumber() {
		return connectionData.getSystemNumber();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultClientEditable()
	 */
	public boolean isDefaultClientEditable() {
		return connectionData.isDefaultClientEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultLocaleEditable()
	 */
	public boolean isDefaultLocaleEditable() {
		return connectionData.isDefaultLocaleEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultUserEditable()
	 */
	public boolean isDefaultUserEditable() {
		return connectionData.isDefaultUserEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDirectConnection()
	 */
	public boolean isDirectConnection() {
		return connectionData.isDirectConnection();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isLoadBalancedConnection()
	 */
	public boolean isLoadBalancedConnection() {
		return connectionData.isLoadBalancedConnection();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getConnectionType()
	 */
	public ConnectionType getConnectionType() {
		return connectionData.getConnectionType();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return connectionData.toString();
	}
	
}
