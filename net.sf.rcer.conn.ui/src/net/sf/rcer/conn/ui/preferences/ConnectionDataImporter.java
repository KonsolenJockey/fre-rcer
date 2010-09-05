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

import java.util.Collection;
import java.util.List;

import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.ui.Activator;
import net.sf.rcer.conn.ui.Messages;

import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.ListSelectionDialog;

/**
 * A process class to handle the import of connection data.
 * @author vwegert
 * @see ConnectionsPreferencePage
 *
 */
class ConnectionDataImporter {

	private Shell parent;
	private WritableList connections;

	/**
	 * An internal implementation of {@link ILabelProvider} used to display the lists.
	 * @author vwegert
	 *
	 */
	private class MyLabelProvider implements ILabelProvider {

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void addListener(ILabelProviderListener listener) {
			// not used
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
		 */
		public void dispose() {
			// not used
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
		 */
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
		 */
		public void removeListener(ILabelProviderListener listener) {
			// not used
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
		 */
		public Image getImage(Object element) {
			return null;
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
		 */
		public String getText(Object element) {
			if (element instanceof ConnectionDataImportSourceDescriptor) {
				ConnectionDataImportSourceDescriptor descriptor = (ConnectionDataImportSourceDescriptor) element;
				return descriptor.getDescription();
			}
			if (element instanceof IConnectionData) {
				IConnectionData connectionData = (IConnectionData) element;
				return connectionData.getDescription();
			}
			return element.toString();
		}
	}

	/**
	 * Default constructor.
	 * @param parent the parent shell, used to open modal dialogs
	 * @param connections the list of connections to modify
	 */
	public ConnectionDataImporter(Shell parent, WritableList connections) {
		this.parent = parent;
		this.connections = connections;

	}

	/**
	 * Runs the series of dialogs used to select and import connection data.
	 * @return <code>true</code> if the list of connections was changed
	 */
	public boolean execute() {

		// load the list of sources
		final List<ConnectionDataImportSourceDescriptor> sources = ConnectionDataImportSourceDescriptor.loadDescriptors(true);
		if (sources.isEmpty()) {
			ErrorDialog.openError(parent, Messages.ConnectionDataImporter_DialogTitle, null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
			Messages.ConnectionDataImporter_NoSourcesError));
			return false;
		}

		// show a dialog to select a source
		ListDialog sourceSelectionDialog = new ListDialog(parent);
		sourceSelectionDialog.setTitle(Messages.ConnectionDataImporter_DialogTitle);
		sourceSelectionDialog.setMessage(Messages.ConnectionDataImporter_SelectSourceMessage);
		sourceSelectionDialog.setLabelProvider(new MyLabelProvider());
		sourceSelectionDialog.setContentProvider(new ArrayContentProvider());
		sourceSelectionDialog.setInput(sources);
		Object[] sourceSelection = null;
		while ((sourceSelection == null) || (sourceSelection.length != 1)) {
			if (sourceSelectionDialog.open() != ListDialog.OK) {
				return false;
			}
			sourceSelection = sourceSelectionDialog.getResult();
			if (sourceSelection.length != 1) {
				ErrorDialog.openError(parent, Messages.ConnectionDataImporter_DialogTitle, null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				Messages.ConnectionDataImporter_SourceSelectionError));
			}
		}		
		assert sourceSelection.length == 1; // see conditions above
		final ConnectionDataImportSourceDescriptor source = (ConnectionDataImportSourceDescriptor) sourceSelection[0]; 
		assert source.isAvailable(); // see ConnectionDataImportSourceDescriptor.loadDescriptors(true)

		// have the source provider implementation load its data and display the status if any
		final IStatus loadStatus =  source.loadConnectionData(parent);
		if (loadStatus.getSeverity() == IStatus.CANCEL) {
			return false;
		}
		if (!(loadStatus.isOK()) || (loadStatus.isMultiStatus())) {
			if (ErrorDialog.openError(parent, Messages.ConnectionDataImporter_DialogTitle, null, loadStatus) == ErrorDialog.CANCEL) {
				return false;
			}
		}

		// show a dialog to select the connections
		final Collection<IConnectionData> sourceConnections = source.getConnectionData();
		if (sourceConnections.isEmpty()) {
			ErrorDialog.openError(parent, Messages.ConnectionDataImporter_DialogTitle, null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
			Messages.ConnectionDataImporter_NoConnectionsError));
			return false;
		}

		ListSelectionDialog connectionSelectionDialog = new ListSelectionDialog(parent, sourceConnections, 
				new ArrayContentProvider(), new MyLabelProvider(), Messages.ConnectionDataImporter_SelectConnectionsMessage);
		connectionSelectionDialog.setTitle(Messages.ConnectionDataImporter_DialogTitle);
		Object[] selectedConnections = null;
		while ((selectedConnections == null) || (selectedConnections.length == 0)) {
			if (connectionSelectionDialog.open() == ListSelectionDialog.CANCEL) {
				return false;
			}
			selectedConnections = connectionSelectionDialog.getResult();
			if (selectedConnections.length == 0) {
				ErrorDialog.openError(parent, Messages.ConnectionDataImporter_DialogTitle, null, new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				Messages.ConnectionDataImporter_ConnectionSelectionError));			
			}
		}
		
		// append the connections to the list
		for (int i = 0; i < selectedConnections.length; i++) {
			connections.add(selectedConnections[i]);
		}
		return true;

	}

}
