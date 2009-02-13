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

import java.util.List;

/**
 * The structure of a table as used by RFC_READ_TABLE.
 * @author vwegert
 *
 */
interface ITableStructure {

	/**
	 * @return the name of the table
	 */
	public String getTableName();

	/**
	 * @return a list of all fields of the table.
	 */
	public List<ITableField> getFieldList();

	/**
	 * @return an array of all fields of the table
	 */
	public ITableField[] getFieldArray();

	/**
	 * @param fieldName the name of a field
	 * @return the description of a field
	 * @throws FieldNotFoundException
	 */
	public ITableField getField(String fieldName) throws FieldNotFoundException;

}