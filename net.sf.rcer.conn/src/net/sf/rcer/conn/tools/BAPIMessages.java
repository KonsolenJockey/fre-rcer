/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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

import java.text.MessageFormat;
import java.util.List;
import java.util.Vector;

import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.Messages;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;

import com.sap.conn.jco.JCoTable;

/**
 * A representation of a list of BAPIRET2 messages, a structure used by many standard
 * and customer function modules. An instance of this class represents an entire table of
 * of BAPIRET2 messages. For a single message, see {@link BAPIMessage}. This class also 
 * implements {@link IStatus} (in fact it's a {@link MultiStatus}) so that the BAPI 
 * messages can be re-used as status objects in the Eclipse environment.
 * 
 * @author vwegert
 *
 */
public class BAPIMessages extends MultiStatus {

	private List<BAPIMessage> messages = new Vector<BAPIMessage>();

	/**
	 * Default constructor to create an empty message list.
	 */
	public BAPIMessages() {
		super(Activator.PLUGIN_ID, 0, "", null);
	}
	
	/**
	 * Constructor to create BAPIMessages instance from a table of BAPIRET2 lines.
	 * @param pluginId the unique identifier of the relevant plug-in
	 * @param code the plug-in-specific status code
	 * @param message a human-readable message, localized to the current locale
	 * @param messageTable the BAPIRET2 message table
	 */
	public BAPIMessages(String pluginId, int code, String message, JCoTable messageTable) {
		
		super(pluginId, code, message, null);
		
		// ensure this is a BAPIRET2 table
		final String structureName = messageTable.getMetaData().getName(); 
		if (!structureName.equals("BAPIRET2")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
					MessageFormat.format(Messages.BAPIMessages_ErrorUnsupportedStructure, structureName));
		}

		// create the BAPIMessage instances
		if (!messageTable.isEmpty()) {
			messageTable.firstRow();
			do {
				add(new BAPIMessage(messageTable));
			} while (messageTable.nextRow());
		}
	}
	
	/**
	 * @return the messages table
	 */
	public List<BAPIMessage> getMessages() {
		return messages;
	}
	
	/**
	 * Creates a {@link BAPIMessages} instance from a JCo table. This method is used by the
	 * generated RFC mapping classes. 
	 * @param messageTable a {@link JCoTable} containing BAPIRET2 messages
	 * @return the corresponding {@link BAPIMessages} instance
	 */
	public static BAPIMessages fromTable(JCoTable messageTable) {
		return new BAPIMessages(Activator.PLUGIN_ID, 0, "", messageTable);
	}
	
	/**
	 * Transfers the contents of the message list to the JCo table. This method is used by the
	 * generated RFC mapping classes.
	 * @param messages the {@link BAPIMessages} instance containing the messages
	 * @param messageTable the {@link JCoTable} to fill
	 */
	public static void toTable(BAPIMessages messages, JCoTable messageTable) {
		messageTable.clear();
		for (final BAPIMessage message: messages.getMessages()) {
			messageTable.appendRow();
			message.toStructure(messageTable);
		}
	}
}
