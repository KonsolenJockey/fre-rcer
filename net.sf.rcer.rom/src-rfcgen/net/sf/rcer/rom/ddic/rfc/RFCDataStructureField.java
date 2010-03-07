 
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
 * A class representing the SAP R/3 data structure DD03P.
 */
public class RFCDataStructureField {

	private PropertyChangeSupport _pcs;

	private String fieldName;
	private int osition;
	private boolean keyField;
	private String mandatory;
	private String dataElementName;
	private String checkTableName;
	private String nestingDepth;
	private String internalType;
	private int internalLength;
	private String referenceTable;
	private String includedStructure;
	private String referenceField;
	private boolean notNull;
	private String domainName;
	private String parameterID;
	private boolean logged;
	private int headingLength;
	private int shortTextLength;
	private int mediumTextLength;
	private int longTextLength;
	private String dataType;
	private int length;
	private int outputLength;
	private int decimals;
	private boolean caseSensitive;
	private boolean signed;
	private boolean valueListFixed;
	private String valueTable;
	private String conversionExit;
	private String description;
	private String searchHelpOrigin;
	private String searchHelpName;
	private String searchHelpField;
	private boolean nestedTable;
	private int typeDepth;
	private String componentType;
	private String defaultFieldName;
	private String groupName;
	private String referenceKind;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataStructureField() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDataStructureField(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.fieldName = source.getString("FIELDNAME"); //$NON-NLS-1$
		this.osition = source.getInt("POSITION"); //$NON-NLS-1$
		this.keyField = source.getString("KEYFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.mandatory = source.getString("MANDATORY"); //$NON-NLS-1$
		this.dataElementName = source.getString("ROLLNAME"); //$NON-NLS-1$
		this.checkTableName = source.getString("CHECKTABLE"); //$NON-NLS-1$
		this.nestingDepth = source.getString("ADMINFIELD"); //$NON-NLS-1$
		this.internalType = source.getString("INTTYPE"); //$NON-NLS-1$
		this.internalLength = source.getInt("INTLEN"); //$NON-NLS-1$
		this.referenceTable = source.getString("REFTABLE"); //$NON-NLS-1$
		this.includedStructure = source.getString("PRECFIELD"); //$NON-NLS-1$
		this.referenceField = source.getString("REFFIELD"); //$NON-NLS-1$
		this.notNull = source.getString("NOTNULL").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.domainName = source.getString("DOMNAME"); //$NON-NLS-1$
		this.parameterID = source.getString("MEMORYID"); //$NON-NLS-1$
		this.logged = source.getString("LOGFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.headingLength = source.getInt("HEADLEN"); //$NON-NLS-1$
		this.shortTextLength = source.getInt("SCRLEN1"); //$NON-NLS-1$
		this.mediumTextLength = source.getInt("SCRLEN2"); //$NON-NLS-1$
		this.longTextLength = source.getInt("SCRLEN3"); //$NON-NLS-1$
		this.dataType = source.getString("DATATYPE"); //$NON-NLS-1$
		this.length = source.getInt("LENG"); //$NON-NLS-1$
		this.outputLength = source.getInt("OUTPUTLEN"); //$NON-NLS-1$
		this.decimals = source.getInt("DECIMALS"); //$NON-NLS-1$
		this.caseSensitive = source.getString("LOWERCASE").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.signed = source.getString("SIGNFLAG").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.valueListFixed = source.getString("VALEXI").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.valueTable = source.getString("ENTITYTAB"); //$NON-NLS-1$
		this.conversionExit = source.getString("CONVEXIT"); //$NON-NLS-1$
		this.description = source.getString("DDTEXT"); //$NON-NLS-1$
		this.searchHelpOrigin = source.getString("SHLPORIGIN"); //$NON-NLS-1$
		this.searchHelpName = source.getString("SHLPNAME"); //$NON-NLS-1$
		this.searchHelpField = source.getString("SHLPFIELD"); //$NON-NLS-1$
		this.nestedTable = source.getString("TABLETYPE").equalsIgnoreCase("X"); //$NON-NLS-1$ //$NON-NLS-2$
		this.typeDepth = source.getInt("DEPTH"); //$NON-NLS-1$
		this.componentType = source.getString("COMPTYPE"); //$NON-NLS-1$
		this.defaultFieldName = source.getString("DEFFDNAME"); //$NON-NLS-1$
		this.groupName = source.getString("GROUPNAME"); //$NON-NLS-1$
		this.referenceKind = source.getString("REFTYPE"); //$NON-NLS-1$
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
		targetStructure.setValue("POSITION", this.osition); //$NON-NLS-1$
		targetStructure.setValue("KEYFLAG", this.keyField); //$NON-NLS-1$
		targetStructure.setValue("MANDATORY", this.mandatory); //$NON-NLS-1$
		targetStructure.setValue("ROLLNAME", this.dataElementName); //$NON-NLS-1$
		targetStructure.setValue("CHECKTABLE", this.checkTableName); //$NON-NLS-1$
		targetStructure.setValue("ADMINFIELD", this.nestingDepth); //$NON-NLS-1$
		targetStructure.setValue("INTTYPE", this.internalType); //$NON-NLS-1$
		targetStructure.setValue("INTLEN", this.internalLength); //$NON-NLS-1$
		targetStructure.setValue("REFTABLE", this.referenceTable); //$NON-NLS-1$
		targetStructure.setValue("PRECFIELD", this.includedStructure); //$NON-NLS-1$
		targetStructure.setValue("REFFIELD", this.referenceField); //$NON-NLS-1$
		targetStructure.setValue("NOTNULL", this.notNull); //$NON-NLS-1$
		targetStructure.setValue("DOMNAME", this.domainName); //$NON-NLS-1$
		targetStructure.setValue("MEMORYID", this.parameterID); //$NON-NLS-1$
		targetStructure.setValue("LOGFLAG", this.logged); //$NON-NLS-1$
		targetStructure.setValue("HEADLEN", this.headingLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN1", this.shortTextLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN2", this.mediumTextLength); //$NON-NLS-1$
		targetStructure.setValue("SCRLEN3", this.longTextLength); //$NON-NLS-1$
		targetStructure.setValue("DATATYPE", this.dataType); //$NON-NLS-1$
		targetStructure.setValue("LENG", this.length); //$NON-NLS-1$
		targetStructure.setValue("OUTPUTLEN", this.outputLength); //$NON-NLS-1$
		targetStructure.setValue("DECIMALS", this.decimals); //$NON-NLS-1$
		targetStructure.setValue("LOWERCASE", this.caseSensitive); //$NON-NLS-1$
		targetStructure.setValue("SIGNFLAG", this.signed); //$NON-NLS-1$
		targetStructure.setValue("VALEXI", this.valueListFixed); //$NON-NLS-1$
		targetStructure.setValue("ENTITYTAB", this.valueTable); //$NON-NLS-1$
		targetStructure.setValue("CONVEXIT", this.conversionExit); //$NON-NLS-1$
		targetStructure.setValue("DDTEXT", this.description); //$NON-NLS-1$
		targetStructure.setValue("SHLPORIGIN", this.searchHelpOrigin); //$NON-NLS-1$
		targetStructure.setValue("SHLPNAME", this.searchHelpName); //$NON-NLS-1$
		targetStructure.setValue("SHLPFIELD", this.searchHelpField); //$NON-NLS-1$
		targetStructure.setValue("TABLETYPE", this.nestedTable); //$NON-NLS-1$
		targetStructure.setValue("DEPTH", this.typeDepth); //$NON-NLS-1$
		targetStructure.setValue("COMPTYPE", this.componentType); //$NON-NLS-1$
		targetStructure.setValue("DEFFDNAME", this.defaultFieldName); //$NON-NLS-1$
		targetStructure.setValue("GROUPNAME", this.groupName); //$NON-NLS-1$
		targetStructure.setValue("REFTYPE", this.referenceKind); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDataStructureField> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDataStructureField entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCDataStructureField> fromTable(JCoTable source) {
		List<RFCDataStructureField> list = new ArrayList<RFCDataStructureField>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDataStructureField(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD03P is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD03P")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD03P).", structureName));
		}
	}
	
	/**
	 * @return the field name (DD03P-FIELDNAME)
	 */
	public String getFieldName() {
		return this.fieldName;
	}
	
	/**
	 * Changes the field name (DD03P-FIELDNAME).
	 * @param newFieldName the new field name to set
	 */
	public void setFieldName(String newFieldName) {
		_pcs.firePropertyChange("fieldName", this.fieldName, newFieldName); //$NON-NLS-1$
		this.fieldName = newFieldName;
	}
	
	/**
	 * @return the position of the field in the table (DD03P-POSITION)
	 */
	public int getOsition() {
		return this.osition;
	}
	
	/**
	 * Changes the position of the field in the table (DD03P-POSITION).
	 * @param newOsition the new position of the field in the table to set
	 */
	public void setOsition(int newOsition) {
		_pcs.firePropertyChange("osition", this.osition, newOsition); //$NON-NLS-1$
		this.osition = newOsition;
	}
	
	/**
	 * @return the whether the field is a key field (DD03P-KEYFLAG)
	 */
	public boolean isKeyField() {
		return this.keyField;
	}
	
	/**
	 * Changes the whether the field is a key field (DD03P-KEYFLAG).
	 * @param newKeyField the new whether the field is a key field to set
	 */
	public void setKeyField(boolean newKeyField) {
		_pcs.firePropertyChange("keyField", this.keyField, newKeyField); //$NON-NLS-1$
		this.keyField = newKeyField;
	}
	
	/**
	 * @return the whether the field is required (DD03P-MANDATORY)
	 */
	public String getMandatory() {
		return this.mandatory;
	}
	
	/**
	 * Changes the whether the field is required (DD03P-MANDATORY).
	 * @param newMandatory the new whether the field is required to set
	 */
	public void setMandatory(String newMandatory) {
		_pcs.firePropertyChange("mandatory", this.mandatory, newMandatory); //$NON-NLS-1$
		this.mandatory = newMandatory;
	}
	
	/**
	 * @return the Data element (semantic domain) (DD03P-ROLLNAME)
	 */
	public String getDataElementName() {
		return this.dataElementName;
	}
	
	/**
	 * Changes the Data element (semantic domain) (DD03P-ROLLNAME).
	 * @param newDataElementName the new Data element (semantic domain) to set
	 */
	public void setDataElementName(String newDataElementName) {
		_pcs.firePropertyChange("dataElementName", this.dataElementName, newDataElementName); //$NON-NLS-1$
		this.dataElementName = newDataElementName;
	}
	
	/**
	 * @return the Check table name of the foreign key (DD03P-CHECKTABLE)
	 */
	public String getCheckTableName() {
		return this.checkTableName;
	}
	
	/**
	 * Changes the Check table name of the foreign key (DD03P-CHECKTABLE).
	 * @param newCheckTableName the new Check table name of the foreign key to set
	 */
	public void setCheckTableName(String newCheckTableName) {
		_pcs.firePropertyChange("checkTableName", this.checkTableName, newCheckTableName); //$NON-NLS-1$
		this.checkTableName = newCheckTableName;
	}
	
	/**
	 * @return the Nesting depth for includes (DD03P-ADMINFIELD)
	 */
	public String getNestingDepth() {
		return this.nestingDepth;
	}
	
	/**
	 * Changes the Nesting depth for includes (DD03P-ADMINFIELD).
	 * @param newNestingDepth the new Nesting depth for includes to set
	 */
	public void setNestingDepth(String newNestingDepth) {
		_pcs.firePropertyChange("nestingDepth", this.nestingDepth, newNestingDepth); //$NON-NLS-1$
		this.nestingDepth = newNestingDepth;
	}
	
	/**
	 * @return the ABAP data type (C,D,N,...) (DD03P-INTTYPE)
	 */
	public String getInternalType() {
		return this.internalType;
	}
	
	/**
	 * Changes the ABAP data type (C,D,N,...) (DD03P-INTTYPE).
	 * @param newInternalType the new ABAP data type (C,D,N,...) to set
	 */
	public void setInternalType(String newInternalType) {
		_pcs.firePropertyChange("internalType", this.internalType, newInternalType); //$NON-NLS-1$
		this.internalType = newInternalType;
	}
	
	/**
	 * @return the Internal length in bytes (DD03P-INTLEN)
	 */
	public int getInternalLength() {
		return this.internalLength;
	}
	
	/**
	 * Changes the Internal length in bytes (DD03P-INTLEN).
	 * @param newInternalLength the new Internal length in bytes to set
	 */
	public void setInternalLength(int newInternalLength) {
		_pcs.firePropertyChange("internalLength", this.internalLength, newInternalLength); //$NON-NLS-1$
		this.internalLength = newInternalLength;
	}
	
	/**
	 * @return the Table for reference field (DD03P-REFTABLE)
	 */
	public String getReferenceTable() {
		return this.referenceTable;
	}
	
	/**
	 * Changes the Table for reference field (DD03P-REFTABLE).
	 * @param newReferenceTable the new Table for reference field to set
	 */
	public void setReferenceTable(String newReferenceTable) {
		_pcs.firePropertyChange("referenceTable", this.referenceTable, newReferenceTable); //$NON-NLS-1$
		this.referenceTable = newReferenceTable;
	}
	
	/**
	 * @return the Name of included table (DD03P-PRECFIELD)
	 */
	public String getIncludedStructure() {
		return this.includedStructure;
	}
	
	/**
	 * Changes the Name of included table (DD03P-PRECFIELD).
	 * @param newIncludedStructure the new Name of included table to set
	 */
	public void setIncludedStructure(String newIncludedStructure) {
		_pcs.firePropertyChange("includedStructure", this.includedStructure, newIncludedStructure); //$NON-NLS-1$
		this.includedStructure = newIncludedStructure;
	}
	
	/**
	 * @return the Reference field for currency and qty fields (DD03P-REFFIELD)
	 */
	public String getReferenceField() {
		return this.referenceField;
	}
	
	/**
	 * Changes the Reference field for currency and qty fields (DD03P-REFFIELD).
	 * @param newReferenceField the new Reference field for currency and qty fields to set
	 */
	public void setReferenceField(String newReferenceField) {
		_pcs.firePropertyChange("referenceField", this.referenceField, newReferenceField); //$NON-NLS-1$
		this.referenceField = newReferenceField;
	}
	
	/**
	 * @return the Indicator that NOT NULL is forced for this field (DD03P-NOTNULL)
	 */
	public boolean isNotNull() {
		return this.notNull;
	}
	
	/**
	 * Changes the Indicator that NOT NULL is forced for this field (DD03P-NOTNULL).
	 * @param newNotNull the new Indicator that NOT NULL is forced for this field to set
	 */
	public void setNotNull(boolean newNotNull) {
		_pcs.firePropertyChange("notNull", this.notNull, newNotNull); //$NON-NLS-1$
		this.notNull = newNotNull;
	}
	
	/**
	 * @return the domain name (DD03P-DOMNAME)
	 */
	public String getDomainName() {
		return this.domainName;
	}
	
	/**
	 * Changes the domain name (DD03P-DOMNAME).
	 * @param newDomainName the new domain name to set
	 */
	public void setDomainName(String newDomainName) {
		_pcs.firePropertyChange("domainName", this.domainName, newDomainName); //$NON-NLS-1$
		this.domainName = newDomainName;
	}
	
	/**
	 * @return the SET/GET parameter ID (DD03P-MEMORYID)
	 */
	public String getParameterID() {
		return this.parameterID;
	}
	
	/**
	 * Changes the SET/GET parameter ID (DD03P-MEMORYID).
	 * @param newParameterID the new SET/GET parameter ID to set
	 */
	public void setParameterID(String newParameterID) {
		_pcs.firePropertyChange("parameterID", this.parameterID, newParameterID); //$NON-NLS-1$
		this.parameterID = newParameterID;
	}
	
	/**
	 * @return the whether this field occurs in change documents (DD03P-LOGFLAG)
	 */
	public boolean isLogged() {
		return this.logged;
	}
	
	/**
	 * Changes the whether this field occurs in change documents (DD03P-LOGFLAG).
	 * @param newLogged the new whether this field occurs in change documents to set
	 */
	public void setLogged(boolean newLogged) {
		_pcs.firePropertyChange("logged", this.logged, newLogged); //$NON-NLS-1$
		this.logged = newLogged;
	}
	
	/**
	 * @return the maximum length of heading (DD03P-HEADLEN)
	 */
	public int getHeadingLength() {
		return this.headingLength;
	}
	
	/**
	 * Changes the maximum length of heading (DD03P-HEADLEN).
	 * @param newHeadingLength the new maximum length of heading to set
	 */
	public void setHeadingLength(int newHeadingLength) {
		_pcs.firePropertyChange("headingLength", this.headingLength, newHeadingLength); //$NON-NLS-1$
		this.headingLength = newHeadingLength;
	}
	
	/**
	 * @return the maximum length of short field label (DD03P-SCRLEN1)
	 */
	public int getShortTextLength() {
		return this.shortTextLength;
	}
	
	/**
	 * Changes the maximum length of short field label (DD03P-SCRLEN1).
	 * @param newShortTextLength the new maximum length of short field label to set
	 */
	public void setShortTextLength(int newShortTextLength) {
		_pcs.firePropertyChange("shortTextLength", this.shortTextLength, newShortTextLength); //$NON-NLS-1$
		this.shortTextLength = newShortTextLength;
	}
	
	/**
	 * @return the maximum length of medium field label (DD03P-SCRLEN2)
	 */
	public int getMediumTextLength() {
		return this.mediumTextLength;
	}
	
	/**
	 * Changes the maximum length of medium field label (DD03P-SCRLEN2).
	 * @param newMediumTextLength the new maximum length of medium field label to set
	 */
	public void setMediumTextLength(int newMediumTextLength) {
		_pcs.firePropertyChange("mediumTextLength", this.mediumTextLength, newMediumTextLength); //$NON-NLS-1$
		this.mediumTextLength = newMediumTextLength;
	}
	
	/**
	 * @return the maximum length of long field label (DD03P-SCRLEN3)
	 */
	public int getLongTextLength() {
		return this.longTextLength;
	}
	
	/**
	 * Changes the maximum length of long field label (DD03P-SCRLEN3).
	 * @param newLongTextLength the new maximum length of long field label to set
	 */
	public void setLongTextLength(int newLongTextLength) {
		_pcs.firePropertyChange("longTextLength", this.longTextLength, newLongTextLength); //$NON-NLS-1$
		this.longTextLength = newLongTextLength;
	}
	
	/**
	 * @return the data type in ABAP Dictionary (DD03P-DATATYPE)
	 */
	public String getDataType() {
		return this.dataType;
	}
	
	/**
	 * Changes the data type in ABAP Dictionary (DD03P-DATATYPE).
	 * @param newDataType the new data type in ABAP Dictionary to set
	 */
	public void setDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType); //$NON-NLS-1$
		this.dataType = newDataType;
	}
	
	/**
	 * @return the length (number of characters) (DD03P-LENG)
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Changes the length (number of characters) (DD03P-LENG).
	 * @param newLength the new length (number of characters) to set
	 */
	public void setLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength); //$NON-NLS-1$
		this.length = newLength;
	}
	
	/**
	 * @return the output length (DD03P-OUTPUTLEN)
	 */
	public int getOutputLength() {
		return this.outputLength;
	}
	
	/**
	 * Changes the output length (DD03P-OUTPUTLEN).
	 * @param newOutputLength the new output length to set
	 */
	public void setOutputLength(int newOutputLength) {
		_pcs.firePropertyChange("outputLength", this.outputLength, newOutputLength); //$NON-NLS-1$
		this.outputLength = newOutputLength;
	}
	
	/**
	 * @return the number of decimal places (DD03P-DECIMALS)
	 */
	public int getDecimals() {
		return this.decimals;
	}
	
	/**
	 * Changes the number of decimal places (DD03P-DECIMALS).
	 * @param newDecimals the new number of decimal places to set
	 */
	public void setDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals); //$NON-NLS-1$
		this.decimals = newDecimals;
	}
	
	/**
	 * @return the whether lower case letters are allowed (DD03P-LOWERCASE)
	 */
	public boolean isCaseSensitive() {
		return this.caseSensitive;
	}
	
	/**
	 * Changes the whether lower case letters are allowed (DD03P-LOWERCASE).
	 * @param newCaseSensitive the new whether lower case letters are allowed to set
	 */
	public void setCaseSensitive(boolean newCaseSensitive) {
		_pcs.firePropertyChange("caseSensitive", this.caseSensitive, newCaseSensitive); //$NON-NLS-1$
		this.caseSensitive = newCaseSensitive;
	}
	
	/**
	 * @return the whether a numerical field is signed (DD03P-SIGNFLAG)
	 */
	public boolean isSigned() {
		return this.signed;
	}
	
	/**
	 * Changes the whether a numerical field is signed (DD03P-SIGNFLAG).
	 * @param newSigned the new whether a numerical field is signed to set
	 */
	public void setSigned(boolean newSigned) {
		_pcs.firePropertyChange("signed", this.signed, newSigned); //$NON-NLS-1$
		this.signed = newSigned;
	}
	
	/**
	 * @return the whether fixed values exist (DD03P-VALEXI)
	 */
	public boolean isValueListFixed() {
		return this.valueListFixed;
	}
	
	/**
	 * Changes the whether fixed values exist (DD03P-VALEXI).
	 * @param newValueListFixed the new whether fixed values exist to set
	 */
	public void setValueListFixed(boolean newValueListFixed) {
		_pcs.firePropertyChange("valueListFixed", this.valueListFixed, newValueListFixed); //$NON-NLS-1$
		this.valueListFixed = newValueListFixed;
	}
	
	/**
	 * @return the name of the value table (DD03P-ENTITYTAB)
	 */
	public String getValueTable() {
		return this.valueTable;
	}
	
	/**
	 * Changes the name of the value table (DD03P-ENTITYTAB).
	 * @param newValueTable the new name of the value table to set
	 */
	public void setValueTable(String newValueTable) {
		_pcs.firePropertyChange("valueTable", this.valueTable, newValueTable); //$NON-NLS-1$
		this.valueTable = newValueTable;
	}
	
	/**
	 * @return the conversion routine (DD03P-CONVEXIT)
	 */
	public String getConversionExit() {
		return this.conversionExit;
	}
	
	/**
	 * Changes the conversion routine (DD03P-CONVEXIT).
	 * @param newConversionExit the new conversion routine to set
	 */
	public void setConversionExit(String newConversionExit) {
		_pcs.firePropertyChange("conversionExit", this.conversionExit, newConversionExit); //$NON-NLS-1$
		this.conversionExit = newConversionExit;
	}
	
	/**
	 * @return the description (DD03P-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the description (DD03P-DDTEXT).
	 * @param newDescription the new description to set
	 */
	public void setDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription); //$NON-NLS-1$
		this.description = newDescription;
	}
	
	/**
	 * @return the Origin of an input help (DD03P-SHLPORIGIN)
	 */
	public String getSearchHelpOrigin() {
		return this.searchHelpOrigin;
	}
	
	/**
	 * Changes the Origin of an input help (DD03P-SHLPORIGIN).
	 * @param newSearchHelpOrigin the new Origin of an input help to set
	 */
	public void setSearchHelpOrigin(String newSearchHelpOrigin) {
		_pcs.firePropertyChange("searchHelpOrigin", this.searchHelpOrigin, newSearchHelpOrigin); //$NON-NLS-1$
		this.searchHelpOrigin = newSearchHelpOrigin;
	}
	
	/**
	 * @return the Name of a search help (DD03P-SHLPNAME)
	 */
	public String getSearchHelpName() {
		return this.searchHelpName;
	}
	
	/**
	 * Changes the Name of a search help (DD03P-SHLPNAME).
	 * @param newSearchHelpName the new Name of a search help to set
	 */
	public void setSearchHelpName(String newSearchHelpName) {
		_pcs.firePropertyChange("searchHelpName", this.searchHelpName, newSearchHelpName); //$NON-NLS-1$
		this.searchHelpName = newSearchHelpName;
	}
	
	/**
	 * @return the Name of a search help parameter (DD03P-SHLPFIELD)
	 */
	public String getSearchHelpField() {
		return this.searchHelpField;
	}
	
	/**
	 * Changes the Name of a search help parameter (DD03P-SHLPFIELD).
	 * @param newSearchHelpField the new Name of a search help parameter to set
	 */
	public void setSearchHelpField(String newSearchHelpField) {
		_pcs.firePropertyChange("searchHelpField", this.searchHelpField, newSearchHelpField); //$NON-NLS-1$
		this.searchHelpField = newSearchHelpField;
	}
	
	/**
	 * @return the DD: Flag if it is a table (DD03P-TABLETYPE)
	 */
	public boolean isNestedTable() {
		return this.nestedTable;
	}
	
	/**
	 * Changes the DD: Flag if it is a table (DD03P-TABLETYPE).
	 * @param newNestedTable the new DD: Flag if it is a table to set
	 */
	public void setNestedTable(boolean newNestedTable) {
		_pcs.firePropertyChange("nestedTable", this.nestedTable, newNestedTable); //$NON-NLS-1$
		this.nestedTable = newNestedTable;
	}
	
	/**
	 * @return the DD: Depth for structured types (DD03P-DEPTH)
	 */
	public int getTypeDepth() {
		return this.typeDepth;
	}
	
	/**
	 * Changes the DD: Depth for structured types (DD03P-DEPTH).
	 * @param newTypeDepth the new DD: Depth for structured types to set
	 */
	public void setTypeDepth(int newTypeDepth) {
		_pcs.firePropertyChange("typeDepth", this.typeDepth, newTypeDepth); //$NON-NLS-1$
		this.typeDepth = newTypeDepth;
	}
	
	/**
	 * @return the DD: Component type (DD03P-COMPTYPE)
	 */
	public String getComponentType() {
		return this.componentType;
	}
	
	/**
	 * Changes the DD: Component type (DD03P-COMPTYPE).
	 * @param newComponentType the new DD: Component type to set
	 */
	public void setComponentType(String newComponentType) {
		_pcs.firePropertyChange("componentType", this.componentType, newComponentType); //$NON-NLS-1$
		this.componentType = newComponentType;
	}
	
	/**
	 * @return the nefault name for components using the data element (DD03P-DEFFDNAME)
	 */
	public String getDefaultFieldName() {
		return this.defaultFieldName;
	}
	
	/**
	 * Changes the nefault name for components using the data element (DD03P-DEFFDNAME).
	 * @param newDefaultFieldName the new nefault name for components using the data element to set
	 */
	public void setDefaultFieldName(String newDefaultFieldName) {
		_pcs.firePropertyChange("defaultFieldName", this.defaultFieldName, newDefaultFieldName); //$NON-NLS-1$
		this.defaultFieldName = newDefaultFieldName;
	}
	
	/**
	 * @return the Group name for named includes (DD03P-GROUPNAME)
	 */
	public String getGroupName() {
		return this.groupName;
	}
	
	/**
	 * Changes the Group name for named includes (DD03P-GROUPNAME).
	 * @param newGroupName the new Group name for named includes to set
	 */
	public void setGroupName(String newGroupName) {
		_pcs.firePropertyChange("groupName", this.groupName, newGroupName); //$NON-NLS-1$
		this.groupName = newGroupName;
	}
	
	/**
	 * @return the type of object referenced (DD03P-REFTYPE)
	 */
	public String getReferenceKind() {
		return this.referenceKind;
	}
	
	/**
	 * Changes the type of object referenced (DD03P-REFTYPE).
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
