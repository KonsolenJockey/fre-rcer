/**
 * 
 */
package net.sf.rcer.rom.ddic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.Domain;

import org.junit.Test;

/**
 * Test for {@link Domain} and its implementation.
 * @author vwegert
 *
 */
public class DomainTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDomainCHAR10() throws Exception {
		Domain dom = collection.getDomain("CHAR10", true);
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
	public void testDomainTEXT10() throws Exception {
		Domain dom = collection.getDomain("TEXT10", true);
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
	public void testDomainNUMC5() throws Exception {
		Domain dom = collection.getDomain("NUMC5", true);
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
	public void testDomainCHAR1_X() throws Exception {
		Domain dom = collection.getDomain("CHAR1_X", true);
		assertEquals("domain name", "CHAR1_X", dom.getName());
		assertEquals("data type", DictionaryDataType.CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 1, dom.getLength());
		assertEquals("output length", 1, dom.getOutputLength());
		assertFalse("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should have values", 2, dom.getValues().size());
	}
	
}
