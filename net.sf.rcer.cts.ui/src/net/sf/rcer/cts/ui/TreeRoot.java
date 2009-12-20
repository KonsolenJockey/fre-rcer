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

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import net.sf.rcer.cts.TransportOrder;

/**
 * The (invisible) root node of the tree. 
 * @author vwegert
 *
 */
class TreeRoot {
	
	private Map<String, TreeLevelTarget> targets = new TreeMap<String, TreeLevelTarget>();
	
	/**
	 * Removes the entire tree content. 
	 */
	public void clear() {
		targets.clear();
	}
	
	/**
	 * Determines the container object that a transport is stored in (that is, the parent of the transport order
	 * object in the tree). 
	 * @param order the order to search for
	 * @return the container object
	 */
	public Object getContainerForTransport(TransportOrder order) {
		final String target = order.getTarget();
		if (targets.containsKey(target)) {
			return targets.get(target).getContainerForTransport(order);
		}
		return null;
	}
	
	/**
	 * Adds a transport order to the tree. 
	 * @param order
	 */
	public void addTransportOrder(TransportOrder order) {
		final String target = order.getTarget();
		if (!targets.containsKey(target)) {
			targets.put(target, new TreeLevelTarget(this, target));
		}
		targets.get(target).addTransportOrder(order);
	}
	
	/**
	 * Adds a list of transport orders to the tree. 
	 * @param orders
	 */
	public void addTransportOrders(Collection<TransportOrder> orders) {
		for (final TransportOrder order: orders) {
			addTransportOrder(order);
		}
	}

	/**
	 * @return the array of elements to display in the viewer
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements() {
		return targets.values().toArray();
	}

}