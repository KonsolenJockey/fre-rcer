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
package net.sf.rcer.cts;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import net.sf.rcer.cts.rfc.ReadTransportResponse;

/**
 * A representation of a transport order. Use the @link {@link TransportSystem} to get instances
 * of this class.
 * @author vwegert
 *
 */
public class TransportOrder extends AbstractTransport {

	private TransportOrderType type;
	private String target;
	
	private Map<String, TransportTask> tasks = new TreeMap<String, TransportTask>();
	
	/**
	 * Internal constructor.
	 * @param transportSystem the parent {@link TransportSystem}
	 * @param id the ID of the transport order
	 * @param result the RFC result to read the header data from
	 * @throws TransportException 
	 */
	TransportOrder(TransportSystem transportSystem, String id, ReadTransportResponse result) throws TransportException {
		super(transportSystem, id, result);
		this.type = TransportOrderType.fromInternalString(result.getHeader().getType());
		this.target = result.getHeader().getTarget();
	}

	/**
	 * @return the order type
	 */
	public TransportOrderType getOrderType() {
		return type;
	}
	
	/**
	 * @return the target system
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @return the tasks of the transport order
	 * @see java.util.Map#values()
	 */
	public Collection<TransportTask> getTasks() {
		return tasks.values();
	}
	
	/**
	 * @param id the task ID to search for
	 * @return the task corresponding to the task ID
	 */
	public TransportTask getTask(String id) {
		return tasks.get(id);
	}
	
	/**
	 * @param userName the name of the user
	 * @return all tasks of this transport order belonging to the user specified
	 */
	public Collection<TransportTask> getTasks(String userName) {
		List<TransportTask> result = new Vector<TransportTask>();
		for (TransportTask task: tasks.values()) {
			if (task.getOwner().equals(userName)) {
				result.add(task);
			}
		}
		return result;
	}
	
	/**
	 * @param taskType the {@link TransportTaskType} to look for
	 * @return all tasks of this transport order of the type specified 
	 */
	public Collection<TransportTask> getTasks(TransportTaskType taskType) {
		List<TransportTask> result = new Vector<TransportTask>();
		for (TransportTask task: tasks.values()) {
			if (task.getTaskType().equals(taskType)) {
				result.add(task);
			}
		}
		return result;
	}
	
	/**
	 * @param userName the user name to look for
	 * @param taskType the {@link TransportTaskType} to look for
	 * @return all tasks of this transport order belonging to the user specified and of the type specified
	 */
	public Collection<TransportTask> getTasks(String userName, TransportTaskType taskType) {
		List<TransportTask> result = new Vector<TransportTask>();
		for (TransportTask task: tasks.values()) {
			if ((task.getOwner().equals(userName)) && (task.getTaskType().equals(taskType))) {
				result.add(task);
			}
		}
		return result;
	}
	
	/**
	 * Adds a task to the transport order. 
	 * @param task
	 * @see 
	 */
	void addTask(TransportTask task) {
		this.tasks.put(task.getID(), task);
	}
	
}
