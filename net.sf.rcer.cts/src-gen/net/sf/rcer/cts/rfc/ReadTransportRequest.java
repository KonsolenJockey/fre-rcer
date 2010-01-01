 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model the input data of a RFC call to TR40_READ_COMM. Use the setters to prepare 
 * the importing parameters, then invoke {@link #execute(JCoDestination)} to execute the call. This method
 * returns an instance that contains the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * ReadTransportRequest request = new ReadTransportRequest();
 * request.setFoo(...);
 * ReadTransportResponse response = call.execute(destination);
 * bar = response.getBar();
 * </pre></blockquote>
 */
public class ReadTransportRequest {

	private PropertyChangeSupport _pcs;

	private String orderID;
	private boolean headerRequested;
	private boolean objectListRequested;
	private boolean objectListKeysRequested;
	private boolean textRequested;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public ReadTransportRequest() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the ID of the order or task to read (IV_TRKORR)
	 */
	public String getOrderID() {
		return this.orderID;
	}
	
	/**
	 * Changes the ID of the order or task to read (IV_TRKORR).
	 * @param newOrderID the new ID of the order or task to read to set
	 */
	public void setOrderID(String newOrderID) {
		_pcs.firePropertyChange("orderID", this.orderID, newOrderID); //$NON-NLS-1$
		this.orderID = newOrderID;
	}
	
	/**
	 * @return the whether to read the header (IV_SEL_E070)
	 */
	public boolean isHeaderRequested() {
		return this.headerRequested;
	}
	
	/**
	 * Changes the whether to read the header (IV_SEL_E070).
	 * @param newHeaderRequested the new whether to read the header to set
	 */
	public void setHeaderRequested(boolean newHeaderRequested) {
		_pcs.firePropertyChange("headerRequested", this.headerRequested, newHeaderRequested); //$NON-NLS-1$
		this.headerRequested = newHeaderRequested;
	}
	
	/**
	 * @return the whether to read the object list (IV_SEL_E071)
	 */
	public boolean isObjectListRequested() {
		return this.objectListRequested;
	}
	
	/**
	 * Changes the whether to read the object list (IV_SEL_E071).
	 * @param newObjectListRequested the new whether to read the object list to set
	 */
	public void setObjectListRequested(boolean newObjectListRequested) {
		_pcs.firePropertyChange("objectListRequested", this.objectListRequested, newObjectListRequested); //$NON-NLS-1$
		this.objectListRequested = newObjectListRequested;
	}
	
	/**
	 * @return the whether to read the keys (IV_SEL_E071K)
	 */
	public boolean isObjectListKeysRequested() {
		return this.objectListKeysRequested;
	}
	
	/**
	 * Changes the whether to read the keys (IV_SEL_E071K).
	 * @param newObjectListKeysRequested the new whether to read the keys to set
	 */
	public void setObjectListKeysRequested(boolean newObjectListKeysRequested) {
		_pcs.firePropertyChange("objectListKeysRequested", this.objectListKeysRequested, newObjectListKeysRequested); //$NON-NLS-1$
		this.objectListKeysRequested = newObjectListKeysRequested;
	}
	
	/**
	 * @return the whether to read the texts (IV_SEL_E07T)
	 */
	public boolean isTextRequested() {
		return this.textRequested;
	}
	
	/**
	 * Changes the whether to read the texts (IV_SEL_E07T).
	 * @param newTextRequested the new whether to read the texts to set
	 */
	public void setTextRequested(boolean newTextRequested) {
		_pcs.firePropertyChange("textRequested", this.textRequested, newTextRequested); //$NON-NLS-1$
		this.textRequested = newTextRequested;
	}
	
	/**
	 * Executes the RFC call and returns the response instance.
	 * @param destination the RFC destination to use
	 * @return the instance of the response class
	 * @throws JCoException
	 */
	public ReadTransportResponse execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("TR40_READ_COMM"); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_TRKORR", orderID); //$NON-NLS-1$
		function.getImportParameterList().setValue("IV_SEL_E070", headerRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		function.getImportParameterList().setValue("IV_SEL_E071", objectListRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		function.getImportParameterList().setValue("IV_SEL_E071K", objectListKeysRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		function.getImportParameterList().setValue("IV_SEL_E07T", textRequested ? "X" : " "); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		function.execute(destination);
		ReadTransportResponse response = new ReadTransportResponse();
		response.setHeader(new TransportHeader(function.getExportParameterList().getStructure("ES_E070"))); //$NON-NLS-1$
		response.setText(new TransportShortText(function.getExportParameterList().getStructure("ES_E07T"))); //$NON-NLS-1$
		response.setTextMissing(function.getExportParameterList().getString("EV_E07T_DOESNT_EXIST").equalsIgnoreCase("X")); //$NON-NLS-1$ //$NON-NLS-2$
		response.setObjectList(ObjectListEntry.fromTable(function.getTableParameterList().getTable("TT_E071"))); //$NON-NLS-1$
		response.setObjectListKeys(ObjectListKeyEntry.fromTable(function.getTableParameterList().getTable("TT_E071K"))); //$NON-NLS-1$
		response.setMessage(new TransportMessage(function.getExportParameterList().getStructure("ES_MSG"))); //$NON-NLS-1$
		response.setException(function.getExportParameterList().getString("EV_EXCEPTION")); //$NON-NLS-1$
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
