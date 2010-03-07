 
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
 * A class representing the SAP R/3 data structure DD05M.
 */
public class RFCForeignKeyField {

	private PropertyChangeSupport _pcs;

	private String fieldName;
	private String foreignTableName;
	private String foreignFieldName;
	private String checkTableName;
	private String checkFieldName;
	private int position;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCForeignKeyField() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCForeignKeyField(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.fieldName = source.getString("FIELDNAME"); //$NON-NLS-1$
		this.foreignTableName = source.getString("FORTABLE"); //$NON-NLS-1$
		this.foreignFieldName = source.getString("FORKEY"); //$NON-NLS-1$
		this.checkTableName = source.getString("CHECKTABLE"); //$NON-NLS-1$
		this.checkFieldName = source.getString("CHECKFIELD"); //$NON-NLS-1$
		this.position = source.getInt("PRIMPOS"); //$NON-NLS-1$
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
		targetStructure.setValue("FORTABLE", this.foreignTableName); //$NON-NLS-1$
		targetStructure.setValue("FORKEY", this.foreignFieldName); //$NON-NLS-1$
		targetStructure.setValue("CHECKTABLE", this.checkTableName); //$NON-NLS-1$
		targetStructure.setValue("CHECKFIELD", this.checkFieldName); //$NON-NLS-1$
		targetStructure.setValue("PRIMPOS", this.position); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCForeignKeyField> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCForeignKeyField entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCForeignKeyField> fromTable(JCoTable source) {
		List<RFCForeignKeyField> list = new ArrayList<RFCForeignKeyField>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCForeignKeyField(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD05M is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD05M")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD05M).", structureName));
		}
	}
	
	/**
	 * @return the name of the field to be checked (DD05M-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the name of the field to be checked (DD05M-FIELDNAME).
	 * @param newFieldName the new name of the field to be checked to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName); //$NON-NLS-1$
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the Table of the foreign key field (DD05M-FORTABLE)
	 */
	public String getForeignTableName() {
		return this.foreignTableName;
	}
	
	/**
	 * Changes the Table of the foreign key field (DD05M-FORTABLE).
	 * @param newForeignTableName the new Table of the foreign key field to set
	 */
	public void setForeignTableName(String newForeignTableName) {
		_pcs.firePropertyChange("foreignTableName", this.foreignTableName, newForeignTableName); //$NON-NLS-1$
		this.foreignTableName = newForeignTableName;
	}
	
	/**
	 * @return the Names of the foreign key fields (DD05M-FORKEY)
	 */
	public String getForeignFieldName() {
		return this.foreignFieldName;
	}
	
	/**
	 * Changes the Names of the foreign key fields (DD05M-FORKEY).
	 * @param newForeignFieldName the new Names of the foreign key fields to set
	 */
	public void setForeignFieldName(String newForeignFieldName) {
		_pcs.firePropertyChange("foreignFieldName", this.foreignFieldName, newForeignFieldName); //$NON-NLS-1$
		this.foreignFieldName = newForeignFieldName;
	}
	
	/**
	 * @return the Check table name of the foreign key (DD05M-CHECKTABLE)
	 */
	public String getCheckTableName() {
		return this.checkTableName;
	}
	
	/**
	 * Changes the Check table name of the foreign key (DD05M-CHECKTABLE).
	 * @param newCheckTableName the new Check table name of the foreign key to set
	 */
	public void setCheckTableName(String newCheckTableName) {
		_pcs.firePropertyChange("checkTableName", this.checkTableName, newCheckTableName); //$NON-NLS-1$
		this.checkTableName = newCheckTableName;
	}
	
	/**
	 * @return the Field name (DD05M-CHECKFIELD)
	 */
	public String getCheckFieldName() {
		return this.checkFieldName;
	}
	
	/**
	 * Changes the Field name (DD05M-CHECKFIELD).
	 * @param newCheckFieldName the new Field name to set
	 */
	public void setCheckFieldName(String newCheckFieldName) {
		_pcs.firePropertyChange("checkFieldName", this.checkFieldName, newCheckFieldName); //$NON-NLS-1$
		this.checkFieldName = newCheckFieldName;
	}
	
	/**
	 * @return the Position of corresp. foreign key field in primary key (DD05M-PRIMPOS)
	 */
	public int getPosition() {
		return this.position;
	}
	
	/**
	 * Changes the Position of corresp. foreign key field in primary key (DD05M-PRIMPOS).
	 * @param newPosition the new Position of corresp. foreign key field in primary key to set
	 */
	public void setPosition(int newPosition) {
		_pcs.firePropertyChange("position", this.position, newPosition); //$NON-NLS-1$
		this.position = newPosition;
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
