/**
 * Copyright (c) 2010 The RCER Development Team.
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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

import net.sf.rcer.conn.connections.ConnectionType;
import net.sf.rcer.conn.connections.IConnectionData;

import org.junit.Test;

/**
 * Tests for {@link LogonIniReaderTest}.
 * @author vwegert
 *
 */
public class LogonIniReaderTest {

	/**
	 * Tests performed using a valid example file. 
	 * @throws IniFileFormatException
	 * @throws IOException
	 */
	@Test
	public void testExampleFile1() {
		LogonIniReader reader = new LogonIniReader(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/example1.ini"));
		
		assertTrue("Status of reader", reader.getStatus().isOK());
		
		List<IConnectionData> connections = reader.getConnections();
		
		assertEquals("Number of connections read", 3, connections.size());
		
		for (IConnectionData conn: connections) {
			final String id = conn.getConnectionDataID();
			if (id.equals("Item1")) {
				assertEquals("connection type of entry " + id, ConnectionType.LOAD_BALANCED, conn.getConnectionType());
				assertEquals("description of entry " + id, "Test System 1", conn.getDescription());
				assertEquals("system ID of entry " + id, "TS1", conn.getSystemID());
				assertEquals("system number of entry " + id, 0, conn.getSystemNumber());
				assertEquals("message server name of entry " + id, "msgserver.domain.tld", conn.getMessageServer());
				assertEquals("message server port of entry " + id, 3600, conn.getMessageServerPort());
				assertEquals("load balancing group of entry " + id, "PUBLIC", conn.getLoadBalancingGroup());
				assertEquals("router string of entry " + id, "", conn.getRouter());
				
			} else if (id.equals("Item2")) {
				assertEquals("connection type of entry " + id, ConnectionType.DIRECT, conn.getConnectionType());
				assertEquals("description of entry " + id, "Test System 2", conn.getDescription());
				assertEquals("system ID of entry " + id, "TS2", conn.getSystemID());
				assertEquals("system number of entry " + id, 1, conn.getSystemNumber());
				assertEquals("application server of entry " + id, "appserver.domain.tld", conn.getApplicationServer());
				assertEquals("router string of entry " + id, "/H/saprouter1.domain.tld/H/", conn.getRouter());

			} else if (id.equals("Item3")) {
				assertEquals("connection type of entry " + id, ConnectionType.DIRECT, conn.getConnectionType());
				assertEquals("description of entry " + id, "Test System 3", conn.getDescription());
				assertEquals("system ID of entry " + id, "TS3", conn.getSystemID());
				assertEquals("system number of entry " + id, 2, conn.getSystemNumber());
				assertEquals("application server of entry " + id, "appserver.domain.tld", conn.getApplicationServer());
				assertEquals("router string of entry " + id, "/H/saprouter1.domain.tld/H/saprouter2.otherdomain.tld/H/", conn.getRouter());

			} else {
				fail(MessageFormat.format("Unknown connection ID ''{0}'' found.", id));
			}
		}
	}
	
}
