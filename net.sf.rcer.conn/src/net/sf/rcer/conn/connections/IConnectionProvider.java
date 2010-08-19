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
package net.sf.rcer.conn.connections;

import java.util.Set;

/**
 * @author vwegert
 *
 */
public interface IConnectionProvider {

	/**
	 * @return a list of all connection IDs currently known to this provider
	 */
	public Set<String> getConnectionIDs();
	
	/**
	 * @param connectionID the ID of the connection
	 * @return the connection corresponding to the connection ID requested
	 * @throws ConnectionNotFoundException 
	 */
	public IConnectionData getConnectionData(String connectionID) throws ConnectionNotFoundException;
	
}
