/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.ui.status;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.IConnection;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.IConnectionStateListener;
import net.sf.rcer.conn.ui.Activator;
import net.sf.rcer.conn.ui.Messages;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

/**
 * The trim widget that displays the connection status and provides a context menu to log on and log off.
 * @author vwegert
 *
 */
public class ConnectionStatusDisplay extends WorkbenchWindowControlContribution implements MenuDetectListener, IConnectionStateListener {

	private Composite composite;
	private Label label;

	private Color backgroundDisconnected;
	private Color backgroundConnected;
	private Color foregroundDisconnected;
	private Color foregroundConnected;
	
	
	/**
	 * Default constructor.
	 */
	public ConnectionStatusDisplay() {
		try {
			ConnectionManager.getInstance().addConnectionStateListener(this);
		} catch (NoClassDefFoundError e) {
			// this happens if the native library could not be loaded
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					Messages.ConnectionStatusDisplay_InitializationError, e));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.ControlContribution#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createControl(Composite parent) {

		// cache the colors used for the display
		final Display display = getWorkbenchWindow().getShell().getDisplay();
		backgroundDisconnected = display.getSystemColor(SWT.COLOR_GRAY);
		backgroundConnected    = display.getSystemColor(SWT.COLOR_DARK_GREEN);
		foregroundDisconnected = display.getSystemColor(SWT.COLOR_WHITE);
		foregroundConnected    = display.getSystemColor(SWT.COLOR_WHITE);
		
		composite = new Composite(parent, SWT.NONE);

		// Give some room around the control
		GridLayoutFactory.fillDefaults().margins(2, 2).applyTo(composite);

		label = new Label(composite, SWT.BORDER | SWT.CENTER);
		
		// determine the maximum sensible width and set it as the minimum size
		label.setText("MMM.MMM");
		composite.layout();
		int textWidth = label.getSize().x;
		GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, true).minSize(textWidth + 4, SWT.DEFAULT).applyTo(label);
		
		adjustLabel(ConnectionManager.getInstance().getPrimaryConnection());

		composite.addMenuDetectListener(this);
		label.addMenuDetectListener(this);

		return composite;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.MenuDetectListener#menuDetected(org.eclipse.swt.events.MenuDetectEvent)
	 */
	public void menuDetected(MenuDetectEvent event) {
		Menu menu = new Menu(getWorkbenchWindow().getShell());
		menu.setLocation(event.x, event.y);
		try {
			createConnectMenuEntries(menu);
			createSelectPrimaryConnectionMenuEntries(menu);
			createDisconnectMenuEntries(menu);

			MenuItem itemSystemStatus = new MenuItem(menu, SWT.PUSH);
			itemSystemStatus.setText(Messages.ConnectionStatusDisplay_DisplaySystemInformationItem);
			itemSystemStatus.setEnabled(ConnectionManager.getInstance().isConnected());
			itemSystemStatus.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (e.widget.getData() instanceof IConnectionData) {
						displaySystemInformation();
					}
				}
			});
		} catch (NoClassDefFoundError e) {
			// this happens if the native library could not be loaded
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					Messages.ConnectionStatusDisplay_InitializationError, e));
			menu = new Menu(getWorkbenchWindow().getShell());
			menu.setLocation(event.x, event.y);
			MenuItem itemError = new MenuItem(menu, SWT.PUSH);
			itemError.setText(Messages.ConnectionStatusDisplay_LibraryMissingMessage);
			itemError.setEnabled(false);
		}

		menu.setVisible(true);
	}

	/**
	 * Creates the menu items to connect to a system.
	 * @param menu
	 */
	private void createConnectMenuEntries(Menu menu) {
		final Set<IConnectionData> registeredConnections = ConnectionRegistry.getInstance().getConnectionData(); 

		switch(registeredConnections.size()) {
		case 0: {
			MenuItem itemConnect = new MenuItem(menu, SWT.PUSH);
			itemConnect.setText(Messages.ConnectionStatusDisplay_NoConnectionsAvailableItem);
			itemConnect.setEnabled(false);
			break;
		}
		case 1: {
			// only one connection available - create a very simple menu
			IConnectionData connectionData = registeredConnections.iterator().next();
			MenuItem itemConnect = new MenuItem(menu, SWT.PUSH);
			itemConnect.setText(MessageFormat.format(Messages.ConnectionStatusDisplay_ConnectItem, connectionData.getDescription()));
			itemConnect.setData(connectionData);
			itemConnect.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (e.widget.getData() instanceof IConnectionData) {
						connect((IConnectionData) e.widget.getData());
					}
				}
			});
			break;
		}
		default: {
			// more than one connection available - menu gets a bit more complex...
			MenuItem itemConnect = new MenuItem(menu, SWT.CASCADE);
			itemConnect.setText(Messages.ConnectionStatusDisplay_ConnectMenu);
			Menu menuConnect = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
			
			// create a sorted list of connections to be a bit more user friendly
			List<IConnectionData> sortedConnections = new ArrayList<IConnectionData>(registeredConnections.size());
			sortedConnections.addAll(registeredConnections);
			Collections.sort(sortedConnections, new Comparator<IConnectionData>() {
				/* (non-Javadoc)
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(IConnectionData arg0, IConnectionData arg1) {
					return arg0.getSystemID().compareTo(arg1.getSystemID());
				}
			});
			
			for (IConnectionData connectionData: sortedConnections) {
				MenuItem item = new MenuItem(menuConnect, SWT.PUSH);
				item.setText(connectionData.toString());
				item.setData(connectionData);
				item.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (e.widget.getData() instanceof IConnectionData) {
							connect((IConnectionData) e.widget.getData());
						}
					}
				});
			}
			itemConnect.setMenu(menuConnect);
			break;
		}
		}
	}

	/**
	 * Creates the menu items to select the primary connection. 
	 * @param menu
	 */
	private void createSelectPrimaryConnectionMenuEntries(Menu menu) {
		final Collection<IConnection> activeConnections = ConnectionManager.getInstance().getActiveConnections();
		if (activeConnections.size() > 1) {
			// submenu to select the primary connection
			MenuItem itemSelectPrimary = new MenuItem(menu, SWT.CASCADE);
			itemSelectPrimary.setText(Messages.ConnectionStatusDisplay_SelectPrimaryConnectionItem);
			Menu menuSelectPrimary = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
			
			// create a sorted list of connections to be a bit more user friendly
			List<IConnection> sortedConnections = new ArrayList<IConnection>(activeConnections.size());
			sortedConnections.addAll(activeConnections);
			Collections.sort(sortedConnections, new Comparator<IConnection>() {
				/* (non-Javadoc)
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(IConnection arg0, IConnection arg1) {
					return arg0.getSystemID().compareTo(arg1.getSystemID());
				}
			});
			
			for (IConnection connection: sortedConnections) {
				if (!ConnectionManager.getInstance().isPrimaryConnection(connection)) { 
					MenuItem itemConnectSingle = new MenuItem(menuSelectPrimary, SWT.PUSH);
					itemConnectSingle.setText(connection.toString());
					itemConnectSingle.setData(connection);
					itemConnectSingle.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							if (e.widget.getData() instanceof IConnection) {
								setPrimaryConnection((IConnection) e.widget.getData());
							}
						}
					});
				}
			}
			itemSelectPrimary.setMenu(menuSelectPrimary);
		}
	}

	/**
	 * Creates the menu items to disconnect from a system.
	 * @param menu
	 */
	private void createDisconnectMenuEntries(Menu menu) {
		final Collection<IConnection> activeConnections = ConnectionManager.getInstance().getActiveConnections();
		switch(activeConnections.size()) {
		case 0: 
			// no item
			break;
		case 1: {
			final IConnection connection = activeConnections.iterator().next();
			MenuItem itemDisconnectSingle = new MenuItem(menu, SWT.PUSH);
			itemDisconnectSingle.setText(MessageFormat.format(Messages.ConnectionStatusDisplay_DisconnectItem, connection.toString()));
			itemDisconnectSingle.setData(connection);
			itemDisconnectSingle.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (e.widget.getData() instanceof IConnection) {
						disconnect((IConnection) e.widget.getData());
					}
				}
			});
			break;	
		}
		default: {
			// submenu to disconnect
			MenuItem itemDisconnectMultiple = new MenuItem(menu, SWT.CASCADE);
			itemDisconnectMultiple.setText(Messages.ConnectionStatusDisplay_DisconnectMenu);
			Menu menuDisconnectMultiple = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
			
			// create a sorted list of connections to be a bit more user friendly
			List<IConnectionData> sortedConnections = new ArrayList<IConnectionData>(activeConnections.size());
			sortedConnections.addAll(activeConnections);
			Collections.sort(sortedConnections, new Comparator<IConnectionData>() {
				/* (non-Javadoc)
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(IConnectionData arg0, IConnectionData arg1) {
					return arg0.getSystemID().compareTo(arg1.getSystemID());
				}
			});
			
			for (IConnectionData connection: sortedConnections) {
				MenuItem itemDisconnectSingle = new MenuItem(menuDisconnectMultiple, SWT.PUSH);
				itemDisconnectSingle.setText(connection.toString());
				itemDisconnectSingle.setData(connection);
				itemDisconnectSingle.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (e.widget.getData() instanceof IConnection) {
							disconnect((IConnection) e.widget.getData());
						}
					}
				});
			}
			itemDisconnectMultiple.setMenu(menuDisconnectMultiple);
		}
		}
	}

	/**
	 * Activates a connection. 
	 * @param connectionData 
	 */
	protected void connect(IConnectionData connectionData) {
		try {
			ConnectionManager.getInstance().getDestination(connectionData, false);
		} catch (ConnectionException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), Messages.ConnectionStatusDisplay_ErrorTitle, 
					Messages.ConnectionStatusDisplay_ConnectionErrorMessage, 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

	/**
	 * Changes the primary connection. 
	 * @param connection
	 */
	protected void setPrimaryConnection(IConnection connection) {
		try {
			ConnectionManager.getInstance().setPrimaryConnection(connection);
		} catch (ConnectionException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), Messages.ConnectionStatusDisplay_ErrorTitle, 
					Messages.ConnectionStatusDisplay_ConnectionErrorMessage, 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

	/**
	 * Deactivates a connection. 
	 * @param connection
	 */
	protected void disconnect(IConnection connection) {
		ConnectionManager.getInstance().closeConnection(connection);
	}

	/**
	 * Displays the details of the primary connection and the system behind it. 
	 */
	protected void displaySystemInformation() {
		// TODO Implement the system information display.
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#connectionActivated(net.sf.rcer.conn.connections.IDestinationData)
	 */
	public void connectionActivated(IConnection connection) {
		// not required
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#connectionDeactivated(net.sf.rcer.conn.connections.IDestinationData)
	 */
	public void connectionDeactivated(IConnection connection) {
		// not required
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#primaryConnectionChanged(net.sf.rcer.conn.connections.IDestinationData)
	 */
	public void primaryConnectionChanged(final IConnection newPrimaryConnection) {
		if (label != null && !label.isDisposed()) {
			getWorkbenchWindow().getShell().getDisplay().asyncExec(new Runnable() {
				/* (non-Javadoc)
				 * @see java.lang.Runnable#run()
				 */
				public void run() {
					adjustLabel(newPrimaryConnection);
				}
			});

		}
	}
	
	/**
	 * Adjusts the properties of the label to match the connection status. 
	 * @param connection
	 */
	protected void adjustLabel(final IConnection connection) {
		if (connection == null) {
			label.setBackground(backgroundDisconnected);
			label.setForeground(foregroundDisconnected);
			label.setText(Messages.ConnectionStatusDisplay_NotConnectedText);
			label.setToolTipText(Messages.ConnectionStatusDisplay_NotConnectedTooltip);
		} else {
			label.setBackground(backgroundConnected);
			label.setForeground(foregroundConnected);
			label.setText(MessageFormat.format(Messages.ConnectionStatusDisplay_DisplayFormat, 
					connection.getSystemID(), connection.getClient()));
			label.setToolTipText(connection.toString());
		}
		
	}

}
