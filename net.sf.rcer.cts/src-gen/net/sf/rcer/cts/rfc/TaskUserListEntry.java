 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure TR005.
 */
public class TaskUserListEntry {

	private PropertyChangeSupport _pcs;

	private String userName;
	private String correctionID;
	private int correctionErrorMessage;
	private String repairID;
	private int repairErrorMessage;
	private String unclassifiedID;
	private int unclassifiedErrorMessage;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public TaskUserListEntry() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public TaskUserListEntry(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.userName = source.getString("AS4USER");
		this.correctionID = source.getString("CORRECTION");
		this.correctionErrorMessage = source.getInt("CORRERRMSG");
		this.repairID = source.getString("REPAIR");
		this.repairErrorMessage = source.getInt("REPAERRMSG");
		this.unclassifiedID = source.getString("UNCLASTASK");
		this.unclassifiedErrorMessage = source.getInt("UNCLERRMSG");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("AS4USER", this.userName);
		target.setValue("CORRECTION", this.correctionID);
		target.setValue("CORRERRMSG", this.correctionErrorMessage);
		target.setValue("REPAIR", this.repairID);
		target.setValue("REPAERRMSG", this.repairErrorMessage);
		target.setValue("UNCLASTASK", this.unclassifiedID);
		target.setValue("UNCLERRMSG", this.unclassifiedErrorMessage);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<TaskUserListEntry> source, JCoTable destination) {
		destination.deleteAllRows();
		for (TaskUserListEntry entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<TaskUserListEntry> fromTable(JCoTable source) {
		List<TaskUserListEntry> list = new ArrayList<TaskUserListEntry>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new TaskUserListEntry(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than TR005 is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("TR005")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected TR005).", structureName));
		}
	}
	
	/**
	 * @return the User Name (TR005-AS4USER)
	 */
	public String getUserName() {
		return this.userName;
	}
	
	/**
	 * Changes the User Name (TR005-AS4USER).
	 * @param newUserName the new User Name to set
	 */
	public void setUserName(String newUserName) {
		_pcs.firePropertyChange("userName", this.userName, newUserName);
		this.userName = newUserName;
	}
	
	/**
	 * @return the ID of Correction Task (TR005-CORRECTION)
	 */
	public String getCorrectionID() {
		return this.correctionID;
	}
	
	/**
	 * Changes the ID of Correction Task (TR005-CORRECTION).
	 * @param newCorrectionID the new ID of Correction Task to set
	 */
	public void setCorrectionID(String newCorrectionID) {
		_pcs.firePropertyChange("correctionID", this.correctionID, newCorrectionID);
		this.correctionID = newCorrectionID;
	}
	
	/**
	 * @return the Error Message (Correction Task) (TR005-CORRERRMSG)
	 */
	public int getCorrectionErrorMessage() {
		return this.correctionErrorMessage;
	}
	
	/**
	 * Changes the Error Message (Correction Task) (TR005-CORRERRMSG).
	 * @param newCorrectionErrorMessage the new Error Message (Correction Task) to set
	 */
	public void setCorrectionErrorMessage(int newCorrectionErrorMessage) {
		_pcs.firePropertyChange("correctionErrorMessage", this.correctionErrorMessage, newCorrectionErrorMessage);
		this.correctionErrorMessage = newCorrectionErrorMessage;
	}
	
	/**
	 * @return the ID of Repair Task (TR005-REPAIR)
	 */
	public String getRepairID() {
		return this.repairID;
	}
	
	/**
	 * Changes the ID of Repair Task (TR005-REPAIR).
	 * @param newRepairID the new ID of Repair Task to set
	 */
	public void setRepairID(String newRepairID) {
		_pcs.firePropertyChange("repairID", this.repairID, newRepairID);
		this.repairID = newRepairID;
	}
	
	/**
	 * @return the Error Message (Repair Task) (TR005-REPAERRMSG)
	 */
	public int getRepairErrorMessage() {
		return this.repairErrorMessage;
	}
	
	/**
	 * Changes the Error Message (Repair Task) (TR005-REPAERRMSG).
	 * @param newRepairErrorMessage the new Error Message (Repair Task) to set
	 */
	public void setRepairErrorMessage(int newRepairErrorMessage) {
		_pcs.firePropertyChange("repairErrorMessage", this.repairErrorMessage, newRepairErrorMessage);
		this.repairErrorMessage = newRepairErrorMessage;
	}
	
	/**
	 * @return the ID of Unclassified Task (TR005-UNCLASTASK)
	 */
	public String getUnclassifiedID() {
		return this.unclassifiedID;
	}
	
	/**
	 * Changes the ID of Unclassified Task (TR005-UNCLASTASK).
	 * @param newUnclassifiedID the new ID of Unclassified Task to set
	 */
	public void setUnclassifiedID(String newUnclassifiedID) {
		_pcs.firePropertyChange("unclassifiedID", this.unclassifiedID, newUnclassifiedID);
		this.unclassifiedID = newUnclassifiedID;
	}
	
	/**
	 * @return the Error Message (Unclassified Task) (TR005-UNCLERRMSG)
	 */
	public int getUnclassifiedErrorMessage() {
		return this.unclassifiedErrorMessage;
	}
	
	/**
	 * Changes the Error Message (Unclassified Task) (TR005-UNCLERRMSG).
	 * @param newUnclassifiedErrorMessage the new Error Message (Unclassified Task) to set
	 */
	public void setUnclassifiedErrorMessage(int newUnclassifiedErrorMessage) {
		_pcs.firePropertyChange("unclassifiedErrorMessage", this.unclassifiedErrorMessage, newUnclassifiedErrorMessage);
		this.unclassifiedErrorMessage = newUnclassifiedErrorMessage;
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
