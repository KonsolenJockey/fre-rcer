 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

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
		this.localeID = source.getString("DDLANGUAGE");
		this.description = source.getString("DDTEXT");
		this.heading = source.getString("REPTEXT");
		this.shortText = source.getString("SCRTEXT_S");
		this.mediumText = source.getString("SCRTEXT_M");
		this.longText = source.getString("SCRTEXT_L");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("DDLANGUAGE", this.localeID);
		target.setValue("DDTEXT", this.description);
		target.setValue("REPTEXT", this.heading);
		target.setValue("SCRTEXT_S", this.shortText);
		target.setValue("SCRTEXT_M", this.mediumText);
		target.setValue("SCRTEXT_L", this.longText);
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
	 * @param source
	 * @param destination
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
		if (!structureName.equals("DD04T")) {
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
	public void setsetLocaleID(String newLocaleID) {
		_pcs.firePropertyChange("localeID", this.localeID, newLocaleID);
		this.localeID = newLocaleID;
	}
	
	/**
	 * @return the Short text describing R/3 Repository objects (DD04T-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the Short text describing R/3 Repository objects (DD04T-DDTEXT).
	 * @param newDescription the new Short text describing R/3 Repository objects to set
	 */
	public void setsetDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription);
		this.description = newDescription;
	}
	
	/**
	 * @return the Heading (DD04T-REPTEXT)
	 */
	public String getHeading() {
		return this.heading;
	}
	
	/**
	 * Changes the Heading (DD04T-REPTEXT).
	 * @param newHeading the new Heading to set
	 */
	public void setsetHeading(String newHeading) {
		_pcs.firePropertyChange("heading", this.heading, newHeading);
		this.heading = newHeading;
	}
	
	/**
	 * @return the Short Field Label (DD04T-SCRTEXT_S)
	 */
	public String getShortText() {
		return this.shortText;
	}
	
	/**
	 * Changes the Short Field Label (DD04T-SCRTEXT_S).
	 * @param newShortText the new Short Field Label to set
	 */
	public void setsetShortText(String newShortText) {
		_pcs.firePropertyChange("shortText", this.shortText, newShortText);
		this.shortText = newShortText;
	}
	
	/**
	 * @return the Medium field label (DD04T-SCRTEXT_M)
	 */
	public String getMediumText() {
		return this.mediumText;
	}
	
	/**
	 * Changes the Medium field label (DD04T-SCRTEXT_M).
	 * @param newMediumText the new Medium field label to set
	 */
	public void setsetMediumText(String newMediumText) {
		_pcs.firePropertyChange("mediumText", this.mediumText, newMediumText);
		this.mediumText = newMediumText;
	}
	
	/**
	 * @return the Long field label (DD04T-SCRTEXT_L)
	 */
	public String getLongText() {
		return this.longText;
	}
	
	/**
	 * Changes the Long field label (DD04T-SCRTEXT_L).
	 * @param newLongText the new Long field label to set
	 */
	public void setsetLongText(String newLongText) {
		_pcs.firePropertyChange("longText", this.longText, newLongText);
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
