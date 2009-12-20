 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure TR002.
 */
public class ObjectListEntry {

	private PropertyChangeSupport _pcs;

	private String transportID;
	private int row;
	private String programID;
	private String objectType;
	private String objectName;
	private String objectFunction;
	private boolean locked;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public ObjectListEntry() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public ObjectListEntry(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.transportID = source.getString("TRKORR");
		this.row = source.getInt("AS4POS");
		this.programID = source.getString("PGMID");
		this.objectType = source.getString("OBJECT");
		this.objectName = source.getString("OBJ_NAME");
		this.objectFunction = source.getString("OBJFUNC");
		this.locked = source.getString("LOCKFLAG").equalsIgnoreCase("X");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("TRKORR", this.transportID);
		target.setValue("AS4POS", this.row);
		target.setValue("PGMID", this.programID);
		target.setValue("OBJECT", this.objectType);
		target.setValue("OBJ_NAME", this.objectName);
		target.setValue("OBJFUNC", this.objectFunction);
		target.setValue("LOCKFLAG", this.locked);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<ObjectListEntry> source, JCoTable destination) {
		destination.deleteAllRows();
		for (ObjectListEntry entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<ObjectListEntry> fromTable(JCoTable source) {
		List<ObjectListEntry> list = new ArrayList<ObjectListEntry>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new ObjectListEntry(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than TR002 is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("TR002")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected TR002).", structureName));
		}
	}
	
	/**
	 * @return the Request or Task (TR002-TRKORR)
	 */
	public String getTransportID() {
		return this.transportID;
	}
	
	/**
	 * Changes the Request or Task (TR002-TRKORR).
	 * @param newTransportID the new Request or Task to set
	 */
	public void setTransportID(String newTransportID) {
		_pcs.firePropertyChange("transportID", this.transportID, newTransportID);
		this.transportID = newTransportID;
	}
	
	/**
	 * @return the Row number (TR002-AS4POS)
	 */
	public int getRow() {
		return this.row;
	}
	
	/**
	 * Changes the Row number (TR002-AS4POS).
	 * @param newRow the new Row number to set
	 */
	public void setRow(int newRow) {
		_pcs.firePropertyChange("row", this.row, newRow);
		this.row = newRow;
	}
	
	/**
	 * @return the Program ID (TR002-PGMID)
	 */
	public String getProgramID() {
		return this.programID;
	}
	
	/**
	 * Changes the Program ID (TR002-PGMID).
	 * @param newProgramID the new Program ID to set
	 */
	public void setProgramID(String newProgramID) {
		_pcs.firePropertyChange("programID", this.programID, newProgramID);
		this.programID = newProgramID;
	}
	
	/**
	 * @return the Object Type (TR002-OBJECT)
	 */
	public String getObjectType() {
		return this.objectType;
	}
	
	/**
	 * Changes the Object Type (TR002-OBJECT).
	 * @param newObjectType the new Object Type to set
	 */
	public void setObjectType(String newObjectType) {
		_pcs.firePropertyChange("objectType", this.objectType, newObjectType);
		this.objectType = newObjectType;
	}
	
	/**
	 * @return the Object Name (TR002-OBJ_NAME)
	 */
	public String getObjectName() {
		return this.objectName;
	}
	
	/**
	 * Changes the Object Name (TR002-OBJ_NAME).
	 * @param newObjectName the new Object Name to set
	 */
	public void setObjectName(String newObjectName) {
		_pcs.firePropertyChange("objectName", this.objectName, newObjectName);
		this.objectName = newObjectName;
	}
	
	/**
	 * @return the Object Function (TR002-OBJFUNC)
	 */
	public String getObjectFunction() {
		return this.objectFunction;
	}
	
	/**
	 * Changes the Object Function (TR002-OBJFUNC).
	 * @param newObjectFunction the new Object Function to set
	 */
	public void setObjectFunction(String newObjectFunction) {
		_pcs.firePropertyChange("objectFunction", this.objectFunction, newObjectFunction);
		this.objectFunction = newObjectFunction;
	}
	
	/**
	 * @return the Status (TR002-LOCKFLAG)
	 */
	public boolean isLocked() {
		return this.locked;
	}
	
	/**
	 * Changes the Status (TR002-LOCKFLAG).
	 * @param newLocked the new Status to set
	 */
	public void setLocked(boolean newLocked) {
		_pcs.firePropertyChange("locked", this.locked, newLocked);
		this.locked = newLocked;
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
