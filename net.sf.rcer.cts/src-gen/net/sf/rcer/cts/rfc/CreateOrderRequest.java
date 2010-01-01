 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model the input data of a RFC call to TR40_ORDER_CREATE. Use the setters to prepare 
 * the importing parameters, then invoke {@link #execute(JCoDestination)} to execute the call. This method
 * returns an instance that contains the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * CreateOrderRequest request = new CreateOrderRequest();
 * request.setFoo(...);
 * CreateOrderResponse response = call.execute(destination);
 * bar = response.getBar();
 * </pre></blockquote>
 */
public class CreateOrderRequest {

	private PropertyChangeSupport _pcs;

	private String category;
	private String text;
	private String transportLayer;
	private String owner;
	private boolean correctionRequested;
	private boolean repairRequested;
	private List<TaskUserListEntry> users = new ArrayList<TaskUserListEntry>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public CreateOrderRequest() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the category of the transport order (IV_CATEGORY)
	 */
	public String getCategory() {
		return this.category;
	}
	
	/**
	 * Changes the category of the transport order (IV_CATEGORY).
	 * @param newCategory the new category of the transport order to set
	 */
	public void setCategory(String newCategory) {
		_pcs.firePropertyChange("category", this.category, newCategory); //$NON-NLS-1$
		this.category = newCategory;
	}
	
	/**
	 * @return the short text (IV_KURZTEXT)
	 */
	public String getText() {
		return this.text;
	}
	
	/**
	 * Changes the short text (IV_KURZTEXT).
	 * @param newText the new short text to set
	 */
	public void setText(String newText) {
		_pcs.firePropertyChange("text", this.text, newText); //$NON-NLS-1$
		this.text = newText;
	}
	
	/**
	 * @return the transport layer (IV_LAYER)
	 */
	public String getTransportLayer() {
		return this.transportLayer;
	}
	
	/**
	 * Changes the transport layer (IV_LAYER).
	 * @param newTransportLayer the new transport layer to set
	 */
	public void setTransportLayer(String newTransportLayer) {
		_pcs.firePropertyChange("transportLayer", this.transportLayer, newTransportLayer); //$NON-NLS-1$
		this.transportLayer = newTransportLayer;
	}
	
	/**
	 * @return the owner of the transport (IV_OWNER)
	 */
	public String getOwner() {
		return this.owner;
	}
	
	/**
	 * Changes the owner of the transport (IV_OWNER).
	 * @param newOwner the new owner of the transport to set
	 */
	public void setOwner(String newOwner) {
		_pcs.firePropertyChange("owner", this.owner, newOwner); //$NON-NLS-1$
		this.owner = newOwner;
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
		_pcs.firePropertyChange("correctionRequested", this.correctionRequested, newCorrectionRequested); //$NON-NLS-1$
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
		_pcs.firePropertyChange("repairRequested", this.repairRequested, newRepairRequested); //$NON-NLS-1$
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
		_pcs.firePropertyChange("users", this.users, newUsers); //$NON-NLS-1$
		this.users = newUsers;
	}
	
	/**
	 * Executes the RFC call and returns the response instance.
	 * @param destination the RFC destination to use
	 * @return the instance of the response class
	 * @throws JCoException
	 */
	public CreateOrderResponse execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("TR40_ORDER_CREATE"); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_CATEGORY", category); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_KURZTEXT", text); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_LAYER", transportLayer); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_OWNER", owner); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_CORRECTION", correctionRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		function.getImportParameterList().setValue("IV_REPAIR", repairRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		TaskUserListEntry.toTable(users, function.getTableParameterList().getTable("TT_USERLIST")); //$NON-NLS-1$
		function.execute(destination);
		CreateOrderResponse response = new CreateOrderResponse();
		response.setOrderID(function.getExportParameterList().getString("EV_TRKORR_ORDER")); //$NON-NLS-1$
		response.setUsers(TaskUserListEntry.fromTable(function.getTableParameterList().getTable("TT_USERLIST"))); //$NON-NLS-1$
		response.setException(function.getExportParameterList().getString("EV_EXCEPTION")); //$NON-NLS-1$
		response.setMessages(TransportMessage.fromTable(function.getTableParameterList().getTable("TT_MSG"))); //$NON-NLS-1$
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
