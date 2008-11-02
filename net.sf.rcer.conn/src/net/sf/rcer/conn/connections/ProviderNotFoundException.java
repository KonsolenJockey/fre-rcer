/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $$Id$$
 */
package net.sf.rcer.conn.connections;

import java.text.MessageFormat;

/**
 * This exception occurs if an undefined connection provider is requested from the 
 * {@link ConnectionRegistry}. 
 * @author vwegert
 *
 */
public class ProviderNotFoundException extends Exception {

	/**
	 * UID for serialization.
	 */
	private static final long serialVersionUID = -2760343960512232774L;

	/**
	 * @param providerID
	 */
	public ProviderNotFoundException(String providerID) {
		super(MessageFormat.format("No conection provider with ID {0} defined.", providerID));
	}
	
}
