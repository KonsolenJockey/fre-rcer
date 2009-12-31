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
 * Interface for an Observer that wants to be notified when the state of a connection changes.
 * @see ConnectionManager#addConnectionStateListener(IConnectionStateListener)
 * @see ConnectionManager#removeConnectionStateListener(IConnectionStateListener)
 * @author vwegert
 *
 */
public interface IConnectionStateListener {

	/**
	 * This method is called after a connection was activated successfully.
	 * @param connection
	 */
	public void connectionActivated(IConnection connection);
	
	/**
	 * This method is called after a connection was deactivated.
	 * @param connection
	 */
	public void connectionDeactivated(IConnection connection);
	
	/**
	 * This method is called after the primary connection has changed. 
	 * @param newPrimaryConnection the new primary connection, or <code>null</code> if no primary connection is active
	 */
	public void primaryConnectionChanged(IConnection newPrimaryConnection);
	
}
