 
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
 * A class representing the SAP R/3 data structure DD04L.
 */
public class RFCDataElementData {

	private PropertyChangeSupport _pcs;

	private String typeName;
	private String parameterID;
	private boolean logged;
	private int headingLength;
	private int shortTextLength;
	private int mediumTextLength;
	private int longTextLength;
	private String searchHelpName;
	private String searchHelpField;
	private String defaultFieldName;
	private String dataType;
	private int length;
	private int decimals;
	private int outputLength;
	private boolean caseSensitive;
	private boolean signed;
	private String conversionExit;
	private boolean valueListFixed;
	private String valueTable;
	private String typeKind;
	private String referenceKind;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataElementData() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDataElementData(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.typeName = source.getString("DOMNAME");
		this.parameterID = source.getString("MEMORYID");
		this.logged = source.getString("LOGFLAG").equalsIgnoreCase("X");
		this.headingLength = source.getInt("HEADLEN");
		this.shortTextLength = source.getInt("SCRLEN1");
		this.mediumTextLength = source.getInt("SCRLEN2");
		this.longTextLength = source.getInt("SCRLEN3");
		this.searchHelpName = source.getString("SHLPNAME");
		this.searchHelpField = source.getString("SHLPFIELD");
		this.defaultFieldName = source.getString("DEFFDNAME");
		this.dataType = source.getString("DATATYPE");
		this.length = source.getInt("LENG");
		this.decimals = source.getInt("DECIMALS");
		this.outputLength = source.getInt("OUTPUTLEN");
		this.caseSensitive = source.getString("LOWERCASE").equalsIgnoreCase("X");
		this.signed = source.getString("SIGNFLAG").equalsIgnoreCase("X");
		this.conversionExit = source.getString("CONVEXIT");
		this.valueListFixed = source.getString("VALEXI").equalsIgnoreCase("X");
		this.valueTable = source.getString("ENTITYTAB");
		this.typeKind = source.getString("REFKIND");
		this.referenceKind = source.getString("REFTYPE");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("DOMNAME", this.typeName);
		target.setValue("MEMORYID", this.parameterID);
		target.setValue("LOGFLAG", this.logged);
		target.setValue("HEADLEN", this.headingLength);
		target.setValue("SCRLEN1", this.shortTextLength);
		target.setValue("SCRLEN2", this.mediumTextLength);
		target.setValue("SCRLEN3", this.longTextLength);
		target.setValue("SHLPNAME", this.searchHelpName);
		target.setValue("SHLPFIELD", this.searchHelpField);
		target.setValue("DEFFDNAME", this.defaultFieldName);
		target.setValue("DATATYPE", this.dataType);
		target.setValue("LENG", this.length);
		target.setValue("DECIMALS", this.decimals);
		target.setValue("OUTPUTLEN", this.outputLength);
		target.setValue("LOWERCASE", this.caseSensitive);
		target.setValue("SIGNFLAG", this.signed);
		target.setValue("CONVEXIT", this.conversionExit);
		target.setValue("VALEXI", this.valueListFixed);
		target.setValue("ENTITYTAB", this.valueTable);
		target.setValue("REFKIND", this.typeKind);
		target.setValue("REFTYPE", this.referenceKind);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDataElementData> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDataElementData entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<RFCDataElementData> fromTable(JCoTable source) {
		List<RFCDataElementData> list = new ArrayList<RFCDataElementData>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDataElementData(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD04L is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD04L")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD04L).", structureName));
		}
	}
	
	/**
	 * @return the domain or referenced data type name (DD04L-DOMNAME)
	 */
	public String getTypeName() {
		return this.typeName;
	}
	
	/**
	 * Changes the domain or referenced data type name (DD04L-DOMNAME).
	 * @param newTypeName the new domain or referenced data type name to set
	 */
	public void setsetTypeName(String newTypeName) {
		_pcs.firePropertyChange("typeName", this.typeName, newTypeName);
		this.typeName = newTypeName;
	}
	
	/**
	 * @return the SET/GET parameter ID (DD04L-MEMORYID)
	 */
	public String getParameterID() {
		return this.parameterID;
	}
	
	/**
	 * Changes the SET/GET parameter ID (DD04L-MEMORYID).
	 * @param newParameterID the new SET/GET parameter ID to set
	 */
	public void setsetParameterID(String newParameterID) {
		_pcs.firePropertyChange("parameterID", this.parameterID, newParameterID);
		this.parameterID = newParameterID;
	}
	
	/**
	 * @return the whether this field occurs in change documents (DD04L-LOGFLAG)
	 */
	public boolean isLogged() {
		return this.logged;
	}
	
	/**
	 * Changes the whether this field occurs in change documents (DD04L-LOGFLAG).
	 * @param newLogged the new whether this field occurs in change documents to set
	 */
	public void setsetLogged(boolean newLogged) {
		_pcs.firePropertyChange("logged", this.logged, newLogged);
		this.logged = newLogged;
	}
	
	/**
	 * @return the maximum length of heading (DD04L-HEADLEN)
	 */
	public int getHeadingLength() {
		return this.headingLength;
	}
	
	/**
	 * Changes the maximum length of heading (DD04L-HEADLEN).
	 * @param newHeadingLength the new maximum length of heading to set
	 */
	public void setsetHeadingLength(int newHeadingLength) {
		_pcs.firePropertyChange("headingLength", this.headingLength, newHeadingLength);
		this.headingLength = newHeadingLength;
	}
	
	/**
	 * @return the maximum length of short field label (DD04L-SCRLEN1)
	 */
	public int getShortTextLength() {
		return this.shortTextLength;
	}
	
	/**
	 * Changes the maximum length of short field label (DD04L-SCRLEN1).
	 * @param newShortTextLength the new maximum length of short field label to set
	 */
	public void setsetShortTextLength(int newShortTextLength) {
		_pcs.firePropertyChange("shortTextLength", this.shortTextLength, newShortTextLength);
		this.shortTextLength = newShortTextLength;
	}
	
	/**
	 * @return the maximum length of medium field label (DD04L-SCRLEN2)
	 */
	public int getMediumTextLength() {
		return this.mediumTextLength;
	}
	
	/**
	 * Changes the maximum length of medium field label (DD04L-SCRLEN2).
	 * @param newMediumTextLength the new maximum length of medium field label to set
	 */
	public void setsetMediumTextLength(int newMediumTextLength) {
		_pcs.firePropertyChange("mediumTextLength", this.mediumTextLength, newMediumTextLength);
		this.mediumTextLength = newMediumTextLength;
	}
	
	/**
	 * @return the maximum length of long field label (DD04L-SCRLEN3)
	 */
	public int getLongTextLength() {
		return this.longTextLength;
	}
	
	/**
	 * Changes the maximum length of long field label (DD04L-SCRLEN3).
	 * @param newLongTextLength the new maximum length of long field label to set
	 */
	public void setsetLongTextLength(int newLongTextLength) {
		_pcs.firePropertyChange("longTextLength", this.longTextLength, newLongTextLength);
		this.longTextLength = newLongTextLength;
	}
	
	/**
	 * @return the name of a search help (DD04L-SHLPNAME)
	 */
	public String getSearchHelpName() {
		return this.searchHelpName;
	}
	
	/**
	 * Changes the name of a search help (DD04L-SHLPNAME).
	 * @param newSearchHelpName the new name of a search help to set
	 */
	public void setsetSearchHelpName(String newSearchHelpName) {
		_pcs.firePropertyChange("searchHelpName", this.searchHelpName, newSearchHelpName);
		this.searchHelpName = newSearchHelpName;
	}
	
	/**
	 * @return the name of a search help parameter (DD04L-SHLPFIELD)
	 */
	public String getSearchHelpField() {
		return this.searchHelpField;
	}
	
	/**
	 * Changes the name of a search help parameter (DD04L-SHLPFIELD).
	 * @param newSearchHelpField the new name of a search help parameter to set
	 */
	public void setsetSearchHelpField(String newSearchHelpField) {
		_pcs.firePropertyChange("searchHelpField", this.searchHelpField, newSearchHelpField);
		this.searchHelpField = newSearchHelpField;
	}
	
	/**
	 * @return the nefault name for components using the data element (DD04L-DEFFDNAME)
	 */
	public String getDefaultFieldName() {
		return this.defaultFieldName;
	}
	
	/**
	 * Changes the nefault name for components using the data element (DD04L-DEFFDNAME).
	 * @param newDefaultFieldName the new nefault name for components using the data element to set
	 */
	public void setsetDefaultFieldName(String newDefaultFieldName) {
		_pcs.firePropertyChange("defaultFieldName", this.defaultFieldName, newDefaultFieldName);
		this.defaultFieldName = newDefaultFieldName;
	}
	
	/**
	 * @return the data type in ABAP Dictionary (DD04L-DATATYPE)
	 */
	public String getDataType() {
		return this.dataType;
	}
	
	/**
	 * Changes the data type in ABAP Dictionary (DD04L-DATATYPE).
	 * @param newDataType the new data type in ABAP Dictionary to set
	 */
	public void setsetDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType);
		this.dataType = newDataType;
	}
	
	/**
	 * @return the length (number of characters) (DD04L-LENG)
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Changes the length (number of characters) (DD04L-LENG).
	 * @param newLength the new length (number of characters) to set
	 */
	public void setsetLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength);
		this.length = newLength;
	}
	
	/**
	 * @return the number of decimal places (DD04L-DECIMALS)
	 */
	public int getDecimals() {
		return this.decimals;
	}
	
	/**
	 * Changes the number of decimal places (DD04L-DECIMALS).
	 * @param newDecimals the new number of decimal places to set
	 */
	public void setsetDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals);
		this.decimals = newDecimals;
	}
	
	/**
	 * @return the output length (DD04L-OUTPUTLEN)
	 */
	public int getOutputLength() {
		return this.outputLength;
	}
	
	/**
	 * Changes the output length (DD04L-OUTPUTLEN).
	 * @param newOutputLength the new output length to set
	 */
	public void setsetOutputLength(int newOutputLength) {
		_pcs.firePropertyChange("outputLength", this.outputLength, newOutputLength);
		this.outputLength = newOutputLength;
	}
	
	/**
	 * @return the whether lower case letters are allowed (DD04L-LOWERCASE)
	 */
	public boolean isCaseSensitive() {
		return this.caseSensitive;
	}
	
	/**
	 * Changes the whether lower case letters are allowed (DD04L-LOWERCASE).
	 * @param newCaseSensitive the new whether lower case letters are allowed to set
	 */
	public void setsetCaseSensitive(boolean newCaseSensitive) {
		_pcs.firePropertyChange("caseSensitive", this.caseSensitive, newCaseSensitive);
		this.caseSensitive = newCaseSensitive;
	}
	
	/**
	 * @return the whether a numerical field is signed (DD04L-SIGNFLAG)
	 */
	public boolean isSigned() {
		return this.signed;
	}
	
	/**
	 * Changes the whether a numerical field is signed (DD04L-SIGNFLAG).
	 * @param newSigned the new whether a numerical field is signed to set
	 */
	public void setsetSigned(boolean newSigned) {
		_pcs.firePropertyChange("signed", this.signed, newSigned);
		this.signed = newSigned;
	}
	
	/**
	 * @return the conversion routine (DD04L-CONVEXIT)
	 */
	public String getConversionExit() {
		return this.conversionExit;
	}
	
	/**
	 * Changes the conversion routine (DD04L-CONVEXIT).
	 * @param newConversionExit the new conversion routine to set
	 */
	public void setsetConversionExit(String newConversionExit) {
		_pcs.firePropertyChange("conversionExit", this.conversionExit, newConversionExit);
		this.conversionExit = newConversionExit;
	}
	
	/**
	 * @return the whether fixed values exist (DD04L-VALEXI)
	 */
	public boolean isValueListFixed() {
		return this.valueListFixed;
	}
	
	/**
	 * Changes the whether fixed values exist (DD04L-VALEXI).
	 * @param newValueListFixed the new whether fixed values exist to set
	 */
	public void setsetValueListFixed(boolean newValueListFixed) {
		_pcs.firePropertyChange("valueListFixed", this.valueListFixed, newValueListFixed);
		this.valueListFixed = newValueListFixed;
	}
	
	/**
	 * @return the name of the value table (DD04L-ENTITYTAB)
	 */
	public String getValueTable() {
		return this.valueTable;
	}
	
	/**
	 * Changes the name of the value table (DD04L-ENTITYTAB).
	 * @param newValueTable the new name of the value table to set
	 */
	public void setsetValueTable(String newValueTable) {
		_pcs.firePropertyChange("valueTable", this.valueTable, newValueTable);
		this.valueTable = newValueTable;
	}
	
	/**
	 * @return the category of dictionary type (DD04L-REFKIND)
	 */
	public String getTypeKind() {
		return this.typeKind;
	}
	
	/**
	 * Changes the category of dictionary type (DD04L-REFKIND).
	 * @param newTypeKind the new category of dictionary type to set
	 */
	public void setsetTypeKind(String newTypeKind) {
		_pcs.firePropertyChange("typeKind", this.typeKind, newTypeKind);
		this.typeKind = newTypeKind;
	}
	
	/**
	 * @return the type of object referenced (DD04L-REFTYPE)
	 */
	public String getReferenceKind() {
		return this.referenceKind;
	}
	
	/**
	 * Changes the type of object referenced (DD04L-REFTYPE).
	 * @param newReferenceKind the new type of object referenced to set
	 */
	public void setsetReferenceKind(String newReferenceKind) {
		_pcs.firePropertyChange("referenceKind", this.referenceKind, newReferenceKind);
		this.referenceKind = newReferenceKind;
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
