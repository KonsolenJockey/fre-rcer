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
import net.sf.rcer.cts.TransportOrderType;
import net.sf.rcer.cts.TransportStatus;

/**
 * The second visible level of the tree, displaying the transport types.
 * @author vwegert
 *
 */
class TreeLevelType implements ITreeItem {

	private TreeLevelTarget parent;
	private TransportOrderType type;
	private Map<TransportStatus, TreeLevelStatus> statuses = new TreeMap<TransportStatus, TreeLevelStatus>();

	/**
	 * Default constructor.
	 * @param parent 
	 * @param type
	 */
	public TreeLevelType(TreeLevelTarget parent, TransportOrderType type) {
		this.parent = parent;
		this.type = type;
	}

	/**
	 * Determines the container object that a transport is stored in (that is, the parent of the transport order
	 * object in the tree). 
	 * @param order the order to search for
	 * @return the container object
	 */
	public Object getContainerForTransport(TransportOrder order) {
		final TransportStatus status = order.getStatus(); 
		if (!statuses.containsKey(status)) {
			return statuses.get(status).getContainerForTransport(order);
		}
		return null;
	}
	
	/**
	 * Adds a transport order to the tree. 
	 * @param order
	 */
	public void addTransportOrder(TransportOrder order) {
		final TransportStatus status = order.getStatus(); 
		if (!statuses.containsKey(status)) {
			statuses.put(status, new TreeLevelStatus(this, status));
		}
		statuses.get(status).addTransportOrder(order);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getChildren()
	 */
	public Object[] getChildren() {
		return statuses.values().toArray();
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
		return !statuses.isEmpty();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getKeyColumnText()
	 */
	public String getKeyColumnText() {
		return type.getDescription();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getDescriptionText()
	 */
	public String getDescriptionText() {
		return ""; //$NON-NLS-1$
	}

}