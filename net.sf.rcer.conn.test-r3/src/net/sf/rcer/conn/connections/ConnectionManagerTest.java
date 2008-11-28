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

import net.sf.rcer.conn.providers.ConnectionProvider;
import net.sf.rcer.conn.providers.CredentialsProvider;

import org.junit.After;
import org.junit.Before;


/**
 * TODO Write documentation for type ConnectionManagerTest.
 * @author vwegert
 *
 */
public abstract class ConnectionManagerTest {
	
	/**
	 * The connection manager for easier access.
	 */
	protected ConnectionManager manager;

	/**
	 * The set-up method. 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.reset();
		manager = ConnectionManager.getInstance();
		manager.closeConnections();
	}

	/**
	 * The tear-down method. 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		manager.closeConnections();
	}


//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getPrimaryConnectionID()}.
//	 * @throws Exception 
//	 */
//	@Test
//	public void testGetPrimaryConnectionID() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getSecondaryConnectionIDs()}.
//	 * @throws Exception 
//	 */
//	@Test
//	public void testGetSecondaryConnectionIDs() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getActiveConnectionIDs()}.
//	 * @throws Exception 
//	 */
//	@Test
//	public void testGetActiveConnectionIDs() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#getActiveConnections()}.
//	 */
//	@Test
//	public void testGetActiveConnections() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isActive(net.sf.rcer.conn.connections.IConnectionData)}.
//	 */
//	@Test
//	public void testIsActiveIConnectionData() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isActive(java.lang.String)}.
//	 */
//	@Test
//	public void testIsActiveString() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isPrimaryConnection(java.lang.String)}.
//	 */
//	@Test
//	public void testIsPrimaryConnectionString() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isPrimaryConnection(net.sf.rcer.conn.connections.IConnection)}.
//	 */
//	@Test
//	public void testIsPrimaryConnectionIConnection() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#isConnected()}.
//	 */
//	@Test
//	public void testIsConnected() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#setPrimaryConnection(com.sap.conn.jco.JCoDestination)}.
//	 */
//	@Test
//	public void testSetPrimaryConnectionJCoDestination() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#setPrimaryConnection(net.sf.rcer.conn.connections.IConnection)}.
//	 */
//	@Test
//	public void testSetPrimaryConnectionIConnection() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#setPrimaryDestination(java.lang.String)}.
//	 */
//	@Test
//	public void testSetPrimaryDestination() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#closeConnection()}.
//	 */
//	@Test
//	public void testCloseConnection() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#closeConnection(com.sap.conn.jco.JCoDestination)}.
//	 */
//	@Test
//	public void testCloseConnectionJCoDestination() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#closeConnection(net.sf.rcer.conn.connections.IConnection)}.
//	 */
//	@Test
//	public void testCloseConnectionIConnection() throws Exception {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#closeConnection(java.lang.String)}.
//	 */
//	@Test
//	public void testCloseConnectionString() throws Exception {
//		fail("Not yet implemented");
//	}
//

}
