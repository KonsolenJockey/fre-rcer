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
package net.sf.rcer.conn.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.test.provider.ConnectionProvider;
import net.sf.rcer.test.provider.CredentialsProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * A test class for the {@link TableReader}.
 * @author vwegert
 *
 */
public class TableReaderTest {

	// TODO add more tests
	// TODO add a test for the last error (fields truncated by 1 character)
	
	/**
	 * The destination to use for testing.
	 */
	private JCoDestination destination;

	/**
	 * The set-up method. 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.reset();
		destination = ConnectionManager.getInstance().getDestination();
	}

	/**
	 * The tear-down method. 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ConnectionManager.getInstance().closeConnections();
	}
	
	/**
	 * Tries to read the table of clients. 
	 * @throws Exception
	 */
	@Test
	public void testGetClientTable() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
	}
	
}
