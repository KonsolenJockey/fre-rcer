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

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Shell;

/**
 * An implementation of {@link IConnectionDataImportSource} that tries to read the INI file from
 * the default locations.
 * @author vwegert
 *
 */
public class WindowsDefaultSource extends AbstractConnectionDataImportSource {

	private String fileName;
	
	/**
	 * Default constructor.
	 */
	public WindowsDefaultSource() {
		// nothing to do 
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#isAvailable()
	 */
	public boolean isAvailable() {
		// We try to emulate the actual SAPlogon behavior here - see note 38119 for the official information.
		// Step 1: command line parameter /INI_FILE=... - we can't check this.
		// Step 2: environment variable SAPLOGON_INI_FILE
		String envVar = System.getenv("SAPLOGON_INI_FILE"); //$NON-NLS-1$
		if ((envVar != null) && (!envVar.isEmpty())) {
			final File file = new File(envVar);
			if (file.exists() && file.isFile()) {
				fileName = file.getAbsolutePath();
				return true;
			}
		}
		// Step 3: SAP GUI installation directory - we don't know that...
		// Step 4: Windows directory
		envVar = System.getenv("SAPLOGON_INI_FILE"); //$NON-NLS-1$
		if ((envVar != null) && (!envVar.isEmpty())) {
			final File file = new File(envVar + System.getProperty("file.separator") + "saplogon.ini"); //$NON-NLS-1$ //$NON-NLS-2$
			if (file.exists() && file.isFile()) {
				fileName = file.getAbsolutePath();
				return true;
			}
		}				
		return false;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#loadConnectionData(org.eclipse.swt.widgets.Shell)
	 */
	public IStatus loadConnectionData(Shell parent) {
		assert fileName != null;
		return readFileContents(fileName);
	}

}
