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
package net.sf.rcer.conn.locales;

import java.text.MessageFormat;

/**
 * This exception occurs if an undefined locale is requested from the {@link LocaleRegistry}. 
 * @author vwegert
 *
 */
public class LocaleNotFoundException extends Exception {

	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = -6503792860775030434L;

	/**
	 * @param isoCode
	 */
	public LocaleNotFoundException(String isoCode) {
		super(MessageFormat.format("No SAP locale for ISO code {0} defined.", isoCode));
	}
	
}
