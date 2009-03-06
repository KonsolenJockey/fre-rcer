/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.ReferredObjectType;
import net.sf.rcer.rom.ddic.TypeKind;

import org.junit.Test;

/**
 * Test for {@link DataElement} and its implementation.
 * @author vwegert
 *
 */
public class DataElementTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDataElementCHAR10() throws Exception {
		DataElement elem = collection.getDataElement("CHAR10", true);
		assertEquals("data element name", "CHAR10", elem.getName());
		assertEquals("type kind", TypeKind.DOMAIN, elem.getTypeKind());
		assertEquals("domain name", "CHAR10", elem.getTypeName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDataElementCHAR_50() throws Exception {
		DataElement elem = collection.getDataElement("CHAR_50", true);
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
	public void testDataElementSWFRCNTREF() throws Exception {
		DataElement elem = collection.getDataElement("SWFRCNTREF", true);
		assertEquals("data element name", "SWFRCNTREF", elem.getName());
		assertEquals("type kind", TypeKind.REFERENCE, elem.getTypeKind());
		assertEquals("reference type", ReferredObjectType.INTERFACE, elem.getReferredType());
		assertEquals("interface", "IF_SWF_CNT_CONTAINER", elem.getTypeName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDataElementTREEMNREF() throws Exception {
		DataElement elem = collection.getDataElement("TREEMNREF", true);
		assertEquals("data element name", "TREEMNREF", elem.getName());
		assertEquals("type kind", TypeKind.REFERENCE, elem.getTypeKind());
		assertEquals("reference type", ReferredObjectType.CLASS, elem.getReferredType());
		assertEquals("interface", "CL_TREE_MODEL_NODE", elem.getTypeName());
	}
	
}
