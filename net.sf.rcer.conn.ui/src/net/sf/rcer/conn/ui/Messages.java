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
	
	public static String ConnectionsPreferencePage_AddButton;
	public static String ConnectionsPreferencePage_ApplicationServerLabel;
	public static String ConnectionsPreferencePage_ClientLabel;
	public static String ConnectionsPreferencePage_ConnectionDataGroup;
	public static String ConnectionsPreferencePage_ConnectionTypeLabel;
	public static String ConnectionsPreferencePage_DeleteConfirmationText;
	public static String ConnectionsPreferencePage_DeleteConfirmationTitle;
	public static String ConnectionsPreferencePage_DescriptionEmptyError;
	public static String ConnectionsPreferencePage_DescriptionLabel;
	public static String ConnectionsPreferencePage_ImportButton;
	public static String ConnectionsPreferencePage_IntegerRangeValidator_NoIntegerError;
	public static String ConnectionsPreferencePage_IntegerRangeValidator_NotInRangeError;
	public static String ConnectionsPreferencePage_LocaleLabel;
	public static String ConnectionsPreferencePage_LogonDefaultsGroup;
	public static String ConnectionsPreferencePage_LogonGroupLabel;
	public static String ConnectionsPreferencePage_MessageServerLabel;
	public static String ConnectionsPreferencePage_MessageServerPortLabel;
	public static String ConnectionsPreferencePage_RemoveButton;
	public static String ConnectionsPreferencePage_RouterLabel;
	public static String ConnectionsPreferencePage_StringLengthValidator_NoStringError;
	public static String ConnectionsPreferencePage_StringLengthValidator_TooLongError;
	public static String ConnectionsPreferencePage_StringLengthValidator_TooShortError;
	public static String ConnectionsPreferencePage_SystemIDLabel;
	public static String ConnectionsPreferencePage_SystemIDValidator;
	public static String ConnectionsPreferencePage_SystemNumberLabel;
	public static String ConnectionsPreferencePage_SystemNumberValidator;
	public static String ConnectionsPreferencePage_UserLabel;
	public static String ConnectionStatusDisplay_ConnectionErrorMessage;
	public static String ConnectionStatusDisplay_ConnectItem;
	public static String ConnectionStatusDisplay_ConnectMenu;
	public static String ConnectionStatusDisplay_DisconnectItem;
	public static String ConnectionStatusDisplay_DisconnectMenu;
	public static String ConnectionStatusDisplay_DisplayFormat;
	public static String ConnectionStatusDisplay_DisplaySystemInformationItem;
	public static String ConnectionStatusDisplay_ErrorTitle;
	public static String ConnectionStatusDisplay_NoConnectionsAvailableItem;
	public static String ConnectionStatusDisplay_NotConnectedText;
	public static String ConnectionStatusDisplay_NotConnectedTooltip;
	public static String ConnectionStatusDisplay_SelectPrimaryConnectionItem;
	public static String LoginDialog_ClientLabel;
	public static String LoginDialog_ClientMissingError;
	public static String LoginDialog_ConnectionLabel;
	public static String LoginDialog_DialogTitle;
	public static String LoginDialog_LocaleLabel;
	public static String LoginDialog_PasswordLabel;
	public static String LoginDialog_PasswordMissingError;
	public static String LoginDialog_Title;
	public static String LoginDialog_UserLabel;
	public static String LoginDialog_UserMissingError;
	public static String TopLevelPreferencePage_Description;
	public static String TopLevelPreferencePage_JCoVersionLabel;
	public static String TracePreferencePage_ConnectionSettingsGroup;
	public static String TracePreferencePage_CPICTraceLevel0Description;
	public static String TracePreferencePage_CPICTraceLevel1Description;
	public static String TracePreferencePage_CPICTraceLevel2Description;
	public static String TracePreferencePage_CPICTraceLevel3Description;
	public static String TracePreferencePage_CPICTraceLevelLabel;
	public static String TracePreferencePage_EnableRFCTraceLabel;
	public static String TracePreferencePage_GlobalSettingsGroup;
	public static String TracePreferencePage_RFCTraceLevel0Description;
	public static String TracePreferencePage_RFCTraceLevel10Description;
	public static String TracePreferencePage_RFCTraceLevel1Description;
	public static String TracePreferencePage_RFCTraceLevel2Description;
	public static String TracePreferencePage_RFCTraceLevel3Description;
	public static String TracePreferencePage_RFCTraceLevel4Description;
	public static String TracePreferencePage_RFCTraceLevel5Description;
	public static String TracePreferencePage_RFCTraceLevel6Description;
	public static String TracePreferencePage_RFCTraceLevel7Description;
	public static String TracePreferencePage_RFCTraceLevel8Description;
	public static String TracePreferencePage_RFCTraceLevel9Description;
	public static String TracePreferencePage_RFCTraceLevelLabel;
	public static String TracePreferencePage_TracingHintsLabel;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// noting to do 
	}
}
