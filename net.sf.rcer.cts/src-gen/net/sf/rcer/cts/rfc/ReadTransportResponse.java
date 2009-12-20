 
package net.sf.rcer.cts.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to model the output data of a RFC call to TR40_READ_COMM. See {@link ReadTransportRequest}
 * for instructions on how to obtain an instance of this class.
 * @see ReadTransportRequest
 */
public class ReadTransportResponse {

	private PropertyChangeSupport _pcs;

	private TransportHeader header;
	private TransportShortText text;
	private boolean textMissing;
	private List<ObjectListEntry> objectList = new ArrayList<ObjectListEntry>();
	private List<ObjectListKeyEntry> objectListKeys = new ArrayList<ObjectListKeyEntry>();
	private TransportMessage message;
	private String exception;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public ReadTransportResponse() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the header of the transport (ES_E070)
	 */
	public TransportHeader getHeader() {
		return this.header;
	}
	
	/**
	 * Changes the header of the transport (ES_E070).
	 * @param newHeader the new header of the transport to set
	 */
	public void setHeader(TransportHeader newHeader) {
		_pcs.firePropertyChange("header", this.header, newHeader);
		this.header = newHeader;
	}
	
	/**
	 * @return the texts of the transport (ES_E07T)
	 */
	public TransportShortText getText() {
		return this.text;
	}
	
	/**
	 * Changes the texts of the transport (ES_E07T).
	 * @param newText the new texts of the transport to set
	 */
	public void setText(TransportShortText newText) {
		_pcs.firePropertyChange("text", this.text, newText);
		this.text = newText;
	}
	
	/**
	 * @return the whether the texts are missing (EV_E07T_DOESNT_EXIST)
	 */
	public boolean isTextMissing() {
		return this.textMissing;
	}
	
	/**
	 * Changes the whether the texts are missing (EV_E07T_DOESNT_EXIST).
	 * @param newTextMissing the new whether the texts are missing to set
	 */
	public void setTextMissing(boolean newTextMissing) {
		_pcs.firePropertyChange("textMissing", this.textMissing, newTextMissing);
		this.textMissing = newTextMissing;
	}
	
	/**
	 * @return the object list of the transport (TT_E071)
	 */
	public List<ObjectListEntry> getObjectList() {
		return this.objectList;
	}
	
	/**
	 * Changes the object list of the transport (TT_E071).
	 * @param newObjectList the new object list of the transport to set
	 */
	public void setObjectList(List<ObjectListEntry> newObjectList) {
		_pcs.firePropertyChange("objectList", this.objectList, newObjectList);
		this.objectList = newObjectList;
	}
	
	/**
	 * @return the key list of the transport (TT_E071K)
	 */
	public List<ObjectListKeyEntry> getObjectListKeys() {
		return this.objectListKeys;
	}
	
	/**
	 * Changes the key list of the transport (TT_E071K).
	 * @param newObjectListKeys the new key list of the transport to set
	 */
	public void setObjectListKeys(List<ObjectListKeyEntry> newObjectListKeys) {
		_pcs.firePropertyChange("objectListKeys", this.objectListKeys, newObjectListKeys);
		this.objectListKeys = newObjectListKeys;
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
