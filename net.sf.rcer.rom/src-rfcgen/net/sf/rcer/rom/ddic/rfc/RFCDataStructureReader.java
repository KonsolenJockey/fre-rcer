 
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
 * A class to model a RFC call to DD_TABL_GET. Use the setters to prepare the importing parameters, 
 * then invoke {@link #execute(JCoDestination)} to execute the call. The attributes of this instance 
 * will be updated to reflect the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * RFCDataStructureReader call = new RFCDataStructureReader();
 * call.setFoo(...);
 * call.execute(destination);
 * bar = call.getBar();
 * </pre></blockquote>
 */
public class RFCDataStructureReader {

	private PropertyChangeSupport _pcs;

	private String name;
	private String localeID;
	private boolean addText;
	private boolean addTypeInfo;
	private RFCDataStructureHeader header;
	private RFCTableTechSettings techSettings;
	private List<RFCDataStructureField> fields = new ArrayList<RFCDataStructureField>();
	private List<RFCForeignKeyHeader> foreignKeyHeaders = new ArrayList<RFCForeignKeyHeader>();
	private List<RFCForeignKeyField> foreignKeyFields = new ArrayList<RFCForeignKeyField>();
	private List<RFCIndexHeader> indexHeaders = new ArrayList<RFCIndexHeader>();
	private List<RFCIndexField> indexFields = new ArrayList<RFCIndexField>();
	private List<RFCSearchHelpHeader> searchHelpHeaders = new ArrayList<RFCSearchHelpHeader>();
	private List<RFCSearchHelpField> searchHelpFields = new ArrayList<RFCSearchHelpField>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataStructureReader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * @return the the name of the structure (strucutre, table, view, ...) (TABL_NAME)
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Changes the the name of the structure (strucutre, table, view, ...) (TABL_NAME).
	 * @param newName the new the name of the structure (strucutre, table, view, ...) to set
	 */
	public void setName(String newName) {
		_pcs.firePropertyChange("name", this.name, newName);
		this.name = newName;
	}
	
	/**
	 * @return the locale ID (LANGU)
	 */
	public String getLocaleID() {
		return this.localeID;
	}
	
	/**
	 * Changes the locale ID (LANGU).
	 * @param newLocaleID the new locale ID to set
	 */
	public void setLocaleID(String newLocaleID) {
		_pcs.firePropertyChange("localeID", this.localeID, newLocaleID);
		this.localeID = newLocaleID;
	}
	
	/**
	 * @return the whether to read the texts (WITHTEXT)
	 */
	public boolean isAddText() {
		return this.addText;
	}
	
	/**
	 * Changes the whether to read the texts (WITHTEXT).
	 * @param newAddText the new whether to read the texts to set
	 */
	public void setAddText(boolean newAddText) {
		_pcs.firePropertyChange("addText", this.addText, newAddText);
		this.addText = newAddText;
	}
	
	/**
	 * @return the whether to read the type information (ADD_TYPEINFO)
	 */
	public boolean isAddTypeInfo() {
		return this.addTypeInfo;
	}
	
	/**
	 * Changes the whether to read the type information (ADD_TYPEINFO).
	 * @param newAddTypeInfo the new whether to read the type information to set
	 */
	public void setAddTypeInfo(boolean newAddTypeInfo) {
		_pcs.firePropertyChange("addTypeInfo", this.addTypeInfo, newAddTypeInfo);
		this.addTypeInfo = newAddTypeInfo;
	}
	
	/**
	 * @return the the header of the structure (DD02V_WA_A)
	 */
	public RFCDataStructureHeader getHeader() {
		return this.header;
	}
	
	/**
	 * Changes the the header of the structure (DD02V_WA_A).
	 * @param newHeader the new the header of the structure to set
	 */
	public void setHeader(RFCDataStructureHeader newHeader) {
		_pcs.firePropertyChange("header", this.header, newHeader);
		this.header = newHeader;
	}
	
	/**
	 * @return the the technical settings of a table (DD09L_WA_A)
	 */
	public RFCTableTechSettings getTechSettings() {
		return this.techSettings;
	}
	
	/**
	 * Changes the the technical settings of a table (DD09L_WA_A).
	 * @param newTechSettings the new the technical settings of a table to set
	 */
	public void setTechSettings(RFCTableTechSettings newTechSettings) {
		_pcs.firePropertyChange("techSettings", this.techSettings, newTechSettings);
		this.techSettings = newTechSettings;
	}
	
	/**
	 * @return the the fields of the structure (DD03P_TAB_A)
	 */
	public List<RFCDataStructureField> getFields() {
		return this.fields;
	}
	
	/**
	 * Changes the the fields of the structure (DD03P_TAB_A).
	 * @param newFields the new the fields of the structure to set
	 */
	public void setFields(List<RFCDataStructureField> newFields) {
		_pcs.firePropertyChange("fields", this.fields, newFields);
		this.fields = newFields;
	}
	
	/**
	 * @return the the headers of the foreign key definitions (DD08V_TAB_A)
	 */
	public List<RFCForeignKeyHeader> getForeignKeyHeaders() {
		return this.foreignKeyHeaders;
	}
	
	/**
	 * Changes the the headers of the foreign key definitions (DD08V_TAB_A).
	 * @param newForeignKeyHeaders the new the headers of the foreign key definitions to set
	 */
	public void setForeignKeyHeaders(List<RFCForeignKeyHeader> newForeignKeyHeaders) {
		_pcs.firePropertyChange("foreignKeyHeaders", this.foreignKeyHeaders, newForeignKeyHeaders);
		this.foreignKeyHeaders = newForeignKeyHeaders;
	}
	
	/**
	 * @return the the fields of the foreign keys (DD05M_TAB_A)
	 */
	public List<RFCForeignKeyField> getForeignKeyFields() {
		return this.foreignKeyFields;
	}
	
	/**
	 * Changes the the fields of the foreign keys (DD05M_TAB_A).
	 * @param newForeignKeyFields the new the fields of the foreign keys to set
	 */
	public void setForeignKeyFields(List<RFCForeignKeyField> newForeignKeyFields) {
		_pcs.firePropertyChange("foreignKeyFields", this.foreignKeyFields, newForeignKeyFields);
		this.foreignKeyFields = newForeignKeyFields;
	}
	
	/**
	 * @return the the headers of the index definitions (DD12V_TAB_A)
	 */
	public List<RFCIndexHeader> getIndexHeaders() {
		return this.indexHeaders;
	}
	
	/**
	 * Changes the the headers of the index definitions (DD12V_TAB_A).
	 * @param newIndexHeaders the new the headers of the index definitions to set
	 */
	public void setIndexHeaders(List<RFCIndexHeader> newIndexHeaders) {
		_pcs.firePropertyChange("indexHeaders", this.indexHeaders, newIndexHeaders);
		this.indexHeaders = newIndexHeaders;
	}
	
	/**
	 * @return the the fields of the index definitions (DD17V_TAB_A)
	 */
	public List<RFCIndexField> getIndexFields() {
		return this.indexFields;
	}
	
	/**
	 * Changes the the fields of the index definitions (DD17V_TAB_A).
	 * @param newIndexFields the new the fields of the index definitions to set
	 */
	public void setIndexFields(List<RFCIndexField> newIndexFields) {
		_pcs.firePropertyChange("indexFields", this.indexFields, newIndexFields);
		this.indexFields = newIndexFields;
	}
	
	/**
	 * @return the the headers of the search help assignments (DD35V_TAB_A)
	 */
	public List<RFCSearchHelpHeader> getSearchHelpHeaders() {
		return this.searchHelpHeaders;
	}
	
	/**
	 * Changes the the headers of the search help assignments (DD35V_TAB_A).
	 * @param newSearchHelpHeaders the new the headers of the search help assignments to set
	 */
	public void setSearchHelpHeaders(List<RFCSearchHelpHeader> newSearchHelpHeaders) {
		_pcs.firePropertyChange("searchHelpHeaders", this.searchHelpHeaders, newSearchHelpHeaders);
		this.searchHelpHeaders = newSearchHelpHeaders;
	}
	
	/**
	 * @return the the fields of the search help assignments (DD36M_TAB_A)
	 */
	public List<RFCSearchHelpField> getSearchHelpFields() {
		return this.searchHelpFields;
	}
	
	/**
	 * Changes the the fields of the search help assignments (DD36M_TAB_A).
	 * @param newSearchHelpFields the new the fields of the search help assignments to set
	 */
	public void setSearchHelpFields(List<RFCSearchHelpField> newSearchHelpFields) {
		_pcs.firePropertyChange("searchHelpFields", this.searchHelpFields, newSearchHelpFields);
		this.searchHelpFields = newSearchHelpFields;
	}
	
	/**
	 * Executes the RFC call and updates the attributes accordingly.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public void execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("DD_TABL_GET");
		function.getImportParameterList().setValue("TABL_NAME", name);
		function.getImportParameterList().setValue("LANGU", localeID);
		function.getImportParameterList().setValue("WITHTEXT", addText ? "X" : " ");
		function.getImportParameterList().setValue("ADD_TYPEINFO", addTypeInfo ? "X" : " ");
		RFCDataStructureField.toTable(fields, function.getTableParameterList().getTable("DD03P_TAB_A"));
		RFCForeignKeyHeader.toTable(foreignKeyHeaders, function.getTableParameterList().getTable("DD08V_TAB_A"));
		RFCForeignKeyField.toTable(foreignKeyFields, function.getTableParameterList().getTable("DD05M_TAB_A"));
		RFCIndexHeader.toTable(indexHeaders, function.getTableParameterList().getTable("DD12V_TAB_A"));
		RFCIndexField.toTable(indexFields, function.getTableParameterList().getTable("DD17V_TAB_A"));
		RFCSearchHelpHeader.toTable(searchHelpHeaders, function.getTableParameterList().getTable("DD35V_TAB_A"));
		RFCSearchHelpField.toTable(searchHelpFields, function.getTableParameterList().getTable("DD36M_TAB_A"));
		function.execute(destination);
		header = new RFCDataStructureHeader(function.getExportParameterList().getStructure("DD02V_WA_A"));
		techSettings = new RFCTableTechSettings(function.getExportParameterList().getStructure("DD09L_WA_A"));
		fields = RFCDataStructureField.fromTable(function.getTableParameterList().getTable("DD03P_TAB_A"));
		foreignKeyHeaders = RFCForeignKeyHeader.fromTable(function.getTableParameterList().getTable("DD08V_TAB_A"));
		foreignKeyFields = RFCForeignKeyField.fromTable(function.getTableParameterList().getTable("DD05M_TAB_A"));
		indexHeaders = RFCIndexHeader.fromTable(function.getTableParameterList().getTable("DD12V_TAB_A"));
		indexFields = RFCIndexField.fromTable(function.getTableParameterList().getTable("DD17V_TAB_A"));
		searchHelpHeaders = RFCSearchHelpHeader.fromTable(function.getTableParameterList().getTable("DD35V_TAB_A"));
		searchHelpFields = RFCSearchHelpField.fromTable(function.getTableParameterList().getTable("DD36M_TAB_A"));
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
