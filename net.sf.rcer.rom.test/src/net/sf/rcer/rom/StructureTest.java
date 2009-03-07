/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import net.sf.rcer.rom.ddic.DataElementField;
import net.sf.rcer.rom.ddic.Structure;
import net.sf.rcer.rom.ddic.StructureField;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

/**
 * Test for {@link Structure} and its implementation.
 * @author vwegert
 *
 */
public class StructureTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testStructureBAPIRET2() throws Exception {
		Structure structure = collection.getStructure("BAPIRET2", true);
		assertEquals("structure name", "BAPIRET2", structure.getName());
		
		EList<StructureField> fields = structure.getFields();
		assertEquals("number of fields", 14, fields.size());
		
		DataElementField typeField = (DataElementField)fields.get(0);
		assertEquals("field name", "TYPE", typeField.getName());
		assertEquals("data element", "BAPI_MTYPE", typeField.getDataElementName());
	}
	
}
