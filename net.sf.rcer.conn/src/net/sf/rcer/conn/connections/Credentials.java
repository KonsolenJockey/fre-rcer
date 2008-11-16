package net.sf.rcer.conn.connections;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * A class to transport the connection data and the logon credentials.
 * @author vwegert
 *
 */
public class Credentials implements ICredentials {

	// TODO add some unit tests for this class
	
	/**
	 * Auxiliary class to manage the property change listeners.
	 */
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	/**
	 * The connection instance.
	 */
	private IConnection connection;

	/**
	 * The actual password to use for logon.
	 */
	private String password;
	
	/**
	 * Default constructor, based on an {@link IConnection} instance.
	 * @param connection
	 */
	public Credentials(IConnection connection) {
		this.connection = connection;
	}

	/**
	 * Default constructor, based on an {@link IConnectionData} instance.
	 * @param connectionData
	 */
	public Credentials(IConnectionData connectionData) {
		this.connection = new Connection(connectionData);
	}
	
	/**
	 * @return the connection
	 */
	public IConnection getConnection() {
		return connection;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentials#getConnectionID()
	 */
	public String getConnectionID() {
		return connection.getConnectionID();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentials#getPassword()
	 */
	public String getPassword() {
		return password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return connection.toString();
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		final String oldValue = this.password;
		this.password = password;
		propertyChangeSupport.firePropertyChange("password", oldValue, password);
	}

	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * @return all of the <code>PropertyChangeListeners</code> added or an 
     *         empty array if no listeners have been added
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners()
	 */
	public PropertyChangeListener[] getPropertyChangeListeners() {
		return propertyChangeSupport.getPropertyChangeListeners();
	}

	/**
     * @param propertyName  The name of the property being listened to
     * @return all of the <code>PropertyChangeListeners</code> associated with
     *         the named property.  If no such listeners have been added,
     *         or if <code>propertyName</code> is null, an empty array is
     *         returned.
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(java.lang.String)
	 */
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		return propertyChangeSupport.getPropertyChangeListeners(propertyName);
	}

	/**
     * @param propertyName  the property name.
     * @return true if there are one or more listeners for the given property
	 * @see java.beans.PropertyChangeSupport#hasListeners(java.lang.String)
	 */
	public boolean hasListeners(String propertyName) {
		return propertyChangeSupport.hasListeners(propertyName);
	}

	/**
     * @param listener  The PropertyChangeListener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	/**
     * @param propertyName  The name of the property that was listened on.
     * @param listener  The PropertyChangeListener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

}