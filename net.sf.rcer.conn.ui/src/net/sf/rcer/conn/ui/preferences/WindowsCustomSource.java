/**
 * Copyright (c) 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.ui.preferences;

import net.sf.rcer.conn.ui.Messages;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * An implementation of {@link IConnectionDataImportSource} that enables the user to choose
 * the INI file to import.
 * @author vwegert
 *
 */
public class WindowsCustomSource extends AbstractConnectionDataImportSource {

	/**
	 * Default constructor.
	 */
	public WindowsCustomSource() {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#isAvailable()
	 */
	public boolean isAvailable() {
		return true;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#loadConnectionData(org.eclipse.swt.widgets.Shell)
	 */
	public IStatus loadConnectionData(Shell parent) {
		FileDialog openDialog = new FileDialog(parent, SWT.OPEN);
		openDialog.setFilterExtensions(new String[] { "*.ini", "*.*" }); //$NON-NLS-1$ //$NON-NLS-2$
		openDialog.setFilterNames(new String[] { Messages.WindowsCustomSource_FilterNameIniFiles, Messages.WindowsCustomSource_FilterNameAllFiles });
		openDialog.setText(Messages.WindowsCustomSource_ImportDialogTitle);
		String fileName = openDialog.open();
		return (fileName == null) ? Status.CANCEL_STATUS : readFileContents(fileName);
	}

}
