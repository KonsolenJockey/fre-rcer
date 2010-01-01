 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to model the output data of a RFC call to TR40_TASK_ADD. See {@link AddTaskRequest}
 * for instructions on how to obtain an instance of this class.
 * @see AddTaskRequest
 */
public class AddTaskResponse {

	private PropertyChangeSupport _pcs;

	private List<TaskUserListEntry> users = new ArrayList<TaskUserListEntry>();
	private String exception;
	private List<TransportMessage> messages = new ArrayList<TransportMessage>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public AddTaskResponse() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the list of users and associated task IDs (TT_USERLIST)
	 */
	public List<TaskUserListEntry> getUsers() {
		return this.users;
	}
	
	/**
	 * Changes the list of users and associated task IDs (TT_USERLIST).
	 * @param newUsers the new list of users and associated task IDs to set
	 */
	public void setUsers(List<TaskUserListEntry> newUsers) {
		_pcs.firePropertyChange("users", this.users, newUsers); //$NON-NLS-1$
		this.users = newUsers;
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
	 * @return the messages that occurred during execution, if any (TT_MSG)
	 */
	public List<TransportMessage> getMessages() {
		return this.messages;
	}
	
	/**
	 * Changes the messages that occurred during execution, if any (TT_MSG).
	 * @param newMessages the new messages that occurred during execution, if any to set
	 */
	public void setMessages(List<TransportMessage> newMessages) {
		_pcs.firePropertyChange("messages", this.messages, newMessages); //$NON-NLS-1$
		this.messages = newMessages;
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
