/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Vector;

import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.test.provider.ConnectionProvider;
import net.sf.rcer.test.provider.CredentialsProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sap.conn.jco.JCoDestination;

/**
 * A test class for the {@link TableReader}.
 * @author vwegert
 *
 */
public class TableReaderTest {

	/**
	 * The destination to use for testing.
	 */
	private JCoDestination destination;

	/**
	 * The set-up method. 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		CredentialsProvider.reset();
		destination = ConnectionManager.getInstance().getDestination();
	}

	/**
	 * The tear-down method. 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ConnectionManager.getInstance().closeConnections();
	}

	/**
	 * Tries to read the table name and structure. 
	 * @throws Exception
	 */
	@Test
	public void testGetTableStructure() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		assertEquals("table name", "T000", reader.getTableName());
		ITableStructure structure = reader.getStructure();
		assertEquals("table name", "T000", structure.getTableName());
		assertEquals(structure.getFieldList().size(), structure.getFieldArray().length);
		ITableField clientField = structure.getField("MANDT");
		checkClientField(clientField);
		clientField = structure.getFieldList().get(0);
		checkClientField(clientField);
		clientField = structure.getFieldArray()[0];
		checkClientField(clientField);
	}

	/**
	 * @param clientField
	 */
	private void checkClientField(ITableField clientField) {
		assertEquals("client field name", "MANDT", clientField.getFieldName());
		assertEquals("client field type", DataType.CHAR, clientField.getDataType());
		assertEquals("client field length", 3, clientField.getLength());
		assertEquals("client field description", "Mandant", clientField.getFieldText());
		assertEquals("client field table name", "T000", clientField.getTableName());
	}

	/**
	 * Tries to read the entire table of clients. 
	 * @throws Exception
	 */
	@Test
	public void testGetClientTable() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
		assertEquals("number of fields", 17, contents.getStructure().getFieldList().size());
		assertTrue("number of clients > 0", contents.size() > 0);
		assertFalse("client table empty", contents.isEmpty());
	}

	/**
	 * Checks whether an exception is thrown if an invalid field is requested.
	 * @throws Exception
	 */
	@Test(expected=FieldNotFoundException.class)
	public void testAddInvalidField() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		reader.clearFieldSelection();
		reader.addField("FOOBARBAZ");
	}
	
	/**
	 * Tries to read the description of the clients. 
	 * @throws Exception
	 */
	@Test
	public void testGetClientText() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		reader.clearFieldSelection();
		reader.addField("MTEXT");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
		assertEquals("number of fields", 1, contents.getStructure().getFieldList().size());
		assertTrue("number of clients", contents.size() > 0);
		ITableField field = contents.getStructure().getFieldList().get(0);
		assertEquals("name of the field", "MTEXT", field.getFieldName());
	}

	/**
	 * Tries to read some boolean flag.
	 * @throws Exception
	 */
	@Test
	public void testGetBooleanField() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		for (ITableLine line: contents) {
			line.getBooleanValue("CCTEMPLOCK");
		}
	}

	/**
	 * Tries to read some integer value.
	 * @throws Exception
	 */
	@Test
	public void testGetIntegerField() throws Exception {
		TableReader reader = new TableReader(destination, "SFLIGHT");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		for (ITableLine line: contents) {
			line.getIntegerValue("CONNID");
		}
	}

	/**
	 * Tries to read the description of the clients. 
	 * @throws Exception
	 */
	@Test(expected=FieldNotFoundException.class)
	public void testReadInvalidField() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read();
		assertNotNull(contents);
		assertTrue("number of clients", contents.size() > 0);
		contents.getLine(0).getValue("FOOBARBAZ");
	}

	/**
	 * Checks whether an exception is thrown if the field list too long.
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testImplicitFieldListTooLong() throws Exception {
		TableReader reader = new TableReader(destination, "SEOCOMPODF");
		reader.read();
	}

	/**
	 * Checks whether an exception is thrown if the field list too long.
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testExplicitFieldListTooLong() throws Exception {
		TableReader reader = new TableReader(destination, "SEOCOMPODF");
		reader.clearFieldSelection();
		for (ITableField field: reader.getStructure().getFieldList()) {
			reader.addField(field);
		}
		reader.read();
	}

	/**
	 * Tries to read from the table of clients using a simple string as a parameter. 
	 * @throws Exception
	 */
	@Test
	public void testSimpleParameter() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read("MANDT = '000'");
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
		assertEquals("number of fields", 17, contents.getStructure().getFieldList().size());
		assertEquals("number of clients", 1, contents.size());
		ITableLine line = contents.getLine(0);
		assertEquals("field MANDT", "000", line.getValue("MANDT"));
	}

	/**
	 * Tries to read from the table of clients using a simple string as a parameter. 
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testSimpleParameterTooLong() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		reader.read("MANDT =                                                                                    '000'");
	}

	/**
	 * Tries to read from the table of clients using a {@link Collection} of parameters. 
	 * @throws Exception
	 */
	@Test
	public void testCollectionParameter() throws Exception {
		Collection<String> params = new Vector<String>();
		params.add("MANDT = '000'");
		params.add("OR MANDT = '066'");
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read(params);
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
		assertEquals("number of fields", 17, contents.getStructure().getFieldList().size());
		assertEquals("number of clients", 2, contents.size());
		ITableLine line = contents.getLine(0);
		assertEquals("field MANDT of first line", "000", line.getValue("MANDT"));
		line = contents.getLine(1);
		assertEquals("field MANDT of second line", "066", line.getValue("MANDT"));
	}

	/**
	 * Tries to read from the table of clients using a {@link Collection} of parameters. 
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testCollectionParameterTooLong() throws Exception {
		Collection<String> params = new Vector<String>();
		params.add("MANDT = '000'");
		params.add("OR                                                                                  MANDT = '066'");
		TableReader reader = new TableReader(destination, "T000");
		reader.read(params);
	}

	/**
	 * Tries to read from the table of clients using the variable arguments. 
	 * @throws Exception
	 */
	@Test
	public void testVarArgsParameter() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		ITableContents contents = reader.read("MANDT = '000'", "OR", "MANDT = '066'");
		assertNotNull(contents);
		assertEquals("name of the result table", "T000", contents.getTableName());
		assertEquals("number of fields", 17, contents.getStructure().getFieldList().size());
		assertEquals("number of clients", 2, contents.size());
		ITableLine line = contents.getLine(0);
		assertEquals("field MANDT of first line", "000", line.getValue("MANDT"));
		line = contents.getLine(1);
		assertEquals("field MANDT of second line", "066", line.getValue("MANDT"));
	}

	/**
	 * Tries to read from the table of clients using the variable arguments. 
	 * @throws Exception
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testVarArgsParameterTooLong() throws Exception {
		TableReader reader = new TableReader(destination, "T000");
		reader.read("MANDT = '000'", "OR", 
				"MANDT =                                                                                        '066'");
	}

}
