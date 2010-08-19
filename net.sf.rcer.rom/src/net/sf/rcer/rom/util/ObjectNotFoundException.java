/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.rom.util;

/**
 * Signals that an object was not found in the SAP R/3 repository.
 * @author vwegert
 *
 */
public class ObjectNotFoundException extends Exception {

	/**
	 * Required for serialization.
	 */
	private static final long serialVersionUID = 6902230715979395804L;

	/**
	 * Default constructor.
	 * @param message
	 */
	public ObjectNotFoundException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 * @param cause
	 */
	public ObjectNotFoundException(Throwable cause) {
		super(cause);
	}

	/**
	 * Default constructor.
	 * @param message
	 * @param cause
	 */
	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
