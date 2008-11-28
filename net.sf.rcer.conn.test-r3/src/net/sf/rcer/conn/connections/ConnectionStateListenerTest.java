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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.providers.ConnectionProvider;

import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * An implementation to test the connection state listener management.
 * @author vwegert
 *
 */
public class ConnectionStateListenerTest extends ConnectionManagerTest implements IConnectionStateListener {

	private static final String CONNECTION_ID = ConnectionProvider.PROVIDER_ID + "#1";

	private IConnection lastActivatedConnection;
	private IConnection lastDeactivatedConnection;
	private IConnection lastPrimaryConnectionSet;

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.ConnectionManagerTest#setUp()
	 */
	@Override
	public void setUp() throws Exception {
		super.setUp();
		reset();
	}
	
	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionManager#addConnectionStateListener(net.sf.rcer.conn.connections.IConnectionStateListener)}.
	 * and {@link net.sf.rcer.conn.connections.ConnectionManager#removeConnectionStateListener(net.sf.rcer.conn.connections.IConnectionStateListener)}.
	 * @throws Exception 
	 */
	@Test
	public void testConnectionStateListener() throws Exception {
		
		// register as a listener
		manager.addConnectionStateListener(this);
		
		// open a connection
		JCoDestination dest = manager.getDestination(CONNECTION_ID);
		
		// we should have picked that up as an activation notification
		assertNotNull("Listener was not notified of connection activation.", lastActivatedConnection);
		assertEquals("Listener was not notified of the correct connection activation.", 
				CONNECTION_ID, lastActivatedConnection.getConnectionDataID());
		assertTrue("Listener was not notified of the correct destination activation.", 
				dest.getDestinationID().startsWith(lastActivatedConnection.getConnectionID()));
		
		// we should have picked that up as a change in the primary connection ID
		assertNotNull("Listener was not notified of primary connection change.", lastPrimaryConnectionSet);
		assertEquals("Listener was not notified of the correct primary connection change.", 
				CONNECTION_ID, lastPrimaryConnectionSet.getConnectionDataID());
		assertTrue("Listener was not notified of the correct primary destination change.", 
				dest.getDestinationID().startsWith(lastPrimaryConnectionSet.getConnectionID()));
		
		// close the connection
		manager.closeConnection(dest);
		
		// we should have picked that up as an deactivation notification
		assertNotNull("Listener was not notified of connection deactivation.", lastDeactivatedConnection);
		assertEquals("Listener was not notified of the correct connection deactivation.", 
				CONNECTION_ID, lastDeactivatedConnection.getConnectionDataID());
		assertTrue("Listener was not notified of the correct destination deactivation.", 
				dest.getDestinationID().startsWith(lastDeactivatedConnection.getConnectionID()));
		
		// we should have picked that up as a change in the primary connection ID
		assertNull("Listener was not notified of primary connection change.", lastPrimaryConnectionSet);
		
		// now remove the listener registration
		manager.removeConnectionStateListener(this);
		reset();
		
		// open a connection
		dest = manager.getDestination(CONNECTION_ID);
		
		// we should NOT have picked that up as an activation notification or  a change in the primary connection ID
		assertNull("Deregistered listener was notified of connection activation.", lastActivatedConnection);
		assertNull("Deregistered listener was notified of primary connection change.", lastPrimaryConnectionSet);
		
		// close the connection
		manager.closeConnection(dest);
		
		// we should NOT have picked that up as an deactivation notification or a change in the primary connection ID
		assertNull("Deregistered listener was not notified of connection deactivation.", lastDeactivatedConnection);
		assertNull("Deregistered listener was not notified of primary connection change.", lastPrimaryConnectionSet);
		
	}

	/**
	 * Resets the listener to its initial state. 
	 */
	private void reset() {
		lastActivatedConnection = null;
		lastDeactivatedConnection = null;
		lastPrimaryConnectionSet = null;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#connectionActivated(net.sf.rcer.conn.connections.IConnection)
	 */
	public void connectionActivated(IConnection connection) {
		lastActivatedConnection = connection;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#connectionDeactivated(net.sf.rcer.conn.connections.IConnection)
	 */
	public void connectionDeactivated(IConnection connection) {
		lastDeactivatedConnection = connection;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.connections.IConnectionStateListener#primaryConnectionChanged(net.sf.rcer.conn.connections.IConnection)
	 */
	public void primaryConnectionChanged(IConnection newPrimaryConnection) {
		lastPrimaryConnectionSet = newPrimaryConnection;
	}

}
