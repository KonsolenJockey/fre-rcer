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
package net.sf.rcer.rom;

import static org.junit.Assert.assertNotNull;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.test.provider.ConnectionProvider;

import org.junit.After;
import org.junit.Before;

/**
 * Base class for ROM tests. Provides the {@link RepositoryObjectCollection} fixture.
 * @author vwegert
 *
 */
public abstract class ROMTest {

	/**
	 * The {@link RepositoryObjectCollection} instance to use for testing.
	 */
	protected RepositoryObjectCollection collection;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		collection = ROMFactory.eINSTANCE.createRepositoryObjectCollection();
		assertNotNull(collection);
		collection.setSourceConnection(ConnectionManager.getInstance().getDestination());
		assertNotNull(collection.getSourceConnection());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		collection = null;
	}

}
