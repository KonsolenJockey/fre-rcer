 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure DD35V.
 */
public class RFCSearchHelpHeader {

	private PropertyChangeSupport _pcs;

	private String fieldName;
	private String searchHelpName;
	private boolean inherited;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCSearchHelpHeader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCSearchHelpHeader(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.fieldName = source.getString("FIELDNAME"); //$NON-NLS-1$
		this.searchHelpName = source.getString("SHLPNAME"); //$NON-NLS-1$
		this.inherited = source.getString("SHLPINHER").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("FIELDNAME", this.fieldName); //$NON-NLS-1$
		targetStructure.setValue("SHLPNAME", this.searchHelpName); //$NON-NLS-1$
		targetStructure.setValue("SHLPINHER", this.inherited); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCSearchHelpHeader> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCSearchHelpHeader entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCSearchHelpHeader> fromTable(JCoTable source) {
		List<RFCSearchHelpHeader> list = new ArrayList<RFCSearchHelpHeader>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCSearchHelpHeader(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD35V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD35V")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD35V).", structureName));
		}
	}
	
	/**
	 * @return the field name (DD35V-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the field name (DD35V-FIELDNAME).
	 * @param newFieldName the new field name to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName); //$NON-NLS-1$
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the name of a search help (DD35V-SHLPNAME)
	 */
	public String getSearchHelpName() {
		return this.searchHelpName;
	}
	
	/**
	 * Changes the name of a search help (DD35V-SHLPNAME).
	 * @param newSearchHelpName the new name of a search help to set
	 */
	public void setSearchHelpName(String newSearchHelpName) {
		_pcs.firePropertyChange("searchHelpName", this.searchHelpName, newSearchHelpName); //$NON-NLS-1$
		this.searchHelpName = newSearchHelpName;
	}
	
	/**
	 * @return the whether the search help attachment is inherited (DD35V-SHLPINHER)
	 */
	public boolean isInherited() {
		return this.inherited;
	}
	
	/**
	 * Changes the whether the search help attachment is inherited (DD35V-SHLPINHER).
	 * @param newInherited the new whether the search help attachment is inherited to set
	 */
	public void setInherited(boolean newInherited) {
		_pcs.firePropertyChange("inherited", this.inherited, newInherited); //$NON-NLS-1$
		this.inherited = newInherited;
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
