/*******************************************************************************
 * Copyright (c) 2010 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Volker Wegert <rcer@volker-wegert.de> - initial API and implementation
 *******************************************************************************/
package net.sf.rcer.rom.ddic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.RepositoryObjectKey;

import org.junit.Test;

/**
 * Test for {@link Domain} and its implementation.
 * @author vwegert
 *
 */
public class DomainTest extends ROMTest {

	/**
	 * @return the repository object key for the domain
	 */
	private RepositoryObjectKey createKey(String domainName) {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("DOMA");
		key.setName(domainName);
		return key;
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR10Direct() throws Exception {
		checkCHAR10(collection.getDomain("CHAR10", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR10Generic() throws Exception {
		checkCHAR10((Domain) collection.loadObject(createKey("CHAR10")));
	}

	/**
	 * @param dom
	 */
	private void checkCHAR10(Domain dom) {
		assertEquals("domain name", "CHAR10", dom.getName());
		assertEquals("data type", DictionaryDataType.CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 10, dom.getLength());
		assertEquals("output length", 10, dom.getOutputLength());
		assertFalse("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should not have values", 0, dom.getValues().size());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testTEXT10Direct() throws Exception {
		checkTEXT10(collection.getDomain("TEXT10", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testTEXT10Generic() throws Exception {
		checkTEXT10((Domain) collection.loadObject(createKey("TEXT10")));
	}

	/**
	 * @param dom
	 */
	private void checkTEXT10(Domain dom) {
		assertEquals("domain name", "TEXT10", dom.getName());
		assertEquals("data type", DictionaryDataType.CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 10, dom.getLength());
		assertEquals("output length", 10, dom.getOutputLength());
		assertTrue("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should not have values", 0, dom.getValues().size());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testNUMC5Direct() throws Exception {
		checkNUMC5(collection.getDomain("NUMC5", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testNUMC5Generic() throws Exception {
		checkNUMC5((Domain) collection.loadObject(createKey("NUMC5")));
	}

	/**
	 * @param dom
	 */
	private void checkNUMC5(Domain dom) {
		assertEquals("domain name", "NUMC5", dom.getName());
		assertEquals("data type", DictionaryDataType.NUMERICAL_CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 5, dom.getLength());
		assertEquals("output length", 5, dom.getOutputLength());
		assertFalse("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should not have values", 0, dom.getValues().size());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR1_XDirect() throws Exception {
		checkCHAR1_X(collection.getDomain("CHAR1_X", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR1_XGeneric() throws Exception {
		checkCHAR1_X((Domain) collection.loadObject(createKey("CHAR1_X")));
	}

	/**
	 * @param dom
	 */
	private void checkCHAR1_X(Domain dom) {
		assertEquals("domain name", "CHAR1_X", dom.getName());
		assertEquals("data type", DictionaryDataType.CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 1, dom.getLength());
		assertEquals("output length", 1, dom.getOutputLength());
		assertFalse("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should have values", 2, dom.getValues().size());
	}
	
}
