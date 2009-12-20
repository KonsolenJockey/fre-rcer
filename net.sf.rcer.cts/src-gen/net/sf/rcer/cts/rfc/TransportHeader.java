 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure TR001.
 */
public class TransportHeader {

	private PropertyChangeSupport _pcs;

	private String transportID;
	private String type;
	private String status;
	private String target;
	private String category;
	private String user;
	private Date lastChangeDate;
	private Date lastChangeTime;
	private String parentID;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public TransportHeader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public TransportHeader(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.transportID = source.getString("TRKORR");
		this.type = source.getString("TRFUNCTION");
		this.status = source.getString("TRSTATUS");
		this.target = source.getString("TARSYSTEM");
		this.category = source.getString("KORRDEV");
		this.user = source.getString("AS4USER");
		this.lastChangeDate = source.getDate("AS4DATE");
		this.lastChangeTime = source.getDate("AS4TIME");
		this.parentID = source.getString("STRKORR");
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
		target.setValue("TRFUNCTION", this.type);
		target.setValue("TRSTATUS", this.status);
		target.setValue("TARSYSTEM", this.target);
		target.setValue("KORRDEV", this.category);
		target.setValue("AS4USER", this.user);
		target.setValue("AS4DATE", this.lastChangeDate);
		target.setValue("AS4TIME", this.lastChangeTime);
		target.setValue("STRKORR", this.parentID);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<TransportHeader> source, JCoTable destination) {
		destination.deleteAllRows();
		for (TransportHeader entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<TransportHeader> fromTable(JCoTable source) {
		List<TransportHeader> list = new ArrayList<TransportHeader>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new TransportHeader(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than TR001 is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("TR001")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected TR001).", structureName));
		}
	}
	
	/**
	 * @return the Request or Task (TR001-TRKORR)
	 */
	public String getTransportID() {
		return this.transportID;
	}
	
	/**
	 * Changes the Request or Task (TR001-TRKORR).
	 * @param newTransportID the new Request or Task to set
	 */
	public void setTransportID(String newTransportID) {
		_pcs.firePropertyChange("transportID", this.transportID, newTransportID);
		this.transportID = newTransportID;
	}
	
	/**
	 * @return the Transport Type (Function) (TR001-TRFUNCTION)
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * Changes the Transport Type (Function) (TR001-TRFUNCTION).
	 * @param newType the new Transport Type (Function) to set
	 */
	public void setType(String newType) {
		_pcs.firePropertyChange("type", this.type, newType);
		this.type = newType;
	}
	
	/**
	 * @return the Status (TR001-TRSTATUS)
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * Changes the Status (TR001-TRSTATUS).
	 * @param newStatus the new Status to set
	 */
	public void setStatus(String newStatus) {
		_pcs.firePropertyChange("status", this.status, newStatus);
		this.status = newStatus;
	}
	
	/**
	 * @return the Transport destination (TR001-TARSYSTEM)
	 */
	public String getTarget() {
		return this.target;
	}
	
	/**
	 * Changes the Transport destination (TR001-TARSYSTEM).
	 * @param newTarget the new Transport destination to set
	 */
	public void setTarget(String newTarget) {
		_pcs.firePropertyChange("target", this.target, newTarget);
		this.target = newTarget;
	}
	
	/**
	 * @return the Category (TR001-KORRDEV)
	 */
	public String getCategory() {
		return this.category;
	}
	
	/**
	 * Changes the Category (TR001-KORRDEV).
	 * @param newCategory the new Category to set
	 */
	public void setCategory(String newCategory) {
		_pcs.firePropertyChange("category", this.category, newCategory);
		this.category = newCategory;
	}
	
	/**
	 * @return the Last changed by (TR001-AS4USER)
	 */
	public String getUser() {
		return this.user;
	}
	
	/**
	 * Changes the Last changed by (TR001-AS4USER).
	 * @param newUser the new Last changed by to set
	 */
	public void setUser(String newUser) {
		_pcs.firePropertyChange("user", this.user, newUser);
		this.user = newUser;
	}
	
	/**
	 * @return the Last changed on (TR001-AS4DATE)
	 */
	public Date getLastChangeDate() {
		return this.lastChangeDate;
	}
	
	/**
	 * Changes the Last changed on (TR001-AS4DATE).
	 * @param newLastChangeDate the new Last changed on to set
	 */
	public void setLastChangeDate(Date newLastChangeDate) {
		_pcs.firePropertyChange("lastChangeDate", this.lastChangeDate, newLastChangeDate);
		this.lastChangeDate = newLastChangeDate;
	}
	
	/**
	 * @return the Last changed at (TR001-AS4TIME)
	 */
	public Date getLastChangeTime() {
		return this.lastChangeTime;
	}
	
	/**
	 * Changes the Last changed at (TR001-AS4TIME).
	 * @param newLastChangeTime the new Last changed at to set
	 */
	public void setLastChangeTime(Date newLastChangeTime) {
		_pcs.firePropertyChange("lastChangeTime", this.lastChangeTime, newLastChangeTime);
		this.lastChangeTime = newLastChangeTime;
	}
	
	/**
	 * @return the Higher-level request (TR001-STRKORR)
	 */
	public String getParentID() {
		return this.parentID;
	}
	
	/**
	 * Changes the Higher-level request (TR001-STRKORR).
	 * @param newParentID the new Higher-level request to set
	 */
	public void setParentID(String newParentID) {
		_pcs.firePropertyChange("parentID", this.parentID, newParentID);
		this.parentID = newParentID;
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
