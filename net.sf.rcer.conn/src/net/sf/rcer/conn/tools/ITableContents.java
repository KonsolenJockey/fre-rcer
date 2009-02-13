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

import java.util.Iterator;

/**
 * The contents of a table as returned by RFC_READ_TABLE using the {@link TableReader}.
 * @author vwegert
 *
 */
public interface ITableContents extends Iterable<ITableLine> {
	
	/**
	 * @return the name of the table
	 */
	public String getTableName();

	/**
	 * @return the structure of the table
	 */
	public ITableStructure getStructure();

	/**
	 * @param index
	 * @return the result line at the designated index
	 * @see java.util.List#get(int)
	 */
	public ITableLine getLine(int index);

	/**
	 * @return <code>true</code> if no result lines were returned
	 * @see java.util.List#isEmpty()
	 */
	public boolean isEmpty();

	/**
	 * @return the number of result lines
	 * @see java.util.List#size()
	 */
	public int size();

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	public Iterator<ITableLine> iterator();

}
