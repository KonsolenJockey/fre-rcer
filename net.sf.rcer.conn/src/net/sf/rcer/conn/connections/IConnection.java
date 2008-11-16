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
package net.sf.rcer.conn.connections;

import net.sf.rcer.conn.locales.Locale;

/**
 * The actual data of a connection at runtime. This interface comprises the connection data represented by 
 * {@link IConnectionData} and adds the actual client, user name and locale.
 * @author vwegert
 *
 */
public interface IConnection extends IConnectionData {

	/**
	 * @return the actual client
	 */
	public String getClient();

	/**
	 * @return the actual user name
	 */
	public String getUserName();

	/**
	 * @return the actual locale
	 */
	public Locale getLocale();

}
