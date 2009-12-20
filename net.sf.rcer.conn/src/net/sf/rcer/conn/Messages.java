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
	
	public static String BAPIMessage_ErrorUnsupportedStructure;

	public static String BAPIMessages_ErrorUnsupportedStructure;

	public static String Connection_DefaultClientUnchangeableError;
	public static String Connection_DefaultLocaleUnchangeable;
	public static String Connection_DefaultUserUnchangeable;
	public static String Connection_LongStringFormat;
	public static String Connection_ShortStringFormat;
	
	public static String ConnectionData_InvalidMessageServerPortError;
	public static String ConnectionData_InvalidSystemNumberError;
	public static String ConnectionData_ParameterNotSupportedForBalancedError;
	public static String ConnectionData_ParameterNotSupportedForDirectError;
	public static String ConnectionData_StringFormat;
	
	public static String ConnectionManager_ConnectionDataNotFoundError;
	public static String ConnectionManager_ConnectionIDNullError;
	public static String ConnectionManager_ConnectionNotActiveError;
	public static String ConnectionManager_ConnectionProviderException;
	public static String ConnectionManager_ConnectionSelectionError;
	public static String ConnectionManager_ConnectionSelectionException;
	public static String ConnectionManager_CredentialsSelectionError;
	public static String ConnectionManager_CredentialsSelectionException;
	public static String ConnectionManager_InvalidCPICTraceLevelError;
	public static String ConnectionManager_InvalidRFCTraceLevelError;
	public static String ConnectionManager_LogonCancelled;
	
	public static String ConnectionNotFoundException_Message;
	
	public static String ConnectionRegistry_ConnectionRetrievalError;
	public static String ConnectionRegistry_InvalidConnectionIDError;
	public static String ConnectionRegistry_InvalidLocaleError;
	public static String ConnectionRegistry_InvalidMessageServerPortError;
	public static String ConnectionRegistry_InvalidSystemNumberError;
	public static String ConnectionRegistry_LoadConnectionProviderError;
	public static String ConnectionRegistry_ReplaceConnectionProviderError;
	
	public static String ConnectionType_Direct;
	public static String ConnectionType_LoadBalanced;
	public static String ConnectionType_UnsupportedValue;
	
	public static String DataType_ErrorInvalidDataType;
	
	public static String FieldNotFoundException_Message;
	
	public static String Locale_StringFormat;
	public static String Locale_UnsupportedClass;
	public static String Locale_UnsupportedStringValue;
	
	public static String LocaleRegistry_NoLocaleForInternalID;
	public static String LocaleRegistry_NoLocaleForISOCode;
	
	public static String PreferencesConnectionManager_ConnectionContainsErrors;
	public static String PreferencesConnectionManager_ConnectionIDNotNumeric;
	public static String PreferencesConnectionManager_ConnectionIDOutOfBounds;
	public static String PreferencesConnectionManager_InvalidConnectionType;
	public static String PreferencesConnectionManager_InvalidDefaultLocale;
	
	public static String ProviderNotFoundException_Message;
	
	public static String TableField_StringFormat;
	
	public static String TableReader_ResultTooLong;
	public static String TableReader_SelectionCriteriaTooLong;
	public static String TableReader_UnknownField;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}
}
