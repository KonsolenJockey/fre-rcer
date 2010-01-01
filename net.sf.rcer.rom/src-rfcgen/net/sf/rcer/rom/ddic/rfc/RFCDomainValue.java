 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure DD07V.
 */
public class RFCDomainValue {

	private PropertyChangeSupport _pcs;

	private int position;
	private String localeID;
	private String lowerValue;
	private String upperValue;
	private String description;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDomainValue() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDomainValue(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.position = source.getInt("VALPOS"); //$NON-NLS-1$
		this.localeID = source.getString("DDLANGUAGE"); //$NON-NLS-1$
		this.lowerValue = source.getString("DOMVALUE_L"); //$NON-NLS-1$
		this.upperValue = source.getString("DOMVALUE_H"); //$NON-NLS-1$
		this.description = source.getString("DDTEXT"); //$NON-NLS-1$
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("VALPOS", this.position); //$NON-NLS-1$
		targetStructure.setValue("DDLANGUAGE", this.localeID); //$NON-NLS-1$
		targetStructure.setValue("DOMVALUE_L", this.lowerValue); //$NON-NLS-1$
		targetStructure.setValue("DOMVALUE_H", this.upperValue); //$NON-NLS-1$
		targetStructure.setValue("DDTEXT", this.description); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDomainValue> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDomainValue entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCDomainValue> fromTable(JCoTable source) {
		List<RFCDomainValue> list = new ArrayList<RFCDomainValue>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDomainValue(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD07V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD07V")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD07V).", structureName));
		}
	}
	
	/**
	 * @return the domain value key (DD07V-VALPOS)
	 */
	public int getPosition() {
		return this.position;
	}
	
	/**
	 * Changes the domain value key (DD07V-VALPOS).
	 * @param newPosition the new domain value key to set
	 */
	public void setPosition(int newPosition) {
		_pcs.firePropertyChange("position", this.position, newPosition); //$NON-NLS-1$
		this.position = newPosition;
	}
	
	/**
	 * @return the locale key (DD07V-DDLANGUAGE)
	 */
	public String getLocaleID() {
		return this.localeID;
	}
	
	/**
	 * Changes the locale key (DD07V-DDLANGUAGE).
	 * @param newLocaleID the new locale key to set
	 */
	public void setLocaleID(String newLocaleID) {
		_pcs.firePropertyChange("localeID", this.localeID, newLocaleID); //$NON-NLS-1$
		this.localeID = newLocaleID;
	}
	
	/**
	 * @return the single value or lower limit (DD07V-DOMVALUE_L)
	 */
	public String getLowerValue() {
		return this.lowerValue;
	}
	
	/**
	 * Changes the single value or lower limit (DD07V-DOMVALUE_L).
	 * @param newLowerValue the new single value or lower limit to set
	 */
	public void setLowerValue(String newLowerValue) {
		_pcs.firePropertyChange("lowerValue", this.lowerValue, newLowerValue); //$NON-NLS-1$
		this.lowerValue = newLowerValue;
	}
	
	/**
	 * @return the upper limit (DD07V-DOMVALUE_H)
	 */
	public String getUpperValue() {
		return this.upperValue;
	}
	
	/**
	 * Changes the upper limit (DD07V-DOMVALUE_H).
	 * @param newUpperValue the new upper limit to set
	 */
	public void setUpperValue(String newUpperValue) {
		_pcs.firePropertyChange("upperValue", this.upperValue, newUpperValue); //$NON-NLS-1$
		this.upperValue = newUpperValue;
	}
	
	/**
	 * @return the short text for fixed values (DD07V-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the short text for fixed values (DD07V-DDTEXT).
	 * @param newDescription the new short text for fixed values to set
	 */
	public void setDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription); //$NON-NLS-1$
		this.description = newDescription;
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
