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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.connections.ConnectionType.FromStringConverter;
import net.sf.rcer.conn.connections.ConnectionType.ToStringConverter;

import org.junit.Test;

/**
 * Test for the {@link ConnectionType} class.
 * @author vwegert
 *
 */
public class ConnectionTypeTest {

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionType#getValues()}.
	 */
	@Test
	public void testGetValues() {
		final ConnectionType[] values = ConnectionType.getValues();
		assertEquals("Size of connection type array", 2, values.length);
		assertTrue("DIRECT in connection type array", 
				(values[0] == ConnectionType.DIRECT) || 
				(values[1] == ConnectionType.DIRECT));
		assertTrue("LOAD_BALANCED in connection type array", 
				(values[0] == ConnectionType.LOAD_BALANCED) || 
				(values[1] == ConnectionType.LOAD_BALANCED));
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.connections.ConnectionType#getStrings()}.
	 */
	@Test
	public void testGetStrings() {
		final String[] strings = ConnectionType.getStrings();
		assertEquals("Size of connection type string array", 2, strings.length);
		assertTrue("DIRECT in connection type string array", 
				(strings[0] == ConnectionType.DIRECT.toString()) || 
				(strings[1] == ConnectionType.DIRECT.toString()));
		assertTrue("LOAD_BALANCED in connection type array", 
				(strings[0] == ConnectionType.LOAD_BALANCED.toString()) || 
				(strings[1] == ConnectionType.LOAD_BALANCED.toString()));
	}
	
	/**
	 * Test method for the {@link ToStringConverter}.
	 */
	@Test
	public void testFromStringConverter() {
		final FromStringConverter converter = new ConnectionType.FromStringConverter();
		assertNull("Conversion of null value", converter.convert(null));
		assertNull("Conversion of empty string", converter.convert(""));
		assertEquals("Conversion of DIRECT from string", 
				ConnectionType.DIRECT, converter.convert(ConnectionType.DIRECT.toString()));
		assertEquals("Conversion of LOAD_BALANCED from string", 
				ConnectionType.LOAD_BALANCED, converter.convert(ConnectionType.LOAD_BALANCED.toString()));
	}

	/**
	 * Test method for the {@link FromStringConverter}.
	 */
	@Test
	public void testToStringConverter() {
		final ToStringConverter converter = new ConnectionType.ToStringConverter();
		assertEquals("Conversion of null value", "", converter.convert(null));
		assertEquals("Conversion of DIRECT to string", 
				ConnectionType.DIRECT.toString(), converter.convert(ConnectionType.DIRECT));
		assertEquals("Conversion of LOAD_BALANCED to string", 
				ConnectionType.LOAD_BALANCED.toString(), converter.convert(ConnectionType.LOAD_BALANCED));
	}

}
