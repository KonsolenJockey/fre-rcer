 
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
		this.dataType = source.getString("DATATYPE");
		this.length = source.getInt("LENG");
		this.outputLength = source.getInt("OUTPUTLEN");
		this.decimals = source.getInt("DECIMALS");
		this.caseSensitive = source.getString("LOWERCASE").equalsIgnoreCase("X");
		this.signed = source.getString("SIGNFLAG").equalsIgnoreCase("X");
		this.valueListFixed = source.getString("VALEXI").equalsIgnoreCase("X");
		this.valueTable = source.getString("ENTITYTAB");
		this.conversionExit = source.getString("CONVEXIT");
		this.description = source.getString("DDTEXT");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("DATATYPE", this.dataType);
		target.setValue("LENG", this.length);
		target.setValue("OUTPUTLEN", this.outputLength);
		target.setValue("DECIMALS", this.decimals);
		target.setValue("LOWERCASE", this.caseSensitive);
		target.setValue("SIGNFLAG", this.signed);
		target.setValue("VALEXI", this.valueListFixed);
		target.setValue("ENTITYTAB", this.valueTable);
		target.setValue("CONVEXIT", this.conversionExit);
		target.setValue("DDTEXT", this.description);
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
	 * @param source
	 * @param destination
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
		if (!structureName.equals("DD01V")) {
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
	public void setsetDataType(String newDataType) {
		_pcs.firePropertyChange("dataType", this.dataType, newDataType);
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
	public void setsetLength(int newLength) {
		_pcs.firePropertyChange("length", this.length, newLength);
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
	public void setsetOutputLength(int newOutputLength) {
		_pcs.firePropertyChange("outputLength", this.outputLength, newOutputLength);
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
	public void setsetDecimals(int newDecimals) {
		_pcs.firePropertyChange("decimals", this.decimals, newDecimals);
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
	public void setsetCaseSensitive(boolean newCaseSensitive) {
		_pcs.firePropertyChange("caseSensitive", this.caseSensitive, newCaseSensitive);
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
	public void setsetSigned(boolean newSigned) {
		_pcs.firePropertyChange("signed", this.signed, newSigned);
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
	public void setsetValueListFixed(boolean newValueListFixed) {
		_pcs.firePropertyChange("valueListFixed", this.valueListFixed, newValueListFixed);
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
	public void setsetValueTable(String newValueTable) {
		_pcs.firePropertyChange("valueTable", this.valueTable, newValueTable);
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
	public void setsetConversionExit(String newConversionExit) {
		_pcs.firePropertyChange("conversionExit", this.conversionExit, newConversionExit);
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
	public void setsetDescription(String newDescription) {
		_pcs.firePropertyChange("description", this.description, newDescription);
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
