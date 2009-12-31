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

import net.sf.rcer.cts.AbstractTransport;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * The {@link LabelProvider} used to display the transport objects in the tree viewer 
 * of the {@link TransportSelectionDialog}-
 * @author vwegert
 *
 */
class TransportLabelProvider extends LabelProvider implements ITableLabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		// We don't have any images to provide (yet).
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex) {
		switch(columnIndex) {
		case 0: return getKeyColumnText(element);
		case 1: return getOwnerText(element);
		case 2: return getDescriptionText(element);
		default: return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @param element
	 * @return the text to be displayed in the key (hierarchy) column.
	 */
	private String getKeyColumnText(Object element) {
		if (element instanceof ITreeItem) {
			ITreeItem item = (ITreeItem) element;
			return item.getKeyColumnText();
		}
		if (element instanceof AbstractTransport) {
			return ((AbstractTransport) element).getID();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * @param element
	 * @return the text to be displayed in the owner column.
	 */
	private String getOwnerText(Object element) {
		if (element instanceof ITreeItem) {
			return ""; //$NON-NLS-1$
		}
		if (element instanceof AbstractTransport) {
			return ((AbstractTransport) element).getOwner();
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * @param element
	 * @return the text to be displayed in the description column
	 */
	private String getDescriptionText(Object element) {
		if (element instanceof ITreeItem) {
			ITreeItem item = (ITreeItem) element;
			return item.getDescriptionText();
		}
		if (element instanceof AbstractTransport) {
			return ((AbstractTransport) element).getDescription();
		}
		return ""; //$NON-NLS-1$
	}

}
