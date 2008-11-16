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
package net.sf.rcer.conn.ui.status;

import java.text.MessageFormat;
import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.IConnection;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.IConnectionStateListener;
import net.sf.rcer.conn.ui.Activator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

import com.sap.conn.jco.JCoException;

/**
 * The trim widget that displays the connection status and provides a context menu to log on and log off.
 * @author vwegert
 *
 */
public class ConnectionStatusDisplay extends WorkbenchWindowControlContribution implements MenuDetectListener, IConnectionStateListener {

	private Composite composite;
	private Label label;

	/**
	 * Default constructor.
	 */
	public ConnectionStatusDisplay() {
		ConnectionManager.getInstance().addConnectionStateListener(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.ControlContribution#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);

		// Give some room around the control
		FillLayout layout = new FillLayout();
		layout.marginHeight = 4;
		layout.marginWidth = 2;
		composite.setLayout(layout);

		label = new Label(composite, SWT.BORDER | SWT.CENTER);
		primaryConnectionChanged(null);

		composite.addMenuDetectListener(this);
		label.addMenuDetectListener(this);

		return composite;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.events.MenuDetectListener#menuDetected(org.eclipse.swt.events.MenuDetectEvent)
	 */
	public void menuDetected(MenuDetectEvent event) {

		final Set<IConnectionData> connections = ConnectionRegistry.getInstance().getConnectionData(); 
		final ConnectionManager manager = ConnectionManager.getInstance();

		Menu menu = new Menu(getWorkbenchWindow().getShell());
		menu.setLocation(event.x, event.y);

		if (connections.isEmpty()) {
			// no connections available - doesn't make sense to populate this menu
			MenuItem itemNoConnections = new MenuItem(menu, SWT.PUSH);
			itemNoConnections.setEnabled(false);
			itemNoConnections.setText("No Connections defined");
		} else {
			if (connections.size() == 1) {
				// only one connection available - create a very simple menu
				IConnectionData connectionData = connections.iterator().next();

				MenuItem itemConnectSingle = new MenuItem(menu, SWT.PUSH);
				itemConnectSingle.setText(MessageFormat.format("Connect to {0}...", connectionData.getDescription()));
				itemConnectSingle.setData(connectionData);
				itemConnectSingle.setEnabled(!manager.isActive(connectionData));
				itemConnectSingle.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (e.widget.getData() instanceof IConnectionData) {
							connect((IConnectionData) e.widget.getData());
						}
					}
				});

				MenuItem itemDisconnectSingle = new MenuItem(menu, SWT.PUSH);
				itemDisconnectSingle.setText(MessageFormat.format("Disconnect from {0}", connectionData.getDescription()));
				itemDisconnectSingle.setData(connectionData);
				itemDisconnectSingle.setEnabled(manager.isActive(connectionData));
				itemDisconnectSingle.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (e.widget.getData() instanceof IConnectionData) {
							disconnect((IConnectionData) e.widget.getData());
						}
					}
				});

			} else {
				// more than one connection available - menu gets a bit more complex...

				// submenu to connect
				MenuItem itemConnectMultiple = new MenuItem(menu, SWT.CASCADE);
				itemConnectMultiple.setText("Connect");
				Menu menuConnectMultiple = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
				for (IConnectionData connectionData: connections) {
					MenuItem itemConnectSingle = new MenuItem(menuConnectMultiple, SWT.PUSH);
					itemConnectSingle.setText(connectionData.getDescription());
					itemConnectSingle.setData(connectionData);
					itemConnectSingle.setEnabled(!manager.isActive(connectionData));
					itemConnectSingle.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							if (e.widget.getData() instanceof IConnectionData) {
								connect((IConnectionData) e.widget.getData());
							}
						}
					});
				}
				itemConnectMultiple.setMenu(menuConnectMultiple);

				// submenu to select the primary connection
				MenuItem itemSelectPrimary = new MenuItem(menu, SWT.CASCADE);
				itemSelectPrimary.setText("Select Primary Connection");
				Menu menuSelectPrimary = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
				for (IConnectionData connectionData: connections) {
					MenuItem itemConnectSingle = new MenuItem(menuSelectPrimary, SWT.PUSH);
					itemConnectSingle.setText(connectionData.getDescription());
					itemConnectSingle.setData(connectionData);
					itemConnectSingle.setEnabled(!manager.isPrimaryConnection(connectionData));
					itemConnectSingle.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							if (e.widget.getData() instanceof IConnectionData) {
								setPrimaryConnection((IConnectionData) e.widget.getData());
							}
						}
					});
				}
				itemSelectPrimary.setMenu(menuSelectPrimary);

				// submenu to disconnect
				MenuItem itemDisconnectMultiple = new MenuItem(menu, SWT.CASCADE);
				itemDisconnectMultiple.setText("Disconnect");
				Menu menuDisconnectMultiple = new Menu(getWorkbenchWindow().getShell(), SWT.DROP_DOWN);
				for (IConnectionData connection: connections) {
					MenuItem itemDisconnectSingle = new MenuItem(menuDisconnectMultiple, SWT.PUSH);
					itemDisconnectSingle.setText(connection.getDescription());
					itemDisconnectSingle.setData(connection);
					itemDisconnectSingle.setEnabled(manager.isActive(connection));
					itemDisconnectSingle.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							if (e.widget.getData() instanceof IConnectionData) {
								disconnect((IConnectionData) e.widget.getData());
							}
						}
					});
				}
				itemDisconnectMultiple.setMenu(menuDisconnectMultiple);
			}

			MenuItem itemSystemStatus = new MenuItem(menu, SWT.PUSH);
			itemSystemStatus.setText("Display System Information...");
			itemSystemStatus.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (e.widget.getData() instanceof IConnectionData) {
						displaySystemInformation((IConnectionData) e.widget.getData());
					}
				}
			});

		}

		menu.setVisible(true);

	}

	/**
	 * Activates a connection. 
	 * @param connectionData 
	 */
	protected void connect(IConnectionData connectionData) {
		try {
			ConnectionManager.getInstance().getDestination(connectionData);
		} catch (JCoException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), "SAP R/3 Connection", 
					"Unable to connect to the SAP R/3 system.", 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		} catch (ConnectionException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), "SAP R/3 Connection", 
					"Unable to connect to the SAP R/3 system.", 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

	/**
	 * Changes the primary connection. 
	 * @param connectionData
	 */
	protected void setPrimaryConnection(IConnectionData connectionData) {
		try {
			ConnectionManager.getInstance().setPrimaryDestination(connectionData);
		} catch (JCoException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), "SAP R/3 Connection", 
					"Unable to connect to the SAP R/3 system.", 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		} catch (ConnectionException e) {
			ErrorDialog.openError(getWorkbenchWindow().getShell(), "SAP R/3 Connection", 
					"Unable to connect to the SAP R/3 system.", 
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

	/**
	 * Deactivates a connection. 
	 * @param connectionData
	 */
	protected void disconnect(IConnectionData connectionData) {
		ConnectionManager.getInstance().closeDestination(connectionData);
	}

	/**
	 * Displays the details of the primary connection and the system behind it. 
	 * @param connectionData
	 */
	protected void displaySystemInformation(IConnectionData connectionData) {
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
	public void primaryConnectionChanged(IConnection newPrimaryConnection) {
		if (label != null) {
			final Display display = getWorkbenchWindow().getShell().getDisplay();
			if (newPrimaryConnection == null) {
				label.setBackground(display.getSystemColor(SWT.COLOR_GRAY));
				label.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
				label.setText(" ---.--- ");
				label.setToolTipText("not connected");
			} else {
				label.setBackground(display.getSystemColor(SWT.COLOR_DARK_GREEN));
				label.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
				label.setText(MessageFormat.format(" {0}.{1} ", newPrimaryConnection.getSystemID(), newPrimaryConnection.getClient()));
				label.setToolTipText(newPrimaryConnection.getDescription());
			}
		}
	}

}
