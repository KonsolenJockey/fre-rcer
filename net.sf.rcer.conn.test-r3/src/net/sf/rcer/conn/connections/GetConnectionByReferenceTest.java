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
package net.sf.rcer.conn.connections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.providers.ConnectionProvider;
import net.sf.rcer.conn.providers.CredentialsProvider;

import org.junit.Before;
import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * A test class for the various ways to get a connection using an {@link IConnectionData} reference.
 * @author vwegert
 *
 */
public class GetConnectionByReferenceTest extends ConnectionManagerTest {

	private IConnectionData connectionData;

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ConnectionManagerTest#setUp()
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		connectionData = ConnectionRegistry.getInstance().getConnectionData(ConnectionProvider.PROVIDER_ID + "#1");
	}
	
	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionException.class)
	public void testNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(connectionData);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(connectionData);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		CredentialsProvider.getInstance();
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
		manager.getDestination(connectionData);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(connectionData);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
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
		manager.getDestination(connectionData);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(connectionData);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(connectionData);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertFalse("Should not have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection either", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionException.class)
	public void testReuseNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(connectionData, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testReuseOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(connectionData, true);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
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
		manager.getDestination(connectionData, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testReuseMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(connectionData, true);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
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
		manager.getDestination(connectionData, true);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testReuseSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(connectionData, true);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(connectionData, true);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertFalse("Should not have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection either", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with no active connections.
	 * @throws Exception 
	 */
	@Test(expected = ConnectionException.class)
	public void testNoReuseNoConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(0);
		manager.getDestination(connectionData, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseOneConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		JCoDestination dest = manager.getDestination(connectionData, false);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
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
		manager.getDestination(connectionData, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with multiple active connections.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseMultipleConnections() throws Exception {
		ConnectionProvider.setAvailableConnections(2);
		JCoDestination dest = manager.getDestination(connectionData, false);
		assertNotNull("Destination access by ID", dest);
		assertTrue("Connection ID does not match", dest.getDestinationID().startsWith(connectionData.getConnectionDataID()));
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
		manager.getDestination(connectionData, false);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination(java.lang.String)}.
	 * Tests with only one active connection.
	 * @throws Exception 
	 */
	@Test
	public void testNoReuseSameConnection() throws Exception {
		ConnectionProvider.setAvailableConnections(1);

		JCoDestination dest1 = manager.getDestination(connectionData, false);
		assertNotNull("Destination access by ID", dest1);
		assertTrue("Connection ID does not match", dest1.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertTrue("Should have called the credentials provider without selection", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());

		CredentialsProvider.reset();

		JCoDestination dest2 = manager.getDestination(connectionData, false);
		assertNotNull("Destination access by ID", dest2);
		assertTrue("Connection ID does not match", dest2.getDestinationID().startsWith(connectionData.getConnectionDataID()));
		assertTrue("Should have called the credentials provider without selection again", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
		assertFalse("Should not have called the credentials provider with selection at all", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
	}

}
