 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

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
		this.typeName = source.getString("DOMNAME"); //$NON-NLS-1$
		this.parameterID = source.getString("MEMORYID"); //$NON-NLS-1$
		this.logged = source.getString("LOGFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.headingLength = source.getInt("HEADLEN"); //$NON-NLS-1$
		this.shortTextLength = source.getInt("SCRLEN1"); //$NON-NLS-1$
		this.mediumTextLength = source.getInt("SCRLEN2"); //$NON-NLS-1$
		this.longTextLength = source.getInt("SCRLEN3"); //$NON-NLS-1$
		this.searchHelpName = source.getString("SHLPNAME"); //$NON-NLS-1$
		this.searchHelpField = source.getString("SHLPFIELD"); //$NON-NLS-1$
		this.defaultFieldName = source.getString("DEFFDNAME"); //$NON-NLS-1$
		this.dataType = source.getString("DATATYPE"); //$NON-NLS-1$
		this.length = source.getInt("LENG"); //$NON-NLS-1$
		this.decimals = source.getInt("DECIMALS"); //$NON-NLS-1$
		this.outputLength = source.getInt("OUTPUTLEN"); //$NON-NLS-1$
		this.caseSensitive = source.getString("LOWERCASE").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.signed = source.getString("SIGNFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.conversionExit = source.getString("CONVEXIT"); //$NON-NLS-1$
		this.valueListFixed = source.getString("VALEXI").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.valueTable = source.getString("ENTITYTAB"); //$NON-NLS-1$
		this.typeKind = source.getString("REFKIND"); //$NON-NLS-1$
		this.referenceKind = source.getString("REFTYPE"); //$NON-NLS-1$
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("DOMNAME", this.typeName); //$NON-NLS-1$
		targetStructure.setValue("MEMORYID", this.parameterID); //$NON-NLS-1$
		targetStructure.setValue("LOGFLAG", this.logged); //$NON-NLS-1$
		targetStructure.setValue("HEADLEN", this.headingLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN1", this.shortTextLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN2", this.mediumTextLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN3", this.longTextLength); //$NON-NLS-1$
		targetStructure.setValue("SHLPNAME", this.searchHelpName); //$NON-NLS-1$
		targetStructure.setValue("SHLPFIELD", this.searchHelpField); //$NON-NLS-1$
		targetStructure.setValue("DEFFDNAME", this.defaultFieldName); //$NON-NLS-1$
		targetStructure.setValue("DATATYPE", this.dataType); //$NON-NLS-1$
		targetStructure.setValue("LENG", this.length); //$NON-NLS-1$
		targetStructure.setValue("DECIMALS", this.decimals); //$NON-NLS-1$
		targetStructure.setValue("OUTPUTLEN", this.outputLength); //$NON-NLS-1$
		targetStructure.setValue("LOWERCASE", this.caseSensitive); //$NON-NLS-1$
		targetStructure.setValue("SIGNFLAG", this.signed); //$NON-NLS-1$
		targetStructure.setValue("CONVEXIT", this.conversionExit); //$NON-NLS-1$
		targetStructure.setValue("VALEXI", this.valueListFixed); //$NON-NLS-1$
		targetStructure.setValue("ENTITYTAB", this.valueTable); //$NON-NLS-1$
		targetStructure.setValue("REFKIND", this.typeKind); //$NON-NLS-1$
		targetStructure.setValue("REFTYPE", this.referenceKind); //$NON-NLS-1$
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
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
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
		if (!structureName.equals("DD04L")) { //$NON-NLS-1$
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
	public void setTypeName(String newTypeName) {
		_pcs.firePropertyChange("typeName", this.typeName, newTypeName); //$NON-NLS-1$
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
	public void setParameterID(String newParameterID) {
		_pcs.firePropertyChange("parameterID", this.parameterID, newParameterID); //$NON-NLS-1$
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
	public void setLogged(boolean newLogged) {
		_pcs.firePropertyChange("logged", this.logged, newLogged); //$NON-NLS-1$
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
	public void setHeadingLength(int newHeadingLength) {
		_pcs.firePropertyChange("headingLength", this.headingLength, newHeadingLength); //$NON-NLS-1$
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
	public void setShortTextLength(int newShortTextLength) {
		_pcs.firePropertyChange("shortTextLength", this.shortTextLength, newShortTextLength); //$NON-NLS-1$
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
	public void setMediumTextLength(int newMediumTextLength) {
		_pcs.firePropertyChange("mediumTextLength", this.mediumTextLength, newMediumTextLength); //$NON-NLS-1$
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
	public void setLongTextLength(int newLongTextLength) {
		_pcs.firePropertyChange("longTextLength", this.longTextLength, newLongTextLength); //$NON-NLS-1$
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
	public void setSearchHelpName(String newSearchHelpName) {
		_pcs.firePropertyChange("searchHelpName", this.searchHelpName, newSearchHelpName); //$NON-NLS-1$
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
	public void setSearchHelpField(String newSearchHelpField) {
		_pcs.firePropertyChange("searchHelpField", this.searchHelpField, newSearchHelpField); //$NON-NLS-1$
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
	public void setDefaultFieldName(String newDefaultFieldName) {
		_pcs.firePropertyChange("defaultFieldName", this.defaultFieldName, newDefaultFieldName); //$NON-NLS-1$
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
	public void setDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType); //$NON-NLS-1$
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
	public void setLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength); //$NON-NLS-1$
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
	public void setDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals); //$NON-NLS-1$
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
	public void setOutputLength(int newOutputLength) {
		_pcs.firePropertyChange("outputLength", this.outputLength, newOutputLength); //$NON-NLS-1$
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
	public void setCaseSensitive(boolean newCaseSensitive) {
		_pcs.firePropertyChange("caseSensitive", this.caseSensitive, newCaseSensitive); //$NON-NLS-1$
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
	public void setSigned(boolean newSigned) {
		_pcs.firePropertyChange("signed", this.signed, newSigned); //$NON-NLS-1$
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
	public void setConversionExit(String newConversionExit) {
		_pcs.firePropertyChange("conversionExit", this.conversionExit, newConversionExit); //$NON-NLS-1$
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
	public void setValueListFixed(boolean newValueListFixed) {
		_pcs.firePropertyChange("valueListFixed", this.valueListFixed, newValueListFixed); //$NON-NLS-1$
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
	public void setValueTable(String newValueTable) {
		_pcs.firePropertyChange("valueTable", this.valueTable, newValueTable); //$NON-NLS-1$
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
	public void setTypeKind(String newTypeKind) {
		_pcs.firePropertyChange("typeKind", this.typeKind, newTypeKind); //$NON-NLS-1$
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
	public void setReferenceKind(String newReferenceKind) {
		_pcs.firePropertyChange("referenceKind", this.referenceKind, newReferenceKind); //$NON-NLS-1$
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
