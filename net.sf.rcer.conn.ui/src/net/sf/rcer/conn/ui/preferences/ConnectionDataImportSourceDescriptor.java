/**
 * Copyright (c) 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.ui.preferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.ui.Activator;
import net.sf.rcer.conn.ui.Messages;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Shell;

/**
 * A wrapper class to read the connection data providers available from the extension registry and 
 * handle the instances at runtime.
 * @author vwegert
 *
 */
class ConnectionDataImportSourceDescriptor implements IConnectionDataImportSource {
	
	private static final String SOURCES_EXTENSION_POINT = "net.sf.rcer.conn.ui.connection_import"; //$NON-NLS-1$
	
	private String description;
	private IConnectionDataImportSource implementation;
	
	/**
	 * Internal constructor.
	 * @param extension
	 * @param element 
	 * @throws CoreException 
	 */
	private ConnectionDataImportSourceDescriptor(IExtension extension, IConfigurationElement element) throws CoreException {
		description = element.getAttribute("description"); //$NON-NLS-1$
		implementation = (IConnectionDataImportSource) element.createExecutableExtension("source"); //$NON-NLS-1$
	}
	
	/**
	 * @param onlyAvailable if <code>true</code>, only the sources that return {@link IConnectionDataImportSource#isAvailable()} = <code>true</code>
	 *        are returned
	 * @return a list of all connection data source descriptors available
	 */
	public static List<ConnectionDataImportSourceDescriptor> loadDescriptors(boolean onlyAvailable) {
		ArrayList<ConnectionDataImportSourceDescriptor> descriptors = new ArrayList<ConnectionDataImportSourceDescriptor>();
		for (IExtension extension: Platform.getExtensionRegistry().getExtensionPoint(SOURCES_EXTENSION_POINT).getExtensions()) {
			for (IConfigurationElement element: extension.getConfigurationElements()) {
				try {
					ConnectionDataImportSourceDescriptor desc = new ConnectionDataImportSourceDescriptor(extension, element);
					if ((!onlyAvailable) || desc.isAvailable()) {
						descriptors.add(desc);
					}
				} catch (CoreException e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ConnectionDataImportSourceDescriptor_SourceInstantiationError, e));
				}
			}
		}
		return Collections.unmodifiableList(descriptors);
	}
	
	/**
	 * @return the description of the connection data source
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#isAvailable()
	 */
	public boolean isAvailable() {
		return implementation.isAvailable();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#loadConnectionData(org.eclipse.swt.widgets.Shell)
	 */
	public IStatus loadConnectionData(Shell parent) {
		return implementation.loadConnectionData(parent);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#getConnectionData()
	 */
	public Collection<IConnectionData> getConnectionData() {
		return implementation.getConnectionData();
	}

}
