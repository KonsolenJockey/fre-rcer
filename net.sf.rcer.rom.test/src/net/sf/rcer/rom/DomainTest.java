/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.rom.ddic.DDICFactory;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.test.provider.ConnectionProvider;

import org.eclipse.core.runtime.IStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for {@link RepositoryPackage} and its implementation.
 * @author vwegert
 *
 */
public class DomainTest {
	
	private RepositoryObjectCollection collection;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		collection = ROMFactory.eINSTANCE.createRepositoryObjectCollection();
		assertNotNull(collection);
		collection.setSourceConnection(ConnectionManager.getInstance().getDestination());
		assertNotNull(collection.getSourceConnection());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		collection = null;
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDomainCHAR10() throws Exception {
		Domain dom = DDICFactory.eINSTANCE.createDomain();
		dom.setName("CHAR10");
		collection.getObjects().add(dom);
		IStatus status = dom.load();
		assertTrue(status.getMessage(), status.isOK());
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
		Domain dom = DDICFactory.eINSTANCE.createDomain();
		dom.setName("TEXT10");
		collection.getObjects().add(dom);
		IStatus status = dom.load();
		assertTrue(status.getMessage(), status.isOK());
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
		Domain dom = DDICFactory.eINSTANCE.createDomain();
		dom.setName("NUMC5");
		collection.getObjects().add(dom);
		IStatus status = dom.load();
		assertTrue(status.getMessage(), status.isOK());
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
		Domain dom = DDICFactory.eINSTANCE.createDomain();
		dom.setName("CHAR1_X");
		collection.getObjects().add(dom);
		IStatus status = dom.load();
		assertTrue(status.getMessage(), status.isOK());
		assertEquals("domain name", "CHAR1_X", dom.getName());
		assertEquals("data type", DictionaryDataType.CHARACTER, dom.getDictionaryDataType());
		assertEquals("length", 1, dom.getLength());
		assertEquals("output length", 1, dom.getOutputLength());
		assertFalse("case sensitive", dom.isCaseSensitive());
		assertEquals("domain should have values", 2, dom.getValues().size());
	}
	
}
