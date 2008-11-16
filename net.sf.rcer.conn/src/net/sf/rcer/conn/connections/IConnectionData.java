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
 * A set of connection data used to connect to a SAP R/3 system. Objects implementing this interface usually 
 * describe the way to connect to a SAP R/3 system. If you're looking for an established connection, 
 * see {@link IConnection}.
 * @see IConnection
 * @author vwegert
 *
 */
public interface IConnectionData {

	/**
	 * @return the ID of the connection data set. Note that this is <b>NOT</b> the ID of the actual connection.
	 */
	public String getConnectionDataID();

	/**
	 * @return the human-readable description of the system connection
	 */
	public String getDescription();

	/**
	 * @return the system ID (SID) of the SAP R/3 system
	 */
	public String getSystemID();

	/**
	 * @return the connection type. If a direct connection is used, 
	 *         an application server and a system number must be provided. If a messages server 
	 *         is used, the message server, the port and the group name must be provided.
	 */
	public ConnectionType getConnectionType();
	
	/**
	 * @return <code>true</code> if the connection is a direct connection, 
	 *         <code>false</code> if load balancing is used.  
	 * @see IConnectionData#getConnectionType()        
	 */
	public boolean isDirectConnection();

	/**
	 * @return <code>true</code> if load balancing is used, 
	 *         <code>false</code> if the connection is a direct connection.  
	 * @see IConnectionData#getConnectionType()        
	 */
	public boolean isLoadBalancedConnection();

	/**
	 * @return the SAP router string
	 */
	public String getRouter();

	/**
	 * @return the address or name of the application server to use for direct connections
	 */
	public String getApplicationServer();

	/**
	 * @return the system number to use for direct connections
	 */
	public int getSystemNumber();

	/**
	 * @return the address or name of the message server to use for load balancing
	 */
	public String getMessageServer();

	/**
	 * @return the port of the message server to use for load balancing
	 */
	public int getMessageServerPort();

	/**
	 * @return the name of the group used for load balancing
	 */
	public String getLoadBalancingGroup();

	/**
	 * @return the default user name to use for logon
	 */
	public String getDefaultUser();

	/**
	 * @return whether the user may change the default user name during logon
	 */
	public boolean isDefaultUserEditable();

	/**
	 * @return the default client to use for logon
	 */
	public String getDefaultClient();

	/**
	 * @return whether the user may change the default client during logon
	 */
	public boolean isDefaultClientEditable();

	/**
	 * @return the default locale to use during logon
	 */
	public Locale getDefaultLocale();

	/**
	 * @return whether the user may change the default locale during logon
	 */
	public boolean isDefaultLocaleEditable();

}