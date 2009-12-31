/**
 * Copyright (c) 2009 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.cts.ui;

import java.util.List;

import net.sf.rcer.cts.TransportException;
import net.sf.rcer.cts.TransportOrder;
import net.sf.rcer.cts.TransportOrderType;
import net.sf.rcer.cts.TransportStatus;
import net.sf.rcer.cts.TransportSystem;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import com.sap.conn.jco.JCoDestination;

/**
 * A dialog to select transport orders and tasks. 
 * @author vwegert
 *
 */
public class TransportSelectionDialog extends TitleAreaDialog implements ISelectionChangedListener {

	private String userName;
	private TransportSystem transportSystem;
	
	private TransportStatus status;
	private TransportOrderType orderType;

	private TreeViewer treeViewer;
	private Tree tree;
	private TransportContentProvider contentProvider;
	private TransportLabelProvider labelProvider;

	private TreeRoot root;
	private TransportOrder selectedOrder;

	/**
	 * Default constructor.
	 * @param parentShell the parent SWT shell
	 * @param destination the {@link JCoDestination} to use
	 * @param orderType the {@link TransportOrderType} to select, or <code>null</code> for no restriction
	 * @param status the {@link TransportStatus} to select, or <code>null</code> for no restriction
	 */
	public TransportSelectionDialog(Shell parentShell, JCoDestination destination, 
			TransportOrderType orderType, TransportStatus status) {
		
		super(parentShell);
		this.userName = destination.getUser();
		this.orderType = orderType;
		this.status = status;
		this.transportSystem = new TransportSystem(destination);
		this.root = new TreeRoot();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle(Messages.TransportSelectionDialog_Title);

		// create the top level composite for the dialog area
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.swtDefaults().numColumns(1).create());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(parent.getFont());

		// build the separator line
		Label titleBarSeparator = new Label(composite, SWT.HORIZONTAL | SWT.SEPARATOR);
		titleBarSeparator.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).span(2, 2).create());

		// add the tree viewer 
		treeViewer = new TreeViewer(composite);
		tree = treeViewer.getTree();
		tree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		tree.setHeaderVisible(true);
		tree.setFont(parent.getFont());
		treeViewer.addSelectionChangedListener(this);

		// add the first column (transport order / task, tree structure)
		TreeColumn col = new TreeColumn(tree, SWT.LEFT);
		col.setMoveable(false);
		col.setResizable(true);
		col.setWidth(200);

		// add the second column (owner)
		col = new TreeColumn(tree, SWT.LEFT);
		col.setMoveable(true);
		col.setResizable(true);
		col.setWidth(100);
		col.setText(Messages.TransportSelectionDialog_ColumnOwner);

		// add the third column (description)
		col = new TreeColumn(tree, SWT.LEFT);
		col.setMoveable(true);
		col.setResizable(true);
		col.setWidth(250);
		col.setText(Messages.TransportSelectionDialog_ColumnDescription);

		// create and assign the providers
		contentProvider = new TransportContentProvider();
		labelProvider = new TransportLabelProvider();
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(labelProvider);

		// set the tree contents for the first time
		treeViewer.setInput(root);
		updateTreeContents();
		treeViewer.expandToLevel(4); // so that the transports are visible

		return composite;
	}

	/**
	 * Re-reads the list of transports and updates the tree.
	 */
	private void updateTreeContents() {
		try {
			List<TransportOrder> transports = transportSystem.getTransportsForUser(userName, orderType, status);
			root.clear();
			root.addTransportOrders(transports);
			treeViewer.refresh();
		} catch (TransportException e) {
			ErrorDialog.openError(getParentShell(), Messages.TransportSelectionDialog_ErrorTitle, Messages.TransportSelectionDialog_ErrorReadingTransports, 
					new Status(IStatus.ERROR, "net.sf.rcer.cts.ui", e.getLocalizedMessage(), e)); //$NON-NLS-1$
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#open()
	 */
	@Override
	public int open() {
		selectedOrder = null;
		return super.open();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		selectedOrder = null;
		ITreeSelection treeSelection = (ITreeSelection) event.getSelection();
		Object element = treeSelection.getFirstElement();
		if ((element != null) && (element instanceof TransportOrder)) {
			selectedOrder = (TransportOrder) element;
		}
		if (selectedOrder == null) {
			setErrorMessage(Messages.TransportSelectionDialog_ErrorMessageSelection);
		} else {
			setErrorMessage(null);
		}
	}

	/**
	 * @return the selected transport order
	 */
	public TransportOrder getSelectedOrder() {
		return selectedOrder;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		if (selectedOrder != null) {
			super.okPressed();
		} else {
			setErrorMessage(Messages.TransportSelectionDialog_ErrorMessageSelection);
		}
	}

}
