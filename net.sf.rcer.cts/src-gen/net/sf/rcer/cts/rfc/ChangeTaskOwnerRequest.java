 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model a RFC call to TR40_TASK_CHANGE_OWNER. Use the setters to prepare the importing parameters, 
 * then invoke {@link #execute(JCoDestination)} to execute the call. The attributes of this instance 
 * will be updated to reflect the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * ChangeTaskOwnerRequest call = new ChangeTaskOwnerRequest();
 * call.setFoo(...);
 * call.execute(destination);
 * bar = call.getBar();
 * </pre></blockquote>
 */
public class ChangeTaskOwnerRequest {

	private PropertyChangeSupport _pcs;

	private String taskID;
	private String oldOwner;
	private String newOwner;
	private TransportMessage message;
	private String exception;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public ChangeTaskOwnerRequest() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * @return the ID of the task (IV_TRKORR)
	 */
	public String getTaskID() {
		return this.taskID;
	}
	
	/**
	 * Changes the ID of the task (IV_TRKORR).
	 * @param newTaskID the new ID of the task to set
	 */
	public void setTaskID(String newTaskID) {
		_pcs.firePropertyChange("taskID", this.taskID, newTaskID); //$NON-NLS-1$
		this.taskID = newTaskID;
	}
	
	/**
	 * @return the old owner name (IV_OLD_OWNER)
	 */
	public String getOldOwner() {
		return this.oldOwner;
	}
	
	/**
	 * Changes the old owner name (IV_OLD_OWNER).
	 * @param newOldOwner the new old owner name to set
	 */
	public void setOldOwner(String newOldOwner) {
		_pcs.firePropertyChange("oldOwner", this.oldOwner, newOldOwner); //$NON-NLS-1$
		this.oldOwner = newOldOwner;
	}
	
	/**
	 * @return the new owner name (IV_NEW_OWNER)
	 */
	public String getNewOwner() {
		return this.newOwner;
	}
	
	/**
	 * Changes the new owner name (IV_NEW_OWNER).
	 * @param newNewOwner the new new owner name to set
	 */
	public void setNewOwner(String newNewOwner) {
		_pcs.firePropertyChange("newOwner", this.newOwner, newNewOwner); //$NON-NLS-1$
		this.newOwner = newNewOwner;
	}
	
	/**
	 * @return the message that occurred during execution, if any (ES_MSG)
	 */
	public TransportMessage getMessage() {
		return this.message;
	}
	
	/**
	 * Changes the message that occurred during execution, if any (ES_MSG).
	 * @param newMessage the new message that occurred during execution, if any to set
	 */
	public void setMessage(TransportMessage newMessage) {
		_pcs.firePropertyChange("message", this.message, newMessage); //$NON-NLS-1$
		this.message = newMessage;
	}
	
	/**
	 * @return the exception that occurred during execution, if any (EV_EXCEPTION)
	 */
	public String getException() {
		return this.exception;
	}
	
	/**
	 * Changes the exception that occurred during execution, if any (EV_EXCEPTION).
	 * @param newException the new exception that occurred during execution, if any to set
	 */
	public void setException(String newException) {
		_pcs.firePropertyChange("exception", this.exception, newException); //$NON-NLS-1$
		this.exception = newException;
	}
	
	/**
	 * Executes the RFC call and updates the attributes accordingly.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public void execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("TR40_TASK_CHANGE_OWNER"); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_TRKORR", taskID); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_OLD_OWNER", oldOwner); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_NEW_OWNER", newOwner); //$NON-NLS-1$
		function.execute(destination);
		message = new TransportMessage(function.getExportParameterList().getStructure("ES_MSG")); //$NON-NLS-1$
		exception = function.getExportParameterList().getString("EV_EXCEPTION"); //$NON-NLS-1$
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
