 
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
 * A class representing the SAP R/3 data structure DD17V.
 */
public class RFCIndexField {

	private PropertyChangeSupport _pcs;

	private String indexName;
	private int position;
	private String fieldName;
	private boolean descending;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCIndexField() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCIndexField(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.indexName = source.getString("INDEXNAME");
		this.position = source.getInt("POSITION");
		this.fieldName = source.getString("FIELDNAME");
		this.descending = source.getString("DESCFLAG").equalsIgnoreCase("X");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("INDEXNAME", this.indexName);
		target.setValue("POSITION", this.position);
		target.setValue("FIELDNAME", this.fieldName);
		target.setValue("DESCFLAG", this.descending);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCIndexField> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCIndexField entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<RFCIndexField> fromTable(JCoTable source) {
		List<RFCIndexField> list = new ArrayList<RFCIndexField>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCIndexField(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD17V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD17V")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD17V).", structureName));
		}
	}
	
	/**
	 * @return the index ID (DD17V-INDEXNAME)
	 */
	public String getIndexName() {
		return this.indexName;
	}
	
	/**
	 * Changes the index ID (DD17V-INDEXNAME).
	 * @param newIndexName the new index ID to set
	 */
	public void setIndexName(String newIndexName) {
		_pcs.firePropertyChange("indexName", this.indexName, newIndexName);
		this.indexName = newIndexName;
	}
	
	/**
	 * @return the position of the field in the table (DD17V-POSITION)
	 */
	public int getPosition() {
		return this.position;
	}
	
	/**
	 * Changes the position of the field in the table (DD17V-POSITION).
	 * @param newPosition the new position of the field in the table to set
	 */
	public void setPosition(int newPosition) {
		_pcs.firePropertyChange("position", this.position, newPosition);
		this.position = newPosition;
	}
	
	/**
	 * @return the field name (DD17V-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the field name (DD17V-FIELDNAME).
	 * @param newFieldName the new field name to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName);
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the whether the index field is sorted in descending order (DD17V-DESCFLAG)
	 */
	public boolean isDescending() {
		return this.descending;
	}
	
	/**
	 * Changes the whether the index field is sorted in descending order (DD17V-DESCFLAG).
	 * @param newDescending the new whether the index field is sorted in descending order to set
	 */
	public void setDescending(boolean newDescending) {
		_pcs.firePropertyChange("descending", this.descending, newDescending);
		this.descending = newDescending;
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
