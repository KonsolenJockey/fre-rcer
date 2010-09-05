/**
 * Copyright (c) 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.tools;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.Messages;
import net.sf.rcer.conn.connections.ConnectionData;
import net.sf.rcer.conn.connections.IConnectionData;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

/**
 * A class to read the contents of the file <code>saplogon.ini</code>
 * as specified by SAP note 99435 and turn them into a set of 
 * {@link IConnectionData} objects.
 * 
 * @author vwegert
 *
 */
public class LogonIniReader {

	/**
	 * Section names within the INI file. Unused section names are commented out to prevent warnings.
	 */
	//	private static final String SECTION_CONFIGURATON        = "Configuration";
	//	private static final String SECTION_WINDOW_POSITION     = "MSWinPos";
	private static final String SECTION_ROUTER              = "Router"; //$NON-NLS-1$
	private static final String SECTION_ROUTER_2            = "Router2"; //$NON-NLS-1$
	private static final String SECTION_ROUTER_CHOICE       = "RouterChoice"; //$NON-NLS-1$
	private static final String SECTION_SERVER              = "Server"; //$NON-NLS-1$
	private static final String SECTION_SYSTEM_NUMBER       = "Database"; //$NON-NLS-1$
	private static final String SECTION_SYSTEM_TYPE         = "System"; //$NON-NLS-1$
	private static final String SECTION_DESCRIPTION         = "Description"; //$NON-NLS-1$
	//	private static final String SECTION_ADDRESS             = "Address";
	private static final String SECTION_SYSTEM_ID           = "MSSysName"; //$NON-NLS-1$
	private static final String SECTION_MSG_SERVER          = "MSSrvName"; //$NON-NLS-1$
	//	private static final String SECTION_SESSION_MANAGER_KEY = "SessManKey";
	//	private static final String SECTION_SNC_NAME            = "SncName";
	//	private static final String SECTION_SNC_CHOICE          = "SncChoice";
	//	private static final String SECTION_CODEPAGE            = "Codepage";
	//	private static final String SECTION_CODEPAGE_INDEX      = "CodepageIndex";
	private static final String SECTION_ORIGIN              = "Origin"; //$NON-NLS-1$
	//	private static final String SECTION_LAST_USED           = "MSLast";
	private static final String SECTION_MSG_SERVER_PORT     = "MSSrvPort"; //$NON-NLS-1$
	//	private static final String SECTION_LOW_SPEED           = "LowSpeedConnection";
	//	private static final String SECTION_UTF8_OFF            = "Utf8Off";
	//	private static final String SECTION_ENTRY_KEY           = "EntryKey";
	//	private static final String SECTION_ENCODING            = "EncodingID";
	//	private static final String SECTION_SHORTCUT_TYPE       = "ShortcutType";
	//	private static final String SECTION_SHORTCUT_STRING     = "ShortcutString";
	//	private static final String SECTION_SHORTCUT_TO         = "ShortcutTo";
	//	private static final String SECTION_SHORTCUT_BY         = "ShortcutBy";

	private SimpleIniFileParser parser;
	private List<IConnectionData> connections;
	private MultiStatus status;

	/**
	 * Reads and parses the contents of a SAPlogon.ini file given via an {@link InputStream}.
	 * @param stream
	 */
	public LogonIniReader(InputStream stream) {
		status = new MultiStatus(Activator.PLUGIN_ID, 0, Messages.LogonIniReader_ResultHeaderMessage, null);

		try {
			parser = new SimpleIniFileParser(stream);
		} catch (IniFileFormatException e) {
			status.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
			return;
		} catch (IOException e) {
			status.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
			return;
		}

		// ensure that the file contains the required sections
		checkSection(SECTION_DESCRIPTION);
		checkSection(SECTION_ORIGIN);
		checkSection(SECTION_SERVER);
		checkSection(SECTION_SYSTEM_TYPE);
		checkSection(SECTION_SYSTEM_NUMBER);
		checkSection(SECTION_SYSTEM_ID);
		checkSection(SECTION_MSG_SERVER);
		// Address, Router, RouterChoice and Router2 are optional sections and therefore not checked

		if (status.isOK()) {
			// now parse the contents
			final Set<String> keys = parser.getKeys(SECTION_SERVER);
			connections = new ArrayList<IConnectionData>(keys.size());
			for (final String key: keys) {
				IConnectionData conn = readConnection(key);
				if (conn != null) {
					connections.add(conn);
				}
			}
		}
	}

	/**
	 * Checks whether a certain section exists. 
	 * @param section
	 */
	private void checkSection(String section) {
		if (!parser.sectionExists(section)) {
			status.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, MessageFormat.format(Messages.LogonIniReader_SectionMissingError, section)));
		}		
	}

	/**
	 * Parses a set of connection data identified by the common key. 
	 * @param key
	 * @return the connection data or <code>null</code> if the data could not be parsed.
	 */
	private IConnectionData readConnection(String key) {

		final String description = parser.keyExists(SECTION_DESCRIPTION, key) ? parser.getValue(SECTION_DESCRIPTION, key) : Messages.LogonIniReader_DefaultDescription;

		// only R/3 systems are supported
		if (!parser.getValue(SECTION_SYSTEM_TYPE, key).equals("3")) { //$NON-NLS-1$
			status.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, MessageFormat.format(Messages.LogonIniReader_NoR3ConnectionError, key,
					description)));
			return null;
		}


		// determine the system number
		final String systemNumberString = parser.getValue(SECTION_SYSTEM_NUMBER, key);
		int systemNumber = -1; 
		if ((systemNumberString == null) || (systemNumberString.isEmpty())) {
			status.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, MessageFormat.format(
					Messages.LogonIniReader_MissingSystemNumberError, key,
					description)));
			return null;
		}
		try {
			systemNumber = Integer.parseInt(systemNumberString);
		} catch (NumberFormatException e1) {
			status.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, MessageFormat.format(
					Messages.LogonIniReader_InvalidSystemNumberError, key,
					description, systemNumberString)));
			return null;
		}


		// set the common properties
		ConnectionData connection = new ConnectionData();
		connection.setConnectionDataID(key);
		connection.setDescription(description);
		connection.setSystemID(parser.getValue(SECTION_SYSTEM_ID, key));
		connection.setSystemNumber(systemNumber);
		connection.setRouter(parser.getValue(SECTION_ROUTER, key));

		// determine the connection type
		final String origin = parser.getValue(SECTION_ORIGIN, key);
		if (origin.equalsIgnoreCase("MS_SEL_GROUPS")) { //$NON-NLS-1$
			// load-balanced connection

			// try to determine the message server port
			// see also http://www.sdn.sap.com/irj/scn/go/portal/prtroot/docs/library/uuid/4e515a43-0e01-0010-2da1-9bcc452c280b
			int port;
			try {
				port = Integer.parseInt(parser.getValue(SECTION_MSG_SERVER_PORT, key));
			} catch (Exception e) {
				port = 3600 + systemNumber;
			}

			connection.setLoadBalancingConnection(parser.getValue(SECTION_MSG_SERVER, key), 
					port, parser.getValue(SECTION_SERVER, key));

			if (parser.getValue(SECTION_ROUTER_CHOICE, key).equals("1")) { //$NON-NLS-1$
				final String router2 = parser.getValue(SECTION_ROUTER_2, key);
				if ((router2 != null) && !(router2.isEmpty())) {
					connection.setRouter(router2);
				}
			}
		} else if (origin.equalsIgnoreCase("MS_SEL_SERVER") || origin.equalsIgnoreCase("USEREDIT")) { //$NON-NLS-1$ //$NON-NLS-2$
			// direct connection
			connection.setDirectConnection(parser.getValue(SECTION_SERVER, key), systemNumber);
		} else {
			status.add(new Status(IStatus.WARNING, Activator.PLUGIN_ID, MessageFormat.format(
					Messages.LogonIniReader_UnknownOriginError, key, description, origin)));
			return null;
		}

		return connection;
	}

	/**
	 * @return the connections 
	 */
	public List<IConnectionData> getConnections() {
		return Collections.unmodifiableList(connections);
	}

	/**
	 * @return the status
	 */
	public IStatus getStatus() {
		return status;
	}

}
