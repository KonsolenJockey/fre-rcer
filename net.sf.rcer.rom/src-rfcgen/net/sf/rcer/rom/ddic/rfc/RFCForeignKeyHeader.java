 
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
 * A class representing the SAP R/3 data structure DD08V.
 */
public class RFCForeignKeyHeader {

	private PropertyChangeSupport _pcs;

	private String fieldName;
	private String tableName;
	private String foreignKeyType;
	private String cardinalityRight;
	private boolean screenCheckDisabled;
	private String description;
	private String messageID;
	private String messageNumber;
	private String inheritance;
	private String cardinalityLeft;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCForeignKeyHeader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCForeignKeyHeader(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.fieldName = source.getString("FIELDNAME");
		this.tableName = source.getString("CHECKTABLE");
		this.foreignKeyType = source.getString("FRKART");
		this.cardinalityRight = source.getString("CARD");
		this.screenCheckDisabled = source.getString("CHECKFLAG").equalsIgnoreCase("X");
		this.description = source.getString("DDTEXT");
		this.messageID = source.getString("ARBGB");
		this.messageNumber = source.getString("MSGNR");
		this.inheritance = source.getString("NOINHERIT");
		this.cardinalityLeft = source.getString("CARDLEFT");
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("FIELDNAME", this.fieldName);
		targetStructure.setValue("CHECKTABLE", this.tableName);
		targetStructure.setValue("FRKART", this.foreignKeyType);
		targetStructure.setValue("CARD", this.cardinalityRight);
		targetStructure.setValue("CHECKFLAG", this.screenCheckDisabled);
		targetStructure.setValue("DDTEXT", this.description);
		targetStructure.setValue("ARBGB", this.messageID);
		targetStructure.setValue("MSGNR", this.messageNumber);
		targetStructure.setValue("NOINHERIT", this.inheritance);
		targetStructure.setValue("CARDLEFT", this.cardinalityLeft);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCForeignKeyHeader> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCForeignKeyHeader entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCForeignKeyHeader> fromTable(JCoTable source) {
		List<RFCForeignKeyHeader> list = new ArrayList<RFCForeignKeyHeader>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCForeignKeyHeader(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD08V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD08V")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD08V).", structureName));
		}
	}
	
	/**
	 * @return the name of the field to be checked (DD08V-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the name of the field to be checked (DD08V-FIELDNAME).
	 * @param newFieldName the new name of the field to be checked to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName);
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the check table name of the foreign key (DD08V-CHECKTABLE)
	 */
	public String getTableName() {
		return this.tableName;
	}
	
	/**
	 * Changes the check table name of the foreign key (DD08V-CHECKTABLE).
	 * @param newTableName the new check table name of the foreign key to set
	 */
	public void setTableName(String newTableName) {
		_pcs.firePropertyChange("tableName", this.tableName, newTableName);
		this.tableName = newTableName;
	}
	
	/**
	 * @return the dependency factor for semantic foreign keys (DD08V-FRKART)
	 */
	public String getForeignKeyType() {
		return this.foreignKeyType;
	}
	
	/**
	 * Changes the dependency factor for semantic foreign keys (DD08V-FRKART).
	 * @param newForeignKeyType the new dependency factor for semantic foreign keys to set
	 */
	public void setForeignKeyType(String newForeignKeyType) {
		_pcs.firePropertyChange("foreignKeyType", this.foreignKeyType, newForeignKeyType);
		this.foreignKeyType = newForeignKeyType;
	}
	
	/**
	 * @return the cardinality of a relationship (DD08V-CARD)
	 */
	public String getCardinalityRight() {
		return this.cardinalityRight;
	}
	
	/**
	 * Changes the cardinality of a relationship (DD08V-CARD).
	 * @param newCardinalityRight the new cardinality of a relationship to set
	 */
	public void setCardinalityRight(String newCardinalityRight) {
		_pcs.firePropertyChange("cardinalityRight", this.cardinalityRight, newCardinalityRight);
		this.cardinalityRight = newCardinalityRight;
	}
	
	/**
	 * @return the whether the check in screen processing is disabled (DD08V-CHECKFLAG)
	 */
	public boolean isScreenCheckDisabled() {
		return this.screenCheckDisabled;
	}
	
	/**
	 * Changes the whether the check in screen processing is disabled (DD08V-CHECKFLAG).
	 * @param newScreenCheckDisabled the new whether the check in screen processing is disabled to set
	 */
	public void setScreenCheckDisabled(boolean newScreenCheckDisabled) {
		_pcs.firePropertyChange("screenCheckDisabled", this.screenCheckDisabled, newScreenCheckDisabled);
		this.screenCheckDisabled = newScreenCheckDisabled;
	}
	
	/**
	 * @return the description (DD08V-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the description (DD08V-DDTEXT).
	 * @param newDescription the new description to set
	 */
	public void setDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription);
		this.description = newDescription;
	}
	
	/**
	 * @return the message class (DD08V-ARBGB)
	 */
	public String getMessageID() {
		return this.messageID;
	}
	
	/**
	 * Changes the message class (DD08V-ARBGB).
	 * @param newMessageID the new message class to set
	 */
	public void setMessageID(String newMessageID) {
		_pcs.firePropertyChange("messageID", this.messageID, newMessageID);
		this.messageID = newMessageID;
	}
	
	/**
	 * @return the message number (DD08V-MSGNR)
	 */
	public String getMessageNumber() {
		return this.messageNumber;
	}
	
	/**
	 * Changes the message number (DD08V-MSGNR).
	 * @param newMessageNumber the new message number to set
	 */
	public void setMessageNumber(String newMessageNumber) {
		_pcs.firePropertyChange("messageNumber", this.messageNumber, newMessageNumber);
		this.messageNumber = newMessageNumber;
	}
	
	/**
	 * @return the foreign key inheritance setting (DD08V-NOINHERIT)
	 */
	public String getInheritance() {
		return this.inheritance;
	}
	
	/**
	 * Changes the foreign key inheritance setting (DD08V-NOINHERIT).
	 * @param newInheritance the new foreign key inheritance setting to set
	 */
	public void setInheritance(String newInheritance) {
		_pcs.firePropertyChange("inheritance", this.inheritance, newInheritance);
		this.inheritance = newInheritance;
	}
	
	/**
	 * @return the Cardinality of a relationship (DD08V-CARDLEFT)
	 */
	public String getCardinalityLeft() {
		return this.cardinalityLeft;
	}
	
	/**
	 * Changes the Cardinality of a relationship (DD08V-CARDLEFT).
	 * @param newCardinalityLeft the new Cardinality of a relationship to set
	 */
	public void setCardinalityLeft(String newCardinalityLeft) {
		_pcs.firePropertyChange("cardinalityLeft", this.cardinalityLeft, newCardinalityLeft);
		this.cardinalityLeft = newCardinalityLeft;
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
