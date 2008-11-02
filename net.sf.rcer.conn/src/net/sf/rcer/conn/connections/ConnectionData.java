/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $$Id$$
 */
package net.sf.rcer.conn.connections;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.MessageFormat;

import net.sf.rcer.conn.locales.Locale;

/**
 * This class encapsulates a set of connection data used to connect to a SAP R/3 system. 
 * @author vwegert
 *
 */
public class ConnectionData implements Cloneable, IConnectionData {

	/**
	 * Auxiliary class to manage the property change listeners.
	 */
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	/**
	 * The ID of the connection. This value is used to store references to this connection 
	 * (like the logon credentials), so it must be unique within the plug-in defining the connection. 
	 */
	private String connectionID;
	
	/**
	 * A human-readable description of the system connection.
	 */
	private String description;
	
	/**
	 * The system ID (SID) of the SAP R/3 system.
	 */
	private String systemID;
	
	/**
	 * The connection type. If a direct connection is used, an application server and a system number 
	 * must be provided. If a messages server is used, the message server, the port and the group name 
	 * must be provided. 
	 */
	private ConnectionType connectionType;
	
	/**
	 * The SAP router string.
	 */
	private String router;
	
	/**
	 * The address or name of the application server to use for direct connections.
	 */
	private String applicationServer;
	
	/**
	 * The system number to use for direct connections.
	 */
	private int systemNumber;
	
	/**
	 * The address or name of the message server to use for load balancing.
	 */
	private String messageServer;
	
	/**
	 * The port of the message server to use for load balancing.
	 */
	private int messageServerPort;
	
	/**
	 * The name of the group used for load balancing.
	 */
	private String loadBalancingGroup;
	
	/**
	 * The default user name to use for logon.
	 */
	private String defaultUser;
	
	/**
	 * Whether the user may change the default user name during logon.
	 */
	private boolean defaultUserEditable;
	
	/**
	 * The default client to use for logon.
	 */
	private String defaultClient;
	
	/**
	 * Whether the user may change the default client during logon.
	 */
	private boolean defaultClientEditable;
	
	/**
	 * The default locale to use during logon.
	 */
	private Locale defaultLocale;
	
	/**
	 * Whether the user may change the default locale during logon.
	 */
	private boolean defaultLocaleEditable;

	/**
	 * Default constructor (creates a direct connection with dummy data).
	 */
	public ConnectionData() {
		this("REPLACE_ME", "", "", "", "", 0);
	}
	
	/**
	 * A constructor to create a direct connection.
	 * @param connectionID the ID of the connection
	 * @param description a human-readable description of the system connection
	 * @param systemID the system ID (SID) of the SAP R/3 system
	 * @param router the SAP router string
	 * @param applicationServer the address or name of the application server to use
	 * @param systemNumber the system number to use
	 */
	public ConnectionData(String connectionID, String description,
			String systemID, String router, String applicationServer,
			int systemNumber) {
		super();
		this.connectionID = connectionID;
		this.description = description;
		this.systemID = systemID;
		this.connectionType = ConnectionType.DIRECT;
		this.router = router;
		this.applicationServer = applicationServer;
		this.systemNumber = systemNumber;
		this.defaultUserEditable = true;
		this.defaultClientEditable = true;
		this.defaultLocaleEditable = true;
	}

	/**
	 * A constructor to create a connection that uses load balancing.
	 * @param connectionID the ID of the connection
	 * @param description a human-readable description of the system connection
	 * @param systemID the system ID (SID) of the SAP R/3 system
	 * @param router the SAP router string
	 * @param messageServer the address or name of the message server to use
	 * @param messageServerPort the port of the message server to use
	 * @param loadBalancingGroup the name of the group used for load balancing
	 */
	public ConnectionData(String connectionID, String description,
			String systemID, String router, String messageServer,
			int messageServerPort, String loadBalancingGroup) {
		super();
		this.connectionID = connectionID;
		this.description = description;
		this.systemID = systemID;
		this.connectionType = ConnectionType.LOAD_BALANCED;
		this.router = router;
		this.messageServer = messageServer;
		this.messageServerPort = messageServerPort;
		this.loadBalancingGroup = loadBalancingGroup;
		this.defaultUserEditable = true;
		this.defaultClientEditable = true;
		this.defaultLocaleEditable = true;
	}
	
	/**
	 * Sets the parameters for a direct connection.
	 * @param applicationServer the address or name of the application server to use
	 * @param systemNumber the system number to use
	 */
	public void setDirectConnection(String applicationServer, int systemNumber) {
		setConnectionType(ConnectionType.DIRECT);
		setApplicationServer(applicationServer);
		setSystemNumber(systemNumber);
	}

	/**
	 * Sets the parameters for a load balancing connection.
	 * @param messageServer the address or name of the message server to use
	 * @param messageServerPort the port of the message server to use
	 * @param loadBalancingGroup the name of the group used for load balancing
	 */
	public void setLoadBalancingConnection(String messageServer, int messageServerPort, 
			String loadBalancingGroup) {
		setConnectionType(ConnectionType.LOAD_BALANCED);
		setMessageServer(messageServer);
		setMessageServerPort(messageServerPort);
		setLoadBalancingGroup(loadBalancingGroup);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getConnectionID()
	 */
	public String getConnectionID() {
		return connectionID;
	}
	
	/**
	 * @param connectionID the connectionID to set
	 */
	public void setConnectionID(String connectionID) {
		final String oldValue = this.connectionID;
		this.connectionID = connectionID;
		propertyChangeSupport.firePropertyChange("connectionID", oldValue, connectionID);
	}
		
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the human-readable description of the system connection to set
	 */
	public void setDescription(String description) {
		final String oldValue = this.description;
		this.description = description;
		propertyChangeSupport.firePropertyChange("description", oldValue, description);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getSystemID()
	 */
	public String getSystemID() {
		return systemID;
	}

	/**
	 * @param systemID the system ID (SID) of the SAP R/3 system to set
	 */
	public void setSystemID(String systemID) {
		final String oldValue = this.systemID;
		this.systemID = systemID;
		propertyChangeSupport.firePropertyChange("systemID", oldValue, systemID);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#getConnectionType()
	 */
	public ConnectionType getConnectionType() {
		return connectionType;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDirectConnection()
	 */
	public boolean isDirectConnection() {
		return connectionType == ConnectionType.DIRECT;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionData#isLoadBalancedConnection()
	 */
	public boolean isLoadBalancedConnection() {
		return connectionType == ConnectionType.LOAD_BALANCED;
	}
	
	/**
	 * @param connectionType the connection type to set
	 */
	public void setConnectionType(ConnectionType connectionType) {
		final ConnectionType oldValue = this.connectionType;
		this.connectionType = connectionType;
		propertyChangeSupport.firePropertyChange("connectionType", oldValue, connectionType);
		switch(connectionType) {
		case DIRECT:
			this.messageServer = null;
			this.messageServerPort = -1;
			this.loadBalancingGroup = null;
			break;
		case LOAD_BALANCED:
			this.applicationServer = null;
			this.systemNumber = -1;
			break;
		}
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getRouter()
	 */
	public String getRouter() {
		return router;
	}

	/**
	 * @param router the SAP router string to set
	 */
	public void setRouter(String router) {
		final String oldValue = this.router;
		this.router = router;
		propertyChangeSupport.firePropertyChange("router", oldValue, router);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getApplicationServer()
	 */
	public String getApplicationServer() {
		return applicationServer;
	}

	/**
	 * @param applicationServer the application server to set
	 */
	public void setApplicationServer(String applicationServer) {
		if (connectionType != ConnectionType.DIRECT) 
			throw new IllegalArgumentException("This parameter is only supported for direct connections.");
		final String oldValue = this.applicationServer;
		this.applicationServer = applicationServer;
		propertyChangeSupport.firePropertyChange("applicationServer", oldValue, applicationServer);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getSystemNumber()
	 */
	public int getSystemNumber() {
		return systemNumber;
	}

	/**
	 * @param systemNumber the system number to set
	 */
	public void setSystemNumber(int systemNumber) {
		if (connectionType != ConnectionType.DIRECT) 
			throw new IllegalArgumentException("This parameter is only supported for direct connections.");
		if ((systemNumber < 0) || (systemNumber > 99))
			throw new IllegalArgumentException("System number must be 0..99.");
		final int oldValue = this.systemNumber;
		this.systemNumber = systemNumber;
		propertyChangeSupport.firePropertyChange("systemNumber", oldValue, systemNumber);
	}	
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getMessageServer()
	 */
	public String getMessageServer() {
		return messageServer;
	}
	
	/**
	 * @param messageServer the message server to set
	 */
	public void setMessageServer(String messageServer) {
		if (connectionType != ConnectionType.LOAD_BALANCED) 
			throw new IllegalArgumentException("This parameter is only supported for load-balanced connections.");
		final String oldValue = this.messageServer;
		this.messageServer = messageServer;
		propertyChangeSupport.firePropertyChange("messageServer", oldValue, messageServer);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getMessageServerPort()
	 */
	public int getMessageServerPort() {
		return messageServerPort;
	}

	/**
	 * @param messageServerPort the message server port to set
	 */
	public void setMessageServerPort(int messageServerPort) {
		if (connectionType != ConnectionType.LOAD_BALANCED) 
			throw new IllegalArgumentException("This parameter is only supported for load-balanced connections.");
		if ((messageServerPort < 0) || (messageServerPort > 65535)) 
			throw new IllegalArgumentException("Message server port must be 0..65535");
		final int oldValue = this.messageServerPort;
		this.messageServerPort = messageServerPort;
		propertyChangeSupport.firePropertyChange("messageServerPort", oldValue, messageServerPort);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getLoadBalancingGroup()
	 */
	public String getLoadBalancingGroup() {
		return loadBalancingGroup;
	}

	/**
	 * @param loadBalancingGroup the loadBalancingGroup to set
	 */
	public void setLoadBalancingGroup(String loadBalancingGroup) {
		if (connectionType != ConnectionType.LOAD_BALANCED) 
			throw new IllegalArgumentException("This parameter is only supported for load-balanced connections.");
		final String oldValue = this.loadBalancingGroup;
		this.loadBalancingGroup = loadBalancingGroup;
		propertyChangeSupport.firePropertyChange("loadBalancingGroup", oldValue, loadBalancingGroup);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultUser()
	 */
	public String getDefaultUser() {
		return defaultUser;
	}

	/**
	 * @param defaultUser the default user name to use for logon
	 */
	public void setDefaultUser(String defaultUser) {
		final String oldValue = this.defaultUser;
		this.defaultUser = defaultUser;
		propertyChangeSupport.firePropertyChange("defaultUser", oldValue, defaultUser);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultUserEditable()
	 */
	public boolean isDefaultUserEditable() {
		return defaultUserEditable;
	}

	/**
	 * @param defaultUserEditable whether the user may change the default user name during logon
	 */
	public void setDefaultUserEditable(boolean defaultUserEditable) {
		final boolean oldValue = this.defaultUserEditable;
		this.defaultUserEditable = defaultUserEditable;
		propertyChangeSupport.firePropertyChange("defaultUserEditable", oldValue, defaultUserEditable);
	}
	
	/**
	 * @param defaultUser the default user name to use for logon
	 * @param isEditable whether the user may change the default user name during logon
	 */
	public void setDefaultUser(String defaultUser, boolean isEditable) {
		setDefaultUser(defaultUser);
		setDefaultUserEditable(isEditable);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultClient()
	 */
	public String getDefaultClient() {
		return defaultClient;
	}

	/**
	 * @param defaultClient the default client to use for logon
	 */
	public void setDefaultClient(String defaultClient) {
		final String oldValue = this.defaultClient;
		this.defaultClient = defaultClient;
		propertyChangeSupport.firePropertyChange("defaultClient", oldValue, defaultClient);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultClientEditable()
	 */
	public boolean isDefaultClientEditable() {
		return defaultClientEditable;
	}

	/**
	 * @param defaultClientEditable whether the user may change the default client during logon
	 */
	public void setDefaultClientEditable(boolean defaultClientEditable) {
		final boolean oldValue = this.defaultClientEditable;
		this.defaultClientEditable = defaultClientEditable;
		propertyChangeSupport.firePropertyChange("defaultClientEditable", oldValue, defaultClientEditable);
	}
	
	/**
	 * @param defaultClient the default client to use for logon
	 * @param isEditable whether the user may change the default client during logon
	 */
	public void setDefaultClient(String defaultClient, boolean isEditable) {
		setDefaultClient(defaultClient);
		setDefaultClientEditable(isEditable);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#getDefaultLocale()
	 */
	public Locale getDefaultLocale() {
		return defaultLocale;
	}

	/**
	 * @param defaultLocale the default locale to use during logon
	 */
	public void setDefaultLocale(Locale defaultLocale) {
		final Locale oldValue = this.defaultLocale;
		this.defaultLocale = defaultLocale;
		propertyChangeSupport.firePropertyChange("defaultLocale", oldValue, defaultLocale);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.IConnectionData#isDefaultLocaleEditable()
	 */
	public boolean isDefaultLocaleEditable() {
		return defaultLocaleEditable;
	}

	/**
	 * @param defaultLocaleEditable whether the user may change the default locale during logon
	 */
	public void setDefaultLocaleEditable(boolean defaultLocaleEditable) {
		final boolean oldValue = this.defaultLocaleEditable;
		this.defaultLocaleEditable = defaultLocaleEditable;
		propertyChangeSupport.firePropertyChange("defaultLocaleEditable", oldValue, defaultLocaleEditable);
	}
	
	/**
	 * @param defaultLocale the default locale to use during logon
	 * @param isEditable whether the user may change the default locale during logon
	 */
	public void setDefaultLocale(Locale defaultLocale, boolean isEditable) {
		setDefaultLocale(defaultLocale);
		setDefaultLocaleEditable(isEditable);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return MessageFormat.format("{0} - {1}", getSystemID(), getDescription());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public ConnectionData clone() {
		try {
			return (ConnectionData) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new UnsupportedOperationException(e);
		}
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
