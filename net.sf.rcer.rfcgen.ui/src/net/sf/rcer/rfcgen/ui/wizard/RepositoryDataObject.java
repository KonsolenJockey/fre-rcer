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
package net.sf.rcer.rfcgen.ui.wizard;

/**
 * A superclass for all runtime information classes.
 * @author vwegert
 */
public abstract class RepositoryDataObject {

	/**
	 * Pads a string with spaces to a certain length, optionally adding quotes to the original string.
	 * @param input
	 * @param length
	 * @param addQuotes
	 * @return the input string padded to length with spaces
	 */
	protected String padString(String input, int length, boolean addQuotes) {
		StringBuilder tmp = new StringBuilder(length);
		tmp.append(input);
		int len = length;
		if (addQuotes) {
			tmp.insert(0, '"');
			tmp.append('"');
			len += 2;
		}
		while (tmp.length() < len) {
			tmp.append(' ');
		}
		return tmp.toString();
	}

}
