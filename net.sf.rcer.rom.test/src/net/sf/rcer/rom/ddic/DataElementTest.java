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
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.RepositoryObjectKey;

import org.junit.Test;

/**
 * Test for {@link DataElement} and its implementation.
 * @author vwegert
 *
 */
public class DataElementTest extends ROMTest {
	
	/**
	 * @return the repository object key for the data element
	 */
	private RepositoryObjectKey createKey(String dataElementName) {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("DTEL");
		key.setName(dataElementName);
		return key;
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR10Direct() throws Exception {
		checkCHAR10(collection.getDataElement("CHAR10", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR10Generic() throws Exception {
		checkCHAR10((DataElement) collection.loadObject(createKey("CHAR10")));
	}

	/**
	 * @param elem
	 */
	private void checkCHAR10(DataElement elem) {
		assertEquals("data element name", "CHAR10", elem.getName());
		assertEquals("type kind", TypeKind.DOMAIN, elem.getTypeKind());
		assertEquals("domain name", "CHAR10", elem.getTypeName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR_50Direct() throws Exception {
		checkCHAR_50(collection.getDataElement("CHAR_50", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testCHAR_50Generic() throws Exception {
		checkCHAR_50((DataElement) collection.loadObject(createKey("CHAR_50")));
	}

	/**
	 * @param elem
	 */
	private void checkCHAR_50(DataElement elem) {
		assertEquals("data element name", "CHAR_50", elem.getName());
		assertEquals("type kind", TypeKind.DICTIONARY_TYPE, elem.getTypeKind());
		assertEquals("type name", "", elem.getTypeName());
		assertEquals("data type", DictionaryDataType.CHARACTER, elem.getDictionaryDataType());
		assertEquals("length", 50, elem.getLength());
		assertEquals("output length", 50, elem.getOutputLength());
		assertFalse("case sensitive", elem.isCaseSensitive());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testSWFRCNTREFDirect() throws Exception {
		checkSWFRCNTREF(collection.getDataElement("SWFRCNTREF", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testSWFRCNTREFGeneric() throws Exception {
		checkSWFRCNTREF((DataElement) collection.loadObject(createKey("SWFRCNTREF")));
	}

	/**
	 * @param elem
	 */
	private void checkSWFRCNTREF(DataElement elem) {
		assertEquals("data element name", "SWFRCNTREF", elem.getName());
		assertEquals("type kind", TypeKind.REFERENCE, elem.getTypeKind());
		assertEquals("reference type", ReferredObjectType.INTERFACE, elem.getReferredType());
		assertEquals("interface", "IF_SWF_CNT_CONTAINER", elem.getTypeName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testTREEMNREFDirect() throws Exception {
		checkTREEMNREF(collection.getDataElement("TREEMNREF", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testTREEMNREFGeneric() throws Exception {
		checkTREEMNREF((DataElement) collection.loadObject(createKey("TREEMNREF")));
	}

	/**
	 * @param elem
	 */
	private void checkTREEMNREF(DataElement elem) {
		assertEquals("data element name", "TREEMNREF", elem.getName());
		assertEquals("type kind", TypeKind.REFERENCE, elem.getTypeKind());
		assertEquals("reference type", ReferredObjectType.CLASS, elem.getReferredType());
		assertEquals("interface", "CL_TREE_MODEL_NODE", elem.getTypeName());
	}
	
}
