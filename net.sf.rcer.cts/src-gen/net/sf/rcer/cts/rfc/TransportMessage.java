/*******************************************************************************
 * Copyright (c) 2010 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Volker Wegert <rcer@volker-wegert.de> - initial API and implementation
 *******************************************************************************/
 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure TR004.
 */
public class TransportMessage {

	private PropertyChangeSupport _pcs;

	private String messageID;
	private String messageType;
	private String messageNumber;
	private String text;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public TransportMessage() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public TransportMessage(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.messageID = source.getString("MSGID"); //$NON-NLS-1$
		this.messageType = source.getString("MSGTY"); //$NON-NLS-1$
		this.messageNumber = source.getString("MSGNO"); //$NON-NLS-1$
		this.text = source.getString("MSGTEXT"); //$NON-NLS-1$
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("MSGID", this.messageID); //$NON-NLS-1$
		targetStructure.setValue("MSGTY", this.messageType); //$NON-NLS-1$
		targetStructure.setValue("MSGNO", this.messageNumber); //$NON-NLS-1$
		targetStructure.setValue("MSGTEXT", this.text); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<TransportMessage> source, JCoTable destination) {
		destination.deleteAllRows();
		for (TransportMessage entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<TransportMessage> fromTable(JCoTable source) {
		List<TransportMessage> list = new ArrayList<TransportMessage>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new TransportMessage(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than TR004 is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("TR004")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected TR004).", structureName));
		}
	}
	
	/**
	 * @return the Message ID (TR004-MSGID)
	 */
	public String getMessageID() {
		return this.messageID;
	}
	
	/**
	 * Changes the Message ID (TR004-MSGID).
	 * @param newMessageID the new Message ID to set
	 */
	public void setMessageID(String newMessageID) {
		_pcs.firePropertyChange("messageID", this.messageID, newMessageID); //$NON-NLS-1$
		this.messageID = newMessageID;
	}
	
	/**
	 * @return the Message Type (E, I, W,...) (TR004-MSGTY)
	 */
	public String getMessageType() {
		return this.messageType;
	}
	
	/**
	 * Changes the Message Type (E, I, W,...) (TR004-MSGTY).
	 * @param newMessageType the new Message Type (E, I, W,...) to set
	 */
	public void setMessageType(String newMessageType) {
		_pcs.firePropertyChange("messageType", this.messageType, newMessageType); //$NON-NLS-1$
		this.messageType = newMessageType;
	}
	
	/**
	 * @return the Message Number (TR004-MSGNO)
	 */
	public String getMessageNumber() {
		return this.messageNumber;
	}
	
	/**
	 * Changes the Message Number (TR004-MSGNO).
	 * @param newMessageNumber the new Message Number to set
	 */
	public void setMessageNumber(String newMessageNumber) {
		_pcs.firePropertyChange("messageNumber", this.messageNumber, newMessageNumber); //$NON-NLS-1$
		this.messageNumber = newMessageNumber;
	}
	
	/**
	 * @return the Message Text (TR004-MSGTEXT)
	 */
	public String getText() {
		return this.text;
	}
	
	/**
	 * Changes the Message Text (TR004-MSGTEXT).
	 * @param newText the new Message Text to set
	 */
	public void setText(String newText) {
		_pcs.firePropertyChange("text", this.text, newText); //$NON-NLS-1$
		this.text = newText;
	}
	
	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		_pcs.addPropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		_pcs.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * @return the list of property change listeners
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners()
	 */
	public PropertyChangeListener[] getPropertyChangeListeners() {
		return _pcs.getPropertyChangeListeners();
	}

	/**
	 * @param propertyName
	 * @return the list of property change listeners for a certain property
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(java.lang.String)
	 */
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		return _pcs.getPropertyChangeListeners(propertyName);
	}

	/**
	 * @param propertyName
	 * @return <code>true</code> if any property change listeners are registered
	 * @see java.beans.PropertyChangeSupport#hasListeners(java.lang.String)
	 */
	public boolean hasListeners(String propertyName) {
		return _pcs.hasListeners(propertyName);
	}

	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		_pcs.removePropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		_pcs.removePropertyChangeListener(propertyName, listener);
	}

}
