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
package net.sf.rcer.conn.locales;

import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the {@link Locale} class.
 * @author vwegert
 *
 */
public class LocaleTest {

	private static final String TEST_ID   = "my_id";
	private static final String TEST_ISO  = "ISO";
	private static final String TEST_DESC = "A dummy locale description";
	
	private Locale locale;
	
	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		locale = new Locale(TEST_ID, TEST_ISO, TEST_DESC);
	}
	
	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		locale = null;
	}
	
	/**
	 * A unit test for the ID property.
	 */
	@Test
	public void testID() {
		assertEquals("initial locale ID", TEST_ID, locale.getID());
		locale.setID("");
		assertEquals("empty locale ID", "", locale.getID());
		locale.setID(TEST_ID);
		assertEquals("restored locale ID", TEST_ID, locale.getID());
	}
	
	/**
	 * A unit test for the ISO code property.
	 */
	@Test
	public void testISO() {
		assertEquals("initial ISO code", TEST_ISO, locale.getISOCode());
		locale.setISOCode("");
		assertEquals("empty ISO code", "", locale.getISOCode());
		locale.setISOCode(TEST_ISO);
		assertEquals("restored ISO code", TEST_ISO, locale.getISOCode());
	}
	
	/**
	 * A unit test for the description property.
	 */
	@Test
	public void testDescription() {
		assertEquals("initial locale description", TEST_DESC, locale.getDescription());
		locale.setDescription("");
		assertEquals("empty locale description", "", locale.getDescription());
		locale.setDescription(TEST_DESC);
		assertEquals("restored locale description", TEST_DESC, locale.getDescription());
	}
	
	/**
	 * Test for the toString() reimplementation.
	 */
	@Test
	public void testToString() {
		final String actual = locale.toString();
		final String expected = MessageFormat.format("{0} ({1})", TEST_ISO, TEST_DESC); 
		assertEquals("result of toString()", expected, actual);
	}
	
}
