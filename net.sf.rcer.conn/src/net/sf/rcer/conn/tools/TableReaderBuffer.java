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

import java.util.HashMap;
import java.util.Map;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * An auxiliary class that can be used to keep a reusable set of {@link TableReader} instances for a 
 * {@link JCoDestination}. This can significantly improve performance if many isolated reads to the same 
 * tables are performed.
 * @author vwegert
 *
 */
public class TableReaderBuffer {

	// TODO Write a test for this class.
	
	private static Map<String, TableReaderBuffer> instances = new HashMap<String, TableReaderBuffer>();
	
	private JCoDestination destination;
	private Map<String, TableReader> readers = new HashMap<String, TableReader>();
	
	/**
	 * Private constructor to prevent secondary instantiation.
	 * @param destination
	 */
	private TableReaderBuffer(JCoDestination destination) {
		this.destination = destination;
	}
	
	/**
	 * @param destination
	 * @return the {@link TableReaderBuffer} instance for the destination provided
	 */
	public static TableReaderBuffer getInstance(JCoDestination destination) {
		final String id = destination.getDestinationID();
		if (!instances.containsKey(id)) {
			instances.put(id, new TableReaderBuffer(destination));
		}
		return instances.get(id);
	}
	
	/**
	 * @param tableName the name of the table
	 * @return the buffered table reader instance
	 * @throws JCoException
	 */
	public TableReader getTableReader(String tableName) throws JCoException {
		if (!readers.containsKey(tableName)) {
			readers.put(tableName, new TableReader(destination, tableName));
		}
		return readers.get(tableName);
	}
	
	
}
