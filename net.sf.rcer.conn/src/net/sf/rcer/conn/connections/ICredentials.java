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

/**
 * The data required to log on to a SAP R/3 system. At the moment, this consists of an {@link IConnection} 
 * object and the password. Note that this interface might change in the future if other logon mechanisms
 * (SSO, ...) are supported.
 * @author vwegert
 *
 */
public interface ICredentials {

	/**
	 * @return the ID of the actual connection. This ID should begin with the 
	 * {@link #getConnectionID() connection ID} and contain the actual client and user.
	 * @see IConnection#getConnectionID()
	 */
	public String getConnectionID();
	
	/**
	 * @return the connection data
	 */
	public IConnection getConnection();
	
	/**
	 * @return the actual password to use for logon
	 */
	public String getPassword();
	
}
