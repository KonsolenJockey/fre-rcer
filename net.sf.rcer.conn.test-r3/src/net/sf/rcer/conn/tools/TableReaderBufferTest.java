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

import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.test.provider.ConnectionProvider;
import net.sf.rcer.test.provider.CredentialsProvider;

import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * Tests for {@link TableReaderBuffer}.
 * @author vwegert
 */
public class TableReaderBufferTest {

	/**
	 * @throws Exception
	 */
	@Test
	public void testSameBufferAndReader() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.reset();
		JCoDestination destination = ConnectionManager.getInstance().getDestination();
		TableReaderBuffer buffer1 = TableReaderBuffer.getInstance(destination);
		TableReaderBuffer buffer2 = TableReaderBuffer.getInstance(destination);
		assertTrue(buffer1 == buffer2);
		TableReader reader1 = buffer1.getTableReader("T000");
		TableReader reader2 = buffer2.getTableReader("T000");
		assertTrue(reader1 == reader2);
		ConnectionManager.getInstance().closeConnections();
	}
	
}
