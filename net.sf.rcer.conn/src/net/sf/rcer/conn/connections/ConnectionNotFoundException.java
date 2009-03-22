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

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

/**
 * This exception occurs if an undefined connection is requested from the {@link ConnectionRegistry} 
 * or a {@link IConnectionProvider}. 
 * @author vwegert
 *
 */
public class ConnectionNotFoundException extends Exception {

	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = 7532339972059167377L;

	/**
	 * @param connectionID
	 */
	public ConnectionNotFoundException(String connectionID) {
		super(MessageFormat.format(Messages.ConnectionNotFoundException_Message, connectionID));
	}
	
	/**
	 * @param connectionID
	 * @param cause
	 */
	public ConnectionNotFoundException(String connectionID, Throwable cause) {
		super(MessageFormat.format(Messages.ConnectionNotFoundException_Message, connectionID), cause);
	}
	
}
