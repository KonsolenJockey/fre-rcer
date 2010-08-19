/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.connections;

import org.eclipse.core.runtime.OperationCanceledException;

/**
 * An interface for a class that is able to select a connection and provide logon credentials.
 * @author vwegert
 *
 */
public interface ICredentialsProviderWithSelection {

	/**
	 * Select a connection and determine the credentials to use.
	 * @return the credentials, or <code>null</code> if the credentials can not be provided
	 * @throws OperationCanceledException if the user cancelled the logon
	 */
	public ICredentials getCredentials() throws OperationCanceledException;

}
