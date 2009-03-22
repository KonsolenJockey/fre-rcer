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

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

/**
 * The description of a table field as used by RFC_READ_TABLE.
 * @author vwegert
 *
 */
class TableField implements Cloneable, ITableField {
	
	private String tableName;
	private String fieldName;
	private int offset;
	private int length;
	private DataType dataType;
	private String fieldText;
	
	/**
	 * Default constructor.
	 * @param tableName the name of the table
	 * @param fieldName the name of the field
	 * @param offset the offset of the field in the table line
	 * @param length the length of the field
	 * @param dataType the data type of the field
	 * @param fieldText the description of the field
	 */
	public TableField(String tableName, String fieldName, int offset, int length,
			DataType dataType, String fieldText) {
		super();
		this.tableName = tableName;
		this.fieldName = fieldName;
		this.offset = offset;
		this.length = length;
		this.dataType = dataType;
		this.fieldText = fieldText;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getTableName()
	 */
	public String getTableName() {
		return tableName;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getFieldName()
	 */
	public String getFieldName() {
		return fieldName;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getOffset()
	 */
	public int getOffset() {
		return offset;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getLength()
	 */
	public int getLength() {
		return length;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getDataType()
	 */
	public DataType getDataType() {
		return dataType;
	}

	/* (non-Javadoc)
	 * @see net.sf.rcer.conn.tools.ITableField#getFieldText()
	 */
	public String getFieldText() {
		return fieldText;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return MessageFormat.format(Messages.TableField_StringFormat, tableName, fieldName, fieldText);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
