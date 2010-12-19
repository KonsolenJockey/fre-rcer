 
package net.sf.rcer.rfcgen.ui.wizard;

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
 * A class representing the SAP R/3 data structure RFCFUNC.
 */
public class FunctionModuleDescription {

	private PropertyChangeSupport _pcs;

	private String functionName;
	private String groupName;
	private String text;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public FunctionModuleDescription() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public FunctionModuleDescription(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.functionName = source.getString("FUNCNAME"); //$NON-NLS-1$
		this.groupName = source.getString("GROUPNAME"); //$NON-NLS-1$
		this.text = source.getString("STEXT"); //$NON-NLS-1$
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
		targetStructure.setValue("FUNCNAME", this.functionName); //$NON-NLS-1$
		targetStructure.setValue("GROUPNAME", this.groupName); //$NON-NLS-1$
		targetStructure.setValue("STEXT", this.text); //$NON-NLS-1$
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<FunctionModuleDescription> source, JCoTable destination) {
		destination.deleteAllRows();
		for (FunctionModuleDescription entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<FunctionModuleDescription> fromTable(JCoTable source) {
		List<FunctionModuleDescription> list = new ArrayList<FunctionModuleDescription>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new FunctionModuleDescription(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than RFCFUNC is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("RFCFUNC")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected RFCFUNC).", structureName));
		}
	}
	
	/**
	 * @return the name of the function module (RFCFUNC-FUNCNAME)
	 */
	public String getFunctionName() {
		return this.functionName;
	}
	
	/**
	 * Changes the name of the function module (RFCFUNC-FUNCNAME).
	 * @param newFunctionName the new name of the function module to set
	 */
	public void setFunctionName(String newFunctionName) {
		_pcs.firePropertyChange("functionName", this.functionName, newFunctionName); //$NON-NLS-1$
		this.functionName = newFunctionName;
	}
	
	/**
	 * @return the name of the function group (RFCFUNC-GROUPNAME)
	 */
	public String getGroupName() {
		return this.groupName;
	}
	
	/**
	 * Changes the name of the function group (RFCFUNC-GROUPNAME).
	 * @param newGroupName the new name of the function group to set
	 */
	public void setGroupName(String newGroupName) {
		_pcs.firePropertyChange("groupName", this.groupName, newGroupName); //$NON-NLS-1$
		this.groupName = newGroupName;
	}
	
	/**
	 * @return the short text of the function module (RFCFUNC-STEXT)
	 */
	public String getText() {
		return this.text;
	}
	
	/**
	 * Changes the short text of the function module (RFCFUNC-STEXT).
	 * @param newText the new short text of the function module to set
	 */
	public void setText(String newText) {
		_pcs.firePropertyChange("text", this.text, newText); //$NON-NLS-1$
		this.text = newText;
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
