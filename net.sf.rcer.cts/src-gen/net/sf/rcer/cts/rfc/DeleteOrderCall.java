 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model a RFC call to TR40_ORDER_DELETE. Use the setters to prepare the importing parameters, 
 * then invoke {@link #execute(JCoDestination)} to execute the call. The attributes of this instance 
 * will be updated to reflect the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * DeleteOrderCall call = new DeleteOrderCall();
 * call.setFoo(...);
 * call.execute(destination);
 * bar = call.getBar();
 * </pre></blockquote>
 */
public class DeleteOrderCall {

	private PropertyChangeSupport _pcs;

	private String orderID;
	private TransportMessage message;
	private String exception;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public DeleteOrderCall() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * @return the ID of the order to delete (IV_TRKORR)
	 */
	public String getOrderID() {
		return this.orderID;
	}
	
	/**
	 * Changes the ID of the order to delete (IV_TRKORR).
	 * @param newOrderID the new ID of the order to delete to set
	 */
	public void setOrderID(String newOrderID) {
		_pcs.firePropertyChange("orderID", this.orderID, newOrderID);
		this.orderID = newOrderID;
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
		_pcs.firePropertyChange("message", this.message, newMessage);
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
		_pcs.firePropertyChange("exception", this.exception, newException);
		this.exception = newException;
	}
	
	/**
	 * Executes the RFC call and updates the attributes accordingly.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public void execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("TR40_ORDER_DELETE");
		function.getImportParameterList().setValue("IV_TRKORR", orderID);
		function.execute(destination);
		message = new TransportMessage(function.getExportParameterList().getStructure("ES_MSG"));
		exception = function.getExportParameterList().getString("EV_EXCEPTION");
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
