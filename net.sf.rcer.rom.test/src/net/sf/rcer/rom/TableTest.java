/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import net.sf.rcer.rom.ddic.DataElementField;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.ddic.TableField;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

/**
 * Test for {@link Table} and its implementation.
 * @author vwegert
 *
 */
public class TableTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testTableSFLIGHT() throws Exception {
		Table table = collection.getTable("SFLIGHT", true);
		assertEquals("table name", "SFLIGHT", table.getName());
		
		EList<TableField> fields = table.getFields();
		assertEquals("number of fields", 14, fields.size());
		
		DataElementField typeField = (DataElementField)fields.get(0);
		assertEquals("field name", "MANDT", typeField.getName());
		assertEquals("data element", "S_MANDT", typeField.getDataElementName());
	}
	
}
