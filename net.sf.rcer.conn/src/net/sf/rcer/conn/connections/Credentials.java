package net.sf.rcer.conn.connections;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import net.sf.rcer.conn.locales.Locale;

/**
 * A class to transport the connection data and the logon credentials.
 * @author vwegert
 *
 */
public class Credentials implements IDestinationData {

	/**
	 * Auxiliary class to manage the property change listeners.
	 */
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	/**
	 * The connection data instance.
	 */
	private IConnectionData connectionData;

	/**
	 * The actual client to log on to.
	 */
	private String client;
	
	/**
	 * The actual user name to use for logon.
	 */
	private String userName;
	
	/**
	 * The actual password to use for logon.
	 */
	private String password;
	
	/**
	 * The actual locale to use for logon.
	 */
	private Locale locale;
	
	/**
	 * Default constructor.
	 * @param connectionData
	 */
	public Credentials(IConnectionData connectionData) {
		this.connectionData = connectionData;
		this.client = connectionData.getDefaultClient();
		this.userName = connectionData.getDefaultUser();
		this.locale = connectionData.getDefaultLocale();
	}

	/**
	 * @return the ID of the connection (the name of the destination)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getConnectionID()
	 */
	public String getConnectionID() {
		return connectionData.getConnectionID();
	}
	
	/**
	 * @return the connection data
	 */
	public IConnectionData getConnectionData() {
		return connectionData;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IDestinationData#getClient()
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(String client) {
		if (!connectionData.isDefaultClientEditable()) {
			throw new UnsupportedOperationException("The default client may not be changed.");
		}
		final String oldValue = this.client;
		this.client = client;
		propertyChangeSupport.firePropertyChange("client", oldValue, client);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IDestinationData#getUserName()
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the user name to set
	 */
	public void setUserName(String userName) {
		if (!connectionData.isDefaultUserEditable()) {
			throw new UnsupportedOperationException("The default user name may not be changed.");
		}
		final String oldValue = this.userName;
		this.userName = userName;
		propertyChangeSupport.firePropertyChange("userName", oldValue, userName);
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		final String oldValue = this.password;
		this.password = password;
		propertyChangeSupport.firePropertyChange("password", oldValue, password);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IDestinationData#getLocale()
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		if (!connectionData.isDefaultLocaleEditable()) {
			throw new UnsupportedOperationException("The default locale may not be changed.");
		}
		final Locale oldValue = this.locale;
		this.locale = locale;
		propertyChangeSupport.firePropertyChange("locale", oldValue, locale);
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

	/**
	 * @return whether the client may be changed during logon
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultClientEditable()
	 */
	public boolean isClientEditable() {
		return connectionData.isDefaultClientEditable();
	}
	
	/**
	 * @return whether the user name may be changed during logon
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultUserEditable()
	 */
	public boolean isUserEditable() {
		return connectionData.isDefaultUserEditable();
	}

	/**
	 * @return whether the locale may be changed during logon
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultLocaleEditable()
	 */
	public boolean isLocaleEditable() {
		return connectionData.isDefaultLocaleEditable();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return connectionData.toString();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getApplicationServer()
	 */
	public String getApplicationServer() {
		return connectionData.getApplicationServer();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getConnectionType()
	 */
	public ConnectionType getConnectionType() {
		return connectionData.getConnectionType();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getDefaultClient()
	 */
	public String getDefaultClient() {
		return connectionData.getDefaultClient();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getDefaultLocale()
	 */
	public Locale getDefaultLocale() {
		return connectionData.getDefaultLocale();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getDefaultUser()
	 */
	public String getDefaultUser() {
		return connectionData.getDefaultUser();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getDescription()
	 */
	public String getDescription() {
		return connectionData.getDescription();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getLoadBalancingGroup()
	 */
	public String getLoadBalancingGroup() {
		return connectionData.getLoadBalancingGroup();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getMessageServer()
	 */
	public String getMessageServer() {
		return connectionData.getMessageServer();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getMessageServerPort()
	 */
	public int getMessageServerPort() {
		return connectionData.getMessageServerPort();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getRouter()
	 */
	public String getRouter() {
		return connectionData.getRouter();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getSystemID()
	 */
	public String getSystemID() {
		return connectionData.getSystemID();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getSystemNumber()
	 */
	public int getSystemNumber() {
		return connectionData.getSystemNumber();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultClientEditable()
	 */
	public boolean isDefaultClientEditable() {
		return connectionData.isDefaultClientEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultLocaleEditable()
	 */
	public boolean isDefaultLocaleEditable() {
		return connectionData.isDefaultLocaleEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDefaultUserEditable()
	 */
	public boolean isDefaultUserEditable() {
		return connectionData.isDefaultUserEditable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isDirectConnection()
	 */
	public boolean isDirectConnection() {
		return connectionData.isDirectConnection();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isLoadBalancedConnection()
	 */
	public boolean isLoadBalancedConnection() {
		return connectionData.isLoadBalancedConnection();
	}

}