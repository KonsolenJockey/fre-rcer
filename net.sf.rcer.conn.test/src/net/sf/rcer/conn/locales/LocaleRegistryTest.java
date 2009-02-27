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
package net.sf.rcer.conn.locales;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vwegert
 *
 */
public class LocaleRegistryTest {

	private static final String ID_EN   = "E";
	private static final String ISO_EN  = "EN";
	private static final String DESC_EN = "English";
	private static final String ID_DE   = "D";
	private static final String ISO_DE  = "DE";
	private static final String DESC_DE = "German";
	
	private LocaleRegistry registry;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		registry = LocaleRegistry.getInstance();
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
	 * Test method for {@link net.sf.rcer.conn.locales.LocaleRegistry#getLocales()}.
	 */
	@Test
	public void testGetLocales() {
		final Collection<Locale> locales = registry.getLocales();
		assertNotNull(locales);
		
		// the list should not be empty because the package itself contains the basic locales
		if (locales.isEmpty()) {
			fail("getLocales() returned an empty list");
		}
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.locales.LocaleRegistry#getLocaleByISO(java.lang.String)}.
	 * @throws LocaleNotFoundException 
	 */
	@Test
	public void testGetLocaleByISO() throws LocaleNotFoundException {
		// check for the standard locale E / EN
		Locale en = registry.getLocaleByISO(ISO_EN);
		assertNotNull(en);
		assertEquals("internal code of standard locale English", ID_EN, en.getID());
		assertEquals("ISO code of standard locale English", ISO_EN, en.getISOCode());
		assertEquals("description of standard locale English", DESC_EN, en.getDescription());

		// check for the standard locale D / DE
		Locale de = registry.getLocaleByISO(ISO_DE);
		assertNotNull(de);
		assertEquals("internal code of standard locale German", ID_DE, de.getID());
		assertEquals("ISO code of standard locale German", ISO_DE, de.getISOCode());
		assertEquals("description of standard locale German", DESC_DE, de.getDescription());
	}
	
	/**
	 * Test method for exception handling of 
	 * {@link net.sf.rcer.conn.locales.LocaleRegistry#getLocaleByISO(java.lang.String)}.
	 * @throws Exception
	 */
	@Test(expected=LocaleNotFoundException.class)
	public void testGetUnknownLocaleByISO() throws Exception {
		@SuppressWarnings("unused")
		Locale foo = registry.getLocaleByISO("ZZ_UNKNOWN_ZZ");
	}

	/**
	 * Test method for {@link net.sf.rcer.conn.locales.LocaleRegistry#getLocaleByID(java.lang.String)}.
	 * @throws LocaleNotFoundException 
	 */
	@Test
	public void testGetLocaleByID() throws LocaleNotFoundException {
		// check for the standard locale E / EN
		Locale en = registry.getLocaleByID(ID_EN);
		assertNotNull(en);
		assertEquals("internal code of standard locale English", ID_EN, en.getID());
		assertEquals("ISO code of standard locale English", ISO_EN, en.getISOCode());
		assertEquals("description of standard locale English", DESC_EN, en.getDescription());

		// check for the standard locale D / DE
		Locale de = registry.getLocaleByID(ID_DE);
		assertNotNull(de);
		assertEquals("internal code of standard locale German", ID_DE, de.getID());
		assertEquals("ISO code of standard locale German", ISO_DE, de.getISOCode());
		assertEquals("description of standard locale German", DESC_DE, de.getDescription());
	}
	
	/**
	 * Test method for exception handling of 
	 * {@link net.sf.rcer.conn.locales.LocaleRegistry#getLocaleByID(java.lang.String)}.
	 * @throws Exception
	 */
	@Test(expected=LocaleNotFoundException.class)
	public void testGetUnknownLocaleByID() throws Exception {
		@SuppressWarnings("unused")
		Locale foo = registry.getLocaleByID("ZZ_UNKNOWN_ZZ");
	}

}
