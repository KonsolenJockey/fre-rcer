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

import net.sf.rcer.cts.rfc.ReadTransportResponse;

/**
 * A representation of a transport task. Use the @link {@link TransportSystem} and the 
 * {@link TransportOrder} to get instances of this class.
 * @author vwegert
 *
 */
public class TransportTask extends AbstractTransport {

	private TransportOrder order;
	private TransportTaskType type;
	
	/**
	 * Internal constructor.
	 * @param order the parent {@link TransportOrder}
	 * @param id the ID of the transport task
	 * @param result the RFC result to read the header data from
	 * @throws TransportException 
	 */
	TransportTask(TransportOrder order, String id, ReadTransportResponse result) throws TransportException {
		super(order.getTransportSystem(), id, result);
		this.order = order;
		this.type = TransportTaskType.fromInternalString(result.getHeader().getType());
	}

	/**
	 * @return the task type
	 */
	public TransportTaskType getTaskType() {
		return type;
	}
	
	/**
	 * @return the transport order
	 */
	public TransportOrder getOrder() {
		return order;
	}
	
}
