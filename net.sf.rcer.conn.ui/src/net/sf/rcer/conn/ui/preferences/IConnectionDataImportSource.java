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

import java.util.Collection;

import net.sf.rcer.conn.connections.IConnectionData;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.widgets.Shell;

/**
 * The interface of a data source that is able to provide {@link IConnectionData} instances
 * that can be imported into the preferences.
 * @author vwegert
 *
 */
public interface IConnectionDataImportSource {

	/**
	 * Determines whether the source is available. 
	 * @return <code>true</code> if the source is available
	 */
	public boolean isAvailable();
	
	/**
	 * Loads the connection data from the actual source. This method will only be called after {@link #isAvailable()} 
	 * has returned <code>true</code>.
	 * @param parent the parent shell
	 * @return an {@link IStatus} instance that tells the caller whether the loading operation was successful
	 */
	public IStatus loadConnectionData(Shell parent);
	
	/**
	 * Retrieves the list of connections that can be imported. This method will only be called after {@link #loadConnectionData(Shell)}
	 * was called and has returned a non-error and non-cancel status.
	 * @return the list of connections that can be imported
	 */
	public Collection<IConnectionData> getConnectionData();
	
}
