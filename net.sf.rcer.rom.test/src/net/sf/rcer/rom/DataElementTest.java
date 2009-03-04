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
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.ReferredObjectType;
import net.sf.rcer.rom.ddic.TypeKind;
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
public class DataElementTest {
	
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
	public void testDataElementCHAR10() throws Exception {
		DataElement elem = DDICFactory.eINSTANCE.createDataElement();
		elem.setName("CHAR10");
		collection.getObjects().add(elem);
		IStatus status = elem.load();
		assertTrue(status.getMessage(), status.isOK());
		assertEquals("data element name", "CHAR10", elem.getName());
		assertEquals("type kind", TypeKind.DOMAIN, elem.getTypeKind());
		assertEquals("domain name", "CHAR10", elem.getTypeName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testDataElementCHAR_50() throws Exception {
		DataElement elem = DDICFactory.eINSTANCE.createDataElement();
		elem.setName("CHAR_50");
		collection.getObjects().add(elem);
		IStatus status = elem.load();
		assertTrue(status.getMessage(), status.isOK());
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
		DataElement elem = DDICFactory.eINSTANCE.createDataElement();
		elem.setName("SWFRCNTREF");
		collection.getObjects().add(elem);
		IStatus status = elem.load();
		assertTrue(status.getMessage(), status.isOK());
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
		DataElement elem = DDICFactory.eINSTANCE.createDataElement();
		elem.setName("TREEMNREF");
		collection.getObjects().add(elem);
		IStatus status = elem.load();
		assertTrue(status.getMessage(), status.isOK());
		assertEquals("data element name", "TREEMNREF", elem.getName());
		assertEquals("type kind", TypeKind.REFERENCE, elem.getTypeKind());
		assertEquals("reference type", ReferredObjectType.CLASS, elem.getReferredType());
		assertEquals("interface", "CL_TREE_MODEL_NODE", elem.getTypeName());
	}
	
}
