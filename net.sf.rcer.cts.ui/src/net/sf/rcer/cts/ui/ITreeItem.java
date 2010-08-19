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

/**
 * An interface for all hierarchy levels except for transport orders and tasks.
 * @author vwegert
 *
 */
public interface ITreeItem {

	/**
	 * @return an array of child elements
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	Object[] getChildren();

	/**
     * @return the parent element, or <code>null</code> if it has none or if the parent cannot be computed
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	Object getParent();

	/**
     * @return <code>true</code> if the given element has children,
     *  and <code>false</code> if it has no children
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	boolean hasChildren();

	/**
	 * @return the text displayed in the key (hierarchy) column
	 */
	String getKeyColumnText();

	/**
	 * @return the text displayed in the description column
	 */
	String getDescriptionText();
	
}
