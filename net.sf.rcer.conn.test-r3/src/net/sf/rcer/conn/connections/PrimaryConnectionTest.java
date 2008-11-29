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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sf.rcer.conn.providers.ConnectionProvider;
import net.sf.rcer.conn.providers.CredentialsProvider;

import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * Tests for the primary connection handling.
 * @author vwegert
 *
 */
public class PrimaryConnectionTest extends ConnectionManagerTest {

	private static final String CONNECTION_ID_1 = ConnectionProvider.PROVIDER_ID + "#1";
	private static final String CONNECTION_ID_2 = ConnectionProvider.PROVIDER_ID + "#2";

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ConnectionManagerTest#setUp()
	 */
	@Override
	public void setUp() throws Exception {
		super.setUp();
		ConnectionProvider.setAvailableConnections(2);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getDestination()}.
	 * @throws Exception 
	 */
	@Test
	public void testGetDestination() throws Exception {
		JCoDestination dest1 = manager.getDestination();
		assertTrue("Manager should report as connected.", manager.isConnected());
		assertTrue("Connection should be active.", manager.isActive(dest1.getDestinationName()));
		assertTrue("Connection ID", dest1.getDestinationName().startsWith(CONNECTION_ID_1));
		assertTrue("Credentials Provider with selection should have been called.", 
				CredentialsProvider.wasGetCredentialsWithSelectionCalled());
		assertFalse("Credentials Provider without selection should nothave been called.", 
				CredentialsProvider.wasGetCredentialsWithoutSelectionCalled());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getPrimaryConnectionID()}.
	 * @throws Exception 
	 */
	@Test
	public void testGetPrimaryConnectionID() throws Exception {
		JCoDestination dest1 = manager.getDestination();
		assertEquals("Primary connection ID", dest1.getDestinationName(), manager.getPrimaryConnectionID());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getSecondaryConnectionIDs()}.
	 * @throws Exception 
	 */
	@Test
	public void testGetSecondaryConnectionIDs() throws Exception {
		@SuppressWarnings("unused")
		JCoDestination dest1 = manager.getDestination(CONNECTION_ID_1);
		JCoDestination dest2 = manager.getDestination(CONNECTION_ID_2);
		Set<String> ids = manager.getSecondaryConnectionIDs();
		assertEquals("Number of secondary connections", 1, ids.size());
		assertEquals("ID of secondary connection", dest2.getDestinationName(), ids.iterator().next());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isPrimaryConnection(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testIsPrimaryConnectionString() throws Exception {
		JCoDestination dest2 = manager.getDestination(CONNECTION_ID_2);
		@SuppressWarnings("unused")
		JCoDestination dest1 = manager.getDestination(CONNECTION_ID_1);
		assertTrue("The first activated connection should be the primary connection.", 
				manager.isPrimaryConnection(dest2.getDestinationName()));
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#setPrimaryConnection(com.sap.conn.jco.JCoDestination)}.
	 * @throws Exception 
	 */
	@Test
	public void testSetPrimaryConnectionJCoDestination() throws Exception {
		JCoDestination dest1 = manager.getDestination(CONNECTION_ID_1);
		JCoDestination dest2 = manager.getDestination(CONNECTION_ID_2);
		assertTrue("First connection should be primary connection.", manager.isPrimaryConnection(dest1));
		assertFalse("Second connection should not be primary connection.", manager.isPrimaryConnection(dest2));
		manager.setPrimaryConnection(dest2);
		assertFalse("First connection should not be primary connection.", manager.isPrimaryConnection(dest1));
		assertTrue("Second connection should be primary connection.", manager.isPrimaryConnection(dest2));
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#setPrimaryConnection(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testSetPrimaryConnection() throws Exception {
		JCoDestination dest1 = manager.getDestination(CONNECTION_ID_1);
		JCoDestination dest2 = manager.getDestination(CONNECTION_ID_2);
		assertTrue("First connection should be primary connection.", manager.isPrimaryConnection(dest1));
		assertFalse("Second connection should not be primary connection.", manager.isPrimaryConnection(dest2));
		manager.setPrimaryConnection(dest2.getDestinationName());
		assertFalse("First connection should not be primary connection.", manager.isPrimaryConnection(dest1));
		assertTrue("Second connection should be primary connection.", manager.isPrimaryConnection(dest2));
	}

}
