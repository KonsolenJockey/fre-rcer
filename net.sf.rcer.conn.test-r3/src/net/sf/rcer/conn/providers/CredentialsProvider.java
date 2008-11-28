/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.providers;

import java.util.Set;

import net.sf.rcer.conn.connections.Connection;
import net.sf.rcer.conn.connections.ConnectionNotFoundException;
import net.sf.rcer.conn.connections.ConnectionRegistry;
import net.sf.rcer.conn.connections.Credentials;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.connections.ICredentials;
import net.sf.rcer.conn.connections.ICredentialsProviderWithSelection;
import net.sf.rcer.conn.connections.ICredentialsProviderWithoutSelection;
import net.sf.rcer.conn.connections.ProviderNotFoundException;

import org.eclipse.core.runtime.OperationCanceledException;

/**
 * A credentials provider for testing purposes only.
 * @author vwegert
 *
 */
public class CredentialsProvider implements ICredentialsProviderWithSelection, ICredentialsProviderWithoutSelection {

	private static CredentialsProvider instance;
	private static boolean simulateCancel;
	private static boolean getCredentialsWithSelectionCalled;
	private static boolean getCredentialsWithoutSelectionCalled;

	/**
	 * Default constructor.
	 */
	public CredentialsProvider() {
		instance = this;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentialsProviderWithSelection#getCredentials()
	 */
	public ICredentials getCredentials() throws OperationCanceledException {
		getCredentialsWithSelectionCalled = true;
		if (simulateCancel) {
			throw new OperationCanceledException();
		}
		try {
			Set<String> ids = ConnectionRegistry.getInstance().getConnectionDataIDs(ConnectionProvider.PROVIDER_ID); 
			if (ids.size() == 0) {
				return null;
			}
			// we have to create a copy because the connection data is wrapped and the ID changes...
			final String id = ids.iterator().next();
			ICredentials src = ConnectionProvider.getCredentials(id);
			Connection conn = new Connection(ConnectionRegistry.getInstance().getConnectionData(id));
			conn.setClient(src.getConnection().getClient());
			conn.setUserName(src.getConnection().getUserName());
			conn.setLocale(src.getConnection().getLocale());
			Credentials cred = new Credentials(conn);
			cred.setPassword(src.getPassword());
			return cred;
		} catch (ProviderNotFoundException e) {
			throw new RuntimeException(e);
		} catch (ConnectionNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ICredentialsProviderWithoutSelection#getCredentials(net.sf.rcer.conn.connections.IConnectionData)
	 */
	public ICredentials getCredentials(IConnectionData connectionData) throws OperationCanceledException {
		getCredentialsWithoutSelectionCalled = true;
		if (simulateCancel) {
			throw new OperationCanceledException();
		}
		ICredentials src = ConnectionProvider.getCredentials(connectionData.getConnectionDataID());
		if (src == null) {
			return null;
		}
		Connection conn = new Connection(connectionData);
		conn.setClient(src.getConnection().getClient());
		conn.setUserName(src.getConnection().getUserName());
		conn.setLocale(src.getConnection().getLocale());
		Credentials cred = new Credentials(conn);
		cred.setPassword(src.getPassword());
		return cred;
	}

	/**
	 * @return the instance
	 */
	public static CredentialsProvider getInstance() {
		return instance;
	}

	/**
	 * Resets the called flags. 
	 */
	public static void reset() {
		getCredentialsWithSelectionCalled = false;
		getCredentialsWithoutSelectionCalled = false;
		simulateCancel = false;
	}
	
	/**
	 * @return the getCredentialsWithSelectionCalled
	 */
	public static boolean wasGetCredentialsWithSelectionCalled() {
		return getCredentialsWithSelectionCalled;
	}
	
	/**
	 * @return the getCredentialsWithoutSelectionCalled
	 */
	public static boolean wasGetCredentialsWithoutSelectionCalled() {
		return getCredentialsWithoutSelectionCalled;
	}

	/**
	 * @param simulateCancel whether to simulate a cancellation
	 */
	public static void setSimulateCancel(boolean simulateCancel) {
		CredentialsProvider.simulateCancel = simulateCancel;
	}
}

