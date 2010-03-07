 
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
 * A class representing the SAP R/3 data structure DD12V.
 */
public class RFCIndexHeader {

	private PropertyChangeSupport _pcs;

	private String indexName;
	private boolean unique;
	private String databaseIndexName;
	private String databaseIndexState;
	private String databaseInclExclSign;
	private String databaseSystem1;
	private String databaseSystem2;
	private String databaseSystem3;
	private String databaseSystem4;
	private String description;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCIndexHeader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCIndexHeader(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.indexName = source.getString("INDEXNAME"); //$NON-NLS-1$
		this.unique = source.getString("UNIQUEFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.databaseIndexName = source.getString("DBINDEX"); //$NON-NLS-1$
		this.databaseIndexState = source.getString("DBSTATE"); //$NON-NLS-1$
		this.databaseInclExclSign = source.getString("DBINCLEXCL"); //$NON-NLS-1$
		this.databaseSystem1 = source.getString("DBSYSSEL1"); //$NON-NLS-1$
		this.databaseSystem2 = source.getString("DBSYSSEL2"); //$NON-NLS-1$
		this.databaseSystem3 = source.getString("DBSYSSEL3"); //$NON-NLS-1$
		this.databaseSystem4 = source.getString("DBSYSSEL4"); //$NON-NLS-1$
		this.description = source.getString("DDTEXT"); //$NON-NLS-1$
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
		targetStructure.setValue("INDEXNAME", this.indexName); //$NON-NLS-1$
		targetStructure.setValue("UNIQUEFLAG", this.unique); //$NON-NLS-1$
		targetStructure.setValue("DBINDEX", this.databaseIndexName); //$NON-NLS-1$
		targetStructure.setValue("DBSTATE", this.databaseIndexState); //$NON-NLS-1$
		targetStructure.setValue("DBINCLEXCL", this.databaseInclExclSign); //$NON-NLS-1$
		targetStructure.setValue("DBSYSSEL1", this.databaseSystem1); //$NON-NLS-1$
		targetStructure.setValue("DBSYSSEL2", this.databaseSystem2); //$NON-NLS-1$
		targetStructure.setValue("DBSYSSEL3", this.databaseSystem3); //$NON-NLS-1$
		targetStructure.setValue("DBSYSSEL4", this.databaseSystem4); //$NON-NLS-1$
		targetStructure.setValue("DDTEXT", this.description); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCIndexHeader> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCIndexHeader entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCIndexHeader> fromTable(JCoTable source) {
		List<RFCIndexHeader> list = new ArrayList<RFCIndexHeader>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCIndexHeader(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD12V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD12V")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD12V).", structureName));
		}
	}
	
	/**
	 * @return the index ID (DD12V-INDEXNAME)
	 */
	public String getIndexName() {
		return this.indexName;
	}
	
	/**
	 * Changes the index ID (DD12V-INDEXNAME).
	 * @param newIndexName the new index ID to set
	 */
	public void setIndexName(String newIndexName) {
		_pcs.firePropertyChange("indexName", this.indexName, newIndexName); //$NON-NLS-1$
		this.indexName = newIndexName;
	}
	
	/**
	 * @return the whether the index is a unique index (DD12V-UNIQUEFLAG)
	 */
	public boolean isUnique() {
		return this.unique;
	}
	
	/**
	 * Changes the whether the index is a unique index (DD12V-UNIQUEFLAG).
	 * @param newUnique the new whether the index is a unique index to set
	 */
	public void setUnique(boolean newUnique) {
		_pcs.firePropertyChange("unique", this.unique, newUnique); //$NON-NLS-1$
		this.unique = newUnique;
	}
	
	/**
	 * @return the database index (DD12V-DBINDEX)
	 */
	public String getDatabaseIndexName() {
		return this.databaseIndexName;
	}
	
	/**
	 * Changes the database index (DD12V-DBINDEX).
	 * @param newDatabaseIndexName the new database index to set
	 */
	public void setDatabaseIndexName(String newDatabaseIndexName) {
		_pcs.firePropertyChange("databaseIndexName", this.databaseIndexName, newDatabaseIndexName); //$NON-NLS-1$
		this.databaseIndexName = newDatabaseIndexName;
	}
	
	/**
	 * @return the status of index on the database (DD12V-DBSTATE)
	 */
	public String getDatabaseIndexState() {
		return this.databaseIndexState;
	}
	
	/**
	 * Changes the status of index on the database (DD12V-DBSTATE).
	 * @param newDatabaseIndexState the new status of index on the database to set
	 */
	public void setDatabaseIndexState(String newDatabaseIndexState) {
		_pcs.firePropertyChange("databaseIndexState", this.databaseIndexState, newDatabaseIndexState); //$NON-NLS-1$
		this.databaseIndexState = newDatabaseIndexState;
	}
	
	/**
	 * @return the whether the list of DB systems used as list of inclusions/exclusions (DD12V-DBINCLEXCL)
	 */
	public String getDatabaseInclExclSign() {
		return this.databaseInclExclSign;
	}
	
	/**
	 * Changes the whether the list of DB systems used as list of inclusions/exclusions (DD12V-DBINCLEXCL).
	 * @param newDatabaseInclExclSign the new whether the list of DB systems used as list of inclusions/exclusions to set
	 */
	public void setDatabaseInclExclSign(String newDatabaseInclExclSign) {
		_pcs.firePropertyChange("databaseInclExclSign", this.databaseInclExclSign, newDatabaseInclExclSign); //$NON-NLS-1$
		this.databaseInclExclSign = newDatabaseInclExclSign;
	}
	
	/**
	 * @return the an included or excluded DB system (DD12V-DBSYSSEL1)
	 */
	public String getDatabaseSystem1() {
		return this.databaseSystem1;
	}
	
	/**
	 * Changes the an included or excluded DB system (DD12V-DBSYSSEL1).
	 * @param newDatabaseSystem1 the new an included or excluded DB system to set
	 */
	public void setDatabaseSystem1(String newDatabaseSystem1) {
		_pcs.firePropertyChange("databaseSystem1", this.databaseSystem1, newDatabaseSystem1); //$NON-NLS-1$
		this.databaseSystem1 = newDatabaseSystem1;
	}
	
	/**
	 * @return the an included or excluded DB system (DD12V-DBSYSSEL2)
	 */
	public String getDatabaseSystem2() {
		return this.databaseSystem2;
	}
	
	/**
	 * Changes the an included or excluded DB system (DD12V-DBSYSSEL2).
	 * @param newDatabaseSystem2 the new an included or excluded DB system to set
	 */
	public void setDatabaseSystem2(String newDatabaseSystem2) {
		_pcs.firePropertyChange("databaseSystem2", this.databaseSystem2, newDatabaseSystem2); //$NON-NLS-1$
		this.databaseSystem2 = newDatabaseSystem2;
	}
	
	/**
	 * @return the an included or excluded DB system (DD12V-DBSYSSEL3)
	 */
	public String getDatabaseSystem3() {
		return this.databaseSystem3;
	}
	
	/**
	 * Changes the an included or excluded DB system (DD12V-DBSYSSEL3).
	 * @param newDatabaseSystem3 the new an included or excluded DB system to set
	 */
	public void setDatabaseSystem3(String newDatabaseSystem3) {
		_pcs.firePropertyChange("databaseSystem3", this.databaseSystem3, newDatabaseSystem3); //$NON-NLS-1$
		this.databaseSystem3 = newDatabaseSystem3;
	}
	
	/**
	 * @return the an included or excluded DB system (DD12V-DBSYSSEL4)
	 */
	public String getDatabaseSystem4() {
		return this.databaseSystem4;
	}
	
	/**
	 * Changes the an included or excluded DB system (DD12V-DBSYSSEL4).
	 * @param newDatabaseSystem4 the new an included or excluded DB system to set
	 */
	public void setDatabaseSystem4(String newDatabaseSystem4) {
		_pcs.firePropertyChange("databaseSystem4", this.databaseSystem4, newDatabaseSystem4); //$NON-NLS-1$
		this.databaseSystem4 = newDatabaseSystem4;
	}
	
	/**
	 * @return the explanatory short text (DD12V-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the explanatory short text (DD12V-DDTEXT).
	 * @param newDescription the new explanatory short text to set
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
