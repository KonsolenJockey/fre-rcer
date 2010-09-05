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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import net.sf.rcer.conn.Messages;

/**
 * A simple parser for INI files, intended to read the contents of the file <code>saplogon.ini</code>
 * as specified by SAP note 99435. 
 * 
 * Note that this is not a general-purpose INI parser - you might want to look at other projects 
 * instead. Specifically, this parser operates under the following limitations:
 * <ul>
 *   <li>no line may appear before the first sections</li>
 *   <li>comments are not allowed (because SAPlogon does not escape the usual comment characters)
 *   <li>there may not be duplicate section names in the file</li>
 *   <li>there may not be duplicate keys within a section</li>
 * </ul>
 * @author vwegert
 *
 */
public class SimpleIniFileParser {

	private Set<String> sectionKeys = new HashSet<String>();
	private Map<String, Set<String>> valueKeys = new HashMap<String, Set<String>>();
	private Map<String, Map<String, String>> sections = new HashMap<String, Map<String,String>>();

	/**
	 * Creates the parser and parses the contents of the {@link InputStream}.
	 * @param stream the stream to read and parse
	 * @throws IOException 
	 * @throws IniFileFormatException 
	 */
	public SimpleIniFileParser(InputStream stream) throws IniFileFormatException, IOException {
		parseFile(new BufferedReader(new InputStreamReader(stream)));
	}

	/**
	 * Checks whether a certain section is present in the file.
	 * @param section the name of the section to check
	 * @return <code>true</code> if the section exists
	 */
	public boolean sectionExists(String section) {
		return sections.containsKey(section.toUpperCase());
	}
	
	/**
	 * Returns an unmodifiable set containing the section names found in the file. 
	 * @return an unmodifiable set containing the section names found in the file
	 */
	public Set<String> getSections() {
		return Collections.unmodifiableSet(sectionKeys);
	}
	
	/**
	 * Checks whether a certain key is present in the file.
	 * @param section the name of the section to check
	 * @param key the name of the key to check
	 * @return <code>true</code> if the key exists in the section 
	 */
	public boolean keyExists(String section, String key) {
		return sections.containsKey(section.toUpperCase()) && sections.get(section.toUpperCase()).containsKey(key.toUpperCase());
	}
	
	/**
	 * Returns an unmodifiable set containing the keys of a section in the file, or <code>null</code> if the
	 * section does not exist. 
	 * @param section the name if the section
	 * @return an unmodifiable set containing the keys of a section in the file, or <code>null</code> if the
	 *         section does not exist
	 */
	public Set<String> getKeys(String section) {
		return sectionExists(section) ? Collections.unmodifiableSet(valueKeys.get(section.toUpperCase())) : null;
	}
	
	/**
	 * Retrieves the value of a key from a section of the file.
	 * @param section the name of the section to read the key from
	 * @param key the name of the key to read
	 * @return the value from the file, or <code>null</code> if either the section or the key does not exist
	 */
	public String getValue(String section, String key) {
		return keyExists(section, key) ? sections.get(section.toUpperCase()).get(key.toUpperCase()) : null;
	}

	/**
	 * Parses the file and stores its contents into {@link #sections}.
	 * @param reader 
	 * @throws IniFileFormatException
	 * @throws IOException
	 */
	private void parseFile(BufferedReader reader) throws IniFileFormatException, IOException {
		String section = null;
		Map<String, String> sectionContents = null;
		Set<String> keys = null;
		String line = ""; //$NON-NLS-1$
		int number = 0;
		while (line != null) {
			if (!line.isEmpty()) {
				if (line.startsWith("[")) { //$NON-NLS-1$
					section = line.substring(1, line.length() - 1);
					if (sections.containsKey(section.toUpperCase())) {
						throw new IniFileFormatException(MessageFormat.format(
								Messages.SimpleIniFileParser_DuplicateSectionError,
								section, number));
					}
					sectionKeys.add(section);
					keys = new HashSet<String>();
					valueKeys.put(section.toUpperCase(), keys);
					sectionContents = new HashMap<String, String>();
					sections.put(section.toUpperCase(), sectionContents);
				} else {
					if (sectionContents == null) {
						throw new IniFileFormatException(Messages.SimpleIniFileParser_FirstLineNoSectionError);
					}
					final int pos = line.indexOf('=');
					final String key = line.substring(0, pos);
					final String value = line.substring(pos + 1);
					if (sectionContents.containsKey(key.toUpperCase())) {
						throw new IniFileFormatException(MessageFormat
								.format(Messages.SimpleIniFileParser_DuplicateKeyError,
										key, section, number));
					}
					keys.add(key);
					sectionContents.put(key.toUpperCase(), value);
				}
			}
			line = reader.readLine();
			number += 1;
		}
	}

}
