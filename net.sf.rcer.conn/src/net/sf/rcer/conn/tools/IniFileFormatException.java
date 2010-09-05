/**
 * Copyright (c) 2010 The RCER Development Team.
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

import java.io.Serializable;

/**
 * An exception used by the {@link SimpleIniFileParser} to signal that the format
 * of the INI file is invalid or unsupported.
 * @author vwegert
 *
 */
public class IniFileFormatException extends Exception {

	/**
	 * Required to be {@link Serializable}.
	 */
	private static final long serialVersionUID = 7911415209974972871L;

	/**
	 * @see Exception#Exception(String)
	 * @param message
	 */
	public IniFileFormatException(String message) {
		super(message);
	}

}
