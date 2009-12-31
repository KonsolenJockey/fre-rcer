 
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
 * A class representing the SAP R/3 data structure DD02V.
 */
public class RFCDataStructureHeader {

	private PropertyChangeSupport _pcs;

	private String structureType;
	private String databaseTableName;
	private int minEntries;
	private int maxEntries;
	private int avgEntries;
	private boolean clientDependent;
	private String bufferSetting;
	private boolean compressed;
	private boolean languageDependent;
	private String description;
	private String maintenanceSetting;
	private String deliveryClass;
	private int bufferPercentage;
	private String viewClass;
	private String viewMaintenanceSetting;
	private String multiplexSetting;
	private boolean searchHelpAttached;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataStructureHeader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDataStructureHeader(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.structureType = source.getString("TABCLASS");
		this.databaseTableName = source.getString("SQLTAB");
		this.minEntries = source.getInt("DATMIN");
		this.maxEntries = source.getInt("DATMAX");
		this.avgEntries = source.getInt("DATAVG");
		this.clientDependent = source.getString("CLIDEP").equalsIgnoreCase("X");
		this.bufferSetting = source.getString("BUFFERED");
		this.compressed = source.getString("COMPRFLAG").equalsIgnoreCase("X");
		this.languageDependent = source.getString("LANGDEP").equalsIgnoreCase("X");
		this.description = source.getString("DDTEXT");
		this.maintenanceSetting = source.getString("MAINFLAG");
		this.deliveryClass = source.getString("CONTFLAG");
		this.bufferPercentage = source.getInt("PROZPUFF");
		this.viewClass = source.getString("VIEWCLASS");
		this.viewMaintenanceSetting = source.getString("VIEWGRANT");
		this.multiplexSetting = source.getString("MULTIPLEX");
		this.searchHelpAttached = source.getString("SHLPEXI").equalsIgnoreCase("X");
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("TABCLASS", this.structureType);
		targetStructure.setValue("SQLTAB", this.databaseTableName);
		targetStructure.setValue("DATMIN", this.minEntries);
		targetStructure.setValue("DATMAX", this.maxEntries);
		targetStructure.setValue("DATAVG", this.avgEntries);
		targetStructure.setValue("CLIDEP", this.clientDependent);
		targetStructure.setValue("BUFFERED", this.bufferSetting);
		targetStructure.setValue("COMPRFLAG", this.compressed);
		targetStructure.setValue("LANGDEP", this.languageDependent);
		targetStructure.setValue("DDTEXT", this.description);
		targetStructure.setValue("MAINFLAG", this.maintenanceSetting);
		targetStructure.setValue("CONTFLAG", this.deliveryClass);
		targetStructure.setValue("PROZPUFF", this.bufferPercentage);
		targetStructure.setValue("VIEWCLASS", this.viewClass);
		targetStructure.setValue("VIEWGRANT", this.viewMaintenanceSetting);
		targetStructure.setValue("MULTIPLEX", this.multiplexSetting);
		targetStructure.setValue("SHLPEXI", this.searchHelpAttached);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDataStructureHeader> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDataStructureHeader entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCDataStructureHeader> fromTable(JCoTable source) {
		List<RFCDataStructureHeader> list = new ArrayList<RFCDataStructureHeader>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDataStructureHeader(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD02V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD02V")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD02V).", structureName));
		}
	}
	
	/**
	 * @return the structure type (structure, table, view, ...) (DD02V-TABCLASS)
	 */
	public String getStructureType() {
		return this.structureType;
	}
	
	/**
	 * Changes the structure type (structure, table, view, ...) (DD02V-TABCLASS).
	 * @param newStructureType the new structure type (structure, table, view, ...) to set
	 */
	public void setStructureType(String newStructureType) {
		_pcs.firePropertyChange("structureType", this.structureType, newStructureType);
		this.structureType = newStructureType;
	}
	
	/**
	 * @return the name of the database table or extended table (DD02V-SQLTAB)
	 */
	public String getDatabaseTableName() {
		return this.databaseTableName;
	}
	
	/**
	 * Changes the name of the database table or extended table (DD02V-SQLTAB).
	 * @param newDatabaseTableName the new name of the database table or extended table to set
	 */
	public void setDatabaseTableName(String newDatabaseTableName) {
		_pcs.firePropertyChange("databaseTableName", this.databaseTableName, newDatabaseTableName);
		this.databaseTableName = newDatabaseTableName;
	}
	
	/**
	 * @return the minimum number of entries (DD02V-DATMIN)
	 */
	public int getMinEntries() {
		return this.minEntries;
	}
	
	/**
	 * Changes the minimum number of entries (DD02V-DATMIN).
	 * @param newMinEntries the new minimum number of entries to set
	 */
	public void setMinEntries(int newMinEntries) {
		_pcs.firePropertyChange("minEntries", this.minEntries, newMinEntries);
		this.minEntries = newMinEntries;
	}
	
	/**
	 * @return the maximum number of entries (DD02V-DATMAX)
	 */
	public int getMaxEntries() {
		return this.maxEntries;
	}
	
	/**
	 * Changes the maximum number of entries (DD02V-DATMAX).
	 * @param newMaxEntries the new maximum number of entries to set
	 */
	public void setMaxEntries(int newMaxEntries) {
		_pcs.firePropertyChange("maxEntries", this.maxEntries, newMaxEntries);
		this.maxEntries = newMaxEntries;
	}
	
	/**
	 * @return the average number of entries (DD02V-DATAVG)
	 */
	public int getAvgEntries() {
		return this.avgEntries;
	}
	
	/**
	 * Changes the average number of entries (DD02V-DATAVG).
	 * @param newAvgEntries the new average number of entries to set
	 */
	public void setAvgEntries(int newAvgEntries) {
		_pcs.firePropertyChange("avgEntries", this.avgEntries, newAvgEntries);
		this.avgEntries = newAvgEntries;
	}
	
	/**
	 * @return the whether the table is client-specific (DD02V-CLIDEP)
	 */
	public boolean isClientDependent() {
		return this.clientDependent;
	}
	
	/**
	 * Changes the whether the table is client-specific (DD02V-CLIDEP).
	 * @param newClientDependent the new whether the table is client-specific to set
	 */
	public void setClientDependent(boolean newClientDependent) {
		_pcs.firePropertyChange("clientDependent", this.clientDependent, newClientDependent);
		this.clientDependent = newClientDependent;
	}
	
	/**
	 * @return the buffering flag (DD02V-BUFFERED)
	 */
	public String getBufferSetting() {
		return this.bufferSetting;
	}
	
	/**
	 * Changes the buffering flag (DD02V-BUFFERED).
	 * @param newBufferSetting the new buffering flag to set
	 */
	public void setBufferSetting(String newBufferSetting) {
		_pcs.firePropertyChange("bufferSetting", this.bufferSetting, newBufferSetting);
		this.bufferSetting = newBufferSetting;
	}
	
	/**
	 * @return the field compression indicator (DD02V-COMPRFLAG)
	 */
	public boolean isCompressed() {
		return this.compressed;
	}
	
	/**
	 * Changes the field compression indicator (DD02V-COMPRFLAG).
	 * @param newCompressed the new field compression indicator to set
	 */
	public void setCompressed(boolean newCompressed) {
		_pcs.firePropertyChange("compressed", this.compressed, newCompressed);
		this.compressed = newCompressed;
	}
	
	/**
	 * @return the whether the table is language-dependent (DD02V-LANGDEP)
	 */
	public boolean isLanguageDependent() {
		return this.languageDependent;
	}
	
	/**
	 * Changes the whether the table is language-dependent (DD02V-LANGDEP).
	 * @param newLanguageDependent the new whether the table is language-dependent to set
	 */
	public void setLanguageDependent(boolean newLanguageDependent) {
		_pcs.firePropertyChange("languageDependent", this.languageDependent, newLanguageDependent);
		this.languageDependent = newLanguageDependent;
	}
	
	/**
	 * @return the description (DD02V-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the description (DD02V-DDTEXT).
	 * @param newDescription the new description to set
	 */
	public void setDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription);
		this.description = newDescription;
	}
	
	/**
	 * @return the to which extent maintenance with standard tools is allowed (DD02V-MAINFLAG)
	 */
	public String getMaintenanceSetting() {
		return this.maintenanceSetting;
	}
	
	/**
	 * Changes the to which extent maintenance with standard tools is allowed (DD02V-MAINFLAG).
	 * @param newMaintenanceSetting the new to which extent maintenance with standard tools is allowed to set
	 */
	public void setMaintenanceSetting(String newMaintenanceSetting) {
		_pcs.firePropertyChange("maintenanceSetting", this.maintenanceSetting, newMaintenanceSetting);
		this.maintenanceSetting = newMaintenanceSetting;
	}
	
	/**
	 * @return the delivery class (DD02V-CONTFLAG)
	 */
	public String getDeliveryClass() {
		return this.deliveryClass;
	}
	
	/**
	 * Changes the delivery class (DD02V-CONTFLAG).
	 * @param newDeliveryClass the new delivery class to set
	 */
	public void setDeliveryClass(String newDeliveryClass) {
		_pcs.firePropertyChange("deliveryClass", this.deliveryClass, newDeliveryClass);
		this.deliveryClass = newDeliveryClass;
	}
	
	/**
	 * @return the percentage for buffers (DD02V-PROZPUFF)
	 */
	public int getBufferPercentage() {
		return this.bufferPercentage;
	}
	
	/**
	 * Changes the percentage for buffers (DD02V-PROZPUFF).
	 * @param newBufferPercentage the new percentage for buffers to set
	 */
	public void setBufferPercentage(int newBufferPercentage) {
		_pcs.firePropertyChange("bufferPercentage", this.bufferPercentage, newBufferPercentage);
		this.bufferPercentage = newBufferPercentage;
	}
	
	/**
	 * @return the view type (DD02V-VIEWCLASS)
	 */
	public String getViewClass() {
		return this.viewClass;
	}
	
	/**
	 * Changes the view type (DD02V-VIEWCLASS).
	 * @param newViewClass the new view type to set
	 */
	public void setViewClass(String newViewClass) {
		_pcs.firePropertyChange("viewClass", this.viewClass, newViewClass);
		this.viewClass = newViewClass;
	}
	
	/**
	 * @return the maintenance status for view data (DD02V-VIEWGRANT)
	 */
	public String getViewMaintenanceSetting() {
		return this.viewMaintenanceSetting;
	}
	
	/**
	 * Changes the maintenance status for view data (DD02V-VIEWGRANT).
	 * @param newViewMaintenanceSetting the new maintenance status for view data to set
	 */
	public void setViewMaintenanceSetting(String newViewMaintenanceSetting) {
		_pcs.firePropertyChange("viewMaintenanceSetting", this.viewMaintenanceSetting, newViewMaintenanceSetting);
		this.viewMaintenanceSetting = newViewMaintenanceSetting;
	}
	
	/**
	 * @return the whether multiplexing is possible for a table (DD02V-MULTIPLEX)
	 */
	public String getMultiplexSetting() {
		return this.multiplexSetting;
	}
	
	/**
	 * Changes the whether multiplexing is possible for a table (DD02V-MULTIPLEX).
	 * @param newMultiplexSetting the new whether multiplexing is possible for a table to set
	 */
	public void setMultiplexSetting(String newMultiplexSetting) {
		_pcs.firePropertyChange("multiplexSetting", this.multiplexSetting, newMultiplexSetting);
		this.multiplexSetting = newMultiplexSetting;
	}
	
	/**
	 * @return the whether a search help attachment to table exists (DD02V-SHLPEXI)
	 */
	public boolean isSearchHelpAttached() {
		return this.searchHelpAttached;
	}
	
	/**
	 * Changes the whether a search help attachment to table exists (DD02V-SHLPEXI).
	 * @param newSearchHelpAttached the new whether a search help attachment to table exists to set
	 */
	public void setSearchHelpAttached(boolean newSearchHelpAttached) {
		_pcs.firePropertyChange("searchHelpAttached", this.searchHelpAttached, newSearchHelpAttached);
		this.searchHelpAttached = newSearchHelpAttached;
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
