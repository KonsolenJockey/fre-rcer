 
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
 * A class representing the SAP R/3 data structure DD36M.
 */
public class RFCSearchHelpField {

	private PropertyChangeSupport _pcs;

	private String fieldName;
	private String searchHelp;
	private String searchHelpField;
	private int position;
	private String assignmentType;
	private String tableName;
	private String tableField;
	private boolean importField;
	private boolean exportField;
	private String dataElement;
	private String domain;
	private String dataType;
	private int length;
	private int decimals;
	private String defaultValue;
	private String defaultValueType;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCSearchHelpField() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCSearchHelpField(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.fieldName = source.getString("FIELDNAME"); //$NON-NLS-1$
		this.searchHelp = source.getString("SHLPNAME"); //$NON-NLS-1$
		this.searchHelpField = source.getString("SHLPFIELD"); //$NON-NLS-1$
		this.position = source.getInt("FLPOSITION"); //$NON-NLS-1$
		this.assignmentType = source.getString("SHTYPE"); //$NON-NLS-1$
		this.tableName = source.getString("SHTABLE"); //$NON-NLS-1$
		this.tableField = source.getString("SHFIELD"); //$NON-NLS-1$
		this.importField = source.getString("SHLPINPUT").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.exportField = source.getString("SHLPOUTPUT").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.dataElement = source.getString("ROLLNAME"); //$NON-NLS-1$
		this.domain = source.getString("DOMNAME"); //$NON-NLS-1$
		this.dataType = source.getString("DATATYPE"); //$NON-NLS-1$
		this.length = source.getInt("LENG"); //$NON-NLS-1$
		this.decimals = source.getInt("DECIMALS"); //$NON-NLS-1$
		this.defaultValue = source.getString("DEFAULTVAL"); //$NON-NLS-1$
		this.defaultValueType = source.getString("DEFAULTTYP"); //$NON-NLS-1$
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
		targetStructure.setValue("FIELDNAME", this.fieldName); //$NON-NLS-1$
		targetStructure.setValue("SHLPNAME", this.searchHelp); //$NON-NLS-1$
		targetStructure.setValue("SHLPFIELD", this.searchHelpField); //$NON-NLS-1$
		targetStructure.setValue("FLPOSITION", this.position); //$NON-NLS-1$
		targetStructure.setValue("SHTYPE", this.assignmentType); //$NON-NLS-1$
		targetStructure.setValue("SHTABLE", this.tableName); //$NON-NLS-1$
		targetStructure.setValue("SHFIELD", this.tableField); //$NON-NLS-1$
		targetStructure.setValue("SHLPINPUT", this.importField); //$NON-NLS-1$
		targetStructure.setValue("SHLPOUTPUT", this.exportField); //$NON-NLS-1$
		targetStructure.setValue("ROLLNAME", this.dataElement); //$NON-NLS-1$
		targetStructure.setValue("DOMNAME", this.domain); //$NON-NLS-1$
		targetStructure.setValue("DATATYPE", this.dataType); //$NON-NLS-1$
		targetStructure.setValue("LENG", this.length); //$NON-NLS-1$
		targetStructure.setValue("DECIMALS", this.decimals); //$NON-NLS-1$
		targetStructure.setValue("DEFAULTVAL", this.defaultValue); //$NON-NLS-1$
		targetStructure.setValue("DEFAULTTYP", this.defaultValueType); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCSearchHelpField> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCSearchHelpField entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCSearchHelpField> fromTable(JCoTable source) {
		List<RFCSearchHelpField> list = new ArrayList<RFCSearchHelpField>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCSearchHelpField(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD36M is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD36M")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD36M).", structureName));
		}
	}
	
	/**
	 * @return the field name (DD36M-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the field name (DD36M-FIELDNAME).
	 * @param newFieldName the new field name to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName); //$NON-NLS-1$
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the name of a search help (DD36M-SHLPNAME)
	 */
	public String getSearchHelp() {
		return this.searchHelp;
	}
	
	/**
	 * Changes the name of a search help (DD36M-SHLPNAME).
	 * @param newSearchHelp the new name of a search help to set
	 */
	public void setSearchHelp(String newSearchHelp) {
		_pcs.firePropertyChange("searchHelp", this.searchHelp, newSearchHelp); //$NON-NLS-1$
		this.searchHelp = newSearchHelp;
	}
	
	/**
	 * @return the name of a search help parameter (DD36M-SHLPFIELD)
	 */
	public String getSearchHelpField() {
		return this.searchHelpField;
	}
	
	/**
	 * Changes the name of a search help parameter (DD36M-SHLPFIELD).
	 * @param newSearchHelpField the new name of a search help parameter to set
	 */
	public void setSearchHelpField(String newSearchHelpField) {
		_pcs.firePropertyChange("searchHelpField", this.searchHelpField, newSearchHelpField); //$NON-NLS-1$
		this.searchHelpField = newSearchHelpField;
	}
	
	/**
	 * @return the position of a search help field (DD36M-FLPOSITION)
	 */
	public int getPosition() {
		return this.position;
	}
	
	/**
	 * Changes the position of a search help field (DD36M-FLPOSITION).
	 * @param newPosition the new position of a search help field to set
	 */
	public void setPosition(int newPosition) {
		_pcs.firePropertyChange("position", this.position, newPosition); //$NON-NLS-1$
		this.position = newPosition;
	}
	
	/**
	 * @return the type of parameter field assignment (DD36M-SHTYPE)
	 */
	public String getAssignmentType() {
		return this.assignmentType;
	}
	
	/**
	 * Changes the type of parameter field assignment (DD36M-SHTYPE).
	 * @param newAssignmentType the new type of parameter field assignment to set
	 */
	public void setAssignmentType(String newAssignmentType) {
		_pcs.firePropertyChange("assignmentType", this.assignmentType, newAssignmentType); //$NON-NLS-1$
		this.assignmentType = newAssignmentType;
	}
	
	/**
	 * @return the Structure with field assigned to a search help field (DD36M-SHTABLE)
	 */
	public String getTableName() {
		return this.tableName;
	}
	
	/**
	 * Changes the Structure with field assigned to a search help field (DD36M-SHTABLE).
	 * @param newTableName the new Structure with field assigned to a search help field to set
	 */
	public void setTableName(String newTableName) {
		_pcs.firePropertyChange("tableName", this.tableName, newTableName); //$NON-NLS-1$
		this.tableName = newTableName;
	}
	
	/**
	 * @return the Structure field assigned to a search help field (DD36M-SHFIELD)
	 */
	public String getTableField() {
		return this.tableField;
	}
	
	/**
	 * Changes the Structure field assigned to a search help field (DD36M-SHFIELD).
	 * @param newTableField the new Structure field assigned to a search help field to set
	 */
	public void setTableField(String newTableField) {
		_pcs.firePropertyChange("tableField", this.tableField, newTableField); //$NON-NLS-1$
		this.tableField = newTableField;
	}
	
	/**
	 * @return the Flag for IMPORT parameter of the search help (DD36M-SHLPINPUT)
	 */
	public boolean isImportField() {
		return this.importField;
	}
	
	/**
	 * Changes the Flag for IMPORT parameter of the search help (DD36M-SHLPINPUT).
	 * @param newImportField the new Flag for IMPORT parameter of the search help to set
	 */
	public void setImportField(boolean newImportField) {
		_pcs.firePropertyChange("importField", this.importField, newImportField); //$NON-NLS-1$
		this.importField = newImportField;
	}
	
	/**
	 * @return the Flag for EXPORT parameter of the search help (DD36M-SHLPOUTPUT)
	 */
	public boolean isExportField() {
		return this.exportField;
	}
	
	/**
	 * Changes the Flag for EXPORT parameter of the search help (DD36M-SHLPOUTPUT).
	 * @param newExportField the new Flag for EXPORT parameter of the search help to set
	 */
	public void setExportField(boolean newExportField) {
		_pcs.firePropertyChange("exportField", this.exportField, newExportField); //$NON-NLS-1$
		this.exportField = newExportField;
	}
	
	/**
	 * @return the data element name (DD36M-ROLLNAME)
	 */
	public String getDataElement() {
		return this.dataElement;
	}
	
	/**
	 * Changes the data element name (DD36M-ROLLNAME).
	 * @param newDataElement the new data element name to set
	 */
	public void setDataElement(String newDataElement) {
		_pcs.firePropertyChange("dataElement", this.dataElement, newDataElement); //$NON-NLS-1$
		this.dataElement = newDataElement;
	}
	
	/**
	 * @return the domain name (DD36M-DOMNAME)
	 */
	public String getDomain() {
		return this.domain;
	}
	
	/**
	 * Changes the domain name (DD36M-DOMNAME).
	 * @param newDomain the new domain name to set
	 */
	public void setDomain(String newDomain) {
		_pcs.firePropertyChange("domain", this.domain, newDomain); //$NON-NLS-1$
		this.domain = newDomain;
	}
	
	/**
	 * @return the data type (DD36M-DATATYPE)
	 */
	public String getDataType() {
		return this.dataType;
	}
	
	/**
	 * Changes the data type (DD36M-DATATYPE).
	 * @param newDataType the new data type to set
	 */
	public void setDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType); //$NON-NLS-1$
		this.dataType = newDataType;
	}
	
	/**
	 * @return the length (DD36M-LENG)
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Changes the length (DD36M-LENG).
	 * @param newLength the new length to set
	 */
	public void setLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength); //$NON-NLS-1$
		this.length = newLength;
	}
	
	/**
	 * @return the number of decimals (DD36M-DECIMALS)
	 */
	public int getDecimals() {
		return this.decimals;
	}
	
	/**
	 * Changes the number of decimals (DD36M-DECIMALS).
	 * @param newDecimals the new number of decimals to set
	 */
	public void setDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals); //$NON-NLS-1$
		this.decimals = newDecimals;
	}
	
	/**
	 * @return the Default value for a search help parameter (DD36M-DEFAULTVAL)
	 */
	public String getDefaultValue() {
		return this.defaultValue;
	}
	
	/**
	 * Changes the Default value for a search help parameter (DD36M-DEFAULTVAL).
	 * @param newDefaultValue the new Default value for a search help parameter to set
	 */
	public void setDefaultValue(String newDefaultValue) {
		_pcs.firePropertyChange("defaultValue", this.defaultValue, newDefaultValue); //$NON-NLS-1$
		this.defaultValue = newDefaultValue;
	}
	
	/**
	 * @return the Default type of a search help parameter (DD36M-DEFAULTTYP)
	 */
	public String getDefaultValueType() {
		return this.defaultValueType;
	}
	
	/**
	 * Changes the Default type of a search help parameter (DD36M-DEFAULTTYP).
	 * @param newDefaultValueType the new Default type of a search help parameter to set
	 */
	public void setDefaultValueType(String newDefaultValueType) {
		_pcs.firePropertyChange("defaultValueType", this.defaultValueType, newDefaultValueType); //$NON-NLS-1$
		this.defaultValueType = newDefaultValueType;
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
