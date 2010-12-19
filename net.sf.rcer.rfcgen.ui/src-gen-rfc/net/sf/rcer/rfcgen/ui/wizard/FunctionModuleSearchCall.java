 
package net.sf.rcer.rfcgen.ui.wizard;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model a RFC call to RFC_FUNCTION_SEARCH. Use the setters to prepare the importing parameters, 
 * then invoke {@link #execute(JCoDestination)} to execute the call. The attributes of this instance 
 * will be updated to reflect the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * FunctionModuleSearchCall call = new FunctionModuleSearchCall();
 * call.setFoo(...);
 * call.execute(destination);
 * bar = call.getBar();
 * </pre></blockquote>
 */
public class FunctionModuleSearchCall {

	private PropertyChangeSupport _pcs;

	private String functionName;
	private String groupName;
	private String language;
	private List<FunctionModuleDescription> functions = new ArrayList<FunctionModuleDescription>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public FunctionModuleSearchCall() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * @return the search pattern for function modules (FUNCNAME)
	 */
	public String getFunctionName() {
		return this.functionName;
	}
	
	/**
	 * Changes the search pattern for function modules (FUNCNAME).
	 * @param newFunctionName the new search pattern for function modules to set
	 */
	public void setFunctionName(String newFunctionName) {
		_pcs.firePropertyChange("functionName", this.functionName, newFunctionName); //$NON-NLS-1$
		this.functionName = newFunctionName;
	}
	
	/**
	 * @return the search pattern for function module groups (GROUPNAME)
	 */
	public String getGroupName() {
		return this.groupName;
	}
	
	/**
	 * Changes the search pattern for function module groups (GROUPNAME).
	 * @param newGroupName the new search pattern for function module groups to set
	 */
	public void setGroupName(String newGroupName) {
		_pcs.firePropertyChange("groupName", this.groupName, newGroupName); //$NON-NLS-1$
		this.groupName = newGroupName;
	}
	
	/**
	 * @return the language to read the short text (LANGUAGE)
	 */
	public String getLanguage() {
		return this.language;
	}
	
	/**
	 * Changes the language to read the short text (LANGUAGE).
	 * @param newLanguage the new language to read the short text to set
	 */
	public void setLanguage(String newLanguage) {
		_pcs.firePropertyChange("language", this.language, newLanguage); //$NON-NLS-1$
		this.language = newLanguage;
	}
	
	/**
	 * @return the list of functions retrieved (FUNCTIONS)
	 */
	public List<FunctionModuleDescription> getFunctions() {
		return this.functions;
	}
	
	/**
	 * Changes the list of functions retrieved (FUNCTIONS).
	 * @param newFunctions the new list of functions retrieved to set
	 */
	public void setFunctions(List<FunctionModuleDescription> newFunctions) {
		_pcs.firePropertyChange("functions", this.functions, newFunctions); //$NON-NLS-1$
		this.functions = newFunctions;
	}
	
	/**
	 * Executes the RFC call and updates the attributes accordingly.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public void execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("RFC_FUNCTION_SEARCH"); //$NON-NLS-1$
		// FIXME: set inactive parameters
		function.getImportParameterList().setValue("FUNCNAME", functionName); //$NON-NLS-1$
		function.getImportParameterList().setValue("GROUPNAME", groupName); //$NON-NLS-1$
		function.getImportParameterList().setValue("LANGUAGE", language); //$NON-NLS-1$
		FunctionModuleDescription.toTable(functions, function.getTableParameterList().getTable("FUNCTIONS")); //$NON-NLS-1$
		function.execute(destination);
		functionName = function.getImportParameterList().getString("FUNCNAME"); //$NON-NLS-1$
		groupName = function.getImportParameterList().getString("GROUPNAME"); //$NON-NLS-1$
		language = function.getImportParameterList().getString("LANGUAGE"); //$NON-NLS-1$
		functions = FunctionModuleDescription.fromTable(function.getTableParameterList().getTable("FUNCTIONS")); //$NON-NLS-1$
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
