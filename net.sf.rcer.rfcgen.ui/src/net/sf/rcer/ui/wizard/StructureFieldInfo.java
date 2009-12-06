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


/**
 * Runtime information on a component (field) of a structure.
 * @see StructureInfo
 * @author vwegert
 *
 */
public class StructureFieldInfo extends RepositoryDataObject {
	
	private StructureInfo structure;
	
	private String fieldName;
	private String fieldType;
	private String attributeName;
	private String comment;
	
	/**
	 * Default constructor.
	 * @param structure 
	 * @param fieldName
	 * @param fieldType
	 * @param attributeName
	 * @param comment
	 */
	public StructureFieldInfo(StructureInfo structure, String fieldName, String fieldType,
			String attributeName, String comment) {
		super();
		this.structure = structure;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.attributeName = attributeName;
		this.comment = comment;
	}

	/**
	 * @return the field name
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @return the field type
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * @return the field name, padded to the maximum length of all field names of the structure
	 */
	public String getPaddedFieldName() {
		return padString(getFieldName(), structure.getMaxFieldNameLength(), true);
	}
	
	/**
	 * @return the field type, padded to the maximum length of all field types of the structure
	 */
	public String getPaddedFieldType() {
		return padString(getFieldType(), structure.getMaxFieldTypeLength(), false);
	}
	
	/**
	 * @return the attribute name, padded to the maximum length of all attribute names of the structure
	 */
	public String getPaddedAttributeName() {
		return padString(getAttributeName(), structure.getMaxAttributeNameLength(), false);
	}
	
}