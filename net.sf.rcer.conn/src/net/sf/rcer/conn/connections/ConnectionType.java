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


import net.sf.rcer.conn.Messages;

/**
 * The connection type (direct or load balanced).
 * @author vwegert
 *
 */
public enum ConnectionType {

	/**
	 * Direct connection to an application server with application server address or name and system number.
	 */
	DIRECT, 

	/**
	 * Load-balanced connection using a message server (name or address and port) and the logon group.
	 */
	LOAD_BALANCED;

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		switch (this) {
		case DIRECT:
			return Messages.ConnectionType_Direct;
		case LOAD_BALANCED:
			return Messages.ConnectionType_LoadBalanced;
		default:
			return super.toString();
		}
	}

	/**
	 * @return the connection types available
	 */
	public static ConnectionType[] getValues() {
		return new ConnectionType[] { DIRECT, LOAD_BALANCED };
	}

	/**
	 * @return the strings describing the connection types available
	 */
	public static String[] getStrings() {
		return new String[] { DIRECT.toString(), LOAD_BALANCED.toString() };
	}
}
