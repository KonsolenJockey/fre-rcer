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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import net.sf.rcer.conn.locales.LocaleRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vwegert
 *
 */
public class ConnectionRegistryTest {

	private ConnectionRegistry registry;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		registry = ConnectionRegistry.getInstance();
		assertNotNull(registry);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		registry = null;
	}

	/**
	 * Tests whether the valid providers are accessible.
	 * @throws Exception 
	 */
	@Test
	public void testValidProviders() throws Exception {
		final Set<String> providers = registry.getProviderIDs();
		assertTrue("Valid data provider 1 was not loaded", 
				providers.contains("net.sf.rcer.conn.valid_provider_1"));
		assertTrue("Valid data provider 2 was not loaded", 
				providers.contains("net.sf.rcer.conn.valid_provider_2"));
	}
	
	/**
	 * Tests whether the connection IDs of the connection providers are returned correctly.
	 * @throws Exception
	 */
	@Test
	public void testValidProviderIDs() throws Exception {
		final Set<String> connectionIDs = registry.getConnectionIDs("net.sf.rcer.conn.valid_provider_1");
		assertTrue("Dynamic direct connection ID is missing", 
				connectionIDs.contains("net.sf.rcer.conn.valid_provider_1#CONN_DIRECT"));
		assertTrue("Dynamic load-balancinb connection ID is missing", 
				connectionIDs.contains("net.sf.rcer.conn.valid_provider_1#CONN_LOAD_BALANCED"));
	}
	
	
	/**
	 * Tests whether the invalid providers are accessible.
	 * @throws Exception 
	 */
	@Test
	public void testInvalidProviders() throws Exception {
		final Set<String> providers = registry.getProviderIDs();
		assertFalse("Invalid data provider was loaded", 
				providers.contains("net.sf.rcer.conn.invalid_provider_class_missing"));
	}

	/**
	 * Tests whether access to an invalid provider raises an exception.
	 * @throws Exception
	 */
	@Test(expected=ProviderNotFoundException.class)
	public void testInvalidProviderConnectionID() throws Exception {
		registry.getConnectionIDs("net.sf.rcer.conn.invalid_provider_class_missing");
	}
	
	/**
	 * Tests whether an attempt to access a connection of an invalid provider raises an exception.
	 * @throws Exception
	 */
	@Test(expected=ProviderNotFoundException.class)
	public void testInvalidProviderConnection() throws Exception {
		registry.getConnectionData("net.sf.rcer.conn.invalid_provider_class_missing#FOO");
	}
	
	/**
	 * Tests whether an attempt to access a connection with a null ID raises an exception.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidNullConnectionID() throws Exception {
		registry.getConnectionData(null);
	}
	
	/**
	 * Tests whether an attempt to access a connection with an empty ID raises an exception.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidEmptyConnectionID() throws Exception {
		registry.getConnectionData("");
	}
	
	/**
	 * Tests whether an attempt to access a connection with an invalid ID raises an exception.
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testInvalidFormattedConnectionID() throws Exception {
		registry.getConnectionData("foo.bar#baz.boo#oof");
	}
	
	/**
	 * Tests whether the retrieval of connection IDs with an empty or null provider ID works.
	 * @throws Exception
	 */
	@Test
	public void testEmptyProviderIDConnectionList() throws Exception {
		final Set<String> list1 = registry.getConnectionIDs();
		final Set<String> list2 = registry.getConnectionIDs(null);
		final Set<String> list3 = registry.getConnectionIDs("");
		assertEquals("Connection ID list obtained with null provider", list1, list2);
		assertEquals("Connection ID list obtained with empty provider", list1, list3);
	}
	
	/**
	 * Tests the direct static connection.
	 * @throws Exception
	 */
	@Test
	public void testStaticDirectConnection() throws Exception {
		
		final String CONNECTION_ID = "net.sf.rcer.conn.direct_connection_1";
		
		final Set<String> connectionIDs = registry.getConnectionIDs();
		assertTrue("Direct static connection ID is missing", 
				connectionIDs.contains(CONNECTION_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Direct static connection is missing", conn);
		assertEquals("Connection ID of static direct connection", 
				CONNECTION_ID, conn.getConnectionID());
		assertEquals("Description of static direct connection", 
				"Direct Connection 1", conn.getDescription());
		assertEquals("System ID of static direct connection", 
				"D01", conn.getSystemID());
		assertTrue("Connection type of static direct connection", 
				conn.isDirectConnection());
		assertEquals("Router of static direct connection", 
				"router1", conn.getRouter());
		assertEquals("Application server of static direct connection", 
				"appserv1", conn.getApplicationServer());
		assertEquals("System number of static direct connection", 
				1, conn.getSystemNumber());
		assertEquals("Default user of static direct connection", 
				"foo", conn.getDefaultUser());
		assertTrue("Default user changeability of static direct connection", 
				conn.isDefaultUserEditable());
		assertEquals("Default client of static direct connection", 
				"123", conn.getDefaultClient());
		assertTrue("Default client changeability of static direct connection", 
				conn.isDefaultClientEditable());
		assertEquals("Default locale of static direct connection", 
				LocaleRegistry.getInstance().getLocaleByISO("DE"), conn.getDefaultLocale());
		assertTrue("Default locale changeability of static direct connection", 
				conn.isDefaultLocaleEditable());
		
	}
	
	/**
	 * Tests whether a direct connection with an invalid system number is handled correctly (that is, ignored).
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testStaticInvalidDirectConnectionSystemNumber() throws Exception {
		registry.getConnectionData("net.sf.rcer.conn.invalid_direct_connection_1");
	}
	
	/**
	 * Tests whether a direct connection with an invalid default locale is handled (that is, whether the locale is 
	 * ignored).
	 * @throws Exception
	 */
	@Test
	public void testStaticInvalidDirectConnectionLocale() throws Exception {
		final IConnectionData conn = registry.getConnectionData("net.sf.rcer.conn.invalid_direct_connection_2");
		assertNull("Default locale of connection with invalid default locale", conn.getDefaultLocale());
	}
	
	/**
	 * Tests the load-balancing static connection.
	 * @throws Exception
	 */
	@Test
	public void testStaticLoadBalancingConnection() throws Exception {
		
		final String CONNECTION_ID = "net.sf.rcer.conn.balanced_connection_1";
		
		final Set<String> connectionIDs = registry.getConnectionIDs();
		assertTrue("Load-balanced static connection ID is missing", 
				connectionIDs.contains(CONNECTION_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Load-balanced static connection is missing", conn);
		assertEquals("Connection ID of static load-balanced connection", 
				CONNECTION_ID, conn.getConnectionID());
		assertEquals("Description of static load-balanced connection", 
				"Load-Balancing Connection 1", conn.getDescription());
		assertEquals("System ID of static load-balanced connection", 
				"L01", conn.getSystemID());
		assertFalse("Connection type of static load-balanced connection", 
				conn.isDirectConnection());
		assertEquals("Router of static load-balanced connection", 
				"router1", conn.getRouter());
		assertEquals("Message server of static load-balanced connection", 
				"messageserv1", conn.getMessageServer());
		assertEquals("Message server port of static load-balanced connection", 
				3456, conn.getMessageServerPort());
		assertEquals("Load-balancing group of static load-balanced connection", 
				"PUBLIC", conn.getLoadBalancingGroup());
		assertEquals("Default user of static load-balanced connection", 
				"foo", conn.getDefaultUser());
		assertTrue("Default user changeability of static load-balanced connection", 
				conn.isDefaultUserEditable());
		assertEquals("Default client of static load-balanced connection", 
				"123", conn.getDefaultClient());
		assertTrue("Default client changeability of static load-balanced connection", 
				conn.isDefaultClientEditable());
		assertEquals("Default locale of static load-balanced connection", 
				LocaleRegistry.getInstance().getLocaleByISO("EN"), conn.getDefaultLocale());
		assertTrue("Default locale changeability of static load-balanced connection", 
				conn.isDefaultLocaleEditable());
		
	}
	
	/**
	 * Tests whether an incorrect load-balancing connection is handled (that is, ignored).
	 * @throws Exception
	 */
	@Test(expected=ConnectionNotFoundException.class)
	public void testStaticInvalidLoadBalancingConnection() throws Exception {
		registry.getConnectionData("net.sf.rcer.conn.invalid_balanced_connection_1");
	}
	
	/**
	 * Tests the direct dynamic connection.
	 * @throws Exception
	 */
	@Test
	public void testDynamicDirectConnection() throws Exception {
		
		final String CONNECTION_ID = "net.sf.rcer.conn.valid_provider_1#CONN_DIRECT";
		
		final Set<String> connectionIDs = registry.getConnectionIDs();
		assertTrue("Direct dynamic connection ID is missing", 
				connectionIDs.contains(CONNECTION_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Direct dynamic connection is missing", conn);
		assertEquals("Connection ID of dynamic direct connection", 
				CONNECTION_ID, conn.getConnectionID());
		assertEquals("Description of dynamic direct connection", 
				"Direct Connection", conn.getDescription());
		assertEquals("System ID of dynamic direct connection", 
				"S01", conn.getSystemID());
		assertTrue("Connection type of dynamic direct connection", 
				conn.isDirectConnection());
		assertEquals("Router of dynamic direct connection", 
				"router1", conn.getRouter());
		assertEquals("Application server of dynamic direct connection", 
				"appserv1", conn.getApplicationServer());
		assertEquals("System number of dynamic direct connection", 
				1, conn.getSystemNumber());
		assertNull("Default user of dynamic direct connection", 
				conn.getDefaultUser());
		assertTrue("Default user changeability of dynamic direct connection", 
				conn.isDefaultUserEditable());
		assertNull("Default client of dynamic direct connection", 
				conn.getDefaultClient());
		assertTrue("Default client changeability of dynamic direct connection", 
				conn.isDefaultClientEditable());
		assertEquals("Default locale of dynamic direct connection", 
				null, conn.getDefaultLocale());
		assertTrue("Default locale changeability of dynamic direct connection", 
				conn.isDefaultLocaleEditable());
		
	}
	
	/**
	 * Tests the load-balancing dynamic connection.
	 * @throws Exception
	 */
	@Test
	public void testDynamicLoadBalancingConnection() throws Exception {
		
		final String CONNECTION_ID = "net.sf.rcer.conn.valid_provider_1#CONN_LOAD_BALANCED";
		
		final Set<String> connectionIDs = registry.getConnectionIDs();
		assertTrue("Load-balanced dynamic connection ID is missing", 
				connectionIDs.contains(CONNECTION_ID));
		
		IConnectionData conn = registry.getConnectionData(CONNECTION_ID);
		assertNotNull("Load-balanced dynamic connection is missing", conn);
		assertEquals("Connection ID of dynamic load-balanced connection", 
				CONNECTION_ID, conn.getConnectionID());
		assertEquals("Description of dynamic load-balanced connection", 
				"Load-Balancing Connection", conn.getDescription());
		assertEquals("System ID of dynamic load-balanced connection", 
				"S02", conn.getSystemID());
		assertFalse("Connection type of dynamic load-balanced connection", 
				conn.isDirectConnection());
		assertEquals("Router of dynamic load-balanced connection", 
				"router2", conn.getRouter());
		assertEquals("Message server of dynamic load-balanced connection", 
				"messageserv2", conn.getMessageServer());
		assertEquals("Message server port of dynamic load-balanced connection", 
				3456, conn.getMessageServerPort());
		assertEquals("Load-balancing group of dynamic load-balanced connection", 
				"PUBLIC", conn.getLoadBalancingGroup());
		assertNull("Default user of dynamic load-balanced connection", 
				conn.getDefaultUser());
		assertTrue("Default user changeability of dynamic load-balanced connection", 
				conn.isDefaultUserEditable());
		assertNull("Default client of dynamic load-balanced connection", 
				conn.getDefaultClient());
		assertTrue("Default client changeability of dynamic load-balanced connection", 
				conn.isDefaultClientEditable());
		assertNull("Default locale of dynamic load-balanced connection", 
				conn.getDefaultLocale());
		assertTrue("Default locale changeability of dynamic load-balanced connection", 
				conn.isDefaultLocaleEditable());
		
	}
	

	
	

}
