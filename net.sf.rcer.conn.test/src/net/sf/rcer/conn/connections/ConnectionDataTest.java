/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $$Id$$
 */
package net.sf.rcer.conn.connections;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A test for the connection data class.
 * @author vwegert
 *
 */
public class ConnectionDataTest {

	private final static String CONNECTION_ID   = "foobar";
	private final static String DESCRIPTION     = "Connection Description";
	private final static String SYSTEM_ID       = "SID";
	private final static String ROUTER          = "/H/foo/H/";
	private final static String APP_SERVER      = "appserv1";
	private final static int    SYSTEM_NUMBER   = 1;
	private final static String MSG_SERVER      = "msgserv1";
	private final static int    MSG_SERVER_PORT = 3456;
	private final static String LB_GROUP        = "PUBLIC";

	private ConnectionData directConnection;
	private ConnectionData loadBalancedConnection;
	
	/**
	 * Prepares some connection data objects to use for testing.
	 */
	@Before
	public void setUp() {
		directConnection = new ConnectionData(CONNECTION_ID, DESCRIPTION, 
				SYSTEM_ID, ROUTER, APP_SERVER, SYSTEM_NUMBER);
		loadBalancedConnection = new ConnectionData(CONNECTION_ID, DESCRIPTION,
				SYSTEM_ID, ROUTER, MSG_SERVER, MSG_SERVER_PORT, LB_GROUP);
	}
	
	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#ConnectionData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testConnectionDataConstructorDirect() {
		assertEquals("Connection ID", CONNECTION_ID, directConnection.getConnectionID());
		assertEquals("Description", DESCRIPTION, directConnection.getDescription());
		assertEquals("Connection Type", ConnectionType.DIRECT, directConnection.getConnectionType());
		assertEquals("System ID", SYSTEM_ID, directConnection.getSystemID());
		assertEquals("Router", ROUTER, directConnection.getRouter());
		assertEquals("Application Server", APP_SERVER, directConnection.getApplicationServer());
		assertEquals("System Number", SYSTEM_NUMBER, directConnection.getSystemNumber());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#ConnectionData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String)}.
	 */
	@Test
	public void testConnectionDataConstructorLoadBalanced() {
		assertEquals("Connection ID", CONNECTION_ID, loadBalancedConnection.getConnectionID());
		assertEquals("Description", DESCRIPTION, loadBalancedConnection.getDescription());
		assertEquals("Connection Type", ConnectionType.LOAD_BALANCED, loadBalancedConnection.getConnectionType());
		assertEquals("System ID", SYSTEM_ID, loadBalancedConnection.getSystemID());
		assertEquals("Router", ROUTER, loadBalancedConnection.getRouter());
		assertEquals("Message Server", MSG_SERVER, loadBalancedConnection.getMessageServer());
		assertEquals("Message Server Port", MSG_SERVER_PORT, loadBalancedConnection.getMessageServerPort());
		assertEquals("Load Balancing Group", LB_GROUP, loadBalancedConnection.getLoadBalancingGroup());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setDirectConnection(java.lang.String, int)}.
	 */
	@Test
	public void testSetDirectConnection() {
		loadBalancedConnection.setDirectConnection(APP_SERVER, SYSTEM_NUMBER);
		assertEquals("Connection Type", ConnectionType.DIRECT, loadBalancedConnection.getConnectionType());
		assertEquals("Application Server", APP_SERVER, loadBalancedConnection.getApplicationServer());
		assertEquals("System Number", SYSTEM_NUMBER, loadBalancedConnection.getSystemNumber());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setLoadBalancingConnection(java.lang.String, int, java.lang.String)}.
	 */
	@Test
	public void testSetLoadBalancingConnection() {
		directConnection.setLoadBalancingConnection(MSG_SERVER, MSG_SERVER_PORT, LB_GROUP);
		assertEquals("Connection Type", ConnectionType.LOAD_BALANCED, directConnection.getConnectionType());
		assertEquals("Message Server", MSG_SERVER, directConnection.getMessageServer());
		assertEquals("Message Server Port", MSG_SERVER_PORT, directConnection.getMessageServerPort());
		assertEquals("Load Balancing Group", LB_GROUP, directConnection.getLoadBalancingGroup());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#isDirectConnection()}.
	 */
	@Test
	public void testIsDirectConnection() {
		assertEquals(true, directConnection.isDirectConnection());
		assertEquals(false, loadBalancedConnection.isDirectConnection());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#isLoadBalancedConnection()}.
	 */
	@Test
	public void testIsLoadBalancedConnection() {
		assertEquals(false, directConnection.isLoadBalancedConnection());
		assertEquals(true, loadBalancedConnection.isLoadBalancedConnection());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setConnectionType(net.sf.rcer.conn.connections.ConnectionType)}.
	 */
	@Test
	public void testSetConnectionType() {
		directConnection.setConnectionType(ConnectionType.LOAD_BALANCED);
		assertEquals("Connection Type", ConnectionType.LOAD_BALANCED, directConnection.getConnectionType());
		assertEquals("Application Server", null, directConnection.getApplicationServer());
		assertEquals("System Number", -1, directConnection.getSystemNumber());
		loadBalancedConnection.setConnectionType(ConnectionType.DIRECT);
		assertEquals("Connection Type", ConnectionType.DIRECT, loadBalancedConnection.getConnectionType());
		assertEquals("Message Server", null, loadBalancedConnection.getMessageServer());
		assertEquals("Message Server Port", -1, loadBalancedConnection.getMessageServerPort());
		assertEquals("Load Balancing Group", null, loadBalancedConnection.getLoadBalancingGroup());
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setApplicationServer(java.lang.String)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetApplicationServerInvalidMode() {
		loadBalancedConnection.setApplicationServer(APP_SERVER);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setSystemNumber(int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetSystemNumberInvalidMode() {
		loadBalancedConnection.setSystemNumber(SYSTEM_NUMBER);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setMessageServer(java.lang.String)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetMessageServerInvalidMode() {
		directConnection.setMessageServer(MSG_SERVER);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setMessageServerPort(int)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetMessageServerPortInvalidMode() {
		directConnection.setMessageServerPort(MSG_SERVER_PORT);
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionData#setLoadBalancingGroup(java.lang.String)}.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSetLoadBalancingGroupInvalidMode() {
		directConnection.setLoadBalancingGroup(LB_GROUP);
	}

}
