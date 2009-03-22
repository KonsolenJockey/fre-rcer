/**
 * Copyright (c) 2008 The RCER Development Team.
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sap.conn.jco.JCoTable;

/**
 * The structure of a table as used by RFC_READ_TABLE.
 * @author vwegert
 *
 */
class TableStructure implements ITableStructure {

	private String tableName;
	private ArrayList<TableField> tableFields = new ArrayList<TableField>();
	private Map<String, Integer> tableFieldPositions = new HashMap<String, Integer>();

	/**
	 * Default constructor.
	 * @param tableName the name of the table
	 * @param fields the structure of the table as table FIELDS returned by RFC_READ_TABLE
	 */
	public TableStructure(String tableName, JCoTable fields) {
		this.tableName = tableName;
		fields.firstRow();
		int position = 0;
		do {
			tableFields.add(new TableField(tableName,
					fields.getString("FIELDNAME"), //$NON-NLS-1$
					fields.getInt("OFFSET"), //$NON-NLS-1$
					fields.getInt("LENGTH"), //$NON-NLS-1$
					DataType.fromChar(fields.getChar("TYPE")), //$NON-NLS-1$
					fields.getString("FIELDTEXT"))); //$NON-NLS-1$
			tableFieldPositions.put(fields.getString("FIELDNAME"), position); //$NON-NLS-1$
			position++;
		} while (fields.nextRow());
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableStructure#getTableName()
	 */
	public String getTableName() {
		return tableName;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableStructure#getFieldList()
	 */
	@SuppressWarnings("unchecked")
	public List<ITableField> getFieldList() {
		return (List<ITableField>) tableFields.clone();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableStructure#getFieldArray()
	 */
	public ITableField[] getFieldArray() {
		final List<ITableField> list = getFieldList(); // handles the cloning part
		return list.toArray(new ITableField[list.size()]);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableStructure#getField(java.lang.String)
	 */
	public ITableField getField(String fieldName) throws FieldNotFoundException {
		if (tableFieldPositions.containsKey(fieldName)) {
			return tableFields.get(tableFieldPositions.get(fieldName));
		}
		throw new FieldNotFoundException(tableName, fieldName);
	}

}
