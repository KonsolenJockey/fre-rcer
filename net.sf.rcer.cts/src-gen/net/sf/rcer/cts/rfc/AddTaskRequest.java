 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model the input data of a RFC call to TR40_TASK_ADD. Use the setters to prepare 
 * the importing parameters, then invoke {@link #execute(JCoDestination)} to execute the call. This method
 * returns an instance that contains the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * AddTaskRequest request = new AddTaskRequest();
 * request.setFoo(...);
 * AddTaskResponse response = call.execute(destination);
 * bar = response.getBar();
 * </pre></blockquote>
 */
public class AddTaskRequest {

	private PropertyChangeSupport _pcs;

	private String orderID;
	private boolean correctionRequested;
	private boolean repairRequested;
	private List<TaskUserListEntry> users = new ArrayList<TaskUserListEntry>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public AddTaskRequest() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the ID of the order to add the tasks to (IV_TRKORR)
	 */
	public String getOrderID() {
		return this.orderID;
	}
	
	/**
	 * Changes the ID of the order to add the tasks to (IV_TRKORR).
	 * @param newOrderID the new ID of the order to add the tasks to to set
	 */
	public void setOrderID(String newOrderID) {
		_pcs.firePropertyChange("orderID", this.orderID, newOrderID);
		this.orderID = newOrderID;
	}
	
	/**
	 * @return the whether to create a correction task (IV_CORRECTION)
	 */
	public boolean isCorrectionRequested() {
		return this.correctionRequested;
	}
	
	/**
	 * Changes the whether to create a correction task (IV_CORRECTION).
	 * @param newCorrectionRequested the new whether to create a correction task to set
	 */
	public void setCorrectionRequested(boolean newCorrectionRequested) {
		_pcs.firePropertyChange("correctionRequested", this.correctionRequested, newCorrectionRequested);
		this.correctionRequested = newCorrectionRequested;
	}
	
	/**
	 * @return the whether to create a repair task (IV_REPAIR)
	 */
	public boolean isRepairRequested() {
		return this.repairRequested;
	}
	
	/**
	 * Changes the whether to create a repair task (IV_REPAIR).
	 * @param newRepairRequested the new whether to create a repair task to set
	 */
	public void setRepairRequested(boolean newRepairRequested) {
		_pcs.firePropertyChange("repairRequested", this.repairRequested, newRepairRequested);
		this.repairRequested = newRepairRequested;
	}
	
	/**
	 * @return the list of users to create tasks for (TT_USERLIST)
	 */
	public List<TaskUserListEntry> getUsers() {
		return this.users;
	}
	
	/**
	 * Changes the list of users to create tasks for (TT_USERLIST).
	 * @param newUsers the new list of users to create tasks for to set
	 */
	public void setUsers(List<TaskUserListEntry> newUsers) {
		_pcs.firePropertyChange("users", this.users, newUsers);
		this.users = newUsers;
	}
	
	/**
	 * Executes the RFC call and returns the response instance.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public AddTaskResponse execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("TR40_TASK_ADD");
		function.getImportParameterList().setValue("IV_TRKORR", orderID);
		function.getImportParameterList().setValue("IV_CORRECTION", correctionRequested ? "X" : " ");
		function.getImportParameterList().setValue("IV_REPAIR", repairRequested ? "X" : " ");
		TaskUserListEntry.toTable(users, function.getTableParameterList().getTable("TT_USERLIST"));
		function.execute(destination);
		AddTaskResponse response = new AddTaskResponse();
		response.setUsers(TaskUserListEntry.fromTable(function.getTableParameterList().getTable("TT_USERLIST")));
		response.setException(function.getExportParameterList().getString("EV_EXCEPTION"));
		response.setMessages(TransportMessage.fromTable(function.getTableParameterList().getTable("TT_MSG")));
		return response;
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
