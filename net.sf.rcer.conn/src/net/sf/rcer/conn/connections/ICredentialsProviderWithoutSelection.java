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
 * An interface for a class that is able to provide logon credentials for a connection.
 * @author vwegert
 *
 */
public interface ICredentialsProviderWithoutSelection {

	/**
	 * Determines the credentials for the connection.
	 * @param connectionData
	 * @return the credentials, or <code>null</code> if the credentials can not be provided
	 */
	public ICredentials getCredentials(IConnectionData connectionData);

}
