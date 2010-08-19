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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sap.conn.jco.JCoTable;

/**
 * The contents of a table as returned by RFC_READ_TABLE using the {@link TableReader}.
 * @author vwegert
 *
 */
class TableContents implements ITableContents{

	private String tableName;
	private TableStructure structure;
	private List<ITableLine> lines = new ArrayList<ITableLine>();

	/**
	 * Default constructor.
	 * @param tableName
	 * @param fields
	 * @param data
	 */
	public TableContents(String tableName, JCoTable fields, JCoTable data) {
		this.tableName = tableName;
		this.structure = new TableStructure(tableName, fields);
		if (!data.isEmpty()) {
			data.firstRow();
			do {
				lines.add(new TableLine(this.structure, data.getString("WA"))); //$NON-NLS-1$
			} while (data.nextRow());
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableContents#getTableName()
	 */
	public String getTableName() {
		return tableName;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableContents#getStructure()
	 */
	public ITableStructure getStructure() {
		return structure;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableContents#getLine(int)
	 */
	public ITableLine getLine(int index) {
		return lines.get(index);
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableContents#isEmpty()
	 */
	public boolean isEmpty() {
		return lines.isEmpty();
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableContents#size()
	 */
	public int size() {
		return lines.size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<ITableLine> iterator() {
		return lines.iterator();
	}

}
