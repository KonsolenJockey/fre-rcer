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
 * Runtime information about a parameter of a function module.
 * @see FunctionModuleInfo
 * @author vwegert
 *
 */
public class FunctionModuleParameter extends RepositoryDataObject {
	
	private FunctionModuleInfo functionModule;
	
	private boolean importing;
	private boolean exporting;
	private boolean changing;
	private boolean tables;
	private String parameterName;
	private String javaType;
	private String attributeName;
	private String comment;
	private boolean isStructure;
	private boolean isTable;
	
	/**
	 * Default constructor.
	 * @param functionModule
	 * @param importing
	 * @param exporting
	 * @param changing
	 * @param tables
	 * @param parameterName
	 * @param javaType
	 * @param attributeName
	 * @param comment
	 * @param isStructure
	 * @param isTable
	 */
	public FunctionModuleParameter(FunctionModuleInfo functionModule,
			boolean importing, boolean exporting, boolean changing,
			boolean tables, String parameterName, String javaType,
			String attributeName, String comment, boolean isStructure,
			boolean isTable) {
		super();
		this.functionModule = functionModule;
		this.importing = importing;
		this.exporting = exporting;
		this.changing = changing;
		this.tables = tables;
		this.parameterName = parameterName;
		this.javaType = javaType;
		this.attributeName = attributeName;
		this.comment = comment;
		this.isStructure = isStructure;
		this.isTable = isTable;
	}

	/**
	 * @return the function module
	 */
	public FunctionModuleInfo getFunctionModule() {
		return functionModule;
	}


	/**
	 * @return whether the parameter is an importing parameter
	 */
	public boolean isImporting() {
		return importing;
	}

	/**
	 * @return whether the parameter is an exporting parameter
	 */
	public boolean isExporting() {
		return exporting;
	}

	/**
	 * @return whether the parameter is a changing parameter
	 */
	public boolean isChanging() {
		return changing;
	}

	/**
	 * @return whether the parameter is a tables parameter
	 */
	public boolean isTables() {
		return tables;
	}

	/**
	 * @return the parameter name
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * @return the java type
	 */
	public String getJavaType() {
		return javaType;
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
	 * @return whether the parameter type is a structured type
	 */
	public boolean isStructure() {
		return isStructure;
	}

	/**
	 * @return whether the parameter type is a tabular type
	 */
	public boolean isTable() {
		return isTable;
	}
	
	/**
	 * @return the parameter name, padded to the maximum length of all parameter names of the function module
	 */
	public String getPaddedParameterName() {
		return padString(getParameterName(), functionModule.getMaxParameterNameLength(), true);
	}
	
	/**
	 * @return the java type, padded to the maximum length of all java types of the function module
	 */
	public String getPaddedJavaType() {
		return padString(getJavaType(), functionModule.getMaxJavaTypeNameLength(), false);
	}
	
	/**
	 * @return the attribute name, padded to the maximum length of all attribute names of the function module
	 */
	public String getPaddedAttributeName() {
		return padString(getAttributeName(), functionModule.getMaxAttributeNameLength(), false);
	}
	
}