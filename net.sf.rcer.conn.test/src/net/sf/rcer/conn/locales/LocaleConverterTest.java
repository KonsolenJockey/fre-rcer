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
package net.sf.rcer.conn.locales;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import net.sf.rcer.conn.ui.converters.LocaleFromStringConverter;
import net.sf.rcer.conn.ui.converters.LocaleToStringConverter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A set of tests for the locale converters.
 * @author vwegert
 *
 */
public class LocaleConverterTest {

	private Locale locale;
	
	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		locale = LocaleRegistry.getInstance().getLocaleByISO("DE");
	}
	
	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		locale = null;
	}
	
	/**
	 * Test method for the {@link LocaleToStringConverter}.
	 */
	@Test
	public void testFromStringConverter() {
		final LocaleFromStringConverter converter = new LocaleFromStringConverter();
		final String iso = locale.getISOCode();
		final String string = locale.toString();
		assertNull("Conversion of null value", converter.convert(null));
		assertNull("Conversion of empty string", converter.convert(""));
		assertEquals("Conversion of text without description", locale, converter.convert(iso));
		assertEquals("Conversion of text with description", locale, converter.convert(string));
	}

	/**
	 * Test method for the {@link LocaleFromStringConverter}.
	 */
	@Test
	public void testToStringConverterWithDescription() {
		final LocaleToStringConverter converter = new LocaleToStringConverter(true);
		final String result = (String) converter.convert(locale);
		assertEquals("Conversion of null value", "", converter.convert(null));
		assertTrue("Converted string does not contain the ISO code", result.contains(locale.getISOCode()));
		assertTrue("Converted string does not contain the description", result.contains(locale.getDescription()));
	}

	/**
	 * Test method for the {@link LocaleFromStringConverter}.
	 */
	@Test
	public void testToStringConverterWithoutDescription() {
		final LocaleToStringConverter converter = new LocaleToStringConverter(false);
		final String result = (String) converter.convert(locale);
		assertEquals("Conversion of null value", "", converter.convert(null));
		assertTrue("Converted string does not contain the ISO code", result.contains(locale.getISOCode()));
		assertFalse("Converted string contains the description", result.contains(locale.getDescription()));
	}

}
