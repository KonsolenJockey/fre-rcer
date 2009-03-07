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

/**
 * The actual contents of a table line.
 * @author vwegert
 *
 */
public interface ITableLine {

	/**
	 * @param fieldName the name of the field
	 * @return the value of the field
	 * @throws FieldNotFoundException
	 */
	public String getValue(String fieldName) throws FieldNotFoundException;

	/**
	 * @param fieldName the name of the field
	 * @return <code>true</code> if the value of the field is 'X'
	 * @throws FieldNotFoundException
	 */
	public boolean getBooleanValue(String fieldName) throws FieldNotFoundException;

	/**
	 * @param fieldName the name of the field
	 * @return the integer value of the field
	 * @throws FieldNotFoundException
	 */
	public int getIntegerValue(String fieldName) throws FieldNotFoundException;

}