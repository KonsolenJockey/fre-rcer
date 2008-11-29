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
 * Abstract super-class to test the {@link ConnectionManager}. Defines minimal common behaviour.
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

}
