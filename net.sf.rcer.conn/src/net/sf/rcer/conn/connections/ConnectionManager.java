/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.connections;

import java.security.InvalidParameterException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import net.sf.rcer.conn.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.ext.DestinationDataEventListener;
import com.sap.conn.jco.ext.DestinationDataProvider;
import com.sap.conn.jco.ext.Environment;

/**
 * The central manager for all active connections to the SAP R/3 systems. Note that at any given time,
 * zero, one or many connections may be active. The first connection that is activated becomes the so-called
 * primary connection. The primary connection can be changed using {@link ConnectionManager#s}. If the primary 
 * connection is closed, any of the secondary connections becomes the new primary connection.
 * @author vwegert
 *
 */
public class ConnectionManager  {

	/**
	 * The internal implementation of the {@link DestinationDataProvider} interface.
	 * @author vwegert
	 *
	 */
	private class Provider implements DestinationDataProvider {

		private ConnectionManager parent;
		private DestinationDataEventListener listener;

		/**
		 * Default constructor.
		 * @param connectionManager
		 */
		public Provider(ConnectionManager connectionManager) {
			parent = connectionManager;
		}

		/* (non-Javadoc)
		 * @see com.sap.conn.jco.ext.DestinationDataProvider#getDestinationProperties(java.lang.String)
		 */
		public Properties getDestinationProperties(String destinationId) {
			final Credentials credentials = parent.getCredentials(destinationId);
			if (credentials == null) {
				return null;
			}
			final IConnectionData connectionData = credentials.getConnectionData();
			Properties p = new Properties();

			p.setProperty(JCO_CLIENT, credentials.getClient());
			p.setProperty(JCO_USER,   credentials.getUserName());
			p.setProperty(JCO_PASSWD, credentials.getPassword());
			p.setProperty(JCO_LANG,   credentials.getLocale().getID());

			switch(connectionData.getConnectionType()) {
			case DIRECT:
				p.setProperty(JCO_ASHOST, connectionData.getApplicationServer());
				p.setProperty(JCO_SYSNR,  Integer.toString(connectionData.getSystemNumber()));
				break;
			case LOAD_BALANCED:
				p.setProperty(JCO_R3NAME, connectionData.getSystemID());
				p.setProperty(JCO_MSHOST, connectionData.getMessageServer());
				p.setProperty(JCO_MSSERV, Integer.toString(connectionData.getMessageServerPort()));
				p.setProperty(JCO_GROUP,  connectionData.getLoadBalancingGroup());
				break;
			} 
			p.setProperty(JCO_SAPROUTER, connectionData.getRouter());

			// TODO Make these values configurable.
			p.setProperty(JCO_PEAK_LIMIT, "5");    // Maximum number of active connections that can be created for a destination simultaneously
			p.setProperty(JCO_POOL_CAPACITY, "1"); // Maximum number of idle connections kept open by the destination. A value of 0 has the effect that there is no connection pooling
			// JCO_EXPIRATION_TIME   - Time in ms after that a free connections hold internally by the destination can be closed
			// JCO_EXPIRATION_PERIOD - Period in ms after that the destination checks the released connections for expiration
			// JCO_MAX_GET_TIME      - Max time in ms to wait for a connection, if the max allowed number of connections is allocated by the application
			// JCO_CPIC_TRACE        - Enable/disable CPIC trace [0..3]
			// JCO_TRACE             - Enable/disable RFC trace (0 or 1)
			p.setProperty(JCO_CPIC_TRACE, "3");
			p.setProperty(JCO_TRACE, "1");
			return p;
		}

		/* (non-Javadoc)
		 * @see com.sap.conn.jco.ext.DestinationDataProvider#setDestinationDataEventListener(com.sap.conn.jco.ext.DestinationDataEventListener)
		 */
		public void setDestinationDataEventListener(DestinationDataEventListener listener) {
			this.listener = listener;
		}

		/* (non-Javadoc)
		 * @see com.sap.conn.jco.ext.DestinationDataProvider#supportsEvents()
		 */
		public boolean supportsEvents() {
			return true;
		}

		/**
		 * @param destinationName
		 * @see com.sap.conn.jco.ext.DestinationDataEventListener#deleted(java.lang.String)
		 */
		void fireDestinationDeleted(String destinationName) {
			listener.deleted(destinationName);
		}

		/**
		 * @param destinationName
		 * @see com.sap.conn.jco.ext.DestinationDataEventListener#updated(java.lang.String)
		 */
		void fireDestinationUpdated(String destinationName) {
			listener.updated(destinationName);
		}
	}

	/**
	 * The singleton instance.
	 */
	private static ConnectionManager instance;

	/**
	 * The actual {@link DestinationDataProvider} implementation.
	 */
	private Provider provider;

	/**
	 * The active destinations, including the primary destination.
	 */
	private Map<String, Credentials> destinations = new HashMap<String, Credentials>();

	/**
	 * The ID of the primary destination, or <code>null</code> if none.
	 */
	private String primaryConnectionID;

	/**
	 * The list of {@link IConnectionStateListener} instances.
	 */
	private Set<IConnectionStateListener> listeners = new HashSet<IConnectionStateListener>();
	
	static {
		Environment.registerDestinationDataProvider(getInstance().getProvider());
	}

	/**
	 * Private constructor to prevent secondary instantiation.
	 */
	private ConnectionManager() {
		// nothing to do at the moment
	}

	/**
	 * @return the singleton instance.
	 */
	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	/**
	 * Obtains the primary connection. If no connection is active, this method tries to deduce the connection to open:
	 * If the {@link ConnectionRegistry} only contains one connection, this connection is activated.
	 * If the {@link ConnectionRegistry} contains more than one connection, an {@link ICredentialsProviderWithSelection}
	 * is used to determine which connection to activate.
	 * @return the primary connection
	 * @throws ConnectionException 
	 * @throws JCoException 
	 * @see #closeDestination()
	 * @see #setPrimaryDestination(String)
	 */
	public JCoDestination getDestination() throws ConnectionException, JCoException {
		if (primaryConnectionID != null) {
			getCheckedDestination(primaryConnectionID);
		}
		final Set<String> registeredConnections = ConnectionRegistry.getInstance().getConnectionIDs();
		switch(registeredConnections.size()) {
		case 0:
			throw new ConnectionException("Unable to find connection data.");
		case 1:
			return getDestination(registeredConnections.iterator().next());
		default: {
			// query the credentials providers in order of priority
			Credentials credentials = null;
			Iterator<ICredentialsProviderWithSelection> it = getCredentialsProvidersWithSelection().iterator();
			while (it.hasNext() && credentials == null) {
				try {
					credentials = it.next().getCredentials();
				} catch (Exception e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
							"Exception occurred trying to select a connection and determine the credentials.", e));
				}
			}
			if (credentials == null) {
				throw new ConnectionException("Unable to select a connection and determine the credentials.");
			}
			addDestinationInternal(credentials);
			try {
				return getCheckedDestination(credentials.getConnectionID());
			} catch (JCoException e) {
				removeDestinationInternal(credentials);
				throw e;
			}
		}
		}
	}

	/**
	 * Obtains the connection designated. If the connection is not active, it is activated. If it is the first 
	 * connection that is activated, it automatically becomes the primary connection.
	 * @param connectionData
	 * @return the connection
	 * @throws JCoException 
	 * @throws ConnectionException 
	 */
	public JCoDestination getDestination(IConnectionData connectionData) throws JCoException, ConnectionException {
		if (destinations.containsKey(connectionData.getConnectionID())) {
			return getCheckedDestination(connectionData.getConnectionID());

		}
		// query the credentials providers in order of priority
		Credentials credentials = null;
		Iterator<ICredentialsProviderWithoutSelection> it = getCredentialsProvidersWithoutSelection().iterator();
		while (it.hasNext() && credentials == null) {
			try {
				credentials = it.next().getCredentials(connectionData);
			} catch (Exception e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
						MessageFormat.format(
								"Exception occurred trying to determine the credentials for connection {0}.",
								connectionData.getConnectionID()), e));
			}
		}
		if (credentials == null) {
			throw new ConnectionException(MessageFormat.format(
					"Unable to determine the credentials for connection {0}.",
					connectionData.getConnectionID()));
		}
		addDestinationInternal(credentials);
		try {
			return getCheckedDestination(credentials.getConnectionID());
		} catch (JCoException e) {
			removeDestinationInternal(credentials);
			throw e;			
		}
	}

	/**
	 * Obtains the connection designated. If the connection is not active, it is activated. If it is the first 
	 * connection that is activated, it automatically becomes the primary connection.
	 * @param connectionID
	 * @return the connection
	 * @throws ConnectionException 
	 * @throws JCoException 
	 */
	public JCoDestination getDestination(String connectionID) throws ConnectionException, JCoException {
		try {
			if (destinations.containsKey(connectionID)) {
				return getCheckedDestination(connectionID);
			}
			return getDestination(ConnectionRegistry.getInstance().getConnectionData(connectionID));
		} catch (ConnectionNotFoundException e) {
			throw new ConnectionException(MessageFormat.format("Unable to load connection data for ID {0}.",
					connectionID), e); 
		} catch (ProviderNotFoundException e) {
			throw new ConnectionException(MessageFormat.format("Unable to load connection data for ID {0}.",
					connectionID), e); 
		}
	}

	/**
	 * @return the connection ID (destination name) of the primary connection, or <code>null</code> 
	 * if no connection is active
	 */
	public String getPrimaryConnectionID() {
		return primaryConnectionID;
	}

	/**
	 * @return a list of all secondary connections ({@link #getActiveConnectionIDs()} without {@link #getPrimaryConnectionID()})
	 */
	public Set<String> getSecondaryConnectionIDs() {
		Set<String> connIDs = getActiveConnectionIDs();
		connIDs.remove(getPrimaryConnectionID());
		return connIDs;
	}

	/**
	 * @return a list of all active connection IDs (destination names)
	 */
	public Set<String> getActiveConnectionIDs() {
		return new HashSet<String>(destinations.keySet());
	}

	/**
	 * @param connectionData
	 * @return <code>true</code> if the connection is active
	 */
	public boolean isActive(IConnectionData connectionData) {
		return destinations.containsKey(connectionData.getConnectionID());
	}

	/**
	 * @param connectionID
	 * @return <code>true</code> if the connection is active
	 */
	public boolean isActive(String connectionID) {
		return destinations.containsKey(connectionID);
	}

	/**
	 * @param connectionData
	 * @return <code>true</code> if the connection is the primary connection
	 */
	public boolean isPrimaryConnection(IConnectionData connectionData) {
		return (primaryConnectionID != null) && primaryConnectionID.equals(connectionData.getConnectionID());
	}

	/**
	 * @param connectionID
	 * @return <code>true</code> if the connection is the primary connection
	 */
	public boolean isPrimaryConnection(String connectionID) {
		return (primaryConnectionID != null) && primaryConnectionID.equals(connectionID);
	}

	/**
	 * Makes the destination the primary destination.
	 * @param destination
	 * @throws JCoException 
	 * @throws ConnectionException 
	 */
	public void setPrimaryDestination(JCoDestination destination) throws ConnectionException, JCoException {
		setPrimaryDestination(destination.getDestinationName());
	}

	/**
	 * Makes the destination the primary destination.
	 * @param connectionData
	 * @throws JCoException 
	 * @throws ConnectionException 
	 */
	public void setPrimaryDestination(IConnectionData connectionData) throws ConnectionException, JCoException {
		setPrimaryDestination(connectionData.getConnectionID());
	}

	/**
	 * Makes the destination the primary destination. If the destination is not active yet, it is activated.
	 * @param connectionID
	 * @throws JCoException 
	 * @throws ConnectionException 
	 */
	public void setPrimaryDestination(String connectionID) throws ConnectionException, JCoException {
		if (connectionID == null) {
			throw new InvalidParameterException("The connection ID may not be null."); 
		}
		if (!destinations.containsKey(connectionID)) {
			getDestination(connectionID);
		}
		final Credentials dest = destinations.get(connectionID);
		setPrimaryConnectionInternal(dest);
	}

	/**
	 * Makes the destination the primary destination. If the destination is not active yet, it is activated.
	 * @param connectionID
	 */
	private void setPrimaryConnectionInternal(Credentials dest) {
		primaryConnectionID = dest == null ? null : dest.getConnectionID();
		// notify listeners that the primary connection has changed
		for (final IConnectionStateListener listener: listeners) {
			listener.primaryConnectionChanged(dest);
		}
	}

	/**
	 * Closes the primary connection. If no connection is active, nothing happens. If more than one connection
	 * is active, the primary connection is closed and any of the secondary connections becomes the new primary 
	 * connection. 
	 */
	public void closeDestination() {
		if (primaryConnectionID != null) {
			closeDestination(primaryConnectionID);
		}
	}

	/**
	 * Closes the designated connection. If the connection is not active, nothing happens. If more than one connection
	 * is active and the designated connection is the primary connection, it is closed and any of the secondary 
	 * connections becomes the new primary connection. 
	 * @param destination
	 */
	public void closeDestination(JCoDestination destination) {
		closeDestination(destination.getDestinationName());
	}

	/**
	 * Closes the designated connection. If the connection is not active, nothing happens. If more than one connection
	 * is active and the designated connection is the primary connection, it is closed and any of the secondary 
	 * connections becomes the new primary connection. 
	 * @param connectionData
	 */
	public void closeDestination(IConnectionData connectionData) {
		closeDestination(connectionData.getConnectionID());
	}

	/**
	 * Closes the designated connection. If the connection is not active, nothing happens. If more than one connection
	 * is active and the designated connection is the primary connection, it is closed and any of the secondary 
	 * connections becomes the new primary connection. 
	 * @param connectionID
	 */
	public void closeDestination(String connectionID) {
		if (destinations.containsKey(connectionID)) {
			final Credentials dest = destinations.get(connectionID);
			removeDestinationInternal(dest);
		}
	}

	/**
	 * Adds an object to the list of listeners to be notified when the state of a connection changes.
	 * @see {@link IConnectionStateListener} 
	 * @param listener
	 */
	public void addConnectionStateListener(IConnectionStateListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	/**
	 * Removes an object from the list of listeners to be notified when the state of a connection changes.
	 * @param listener
	 */
	public void removeConnectionStateListener(IConnectionStateListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	
	/**
	 * Adds the destination to the list of active destinations. Also sets the primary connection if not set.
	 * @param dest
	 */
	private void addDestinationInternal(Credentials dest) {
		destinations.put(dest.getConnectionID(), dest);
		provider.fireDestinationUpdated(dest.getConnectionID());
		// notify listeners that a new connection was opened
		for (final IConnectionStateListener listener: listeners) {
			listener.connectionActivated(dest);
		}
		// set the primary connection if it is not set
		if (primaryConnectionID == null) {
			setPrimaryConnectionInternal(dest);
		}
	}

	/**
	 * Removes a connection from the list of active connections. Also chooses a new primary connection if required.
	 * @param dest
	 */
	private void removeDestinationInternal(Credentials dest) {
		provider.fireDestinationDeleted(dest.getConnectionID());
		destinations.remove(dest.getConnectionID());
		// notify listeners that the connection has been closed
		for (final IConnectionStateListener listener: listeners) {
			listener.connectionActivated(dest);
		}
		// was this the primary connection?
		if (primaryConnectionID.equals(dest.getConnectionID())) {
			// yes - choose another, if any are left
			setPrimaryConnectionInternal(destinations.isEmpty() ? null : destinations.values().iterator().next());
		}
	}

	/**
	 * @return actual {@link DestinationDataProvider} implementation
	 */
	private DestinationDataProvider getProvider() {
		if (provider == null) {
			provider = new Provider(this);
		}
		return provider;
	}

	/**
	 * @param destinationId
	 * @return the credentials for the connection, or <code>null</code> if the connection is not active
	 */
	private Credentials getCredentials(String destinationId) {
		if (!destinations.containsKey(destinationId)) {
			return null;
		}
		return destinations.get(destinationId);
	}

	/**
	 * @return a list of all reachable {@link ICredentialsProviderWithoutSelection}, sorted by priority
	 */
	private List<ICredentialsProviderWithoutSelection> getCredentialsProvidersWithoutSelection() {
		Map<String, ICredentialsProviderWithoutSelection> providers = new TreeMap<String, ICredentialsProviderWithoutSelection>();
		for (final IConfigurationElement element: 
			Platform.getExtensionRegistry().getConfigurationElementsFor(Activator.PLUGIN_ID, "credentials")) {
			if (element.getName().equals("credentialsProviderWithoutSelection")) {
				final String id = element.getAttribute("id");
				try {
					final String prio = element.getAttribute("priority");
					final ICredentialsProviderWithoutSelection prov = (ICredentialsProviderWithoutSelection) element.createExecutableExtension("class");
					providers.put(prio, prov);
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
							MessageFormat.format(
									"Exception occurred trying to instantiate connection provider {0}.", id), e));
				}

			}
		}
		return new Vector<ICredentialsProviderWithoutSelection>(providers.values());
	}

	/**
	 * @return a list of all reachable {@link ICredentialsProviderWithSelection}, sorted by priority
	 */
	private List<ICredentialsProviderWithSelection> getCredentialsProvidersWithSelection() {
		Map<String, ICredentialsProviderWithSelection> providers = new TreeMap<String, ICredentialsProviderWithSelection>();
		for (final IConfigurationElement element: 
			Platform.getExtensionRegistry().getConfigurationElementsFor(Activator.PLUGIN_ID, "credentials")) {
			if (element.getName().equals("credentialsProviderWithSelection")) {
				final String id = element.getAttribute("id");
				try {
					final String prio = element.getAttribute("priority");
					final ICredentialsProviderWithSelection prov = (ICredentialsProviderWithSelection) element.createExecutableExtension("class");
					providers.put(prio, prov);
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
							MessageFormat.format(
									"Exception occurred trying to instantiate connection provider {0}.", id), e));
				}

			}
		}
		return new Vector<ICredentialsProviderWithSelection>(providers.values());
	}

	/**
	 * Requests a destination object from the JCo and executes a RFC_PING it to see if it is valid. 
	 * @param connectionID
	 * @return
	 * @throws JCoException
	 */
	private JCoDestination getCheckedDestination(String connectionID) throws JCoException {
		final JCoDestination dest = JCoDestinationManager.getDestination(connectionID);
		dest.ping();
		return dest;
	}

}
