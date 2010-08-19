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

/**
 * The first visible level of the tree, displaying the target systems.
 * @author vwegert
 *
 */
class TreeLevelTarget implements ITreeItem {
	
	private TreeRoot parent;
	private String target;
	private Map<TransportOrderType, TreeLevelType> types = new TreeMap<TransportOrderType, TreeLevelType>();

	/**
	 * Default constructor.
	 * @param parent 
	 * @param target
	 */
	public TreeLevelTarget(TreeRoot parent, String target) {
		this.parent = parent;
		this.target = target;
	}

	/**
	 * Determines the container object that a transport is stored in (that is, the parent of the transport order
	 * object in the tree). 
	 * @param order the order to search for
	 * @return the container object
	 */
	public Object getContainerForTransport(TransportOrder order) {
		final TransportOrderType type = order.getOrderType();
		if (types.containsKey(type)) {
			return types.get(type).getContainerForTransport(order);
		}
		return null;
	}
	
	/**
	 * Adds a transport order to the tree. 
	 * @param order
	 */
	public void addTransportOrder(TransportOrder order) {
		final TransportOrderType type = order.getOrderType();
		if (!types.containsKey(type)) {
			types.put(type, new TreeLevelType(this, type));
		}
		types.get(type).addTransportOrder(order);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getChildren()
	 */
	public Object[] getChildren() {
		return types.values().toArray();
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
		return !types.isEmpty();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getKeyColumnText()
	 */
	public String getKeyColumnText() {
		return (target == null || target.equals("")) ? Messages.TreeLevelTarget_LocalChangeRequests : target; //$NON-NLS-1$
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.cts.ui.ITreeItem#getDescriptionText()
	 */
	public String getDescriptionText() {
		return ""; //$NON-NLS-1$
	}

}