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
	
	/**
	 * Internal constructor.
	 * @param transportSystem the parent {@link TransportSystem}
	 * @param id the ID of the transport order
	 * @param result the RFC result to read the header data from
	 * @throws TransportException 
	 */
	TransportOrder(TransportSystem transportSystem,	String id, ReadTransportResponse result) throws TransportException {
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
	
}
