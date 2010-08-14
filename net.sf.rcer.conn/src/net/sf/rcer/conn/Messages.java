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
package net.sf.rcer.conn;

import org.eclipse.osgi.util.NLS;

/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {

	private static final String BUNDLE_NAME = "net.sf.rcer.conn.messages"; //$NON-NLS-1$

	/**
	 * Unable to register or unregister the trace listener.
	 */
	public static String Activator_TraceListenerError;

	/**
	 * Unsupported structure {0} (expected BAPIRET2).
	 */
	public static String BAPIMessage_ErrorUnsupportedStructure;

	/**
	 * Unsupported structure {0} (expected BAPIRET2).
	 */
	public static String BAPIMessages_ErrorUnsupportedStructure;

	/**
	 * The default client may not be changed.
	 */
	public static String Connection_DefaultClientUnchangeableError;

	/**
	 * The default locale may not be changed.
	 */
	public static String Connection_DefaultLocaleUnchangeable;

	/**
	 * The default user name may not be changed.
	 */
	public static String Connection_DefaultUserUnchangeable;

	/**
	 * {0}.{1} {2} ({3})
	 */
	public static String Connection_LongStringFormat;

	/**
	 * {0} {1} ({2})
	 */
	public static String Connection_ShortStringFormat;

	/**
	 * Message server port must be 0..65535
	 */
	public static String ConnectionData_InvalidMessageServerPortError;

	/**
	 * System number must be 0..99.
	 */
	public static String ConnectionData_InvalidSystemNumberError;

	/**
	 * This parameter is only supported for load-balanced connections.
	 */
	public static String ConnectionData_ParameterNotSupportedForBalancedError;

	/**
	 * This parameter is only supported for direct connections.
	 */
	public static String ConnectionData_ParameterNotSupportedForDirectError;

	/**
	 * {0} - {1}
	 */
	public static String ConnectionData_StringFormat;

	/**
	 * Unable to find connection data.
	 */
	public static String ConnectionManager_ConnectionDataNotFoundError;

	/**
	 * The connection ID may not be null.
	 */
	public static String ConnectionManager_ConnectionIDNullError;

	/**
	 * The connection is invalid.
	 */
	public static String ConnectionManager_ConnectionInvalid;

	/**
	 * No connection with ID {0} is active.
	 */
	public static String ConnectionManager_ConnectionNotActiveError;

	/**
	 * Exception occurred trying to instantiate connection provider {0}.
	 */
	public static String ConnectionManager_ConnectionProviderException;

	/**
	 * Unable to select a connection and determine the credentials.
	 */
	public static String ConnectionManager_ConnectionSelectionError;

	/**
	 * Exception occurred trying to select a connection and determine the credentials.
	 */
	public static String ConnectionManager_ConnectionSelectionException;

	/**
	 * Unable to obtain the connection.
	 */
	public static String ConnectionManager_CredentialsError;

	/**
	 * Unable to determine the credentials for connection {0}.
	 */
	public static String ConnectionManager_CredentialsSelectionError;

	/**
	 * Exception occurred trying to determine the credentials for connection {0}.
	 */
	public static String ConnectionManager_CredentialsSelectionException;

	/**
	 * Invalid CPI-C trace level {0}. Valid values range from 0 to 3.
	 */
	public static String ConnectionManager_InvalidCPICTraceLevelError;

	/**
	 * Invalid global RFC trace level {0}. Valid values range from 0 to 10.
	 */
	public static String ConnectionManager_InvalidRFCTraceLevelError;

	/**
	 * Logon canceled by the user.
	 */
	public static String ConnectionManager_LogonCancelled;

	/**
	 * Primary connection is invalid.
	 */
	public static String ConnectionManager_PrimaryConnectionInvalid;

	/**
	 * No connection with ID {0} defined.
	 */
	public static String ConnectionNotFoundException_Message;

	/**
	 * Exception occurred retrieving details of connection {0}.
	 */
	public static String ConnectionRegistry_ConnectionRetrievalError;

	/**
	 * Attempt to retrieve connection with invalid ID {0}
	 */
	public static String ConnectionRegistry_InvalidConnectionIDError;

	/**
	 * Connection {0} contains an invalid default locale, ignoring it.
	 */
	public static String ConnectionRegistry_InvalidLocaleError;

	/**
	 * Connection {0} contains an invalid message server port ({1})
	 */
	public static String ConnectionRegistry_InvalidMessageServerPortError;

	/**
	 * Connection {0} contains an invalid system number ({1})
	 */
	public static String ConnectionRegistry_InvalidSystemNumberError;

	/**
	 * Unable to instantiate the connection provider {0} (implementation class {1})
	 */
	public static String ConnectionRegistry_LoadConnectionProviderError;

	/**
	 * Unable to replace the current implementation {0} of connection provider {1} with new implementation {2}
	 */
	public static String ConnectionRegistry_ReplaceConnectionProviderError;

	/**
	 * direct
	 */
	public static String ConnectionType_Direct;

	/**
	 * load-balanced
	 */
	public static String ConnectionType_LoadBalanced;

	/**
	 * Unsupported value {0}
	 */
	public static String ConnectionType_UnsupportedValue;

	/**
	 * ''{0}'' is not a valid data type.
	 */
	public static String DataType_ErrorInvalidDataType;

	/**
	 * No field named {0} exists in table {1}
	 */
	public static String FieldNotFoundException_Message;

	/**
	 * {0} ({1})
	 */
	public static String Locale_StringFormat;

	/**
	 * Unsupported class {0}
	 */
	public static String Locale_UnsupportedClass;

	/**
	 * Unsupported value {0}
	 */
	public static String Locale_UnsupportedStringValue;

	/**
	 * No SAP Locale for internal ID {0} defined.
	 */
	public static String LocaleRegistry_NoLocaleForInternalID;

	/**
	 * No SAP Locale for ISO code {0} defined.
	 */
	public static String LocaleRegistry_NoLocaleForISOCode;

	/**
	 * Connection {0} contains errors.
	 */
	public static String PreferencesConnectionManager_ConnectionContainsErrors;

	/**
	 * Unable to synchronize the preferences store. Connection data might be stale.
	 */
	public static String PreferencesConnectionManager_ConnectionDataStale;

	/**
	 * The connection ID {0} is not numeric.
	 */
	public static String PreferencesConnectionManager_ConnectionIDNotNumeric;

	/**
	 * The connection ID {0} exceeds the maximum number of stored connections (0..{1})
	 */
	public static String PreferencesConnectionManager_ConnectionIDOutOfBounds;

	/**
	 * Connection {0} contains an invalid connection type ({1})
	 */
	public static String PreferencesConnectionManager_InvalidConnectionType;

	/**
	 * Connection {0} contains an invalid default locale, ignoring it.
	 */
	public static String PreferencesConnectionManager_InvalidDefaultLocale;

	/**
	 * No connection provider with ID {0} defined.
	 */
	public static String ProviderNotFoundException_Message;

	/**
	 * {0}-{1} ({2})
	 */
	public static String TableField_StringFormat;

	/**
	 * The total length of the selected fields may not exceed 512 characters (limitation of RFC_READ_TABLE).
	 */
	public static String TableReader_ResultTooLong;

	/**
	 * The selection criteria may not exceed 72 characters per row (limitation of RFC_READ_TABLE).
	 */
	public static String TableReader_SelectionCriteriaTooLong;

	/**
	 * Unknown field {0} selected.
	 */
	public static String TableReader_UnknownField;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}
}
