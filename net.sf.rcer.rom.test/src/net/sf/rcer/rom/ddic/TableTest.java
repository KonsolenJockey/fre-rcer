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
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.RepositoryObjectKey;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

/**
 * Test for {@link Table} and its implementation.
 * @author vwegert
 *
 */
public class TableTest extends ROMTest {
	
	/**
	 * @return the repository object key for the table
	 */
	private RepositoryObjectKey createKey(String tableName) {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID("R3TR");
		key.setObjectTypeID("TABL");
		key.setName(tableName);
		return key;
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testTableSFLIGHTDirect() throws Exception {
		checkSFLIGHT(collection.getTable("SFLIGHT", true));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testTableSFLIGHTGeneric() throws Exception {
		checkSFLIGHT((Table) collection.loadObject(createKey("SFLIGHT")));
	}

	/**
	 * @param table
	 */
	private void checkSFLIGHT(Table table) {
		assertEquals("table name", "SFLIGHT", table.getName());
		
		EList<TableField> fields = table.getFields();
		assertEquals("number of fields", 14, fields.size());
		
		DataElementField typeField = (DataElementField)fields.get(0);
		assertEquals("field name", "MANDT", typeField.getName());
		assertEquals("data element", "S_MANDT", typeField.getDataElementName());
	}
	
}
