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

/**
 * The description of a table field as used by RFC_READ_TABLE.
 * @author vwegert
 *
 */
public interface ITableField {

	/**
	 * @return the name of the table
	 */
	public String getTableName();

	/**
	 * @return the name of the field
	 */
	public String getFieldName();

	/**
	 * @return the offset of the field in the table line
	 */
	public int getOffset();

	/**
	 * @return the length of the field
	 */
	public int getLength();

	/**
	 * @return the data type of the field
	 */
	public DataType getDataType();

	/**
	 * @return the description of the field
	 */
	public String getFieldText();

}