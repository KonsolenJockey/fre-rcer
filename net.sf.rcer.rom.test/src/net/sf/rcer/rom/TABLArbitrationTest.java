/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.rom.ddic.Structure;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl;

import org.junit.Test;


/**
 * Tests to determine whether the {@link RepositoryObjectCollection} is able to load R3TR TABL objects.
 * @see RepositoryObjectCollectionImpl#loadTABLObject(RepositoryObjectKey)
 * @author vwegert
 */
public class TABLArbitrationTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testStructure() throws Exception {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("TABL");
		key.setName("BAPIRET2");
		
		RepositoryObject object = collection.loadObject(key);
		assertTrue("type of loaded object", object instanceof Structure);
		
		Structure structure = (Structure) object;
		assertEquals("structure name", "BAPIRET2", structure.getName());
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testTable() throws Exception {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("TABL");
		key.setName("SFLIGHT");
		
		RepositoryObject object = collection.loadObject(key);
		assertTrue("type of loaded object", object instanceof Table);
		
		Table table = (Table) object;
		assertEquals("table name", "SFLIGHT", table.getName());
	}
	
}
