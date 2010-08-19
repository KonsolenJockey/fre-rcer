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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.test.provider.ConnectionProvider;
import net.sf.rcer.test.provider.CredentialsProvider;

import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * A test class for the various ways to get a connection using the connection ID.
 * @author vwegert
 *
 */
public class GetConnectionByIDTest extends ConnectionManagerTest {

	private static final String CONNECTION_ID = ConnectionProvider.PROVIDER_ID + "#1";
	private static final String UNKNOWN_PROVIDER   = "this.provider.does.not#exist";
	private static final String UNKNOWN_CONNECTION = ConnectionProvider.PROVIDER_ID + "#" + "does_not_exist_either";

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ProviderNotFoundException.class)
	public void testUnknownProvider() throws Exception {
		manager.getDestination(UNKNOWN_PROVIDER);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class) 
	public void testUnknownConnection() throws Exception {
		manager.getDestination(UNKNOWN_CONNECTION);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class)
	public void testNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(CONNECTION_ID);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(CONNECTION_ID);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testOneConnectionCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testMultipleConnections()	throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(CONNECTION_ID);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testMultipleConnectionsCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(CONNECTION_ID);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(CONNECTION_ID);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(CONNECTION_ID));
		assertFalse("Should not have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection either", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ProviderNotFoundException.class)
	public void testReuseUnknownProvider() throws Exception {
		manager.getDestination(UNKNOWN_PROVIDER, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class)
	public void testReuseUnknownConnection() throws Exception {
		manager.getDestination(UNKNOWN_CONNECTION, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class)
	public void testReuseNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(CONNECTION_ID, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testReuseOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(CONNECTION_ID, true);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testReuseOneConnectionCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testReuseMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(CONNECTION_ID, true);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testReuseMultipleConnectionsCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testReuseSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(CONNECTION_ID, true);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(CONNECTION_ID, true);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(CONNECTION_ID));
		assertFalse("Should not have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection either", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ProviderNotFoundException.class)
	public void testNoReuseUnknownProvider() throws Exception {
		manager.getDestination(UNKNOWN_PROVIDER, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class)
	public void testNoReuseUnknownConnection() throws Exception {
		manager.getDestination(UNKNOWN_CONNECTION, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionNotFoundException.class)
	public void testNoReuseNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(CONNECTION_ID, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(CONNECTION_ID, false);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testNoReuseOneConnectionCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(CONNECTION_ID, false);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test(expected=ConnectionException.class)
	public void testNoReuseMultipleConnectionsCancelled() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		CredentialsProvider.setSimulateCancel(true);
		manager.getDestination(CONNECTION_ID, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(CONNECTION_ID, false);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(CONNECTION_ID, false);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(CONNECTION_ID));
		assertTrue("Should have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection at all", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

}
