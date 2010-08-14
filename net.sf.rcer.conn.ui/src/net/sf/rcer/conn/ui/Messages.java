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
package net.sf.rcer.conn.ui;

import org.eclipse.osgi.util.NLS;

/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "net.sf.rcer.conn.ui.messages"; //$NON-NLS-1$
	
	/**
	 * Connect to {0}...
	 */
	public static String ConnectionStatusDisplay_ConnectItem;

	/**
	 * Connect
	 */
	public static String ConnectionStatusDisplay_ConnectMenu;

	/**
	 * Unable to connect to the SAP R/3 system.
	 */
	public static String ConnectionStatusDisplay_ConnectionErrorMessage;

	/**
	 * Disconnect from {0}
	 */
	public static String ConnectionStatusDisplay_DisconnectItem;

	/**
	 * Disconnect
	 */
	public static String ConnectionStatusDisplay_DisconnectMenu;

	/**
	 * \ \ {0}.{1}  
	 */
	public static String ConnectionStatusDisplay_DisplayFormat;

	/**
	 * Display System Information...
	 */
	public static String ConnectionStatusDisplay_DisplaySystemInformationItem;

	/**
	 * SAP R/3 Connection
	 */
	public static String ConnectionStatusDisplay_ErrorTitle;

	/**
	 * Unable to initialize RCER connection status display.
	 */
	public static String ConnectionStatusDisplay_InitializationError;

	/**
	 * JCo native library is missing
	 */
	public static String ConnectionStatusDisplay_LibraryMissingMessage;

	/**
	 * Connect: no connections available
	 */
	public static String ConnectionStatusDisplay_NoConnectionsAvailableItem;

	/**
	 * \ \ ---.---  
	 */
	public static String ConnectionStatusDisplay_NotConnectedText;

	/**
	 * not connected
	 */
	public static String ConnectionStatusDisplay_NotConnectedTooltip;

	/**
	 * Select Primary Connection
	 */
	public static String ConnectionStatusDisplay_SelectPrimaryConnectionItem;

	/**
	 * Add...
	 */
	public static String ConnectionsPreferencePage_AddButton;

	/**
	 * Application Server:
	 */
	public static String ConnectionsPreferencePage_ApplicationServerLabel;

	/**
	 * Client:
	 */
	public static String ConnectionsPreferencePage_ClientLabel;

	/**
	 * Connection Data
	 */
	public static String ConnectionsPreferencePage_ConnectionDataGroup;

	/**
	 * Connection Type:
	 */
	public static String ConnectionsPreferencePage_ConnectionTypeLabel;

	/**
	 * Do you want to delete the selected connection?
	 */
	public static String ConnectionsPreferencePage_DeleteConfirmationText;

	/**
	 * Delete Connection
	 */
	public static String ConnectionsPreferencePage_DeleteConfirmationTitle;

	/**
	 * Description may not be empty.
	 */
	public static String ConnectionsPreferencePage_DescriptionEmptyError;

	/**
	 * Description:
	 */
	public static String ConnectionsPreferencePage_DescriptionLabel;

	/**
	 * Import...
	 */
	public static String ConnectionsPreferencePage_ImportButton;

	/**
	 * Value is not an Integer
	 */
	public static String ConnectionsPreferencePage_IntegerRangeValidator_NoIntegerError;

	/**
	 * {0} must be between {1} and {2}.
	 */
	public static String ConnectionsPreferencePage_IntegerRangeValidator_NotInRangeError;

	/**
	 * Locale:
	 */
	public static String ConnectionsPreferencePage_LocaleLabel;

	/**
	 * Logon Defaults
	 */
	public static String ConnectionsPreferencePage_LogonDefaultsGroup;

	/**
	 * Logon Group:
	 */
	public static String ConnectionsPreferencePage_LogonGroupLabel;

	/**
	 * Message Server:
	 */
	public static String ConnectionsPreferencePage_MessageServerLabel;

	/**
	 * Message Server Port:
	 */
	public static String ConnectionsPreferencePage_MessageServerPortLabel;

	/**
	 * Remove...
	 */
	public static String ConnectionsPreferencePage_RemoveButton;

	/**
	 * Router:
	 */
	public static String ConnectionsPreferencePage_RouterLabel;

	/**
	 * Value is not a String
	 */
	public static String ConnectionsPreferencePage_StringLengthValidator_NoStringError;

	/**
	 * {0} may not exceed {1} characters.
	 */
	public static String ConnectionsPreferencePage_StringLengthValidator_TooLongError;

	/**
	 * {0} must be at least {1} characters.
	 */
	public static String ConnectionsPreferencePage_StringLengthValidator_TooShortError;

	/**
	 * System ID:
	 */
	public static String ConnectionsPreferencePage_SystemIDLabel;

	/**
	 * System ID
	 */
	public static String ConnectionsPreferencePage_SystemIDValidator;

	/**
	 * System Number:
	 */
	public static String ConnectionsPreferencePage_SystemNumberLabel;

	/**
	 * System Number
	 */
	public static String ConnectionsPreferencePage_SystemNumberValidator;

	/**
	 * User:
	 */
	public static String ConnectionsPreferencePage_UserLabel;

	/**
	 * Client:
	 */
	public static String LoginDialog_ClientLabel;

	/**
	 * Enter a client.
	 */
	public static String LoginDialog_ClientMissingError;

	/**
	 * Connection:
	 */
	public static String LoginDialog_ConnectionLabel;

	/**
	 * SAP R/3 Logon
	 */
	public static String LoginDialog_DialogTitle;

	/**
	 * Locale:
	 */
	public static String LoginDialog_LocaleLabel;

	/**
	 * Password:
	 */
	public static String LoginDialog_PasswordLabel;

	/**
	 * Enter a password.
	 */
	public static String LoginDialog_PasswordMissingError;

	/**
	 * Log on to the SAP R/3 system
	 */
	public static String LoginDialog_Title;

	/**
	 * User Name:
	 */
	public static String LoginDialog_UserLabel;

	/**
	 * Enter a user name.
	 */
	public static String LoginDialog_UserMissingError;

	/**
	 * Use the detail pages to set the preferences of the connector.
	 */
	public static String TopLevelPreferencePage_Description;

	/**
	 * JCo Version:
	 */
	public static String TopLevelPreferencePage_JCoVersionLabel;

	/**
	 * 0
	 */
	public static String TracePreferencePage_CPICTraceLevel0Description;

	/**
	 * 1
	 */
	public static String TracePreferencePage_CPICTraceLevel1Description;

	/**
	 * 2
	 */
	public static String TracePreferencePage_CPICTraceLevel2Description;

	/**
	 * 3
	 */
	public static String TracePreferencePage_CPICTraceLevel3Description;

	/**
	 * CPI-C Trace Level:
	 */
	public static String TracePreferencePage_CPICTraceLevelLabel;

	/**
	 * Connection-Level Settings
	 */
	public static String TracePreferencePage_ConnectionSettingsGroup;

	/**
	 * Enable RFC Trace
	 */
	public static String TracePreferencePage_EnableRFCTraceLabel;

	/**
	 * Global Settings
	 */
	public static String TracePreferencePage_GlobalSettingsGroup;

	/**
	 * 0 - nothing
	 */
	public static String TracePreferencePage_RFCTraceLevel0Description;

	/**
	 * 10
	 */
	public static String TracePreferencePage_RFCTraceLevel10Description;

	/**
	 * 1 - errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel1Description;

	/**
	 * 2 - execution path, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel2Description;

	/**
	 * 3 - full execution path, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel3Description;

	/**
	 * 4 - execution path, info messages, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel4Description;

	/**
	 * 5
	 */
	public static String TracePreferencePage_RFCTraceLevel5Description;

	/**
	 * 6 - full execution path, info messages, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel6Description;

	/**
	 * 7 - debug messages, full execution path, info messages, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel7Description;

	/**
	 * 8 - verbose debug messages, full execution path, info messages, errors and warnings
	 */
	public static String TracePreferencePage_RFCTraceLevel8Description;

	/**
	 * 9
	 */
	public static String TracePreferencePage_RFCTraceLevel9Description;

	/**
	 * RFC Trace Level:
	 */
	public static String TracePreferencePage_RFCTraceLevelLabel;

	/**
	 * Use the Error Log view to display the logged events. The trace levels are reset to their default values (errors and warnings only) when exiting the application.
	 */
	public static String TracePreferencePage_TracingHintsLabel;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// noting to do 
	}
}
