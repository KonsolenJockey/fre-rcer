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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

/**
 * Tests for {@link SimpleIniFileParserTest}.
 * @author vwegert
 *
 */
public class SimpleIniFileParserTest {

	/**
	 * Tests performed using a valid example file. 
	 * @throws IniFileFormatException
	 * @throws IOException
	 */
	@Test
	public void testExampleFile1() throws IniFileFormatException, IOException {
		SimpleIniFileParser parser = new SimpleIniFileParser(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/example1.ini"));
		
		assertTrue("Check for existing section", parser.sectionExists("Router"));
		assertFalse("Check for nonexistent section", parser.sectionExists("FooBar"));
		
		assertTrue("Check for existing section in set", parser.getSections().contains("Router"));
		assertFalse("Check for nonexistent section in set", parser.getSections().contains("FooBar")); 
		
		assertTrue("Check for existing key", parser.keyExists("MSWinPos", "NormX"));
		assertFalse("Check for nonexistent key in existing section", parser.keyExists("MSWinPos", "Baz"));
		assertFalse("Check for nonexistent key in nonexistent section", parser.keyExists("Foo", "Bar"));
		
		assertTrue("Check for existing key in key set", parser.getKeys("MSWinPos").contains("NormX"));
		assertFalse("Check for nonexistent key inkey set of existing section", parser.getKeys("MSWinPos").contains("Baz"));
		assertNull("Check for key set of nonexistent section", parser.getKeys("Foo"));
		
		assertEquals("Retrieval of existing key from existing section", parser.getValue("Description", "Item1"), "Test System 1");
		assertNull("Retrieval of nonexistent key from existing section", parser.getValue("MSWinPos", "Baz"));
		assertNull("Retrieval of nonexistent key from nonexistent section", parser.getValue("Foo", "Bar"));
	}
	
	/**
	 * Test for error handling using an invalid example file. 
	 * @throws IOException 
	 * @throws IniFileFormatException 
	 */
	@Test(expected=IniFileFormatException.class)
	public void testInvalidFile1() throws IniFileFormatException, IOException {
		new SimpleIniFileParser(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/invalid1.ini"));
	}
	
	/**
	 * Test for error handling using an invalid example file. 
	 * @throws IOException 
	 * @throws IniFileFormatException 
	 */
	@Test(expected=IniFileFormatException.class)
	public void testInvalidFile2() throws IniFileFormatException, IOException {
		new SimpleIniFileParser(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/invalid2.ini"));
	}
	
	/**
	 * Test for error handling using an invalid example file. 
	 * @throws IOException 
	 * @throws IniFileFormatException 
	 */
	@Test(expected=IniFileFormatException.class)
	public void testInvalidFile3() throws IniFileFormatException, IOException {
		new SimpleIniFileParser(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/invalid3.ini"));
	}
	
	/**
	 * Tests whether the parser really works in a case-insensitive way concerning section and value keys. 
	 * @throws IniFileFormatException
	 * @throws IOException
	 */
	@Test
	public void testCaseSensitivity() throws IniFileFormatException, IOException {
		SimpleIniFileParser parser = new SimpleIniFileParser(getClass().getClassLoader().getResourceAsStream("/net/sf/rcer/conn/tools/example1.ini"));
		assertTrue("Check for existing section", parser.sectionExists("ROUTER"));
		assertTrue("Check for existing key", parser.keyExists("mswinpos", "nORMx"));
		assertEquals("Retrieval of existing key from existing section", parser.getValue("dESCRiption", "iTEM1"), "Test System 1");
		
		// the section set and key set should preserve the case!
		assertTrue("Check for existing section in set", parser.getSections().contains("Router"));
		assertTrue("Check for existing key in key set", parser.getKeys("MSWinPos").contains("NormX"));

	}
	
}
