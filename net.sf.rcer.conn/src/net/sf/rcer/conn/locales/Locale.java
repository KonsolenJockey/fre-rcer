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
package net.sf.rcer.conn.locales;

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

/**
 * A single SAP Locale as defined by a <tt>locale</tt> element of the extension point 
 * <tt>net.sf.rcer.conn.saplocales</tt>. Use the {@link LocaleRegistry} to obtain instances of this class.
 * @author vwegert
 *
 */
public class Locale {

	/**
	 * The internal ID used by the SAP R/3 system (usually a single character, case sensitive).
	 */
	private String id;

	/**
	 * The language code as specified by ISO 639 (usually two characters).
	 */
	private String isoCode;

	/**
	 * The human-readable description of the locale.
	 */
	private String description;

	/**
	 * The default constructor as used by {@link LocaleRegistry}.
	 * @param id
	 * @param isoCode
	 * @param description
	 */
	Locale(String id, String isoCode, String description) {
		super();
		this.id = id;
		this.isoCode = isoCode;
		this.description = description;
	}

	/**
	 * @return the internal ID used by the SAP R/3 system (usually a single character, case sensitive).
	 */
	public String getID() {
		return id;
	}

	/**
	 * @return the language code as specified by ISO 639 (usually two characters).
	 */
	public String getISOCode() {
		return isoCode;
	}

	/**
	 * @return the human-readable description of the locale.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param id the internal ID used by the SAP R/3 system (usually a single character, case sensitive) to set
	 */
	void setID(String id) {
		this.id = id;
	}

	/**
	 * @param isoCode the language code as specified by ISO 639 (usually two characters) to set
	 */
	void setISOCode(String isoCode) {
		this.isoCode = isoCode;
	}

	/**
	 * @param description the human-readable description of the locale to set
	 */
	void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return MessageFormat.format(Messages.Locale_StringFormat, getISOCode(), getDescription());
	}

}
