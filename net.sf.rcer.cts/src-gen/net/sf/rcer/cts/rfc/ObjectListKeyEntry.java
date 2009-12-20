 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure TR003.
 */
public class ObjectListKeyEntry {

	private PropertyChangeSupport _pcs;

	private String transportID;
	private String programID;
	private String objectType;
	private String objectName;
	private int row;
	private String masterObjectType;
	private String masterObjectName;
	private String viewName;
	private String objectFunction;
	private String tableKey;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public ObjectListKeyEntry() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public ObjectListKeyEntry(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.transportID = source.getString("TRKORR");
		this.programID = source.getString("PGMID");
		this.objectType = source.getString("OBJECT");
		this.objectName = source.getString("OBJNAME");
		this.row = source.getInt("AS4POS");
		this.masterObjectType = source.getString("MASTERTYPE");
		this.masterObjectName = source.getString("MASTERNAME");
		this.viewName = source.getString("VIEWNAME");
		this.objectFunction = source.getString("OBJFUNC");
		this.tableKey = source.getString("TABKEY");
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("TRKORR", this.transportID);
		targetStructure.setValue("PGMID", this.programID);
		targetStructure.setValue("OBJECT", this.objectType);
		targetStructure.setValue("OBJNAME", this.objectName);
		targetStructure.setValue("AS4POS", this.row);
		targetStructure.setValue("MASTERTYPE", this.masterObjectType);
		targetStructure.setValue("MASTERNAME", this.masterObjectName);
		targetStructure.setValue("VIEWNAME", this.viewName);
		targetStructure.setValue("OBJFUNC", this.objectFunction);
		targetStructure.setValue("TABKEY", this.tableKey);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<ObjectListKeyEntry> source, JCoTable destination) {
		destination.deleteAllRows();
		for (ObjectListKeyEntry entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<ObjectListKeyEntry> fromTable(JCoTable source) {
		List<ObjectListKeyEntry> list = new ArrayList<ObjectListKeyEntry>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new ObjectListKeyEntry(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than TR003 is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("TR003")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected TR003).", structureName));
		}
	}
	
	/**
	 * @return the Request or Task (TR003-TRKORR)
	 */
	public String getTransportID() {
		return this.transportID;
	}
	
	/**
	 * Changes the Request or Task (TR003-TRKORR).
	 * @param newTransportID the new Request or Task to set
	 */
	public void setTransportID(String newTransportID) {
		_pcs.firePropertyChange("transportID", this.transportID, newTransportID);
		this.transportID = newTransportID;
	}
	
	/**
	 * @return the Program ID (TR003-PGMID)
	 */
	public String getProgramID() {
		return this.programID;
	}
	
	/**
	 * Changes the Program ID (TR003-PGMID).
	 * @param newProgramID the new Program ID to set
	 */
	public void setProgramID(String newProgramID) {
		_pcs.firePropertyChange("programID", this.programID, newProgramID);
		this.programID = newProgramID;
	}
	
	/**
	 * @return the Object Type (TR003-OBJECT)
	 */
	public String getObjectType() {
		return this.objectType;
	}
	
	/**
	 * Changes the Object Type (TR003-OBJECT).
	 * @param newObjectType the new Object Type to set
	 */
	public void setObjectType(String newObjectType) {
		_pcs.firePropertyChange("objectType", this.objectType, newObjectType);
		this.objectType = newObjectType;
	}
	
	/**
	 * @return the Object Name (TR003-OBJNAME)
	 */
	public String getObjectName() {
		return this.objectName;
	}
	
	/**
	 * Changes the Object Name (TR003-OBJNAME).
	 * @param newObjectName the new Object Name to set
	 */
	public void setObjectName(String newObjectName) {
		_pcs.firePropertyChange("objectName", this.objectName, newObjectName);
		this.objectName = newObjectName;
	}
	
	/**
	 * @return the Row number (TR003-AS4POS)
	 */
	public int getRow() {
		return this.row;
	}
	
	/**
	 * Changes the Row number (TR003-AS4POS).
	 * @param newRow the new Row number to set
	 */
	public void setRow(int newRow) {
		_pcs.firePropertyChange("row", this.row, newRow);
		this.row = newRow;
	}
	
	/**
	 * @return the Master Object Type (TR003-MASTERTYPE)
	 */
	public String getMasterObjectType() {
		return this.masterObjectType;
	}
	
	/**
	 * Changes the Master Object Type (TR003-MASTERTYPE).
	 * @param newMasterObjectType the new Master Object Type to set
	 */
	public void setMasterObjectType(String newMasterObjectType) {
		_pcs.firePropertyChange("masterObjectType", this.masterObjectType, newMasterObjectType);
		this.masterObjectType = newMasterObjectType;
	}
	
	/**
	 * @return the Master Object Name (TR003-MASTERNAME)
	 */
	public String getMasterObjectName() {
		return this.masterObjectName;
	}
	
	/**
	 * Changes the Master Object Name (TR003-MASTERNAME).
	 * @param newMasterObjectName the new Master Object Name to set
	 */
	public void setMasterObjectName(String newMasterObjectName) {
		_pcs.firePropertyChange("masterObjectName", this.masterObjectName, newMasterObjectName);
		this.masterObjectName = newMasterObjectName;
	}
	
	/**
	 * @return the View Name (TR003-VIEWNAME)
	 */
	public String getViewName() {
		return this.viewName;
	}
	
	/**
	 * Changes the View Name (TR003-VIEWNAME).
	 * @param newViewName the new View Name to set
	 */
	public void setViewName(String newViewName) {
		_pcs.firePropertyChange("viewName", this.viewName, newViewName);
		this.viewName = newViewName;
	}
	
	/**
	 * @return the Object Function (TR003-OBJFUNC)
	 */
	public String getObjectFunction() {
		return this.objectFunction;
	}
	
	/**
	 * Changes the Object Function (TR003-OBJFUNC).
	 * @param newObjectFunction the new Object Function to set
	 */
	public void setObjectFunction(String newObjectFunction) {
		_pcs.firePropertyChange("objectFunction", this.objectFunction, newObjectFunction);
		this.objectFunction = newObjectFunction;
	}
	
	/**
	 * @return the Table Key (TR003-TABKEY)
	 */
	public String getTableKey() {
		return this.tableKey;
	}
	
	/**
	 * Changes the Table Key (TR003-TABKEY).
	 * @param newTableKey the new Table Key to set
	 */
	public void setTableKey(String newTableKey) {
		_pcs.firePropertyChange("tableKey", this.tableKey, newTableKey);
		this.tableKey = newTableKey;
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
