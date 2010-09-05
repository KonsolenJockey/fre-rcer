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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;

import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.tools.LogonIniReader;
import net.sf.rcer.conn.ui.Activator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * A basic implementation of {@link IConnectionDataImportSource}.
 * @author vwegert
 *
 */
public abstract class AbstractConnectionDataImportSource implements IConnectionDataImportSource {

	/**
	 * The {@link LogonIniReader} used to read the contents of the INI file.
	 */
	protected LogonIniReader reader;
	
	/**
	 * Tries to read the file and returns a status according to the result.
	 * @param fileName the name of the file to read
	 * @return an {@link IStatus} 
	 */
	protected IStatus readFileContents(String fileName) {
		try {
			reader = new LogonIniReader(new FileInputStream(fileName));
			return reader.getStatus();
		} catch (FileNotFoundException e) {
			reader = null;
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getLocalizedMessage(), e);
		}
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.ui.preferences.IConnectionDataImportSource#getConnectionData()
	 */
	public Collection<IConnectionData> getConnectionData() {
		assert reader != null;
		return reader.getConnections();
	}

}
