/**
 * 
 */
package net.sf.rcer.rom.ddic;

import static org.junit.Assert.assertEquals;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.RepositoryObjectKey;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

/**
 * Test for {@link Structure} and its implementation.
 * @author vwegert
 *
 */
public class StructureTest extends ROMTest {
	
	/**
	 * @return the repository object key for the structure
	 */
	private RepositoryObjectKey createKey(String structureName) {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("TABL");
		key.setName(structureName);
		return key;
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testBAPIRET2Direct() throws Exception {
		checkBAPIRET2(collection.getStructure("BAPIRET2", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testBAPIRET2Generic() throws Exception {
		checkBAPIRET2((Structure) collection.loadObject(createKey("BAPIRET2")));
	}

	/**
	 * @param structure
	 */
	private void checkBAPIRET2(Structure structure) {
		assertEquals("structure name", "BAPIRET2", structure.getName());
		
		EList<StructureField> fields = structure.getFields();
		assertEquals("number of fields", 14, fields.size());
		
		DataElementField typeField = (DataElementField)fields.get(0);
		assertEquals("field name", "TYPE", typeField.getName());
		assertEquals("data element", "BAPI_MTYPE", typeField.getDataElementName());
	}
	
}
