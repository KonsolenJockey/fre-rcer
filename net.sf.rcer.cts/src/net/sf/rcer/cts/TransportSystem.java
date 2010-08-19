/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.cts.rfc.AddTaskRequest;
import net.sf.rcer.cts.rfc.AddTaskResponse;
import net.sf.rcer.cts.rfc.ReadTransportRequest;
import net.sf.rcer.cts.rfc.ReadTransportResponse;
import net.sf.rcer.cts.rfc.TaskUserListEntry;
import net.sf.rcer.cts.rfc.TransportMessage;
import net.sf.rcer.cts.rfc.TransportTableReader;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * The central class of the CTS interface. All methods of this class are designed to be used in headless
 * environments.
 * @author vwegert
 *
 */
public class TransportSystem {

	private JCoDestination destination;
	private TransportTableReader transportTableReader;

	/**
	 * Default constructor.
	 * @param destination the {@link JCoDestination} to use
	 */
	public TransportSystem(JCoDestination destination) {
		this.destination = destination;
	}

	/**
	 * Default constructor that tries to use the current primary connection.
	 * @throws ConnectionException
	 */
	public TransportSystem() throws ConnectionException {
		this.destination = ConnectionManager.getInstance().getDestination();
	}

	/**
	 * @return the destination
	 */
	public JCoDestination getDestination() {
		return destination;
	}

	/**
	 * Wrapper around {@link ReadTransportRequest#execute(JCoDestination)} with additional error checks.
	 * @param request the request to execute
	 * @return the checked response
	 * @throws TransportException
	 */
	private ReadTransportResponse readTransportRequest(ReadTransportRequest request) throws TransportException {

		ReadTransportResponse result;
		try {
			result = request.execute(destination);
		} catch (JCoException e) {
			throw new TransportException(MessageFormat.format(Messages.TransportSystem_ErrorReadingTransport,
					request.getOrderID(), e.getLocalizedMessage()), e);
		}

		// check whether an exception was raised
		if (!result.getException().equals("")) { //$NON-NLS-1$
			throw new TransportException(MessageFormat.format(
					Messages.TransportSystem_ExceptionReadingTransport,
					request.getOrderID(), result.getException()));
		}

		// check whether an error message was returned
		if (result.getMessage().getMessageType().equals("E") ||  //$NON-NLS-1$
				result.getMessage().getMessageType().equals("A") || //$NON-NLS-1$
				result.getMessage().getMessageType().equals("X")) { //$NON-NLS-1$
			throw new TransportException(MessageFormat.format(Messages.TransportSystem_ErrorReadingTransport,
					request.getOrderID(), result.getMessage().getText()));
		}
		return result;
	}

	/**
	 * Retrieves a single transport order 
	 * @param id the ID of the transport order
	 * @return the {@link TransportOrder} instance
	 * @throws TransportException
	 */
	public TransportOrder getTransportOrder(String id) throws TransportException {
		ReadTransportRequest request = new ReadTransportRequest();
		request.setOrderID(id);
		request.setHeaderRequested(true);
		request.setTextRequested(true);
		request.setObjectListRequested(true);
		request.setObjectListKeysRequested(true);

		ReadTransportResponse result = readTransportRequest(request);

		if (!result.getHeader().getParentID().equals("")) { //$NON-NLS-1$
			throw new TransportException(MessageFormat.format(
					Messages.TransportSystem_ErrorTaskNotOrder, id));
		}

		TransportOrder order = new TransportOrder(this, id, result);

		// read the tasks belonging to the order
		TransportTableReader reader = new TransportTableReader(destination);
		Set<String> taskIDs = reader.getTasksForOrder(id);
		for (final String taskID: taskIDs) {
			order.addTask(getTransportTask(order, taskID));
		}

		return order;
	}

	/**
	 * Retrieves a single transport task. 
	 * @param id the ID of the transport task
	 * @return the {@link TransportTask} instance
	 * @throws TransportException
	 */
	private TransportTask getTransportTask(TransportOrder order, String id) throws TransportException {
		ReadTransportRequest request = new ReadTransportRequest();
		request.setOrderID(id);
		request.setHeaderRequested(true);
		request.setTextRequested(true);
		request.setObjectListRequested(true);
		request.setObjectListKeysRequested(true);

		ReadTransportResponse result = readTransportRequest(request);

		if (result.getHeader().getParentID().equals("")) { //$NON-NLS-1$
			throw new TransportException(MessageFormat.format(
					Messages.TransportSystem_ErrorOrderNotTask, id));
		}

		return new TransportTask(order, id, result);
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
	 * @return a {@link List} of {@link TransportOrder} instances
	 * @throws TransportException 
	 * @see net.sf.rcer.cts.rfc.TransportTableReader#getTransportOrders(java.lang.String, 
	 *  net.sf.rcer.cts.TransportOrderType, net.sf.rcer.cts.TransportStatus, net.sf.rcer.cts.TransportCategory)
	 */
	public List<TransportOrder> getTransportOrders(String owner, TransportCategory category, 
			TransportOrderType type, TransportStatus status) throws TransportException {

		if (transportTableReader == null) {
			transportTableReader = new TransportTableReader(destination);
		}
		Set<String> ids = transportTableReader.getTransportOrders(owner, type, status, category);
		List<TransportOrder> orders = new ArrayList<TransportOrder>();
		for (String id: ids) {
			orders.add(getTransportOrder(id));
		}
		return orders;
	}

	/**
	 * Retrieves transport orders for a set of selection criteria. This method is similar to 
	 * {@link #getTransportOrders(String, TransportCategory, TransportOrderType, TransportStatus)},
	 * but it considers all transports the user takes part in - whether the user owns the transport order 
	 * itself or a subordinate transport task is irrelevant.
	 * @param user the user name, or <code>null</code> for all users
	 * @param status the {@link TransportStatus}, or <code>null</code> for all statuses
	 * @param category the {@link TransportCategory}, or <code>null</code> for all categories
	 * @return a {@link List} of {@link TransportOrder} instances
	 * @throws TransportException
	 * @see net.sf.rcer.cts.rfc.TransportTableReader#getTransportOrdersForUser(java.lang.String,
	 *  net.sf.rcer.cts.TransportStatus, net.sf.rcer.cts.TransportCategory)
	 */
	public List<TransportOrder> getTransportsForUser(String user, 
			TransportCategory category, TransportStatus status) throws TransportException {

		if (transportTableReader == null) {
			transportTableReader = new TransportTableReader(destination);
		}
		Set<String> ids = transportTableReader.getTransportOrdersForUser(user, status, category);
		List<TransportOrder> orders = new ArrayList<TransportOrder>();
		for (String id: ids) {
			orders.add(getTransportOrder(id));
		}
		return orders;
	}

	/**
	 * Retrieves transport orders for a set of selection criteria. This method is similar to 
	 * {@link #getTransportOrders(String, TransportCategory, TransportOrderType, TransportStatus)},
	 * but it considers all transports the user takes part in - whether the user owns the transport order 
	 * itself or a subordinate transport task is irrelevant.
	 * @param user the user name, or <code>null</code> for all users
	 * @param status the {@link TransportStatus}, or <code>null</code> for all statuses
	 * @param type the {@link TransportOrderType}, or <code>null</code> for all types
	 * @return a {@link List} of {@link TransportOrder} instances
	 * @throws TransportException
	 * @see net.sf.rcer.cts.rfc.TransportTableReader#getTransportOrdersForUser(java.lang.String,
	 *  net.sf.rcer.cts.TransportStatus, net.sf.rcer.cts.TransportCategory)
	 */
	public List<TransportOrder> getTransportsForUser(String user, 
			TransportOrderType type, TransportStatus status) throws TransportException {

		if (transportTableReader == null) {
			transportTableReader = new TransportTableReader(destination);
		}
		Set<String> ids = transportTableReader.getTransportOrdersForUser(user, status, null);
		List<TransportOrder> orders = new ArrayList<TransportOrder>();
		for (String id: ids) {
			TransportOrder order = getTransportOrder(id);
			if (type != null) {
				if (order.getOrderType().equals(type)) {
					orders.add(getTransportOrder(id));
				}
			} else {
				orders.add(getTransportOrder(id));
			}
		}
		return orders;
	}

	/**
	 * Adds a task to the transport order. This method does <b>not</b> check whether a task of that type for the user 
	 * already exists. 
	 * @param orderID the ID of the transport order to add the transport task to 
	 * @param user the user who will be the new owner of the transport task
	 * @param type the transport task type - note that <code>CUSTOMIZING</code> is not yet supported
	 * @return the newly created {@link TransportTask}
	 * @throws TransportException
	 */
	public TransportTask addTask(String orderID, String user, TransportTaskType type) throws TransportException {

		// prepare the request
		AddTaskRequest request = new AddTaskRequest();
		request.setOrderID(orderID);
		request.setUsers(getUserList(user));
		switch(type) {
		case CORRECTION:
			request.setCorrectionRequested(true);
			break;
		case REPAIR: 
			request.setRepairRequested(true);
			break;
		case UNCLASSIFIED:
			break;
		default:
			throw new UnsupportedOperationException(MessageFormat
					.format(
							Messages.TransportSystem_ErrorTaskTypeNotSupported,
							type.getDescription()));
		}

		// execute the call
		AddTaskResponse response;
		try {
			response = request.execute(destination);
		} catch (JCoException e) {
			throw new TransportException(MessageFormat.format(
					Messages.TransportSystem_ErrorAddingTaskForUser,
					type.getDescription(), user, orderID), e);
		}

		// check whether an exception was raised
		if (!response.getException().equals("")) { //$NON-NLS-1$
			throw new TransportException(MessageFormat.format(
					Messages.TransportSystem_ExceptionAddingTaskForUser,
					type.getDescription(), user, orderID));
		}

		// get the line from the users table
		TaskUserListEntry entry = response.getUsers().get(0);
		String taskID = ""; //$NON-NLS-1$
		int messageLine = 0;
		switch(type) {
		case CORRECTION:
			taskID = entry.getCorrectionID();
			messageLine = entry.getCorrectionErrorMessage();
			break;
		case REPAIR: 
			taskID = entry.getRepairID();
			messageLine = entry.getRepairErrorMessage();
			break;
		case UNCLASSIFIED:
			taskID = entry.getUnclassifiedID();
			messageLine = entry.getUnclassifiedErrorMessage();
			break;
		default:
			return null; // should never happen, see above.
		}

		// check whether an error message was returned
		if (messageLine != 0) {
			TransportMessage message = response.getMessages().get(messageLine);
			if (message.getMessageType().equals("E") ||  //$NON-NLS-1$
					message.getMessageType().equals("A") || //$NON-NLS-1$
					message.getMessageType().equals("X")) { //$NON-NLS-1$
				throw new TransportException(MessageFormat.format(Messages.TransportSystem_ErrorAddingTaskForUserWithMessage,
						type.getDescription(), user, orderID, message.getText()));
			}
		}

		// re-read the transport order and get the task
		return getTransportOrder(orderID).getTask(taskID);
	}

	/**
	 * Adds a task to the transport order. This method does <b>not</b> check whether a task of that type for the user 
	 * already exists. 
	 * @param order the transport order to add the transport task to 
	 * @param user the user who will be the new owner of the transport task
	 * @param type the transport task type - note that <code>CUSTOMIZING</code> is not yet supported
	 * @return the newly created {@link TransportTask}
	 * @throws TransportException
	 */
	public TransportTask addTask(TransportOrder order, String user, TransportTaskType type) throws TransportException {
		return addTask(order.getID(), user, type);
	}

	/**
	 * @param user a user name to create a list for
	 * @return a list that contains a single entry for the user specified
	 */
	private List<TaskUserListEntry> getUserList(String user) {
		List<TaskUserListEntry> list = new ArrayList<TaskUserListEntry>();
		TaskUserListEntry entry = new TaskUserListEntry();
		entry.setUserName(user);
		list.add(entry);
		return list;
	}

}
