/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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

import java.util.List;
import java.util.Vector;

/**
 * Runtime information about a function module.
 * @author vwegert
 *
 */
public class FunctionModuleInfo extends RepositoryDataObject {
	
	private String functionModuleName;
	private String callClassName;
	private String requestClassName;
	private String responseClassName;
	private List<FunctionModuleParameter> parameters = new Vector<FunctionModuleParameter>();
	
	private int maxParameterNameLength = 0;
	private int maxJavaTypeNameLength = 0;
	private int maxAttributeNameLength = 0;
	
	/**
	 * Default constructor.
	 * @param functionModuleName
	 * @param callClassName
	 * @param requestClassName 
	 * @param responseClassName 
	 */
	public FunctionModuleInfo(String functionModuleName, String callClassName, String requestClassName, String responseClassName) {
		super();
		this.functionModuleName = functionModuleName;
		this.callClassName = callClassName;
		this.requestClassName = requestClassName;
		this.responseClassName = responseClassName;
	}

	/**
	 * Adds a parameter.
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
	public void addParameter(boolean importing, boolean exporting, boolean changing, boolean tables, 
			String parameterName, String javaType, String attributeName, String comment,
			boolean isStructure, boolean isTable) {
		FunctionModuleParameter param = new FunctionModuleParameter(this, importing, exporting, changing, tables, 
				parameterName, javaType, attributeName, comment, isStructure, isTable);
		parameters.add(param);
		maxParameterNameLength = Math.max(maxParameterNameLength, parameterName.length());
		maxJavaTypeNameLength = Math.max(maxJavaTypeNameLength, javaType.length());
		maxAttributeNameLength = Math.max(maxAttributeNameLength, attributeName.length());
	}
	
	/**
	 * @return the function module name
	 */
	public String getFunctionModuleName() {
		return functionModuleName;
	}

	/**
	 * @return the class name for the call-style mapping
	 */
	public String getCallClassName() {
		return callClassName;
	}

	/**
	 * @return the class name for the request class
	 */
	public String getRequestClassName() {
		return requestClassName;
	}

	/**
	 * @return the class name for the response class
	 */
	public String getResponseClassName() {
		return responseClassName;
	}

	/**
	 * @return the parameters
	 */
	public List<FunctionModuleParameter> getParameters() {
		return parameters;
	}

	/**
	 * @return the maximum parameter name length
	 */
	public int getMaxParameterNameLength() {
		return maxParameterNameLength;
	}

	/**
	 * @return the maximum java type name length
	 */
	public int getMaxJavaTypeNameLength() {
		return maxJavaTypeNameLength;
	}

	/**
	 * @return the maximum attribute name length
	 */
	public int getMaxAttributeNameLength() {
		return maxAttributeNameLength;
	}
	
}