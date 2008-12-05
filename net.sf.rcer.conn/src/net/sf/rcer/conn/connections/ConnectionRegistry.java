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

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.sf.rcer.conn.Activator;
import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 * The central registry for definitions of connections to the SAP R/3 systems.
 * @author vwegert
 *
 */
public class ConnectionRegistry implements IRegistryEventListener {

	/**
	 * The name of the extension point used to define the connections and connection providers.
	 */
	public static final String CONNECTIONS_EXTENSION_POINT = "net.sf.rcer.conn.connections";

	/**
	 * The singleton instance.
	 */
	private static volatile ConnectionRegistry instance;

	/**
	 * A map of all the connections that were defined using the extension point only.
	 */
	private Map<String, IConnectionData> staticConnectionData = new HashMap<String, IConnectionData>();

	/**
	 * A map of all the connection providers can supply dynamic connection data.
	 */
	private Map<String, IConnectionProvider> connectionProviders = new HashMap<String, IConnectionProvider>();

	/**
	 * Private constructor to prevent secondary instantiation.
	 */
	private ConnectionRegistry() {

		// load all connections and connection providers that are currently defined
		addConnections(Platform.getExtensionRegistry().getExtensionPoint(CONNECTIONS_EXTENSION_POINT).getExtensions());

		// register a listener so that the registry is notified of changes
		Platform.getExtensionRegistry().addListener(this, CONNECTIONS_EXTENSION_POINT);
	}

	/**
	 * @return the singleton instance.
	 */
	public static ConnectionRegistry getInstance() {
		if (instance == null) {
			synchronized (ConnectionRegistry.class) {
				if (instance == null) {
					instance = new ConnectionRegistry();
				}
			}
		}
		return instance;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IRegistryEventListener#added(org.eclipse.core.runtime.IExtension[])
	 */
	public void added(IExtension[] extensions) {
		addConnections(extensions);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IRegistryEventListener#removed(org.eclipse.core.runtime.IExtension[])
	 */
	public void removed(IExtension[] extensions) {
		removeConnections(extensions);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IRegistryEventListener#added(org.eclipse.core.runtime.IExtensionPoint[])
	 */
	public void added(IExtensionPoint[] extensionPoints) {
		// This class does not react to extension point changes.
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IRegistryEventListener#removed(org.eclipse.core.runtime.IExtensionPoint[])
	 */
	public void removed(IExtensionPoint[] extensionPoints) {
		// This class does not react to extension point changes.
	}

	/**
	 * Examine the extensions provided and either insert new connections and connection providers 
	 * or update the existing connections.
	 * @param extensions
	 */
	private void addConnections(IExtension[] extensions) {
		for(final IExtension extension: extensions) {
			assert extension.getExtensionPointUniqueIdentifier().equals(CONNECTIONS_EXTENSION_POINT);
			final String pluginID = extension.getContributor().getName();

			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for(final IConfigurationElement element: elements) {

				if (element.getName().equals("connection")) {
					// add or modify a static connection
					final String localID = element.getAttribute("id");
					final String globalID = pluginID + "." + localID;
					if (staticConnectionData.containsKey(globalID)) {
						updateStaticConnection(element, globalID);
					} else {
						addStaticConnection(element, globalID);
					}

				} else if (element.getName().equals("provider")) {
					// add a connection provider (can't modify it if it already exists)
					final String localID = element.getAttribute("id");
					final String globalID = pluginID + "." + localID;
					if (connectionProviders.containsKey(globalID)) {
						final String nominalClass = element.getAttribute("provider");
						final String actualClass  = connectionProviders.get(globalID).getClass().getName();
						if (!actualClass.equals(nominalClass)) {
							logError(MessageFormat.format("Unable to replace the current implementation {0} of connection provider {1} with new implementation {2}",
									actualClass, globalID, nominalClass), null);
						}
					} else {
						try {
							IConnectionProvider provider = (IConnectionProvider) element.createExecutableExtension("provider");
							connectionProviders.put(globalID, provider);
						} catch (CoreException e) {
							logError(MessageFormat.format("Unable to instantiate the connection provider {0} (implementation class {1})",
									globalID, element.getAttribute("provider")), e);
						}
					}

				}
			}
		}
	}

	/**
	 * Examine the extensions provided and remove the connections and connection providers.
	 * @param extensions
	 */
	private void removeConnections(IExtension[] extensions) {
		for(final IExtension extension: extensions) {
			assert extension.getExtensionPointUniqueIdentifier().equals(CONNECTIONS_EXTENSION_POINT);
			final String pluginID = extension.getContributor().getName();

			final IConfigurationElement[] elements = extension.getConfigurationElements();
			for(final IConfigurationElement element: elements) {

				if (element.getName().equals("connection")) {
					// remove a static connection
					final String localID = element.getAttribute("id");
					final String globalID = pluginID + "." + localID;
					if (staticConnectionData.containsKey(globalID)) {
						staticConnectionData.remove(globalID);
					}

				} else if (element.getName().equals("provider")) {
					// remove a connection provider
					final String localID = element.getAttribute("id");
					final String globalID = pluginID + "." + localID;
					if (connectionProviders.containsKey(globalID)) {
						connectionProviders.remove(globalID);
					}

				}
			}
		}
	}

	/**
	 * Extracts the information from an extension element and creates a new static connection object.
	 * @param configurationElement
	 * @param connectionID
	 */
	private void addStaticConnection(final IConfigurationElement configurationElement, final String connectionID) {
		ConnectionData connection = null;
		if (configurationElement.getAttribute("connectionType").equals("direct")) {
			try {
				int systemNumber = Integer.parseInt(configurationElement.getAttribute("systemNumber"));
				connection = new ConnectionData(connectionID,
						configurationElement.getAttribute("description"),
						configurationElement.getAttribute("systemID"),
						configurationElement.getAttribute("router"),
						configurationElement.getAttribute("applicationServer"),
						systemNumber);
			} catch (NumberFormatException e) {
				logError(MessageFormat.format(
						"Connection {0} contains an invalid system number ({1})",
						connectionID, configurationElement.getAttribute("systemNumber")), e);
				return;
			}
		} else {
			try {
				int messageServerPort = Integer.parseInt(configurationElement.getAttribute("messageServerPort"));
				connection = new ConnectionData(connectionID,
						configurationElement.getAttribute("description"),
						configurationElement.getAttribute("systemID"),
						configurationElement.getAttribute("router"),
						configurationElement.getAttribute("messageServer"),
						messageServerPort,
						configurationElement.getAttribute("loadBalancingGroup"));
			} catch (NumberFormatException e) {
				logError(MessageFormat.format(
						"Connection {0} contains an invalid message server port ({1})",
						connectionID, configurationElement.getAttribute("messageServerPort")), e);
				return;
			}
		}

		connection.setDefaultUser(configurationElement.getAttribute("defaultUser"), 
				configurationElement.getAttribute("defaultUserEditable").equalsIgnoreCase("true"));
		connection.setDefaultClient(configurationElement.getAttribute("defaultClient"), 
				configurationElement.getAttribute("defaultClientEditable").equalsIgnoreCase("true"));

		final String localeISOCode = configurationElement.getAttribute("defaultLocale");
		if ((localeISOCode != null) && (!localeISOCode.equals(""))) {
			try {
				final Locale locale = LocaleRegistry.getInstance().getLocaleByISO(localeISOCode);
				connection.setDefaultLocale(locale,  
						configurationElement.getAttribute("defaultLocaleEditable").equalsIgnoreCase("true"));
			} catch (LocaleNotFoundException e) {
				logError(MessageFormat.format("Connection {0} contains an invalid default locale, ignoring it.",
						connectionID), e);
			}
		}

		staticConnectionData.put(connectionID, connection);

	}

	/**
	 * Updates an existing static connection object.
	 * @param configurationElement
	 * @param connectionID
	 */
	private void updateStaticConnection(final IConfigurationElement configurationElement, final String connectionID) {
		assert false;
		// TODO implement this method
	}

	/**
	 * Auxiliary method to log an error message
	 * @param message the message to log
	 * @param exception the exception that occurred
	 */
	private void logError(String message, Exception exception) {
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, exception));
	}

	/**
	 * @return the set of plug-in provider IDs
	 */
	public Set<String> getProviderIDs() {
		return connectionProviders.keySet();
	}

	/**
	 * @param providerID the ID of the connection provider
	 * @return a list of connection IDs supplied by the provider
	 * @throws ProviderNotFoundException 
	 */
	public Set<String> getConnectionDataIDs(String providerID) throws ProviderNotFoundException {
		if ((providerID == null) || (providerID.equals(""))) {
			return getConnectionDataIDs();
		} else if (!connectionProviders.containsKey(providerID)) {
			throw new ProviderNotFoundException(providerID);
		} else { 
			Set<String> connectionIDs = new HashSet<String>();
			for(final String localID: connectionProviders.get(providerID).getConnectionIDs()) {
				connectionIDs.add(providerID + "#" + localID);
			}
			return connectionIDs;
		}
	}

	/**
	 * @return a list of all connections IDs, whether the connections are statically defined or dynamically provided
	 */
	public Set<String> getConnectionDataIDs() {
		Set<String> connectionIDs = new HashSet<String>();

		// add the static connections
		connectionIDs.addAll(staticConnectionData.keySet());

		// add the connections provided by all connection providers
		for(final String providerID: connectionProviders.keySet()) {
			final IConnectionProvider provider = connectionProviders.get(providerID);
			for(final String connectionID: provider.getConnectionIDs()) {
				connectionIDs.add(providerID + "#" + connectionID);
			}
		}

		return connectionIDs;			
	}

	/**
	 * @param connectionID
	 * @return the connection data for a given connection ID
	 * @throws ConnectionNotFoundException
	 * @throws ProviderNotFoundException 
	 */
	public IConnectionData getConnectionData(String connectionID) throws ConnectionNotFoundException, ProviderNotFoundException {
		if ((connectionID == null) || (connectionID.equals(""))) {
			throw new ConnectionNotFoundException(connectionID);
		} else if (connectionID.contains("#")) {
			String[] parts = connectionID.split("#");
			if (parts.length != 2) {
				logError(MessageFormat.format("Attempt to retrieve connection with invalid ID {0}",
						connectionID), null);
				throw new ConnectionNotFoundException(connectionID);				
			}
			if (!connectionProviders.containsKey(parts[0])) {
				throw new ProviderNotFoundException(parts[0]);
			}
			return new ProvidedConnectionData(parts[0], connectionProviders.get(parts[0]).getConnectionData(parts[1]));
		} else {
			if (!staticConnectionData.containsKey(connectionID)) {
				throw new ConnectionNotFoundException(connectionID);
			}
			return staticConnectionData.get(connectionID);
		}
	}

	/**
	 * @return a set of all connections, whether they are statically defined or dynamically provided
	 */
	public Set<IConnectionData> getConnectionData() {
		Set<IConnectionData> connectionData = new HashSet<IConnectionData>();
		for (final String id: getConnectionDataIDs()) {
			try {
				connectionData.add(getConnectionData(id));
			} catch (ConnectionNotFoundException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
						MessageFormat.format("Exception occurred retrieving details of connection {0}.", id), e));
			} catch (ProviderNotFoundException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
						MessageFormat.format("Exception occurred retrieving details of connection {0}.", id), e));
			}
		}
		return connectionData;
	}
}
