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
package net.sf.rcer.conn.ui.login;

import java.util.HashSet;
import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.ICredentials;
import net.sf.rcer.conn.connections.ICredentialsProviderWithSelection;
import net.sf.rcer.conn.connections.ICredentialsProviderWithoutSelection;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.dialogs.Dialog;

/**
 * A login provider that uses the {@link LoginDialog} to query the user for credentials.
 * @author vwegert
 *
 */
public class LoginProvider implements ICredentialsProviderWithSelection, ICredentialsProviderWithoutSelection {

	/**
	 * Default constructor.
	 */
	public LoginProvider() {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentialsProviderWithSelection#getCredentials()
	 */
	public ICredentials getCredentials() {
		LoginDialog loginDialog = new LoginDialog(ConnectionRegistry.getInstance().getConnectionData());
		switch(loginDialog.open()) { 
		case Dialog.OK:
			return loginDialog.getSelectedCredentials();
		case Dialog.CANCEL:
			throw new OperationCanceledException();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentialsProviderWithoutSelection#getCredentials(net.sf.rcer.conn.connections.IConnectionData)
	 */
	public ICredentials getCredentials(IConnectionData connectionData) {
		Set<IConnectionData> set = new HashSet<IConnectionData>();
		set.add(connectionData);
		LoginDialog loginDialog = new LoginDialog(set);
		switch(loginDialog.open()) {
		case Dialog.OK: 
			return loginDialog.getSelectedCredentials();
		case Dialog.CANCEL:
			throw new OperationCanceledException();
		}
		return null;
	}

}
