/**
 * Copyright (c) 2009 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.cts.rfc;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.rcer.conn.tools.FieldNotFoundException;
import net.sf.rcer.conn.tools.ITableContents;
import net.sf.rcer.conn.tools.ITableLine;
import net.sf.rcer.conn.tools.TableReader;
import net.sf.rcer.conn.tools.TableReaderBuffer;
import net.sf.rcer.cts.Messages;
import net.sf.rcer.cts.TransportCategory;
import net.sf.rcer.cts.TransportException;
import net.sf.rcer.cts.TransportOrderType;
import net.sf.rcer.cts.TransportStatus;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * Wrapper around {@link TableReader} to retrieve the contents of table E070,
 * the main transport header data table.
 * @author vwegert
 *
 */
public class TransportTableReader {

	private TableReader reader;
	
	/**
	 * Default constructor.
	 * @param dest the {@link JCoDestination} to use
	 * @throws TransportException 
	 */
	public TransportTableReader(JCoDestination dest) throws TransportException {
		try {
			this.reader = TableReaderBuffer.getInstance(dest).getTableReader("E070"); //$NON-NLS-1$
		} catch (JCoException e) {
			throw new TransportException(Messages.TransportTableReader_ErrorReadingStructure, e); 
		}
	}
	
	/**
	 * Retrieves the transport orders according to certain selection criteria. <b>Note:</b> The selection
	 * criteria are applied to transport orders only, not to the subordinate tasks. This means that selecting
	 * for a user name FOO will only return orders that are owned by user FOO, not orders owned by other users
	 * having a task owned by FOO. Same thing applies to the other selection criteria. 
	 * @param owner the owner name of the transport, or <code>null</code> for all users
	 * @param type the {@link TransportOrderType}, or <code>null</code> for all types
	 * @param status the {@link TransportStatus}, or <code>null</code> for all statuses
	 * @param category the {@link TransportCategory}, or <code>null</code> for all categories
	 * @return a {@link Set} of strings containing the transport order IDs
	 * @throws TransportException 
	 */
	public Set<String> getTransportOrders(String owner, TransportOrderType type, 
			TransportStatus status, TransportCategory category) throws TransportException {
		
		List<String> criteria = new ArrayList<String>();
		
		if ((owner != null) && (!owner.equals(""))) {
			criteria.add(MessageFormat.format("AS4USER = ''{0}''", owner)); //$NON-NLS-1$
		}
		
		if (type == null) {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add("TRFUNCTION = 'K' OR TRFUNCTION = 'W' OR TRFUNCTION = 'T'"); //$NON-NLS-1$
		} else {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add(MessageFormat.format("TRFUNCTION = ''{0}''", type.toInternalString()));			 //$NON-NLS-1$
		}

		if (status != null) {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add(MessageFormat.format("TRSTATUS = ''{0}''", status.toInternalString())); //$NON-NLS-1$
		}
		
		if (category != null) {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add(MessageFormat.format("KORRDEV = ''{0}''", category.toInternalString())); //$NON-NLS-1$
		}
		
		ITableContents table;
		try {
			table = reader.read(criteria);
		} catch (JCoException e1) {
			throw new TransportException(Messages.TransportTableReader_ErrorReadingContents, e1); 
		}
		
		Set<String> transports = new HashSet<String>();
		try {
			for (ITableLine line: table) {
				// safeguard against accidental selection of transport tasks
				if (line.getValue("STRKORR").equals("")) { //$NON-NLS-1$
					transports.add(line.getValue("TRKORR")); //$NON-NLS-1$
				}
			}
		} catch (FieldNotFoundException e) {
			throw new RuntimeException(Messages.TransportTableReader_ErrorStructureChanged, e);
		}
		return transports;
		
	}
	
	/**
	 * Retrieves transport orders for a set of selection criteria. This method is similar to 
	 * {@link #getTransportOrders(String, TransportCategory, TransportOrderType, TransportStatus)},
	 * but it considers all transports the user takes part in - whether the user owns the transport order 
	 * itself or a subordinate transport task is irrelevant.
	 * @param user the user name, or <code>null</code> for all users
	 * @param status the {@link TransportStatus}, or <code>null</code> for all statuses
	 * @param category the {@link TransportCategory}, or <code>null</code> for all categories
	 * @return a {@link Set} of strings containing the transport order IDs
	 * @throws TransportException 
	 */
	public Set<String> getTransportOrdersForUser(String user, TransportStatus status, 
			TransportCategory category) throws TransportException {
		
		List<String> criteria = new ArrayList<String>();
		
		if ((user != null) && (!user.equals(""))) {
			criteria.add(MessageFormat.format("AS4USER = ''{0}''", user)); //$NON-NLS-1$
		}
		
		if (status != null) {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add(MessageFormat.format("TRSTATUS = ''{0}''", status.toInternalString())); //$NON-NLS-1$
		}
		
		if (category != null) {
			if (!criteria.isEmpty()) criteria.add("AND"); //$NON-NLS-1$
			criteria.add(MessageFormat.format("KORRDEV = ''{0}''", category.toInternalString())); //$NON-NLS-1$
		}
		
		ITableContents table;
		try {
			table = reader.read(criteria);
		} catch (JCoException e) {
			throw new TransportException(Messages.TransportTableReader_ErrorReadingContents, e); 
		}
		
		Set<String> transports = new HashSet<String>();
		try {
			for (ITableLine line: table) {
				final String type = line.getValue("TRFUNCTION"); //$NON-NLS-1$
				if (TransportOrderType.isValidOrderType(type)) { // TODO add TransportTaskType 
					if (line.getValue("STRKORR").equals("")) { //$NON-NLS-1$
						transports.add(line.getValue("TRKORR")); //$NON-NLS-1$
					} else {
						transports.add(line.getValue("STRKORR")); //$NON-NLS-1$
					}
				}
			}
		} catch (FieldNotFoundException e) {
			throw new RuntimeException(Messages.TransportTableReader_ErrorStructureChanged, e);
		}
		return transports;
		
	}	
	
	/**
	 * Retrieves all tasks belonging to a transport order.
	 * @param orderID the ID of the transport order
	 * @return a {@link Set} of strings containing the transport task IDs
	 * @throws TransportException
	 */
	public Set<String> getTasksForOrder(String orderID) throws TransportException {
		ITableContents table;
		try {
			table = reader.read((MessageFormat.format("STRKORR = ''{0}''", orderID))); //$NON-NLS-1$
		} catch (JCoException e) {
			throw new TransportException(Messages.TransportTableReader_ErrorReadingContents, e); 
		}
		
		Set<String> tasks = new HashSet<String>();
		try {
			for (ITableLine line: table) {
				tasks.add(line.getValue("TRKORR")); //$NON-NLS-1$
			}
		} catch (FieldNotFoundException e) {
			throw new RuntimeException(Messages.TransportTableReader_ErrorStructureChanged, e);
		}
		return tasks;
		
	}	
	
}
