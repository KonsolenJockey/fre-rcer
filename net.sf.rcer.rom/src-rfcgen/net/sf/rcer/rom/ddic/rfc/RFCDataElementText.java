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
 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure DD04T.
 */
public class RFCDataElementText {

	private PropertyChangeSupport _pcs;

	private String localeID;
	private String description;
	private String heading;
	private String shortText;
	private String mediumText;
	private String longText;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataElementText() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDataElementText(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.localeID = source.getString("DDLANGUAGE"); //$NON-NLS-1$
		this.description = source.getString("DDTEXT"); //$NON-NLS-1$
		this.heading = source.getString("REPTEXT"); //$NON-NLS-1$
		this.shortText = source.getString("SCRTEXT_S"); //$NON-NLS-1$
		this.mediumText = source.getString("SCRTEXT_M"); //$NON-NLS-1$
		this.longText = source.getString("SCRTEXT_L"); //$NON-NLS-1$
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
	    // don't call clear in case of a table because that would delete all rows.
		if (!(targetStructure instanceof JCoTable)) {
			targetStructure.clear();
		}
		targetStructure.setValue("DDLANGUAGE", this.localeID); //$NON-NLS-1$
		targetStructure.setValue("DDTEXT", this.description); //$NON-NLS-1$
		targetStructure.setValue("REPTEXT", this.heading); //$NON-NLS-1$
		targetStructure.setValue("SCRTEXT_S", this.shortText); //$NON-NLS-1$
		targetStructure.setValue("SCRTEXT_M", this.mediumText); //$NON-NLS-1$
		targetStructure.setValue("SCRTEXT_L", this.longText); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDataElementText> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDataElementText entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCDataElementText> fromTable(JCoTable source) {
		List<RFCDataElementText> list = new ArrayList<RFCDataElementText>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDataElementText(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD04T is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD04T")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD04T).", structureName));
		}
	}
	
	/**
	 * @return the locale ID (DD04T-DDLANGUAGE)
	 */
	public String getLocaleID() {
		return this.localeID;
	}
	
	/**
	 * Changes the locale ID (DD04T-DDLANGUAGE).
	 * @param newLocaleID the new locale ID to set
	 */
	public void setLocaleID(String newLocaleID) {
		_pcs.firePropertyChange("localeID", this.localeID, newLocaleID); //$NON-NLS-1$
		this.localeID = newLocaleID;
	}
	
	/**
	 * @return the description (DD04T-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the description (DD04T-DDTEXT).
	 * @param newDescription the new description to set
	 */
	public void setDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription); //$NON-NLS-1$
		this.description = newDescription;
	}
	
	/**
	 * @return the heading (DD04T-REPTEXT)
	 */
	public String getHeading() {
		return this.heading;
	}
	
	/**
	 * Changes the heading (DD04T-REPTEXT).
	 * @param newHeading the new heading to set
	 */
	public void setHeading(String newHeading) {
		_pcs.firePropertyChange("heading", this.heading, newHeading); //$NON-NLS-1$
		this.heading = newHeading;
	}
	
	/**
	 * @return the short field label (DD04T-SCRTEXT_S)
	 */
	public String getShortText() {
		return this.shortText;
	}
	
	/**
	 * Changes the short field label (DD04T-SCRTEXT_S).
	 * @param newShortText the new short field label to set
	 */
	public void setShortText(String newShortText) {
		_pcs.firePropertyChange("shortText", this.shortText, newShortText); //$NON-NLS-1$
		this.shortText = newShortText;
	}
	
	/**
	 * @return the medium field label (DD04T-SCRTEXT_M)
	 */
	public String getMediumText() {
		return this.mediumText;
	}
	
	/**
	 * Changes the medium field label (DD04T-SCRTEXT_M).
	 * @param newMediumText the new medium field label to set
	 */
	public void setMediumText(String newMediumText) {
		_pcs.firePropertyChange("mediumText", this.mediumText, newMediumText); //$NON-NLS-1$
		this.mediumText = newMediumText;
	}
	
	/**
	 * @return the long field label (DD04T-SCRTEXT_L)
	 */
	public String getLongText() {
		return this.longText;
	}
	
	/**
	 * Changes the long field label (DD04T-SCRTEXT_L).
	 * @param newLongText the new long field label to set
	 */
	public void setLongText(String newLongText) {
		_pcs.firePropertyChange("longText", this.longText, newLongText); //$NON-NLS-1$
		this.longText = newLongText;
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
