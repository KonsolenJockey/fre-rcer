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

/**
 * This exception is thrown by the {@link ConnectionManager} if anything goes wrong when trying 
 * to establish a connection.
 * @author vwegert
 *
 */
public class ConnectionException extends Exception {

	/**
	 * Required for serialization.
	 */
	private static final long serialVersionUID = 4498437641819492219L;

	/**
	 * Default constructor.
	 * @param message
	 */
	public ConnectionException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 * @param message
	 * @param cause
	 */
	public ConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
