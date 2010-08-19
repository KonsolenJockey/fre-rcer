/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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

import net.sf.rcer.cts.TransportOrder;
import net.sf.rcer.cts.TransportTask;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The {@link ITreeContentProvider} used to display the transport objects in the tree viewer 
 * of the {@link TransportSelectionDialog}-
 * @author vwegert
 *
 */
class TransportContentProvider implements ITreeContentProvider {

	private TreeRoot root;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ITreeItem) {
			final ITreeItem item = (ITreeItem) parentElement;
			return item.getChildren();
		}
		if (parentElement instanceof TransportOrder) {
			TransportOrder order = (TransportOrder) parentElement;
			return order.getTasks().toArray();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	public Object getParent(Object element) {
		if (element instanceof ITreeItem) {
			final ITreeItem item = (ITreeItem) element;
			return item.getParent();
		}
		if (element instanceof TransportOrder) {
			TransportOrder order = (TransportOrder) element;
			return root.getContainerForTransport(order);
		}
		if (element instanceof TransportTask) {
			TransportTask task = (TransportTask) element;
			return task.getOrder();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	public boolean hasChildren(Object element) {
		if (element instanceof ITreeItem) {
			ITreeItem item = (ITreeItem) element;
			return item.hasChildren();
		}
		if (element instanceof TransportOrder) {
			TransportOrder order = (TransportOrder) element;
			return order.getTasks().size() > 0;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object inputElement) {
		return root.getElements();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
		root = null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof TreeRoot) {
			root = (TreeRoot) newInput;
		} 
	}

}
