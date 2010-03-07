 
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
 * A class representing the SAP R/3 data structure DD01V.
 */
public class RFCDomainData {

	private PropertyChangeSupport _pcs;

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
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDomainData() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCDomainData(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
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
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCDomainData> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCDomainData entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCDomainData> fromTable(JCoTable source) {
		List<RFCDomainData> list = new ArrayList<RFCDomainData>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCDomainData(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD01V is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD01V")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD01V).", structureName));
		}
	}
	
	/**
	 * @return the data type in ABAP Dictionary (DD01V-DATATYPE)
	 */
	public String getDataType() {
		return this.dataType;
	}
	
	/**
	 * Changes the data type in ABAP Dictionary (DD01V-DATATYPE).
	 * @param newDataType the new data type in ABAP Dictionary to set
	 */
	public void setDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType); //$NON-NLS-1$
		this.dataType = newDataType;
	}
	
	/**
	 * @return the length (number of characters) (DD01V-LENG)
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Changes the length (number of characters) (DD01V-LENG).
	 * @param newLength the new length (number of characters) to set
	 */
	public void setLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength); //$NON-NLS-1$
		this.length = newLength;
	}
	
	/**
	 * @return the output length (DD01V-OUTPUTLEN)
	 */
	public int getOutputLength() {
		return this.outputLength;
	}
	
	/**
	 * Changes the output length (DD01V-OUTPUTLEN).
	 * @param newOutputLength the new output length to set
	 */
	public void setOutputLength(int newOutputLength) {
		_pcs.firePropertyChange("outputLength", this.outputLength, newOutputLength); //$NON-NLS-1$
		this.outputLength = newOutputLength;
	}
	
	/**
	 * @return the number of decimal places (DD01V-DECIMALS)
	 */
	public int getDecimals() {
		return this.decimals;
	}
	
	/**
	 * Changes the number of decimal places (DD01V-DECIMALS).
	 * @param newDecimals the new number of decimal places to set
	 */
	public void setDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals); //$NON-NLS-1$
		this.decimals = newDecimals;
	}
	
	/**
	 * @return the whether lower case letters are allowed (DD01V-LOWERCASE)
	 */
	public boolean isCaseSensitive() {
		return this.caseSensitive;
	}
	
	/**
	 * Changes the whether lower case letters are allowed (DD01V-LOWERCASE).
	 * @param newCaseSensitive the new whether lower case letters are allowed to set
	 */
	public void setCaseSensitive(boolean newCaseSensitive) {
		_pcs.firePropertyChange("caseSensitive", this.caseSensitive, newCaseSensitive); //$NON-NLS-1$
		this.caseSensitive = newCaseSensitive;
	}
	
	/**
	 * @return the whether a numerical field is signed (DD01V-SIGNFLAG)
	 */
	public boolean isSigned() {
		return this.signed;
	}
	
	/**
	 * Changes the whether a numerical field is signed (DD01V-SIGNFLAG).
	 * @param newSigned the new whether a numerical field is signed to set
	 */
	public void setSigned(boolean newSigned) {
		_pcs.firePropertyChange("signed", this.signed, newSigned); //$NON-NLS-1$
		this.signed = newSigned;
	}
	
	/**
	 * @return the whether fixed values exist (DD01V-VALEXI)
	 */
	public boolean isValueListFixed() {
		return this.valueListFixed;
	}
	
	/**
	 * Changes the whether fixed values exist (DD01V-VALEXI).
	 * @param newValueListFixed the new whether fixed values exist to set
	 */
	public void setValueListFixed(boolean newValueListFixed) {
		_pcs.firePropertyChange("valueListFixed", this.valueListFixed, newValueListFixed); //$NON-NLS-1$
		this.valueListFixed = newValueListFixed;
	}
	
	/**
	 * @return the name of the value table (DD01V-ENTITYTAB)
	 */
	public String getValueTable() {
		return this.valueTable;
	}
	
	/**
	 * Changes the name of the value table (DD01V-ENTITYTAB).
	 * @param newValueTable the new name of the value table to set
	 */
	public void setValueTable(String newValueTable) {
		_pcs.firePropertyChange("valueTable", this.valueTable, newValueTable); //$NON-NLS-1$
		this.valueTable = newValueTable;
	}
	
	/**
	 * @return the conversion routine (DD01V-CONVEXIT)
	 */
	public String getConversionExit() {
		return this.conversionExit;
	}
	
	/**
	 * Changes the conversion routine (DD01V-CONVEXIT).
	 * @param newConversionExit the new conversion routine to set
	 */
	public void setConversionExit(String newConversionExit) {
		_pcs.firePropertyChange("conversionExit", this.conversionExit, newConversionExit); //$NON-NLS-1$
		this.conversionExit = newConversionExit;
	}
	
	/**
	 * @return the short text describing the domain (DD01V-DDTEXT)
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Changes the short text describing the domain (DD01V-DDTEXT).
	 * @param newDescription the new short text describing the domain to set
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
