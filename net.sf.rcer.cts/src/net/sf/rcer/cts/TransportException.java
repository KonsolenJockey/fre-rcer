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

/**
 * A general exception for use within the CTS packages.
 * @author vwegert
 *
 */
public class TransportException extends Exception {

	/**
	 * Required for serialization.
	 */
	private static final long serialVersionUID = 5200679913293156540L;

	/**
	 * Default constructor.
	 * @see Exception#Exception(String, Throwable)
	 */
	public TransportException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Default constructor.
	 * @see Exception#Exception(String)
	 */
	TransportException(String message) {
		super(message);
	}
	
}
