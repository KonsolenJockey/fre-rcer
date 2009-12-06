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
package net.sf.rcer.ui.wizard;

import java.util.List;
import java.util.Vector;

/**
 * Runtime information on a structure used in a function module interface.
 * @author vwegert
 *
 */
public class StructureInfo extends RepositoryDataObject {
	
	private String structureName;
	private String className;
	private List<StructureFieldInfo> fields = new Vector<StructureFieldInfo>();
	
	private int maxFieldNameLength = 0;
	private int maxFieldTypeLength = 0;
	private int maxAttributeNameLength = 0;

	/**
	 * Default constructor.
	 * @param structureName
	 * @param className
	 */
	public StructureInfo(String structureName, String className) {
		super();
		this.structureName = structureName;
		this.className = className;
	}
	
	/**
	 * Adds a field to the structure.
	 * @param fieldName
	 * @param fieldType
	 * @param attributeName
	 * @param comment
	 */
	public void addField(String fieldName, String fieldType, String attributeName, String comment) {
		StructureFieldInfo field = new StructureFieldInfo(this, fieldName, fieldType, attributeName, comment);
		fields.add(field);
		maxFieldNameLength = Math.max(maxFieldNameLength, fieldName.length());
		maxFieldTypeLength = Math.max(maxFieldTypeLength, fieldType.length());
		maxAttributeNameLength = Math.max(maxAttributeNameLength, attributeName.length());
	}

	/**
	 * @return the structure name
	 */
	public String getStructureName() {
		return structureName;
	}

	/**
	 * @return the class name
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return the fields
	 */
	public List<StructureFieldInfo> getFields() {
		return fields;
	}

	/**
	 * @return the maximum field name length
	 */
	public int getMaxFieldNameLength() {
		return maxFieldNameLength;
	}

	/**
	 * @return the maximum field type length
	 */
	public int getMaxFieldTypeLength() {
		return maxFieldTypeLength;
	}

	/**
	 * @return the maximum attribute name length
	 */
	public int getMaxAttributeNameLength() {
		return maxAttributeNameLength;
	}
	
}