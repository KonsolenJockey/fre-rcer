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
package net.sf.rcer.conn.preferences;

/**
 * A collection of all constants used to access the plug-in preferences.
 * @author vwegert
 *
 */
public interface IPreferenceConstants {

	/**
	 * The preference used to store the number of registered connections.
	 */
	public static final String CONNECTION_NUMBER               = "connection.number"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the connection type. 
	 */
	public static final String CONNECTION_TYPE                 = "connection.type"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the connection description. 
	 */
	public static final String CONNECTION_DESCRIPTION          = "connection.description"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the system ID. 
	 */
	public static final String CONNECTION_SYSTEM_ID            = "connection.system_id"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the SAP router. 
	 */
	public static final String CONNECTION_ROUTER               = "connection.router"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the application server. 
	 */
	public static final String CONNECTION_APPLICATION_SERVER   = "connection.application_server"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the system number. 
	 */
	public static final String CONNECTION_SYSTEM_NUMBER        = "connection.system_number"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the message server. 
	 */
	public static final String CONNECTION_MESSAGE_SERVER       = "connection.message_server"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the message server port. 
	 */
	public static final String CONNECTION_MESSAGE_SERVER_PORT  = "connection.message_server_port"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the load balancing group. 
	 */
	public static final String CONNECTION_LOAD_BALANCING_GROUP = "connection.load_balancing_group"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the default user name. 
	 */
	public static final String CONNECTION_DEFAULT_USER         = "connection.default_user"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the default client. 
	 */
	public static final String CONNECTION_DEFAULT_CLIENT       = "connection.default_client"; //$NON-NLS-1$

	/**
	 * The preference prefix used to store the default locale. 
	 */
	public static final String CONNECTION_DEFAULT_LOCALE       = "connection.default_locale"; //$NON-NLS-1$

	/**
	 * A constant used to interpret the values of CONNECTION_TYPE.
	 */
	public static final String CONNECTION_TYPE_DIRECT          = "direct"; //$NON-NLS-1$

	/**
	 * A constant used to interpret the values of CONNECTION_TYPE.
	 */
	public static final String CONNECTION_TYPE_LOAD_BALANCING  = "load balancing"; //$NON-NLS-1$

}
