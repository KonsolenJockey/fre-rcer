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

import java.util.Map;
import java.util.TreeMap;

import net.sf.rcer.cts.TransportOrder;
import net.sf.rcer.cts.TransportStatus;

/**
 * The third visible level of the tree, displaying the transport order status. 
 * Below this level, the transport orders and tasks will be displayed
 * @author vwegert
 *
 */
class TreeLevelStatus implements ITreeItem {
	
	private TreeLevelType parent;
	private TransportStatus status;
	private Map<String, TransportOrder> orders = new TreeMap<String, TransportOrder>();

	/**
	 * Default constructor.
	 * @param parent 
	 * @param status
	 */
	public TreeLevelStatus(TreeLevelType parent, TransportStatus status) {
		this.parent= parent;
		this.status = status;
	}

	/**
	 * Adds a transport order to the tree. 
	 * @param order
	 */
	public void addTransportOrder(TransportOrder order) {
		orders.put(order.getID(), order);
	}

	/**
	 * Determines the container object that a transport is stored in (that is, the parent of the transport order
	 * object in the tree). 
	 * @param order the order to search for
	 * @return the container object
	 */
	public Object getContainerForTransport(TransportOrder order) {
		return this;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getChildren()
	 */
	public Object[] getChildren() {
		return orders.values().toArray();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getParent()
	 */
	public Object getParent() {
		return parent;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#hasChildren()
	 */
	public boolean hasChildren() {
		return !orders.isEmpty();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getKeyColumnText()
	 */
	public String getKeyColumnText() {
		return status.getDescription();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getDescriptionText()
	 */
	public String getDescriptionText() {
		return ""; //$NON-NLS-1$
	}

}