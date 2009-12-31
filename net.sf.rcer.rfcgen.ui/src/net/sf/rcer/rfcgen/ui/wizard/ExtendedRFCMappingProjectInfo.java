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

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunctionTemplate;
import com.sap.conn.jco.JCoListMetaData;
import com.sap.conn.jco.JCoRecordMetaData;
import com.sap.conn.jco.JCoRepository;

/**
 * The project information used to generate the initial model.
 * @author vwegert
 *
 */
public class ExtendedRFCMappingProjectInfo extends RFCMappingProjectInfo {

	private JCoDestination destination;
	private JCoRepository repository;

	private Collection<JCoFunctionTemplate> functionModules;
	private String packageName;
	private boolean callStyleMappingSelected;

	private Map<String, StructureInfo> structures = new TreeMap<String, StructureInfo>();
	private Map<String, FunctionModuleInfo> functions = new TreeMap<String, FunctionModuleInfo>();

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(JCoDestination destination) {
		this.destination = destination;
		try {
			this.repository = destination == null ? null : destination.getRepository();
		} catch (JCoException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @return whether a connection to a SAP R/3 system exists
	 */
	public boolean isConnected() {
		return destination != null;
	}

	/**
	 * @return the list of function modules
	 */
	public Collection<JCoFunctionTemplate> getFunctionModules() {
		return functionModules;
	}

	/**
	 * @param functionModules the list of function modules 
	 */
	public void setFunctionModules(Collection<JCoFunctionTemplate> functionModules) {
		this.functionModules = functionModules;
		readMetaData();
	}

	/**
	 * @return the package name
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the package name to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	/**
	 * @return whether to use call-style mapping
	 */
	public boolean isCallStyleMappingSelected() {
		return callStyleMappingSelected;
	}

	/**
	 * @param callStyleMappingSelected whether to use call-stype mapping
	 */
	public void setCallStyleMappingSelected(boolean callStyleMappingSelected) {
		this.callStyleMappingSelected = callStyleMappingSelected;
	}

	/**
	 * @return the list of structures to generate mappings for
	 */
	public Collection<StructureInfo> getStructures() {
		return structures.values();
	}

	/**
	 * @return the list of function modules to generate mappings for
	 */
	public Collection<FunctionModuleInfo> getFunctions() {
		return functions.values();
	}

	/**
	 * Read the meta data of all structures and function modules to be created.
	 * @throws JCoException
	 */
	private void readMetaData() {
		try {
			structures.clear();
			functions.clear();
			for (JCoFunctionTemplate function: functionModules) {
				JCoListMetaData iface = function.getFunctionInterface();
				for (int pos = 0; pos < iface.getFieldCount(); pos++) {
					if (iface.isStructure(pos)) {
						addStructure(repository.getStructureDefinition(iface.getRecordTypeName(pos)));
					} else if (iface.isTable(pos)) {
						addStructure(iface.getRecordMetaData(pos));
					}
				}
				addFunctionModule(function, iface);
			}
		} catch (JCoException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Adds a structure to the list of structures to generate.
	 * @param struct
	 */
	private void addStructure(JCoRecordMetaData struct) {
		if (!structures.containsKey(struct.getName())) {
			StructureInfo info = new StructureInfo(struct.getName(), struct.getName());
			for (int pos = 0; pos < struct.getFieldCount(); pos++) {
				String javaType = removeStandardPackages(struct.getClassNameOfField(pos));
				if (javaType.equals("Integer")) {
					javaType = "int";
				}
				info.addField(struct.getName(pos), javaType, struct.getName(pos), 
						struct.getDescription(pos) == null ? "" : struct.getDescription(pos).replaceAll("\"", "'"));
			}
			structures.put(struct.getName(), info);
		}
	}

	/**
	 * Adds a function module to the list of structures to generate.
	 * @param function
	 * @param iface
	 */
	private void addFunctionModule(JCoFunctionTemplate function, JCoListMetaData iface) {
		if (!functions.containsKey(function.getName())) {
			FunctionModuleInfo info;
			info = new FunctionModuleInfo(function.getName(), 
					function.getName() + "_Call",
					function.getName() + "_Request", function.getName() + "_Response");
			for (int pos = 0; pos < iface.getFieldCount(); pos++) {
				String javaType = "";
				if (iface.isStructure(pos) || iface.isTable(pos)) {
					javaType = structures.get(iface.getRecordTypeName(pos)).getClassName();
				} else {
					javaType = removeStandardPackages(iface.getClassNameOfField(pos));
					if (javaType.equals("Integer")) {
						javaType = "int";
					}
				}
				info.addParameter(iface.isImport(pos), iface.isExport(pos), iface.isChanging(pos), iface.isTable(pos), 
						iface.getName(pos), javaType, iface.getName(pos), 
						iface.getDescription(pos) == null ? "" : iface.getDescription(pos).replaceAll("\"", "'"), 
								iface.isStructure(pos), iface.isTable(pos)); // TODO: isTable cannot be used for importing / exporting / changing params
			}
			functions.put(function.getName(), info);
		}
	}

	/**
	 * @param className
	 * @return the name, stripped of the standard package names
	 */
	private String removeStandardPackages(String className) {
		return className.replace("java.lang.", "").replace("java.util.", "");
	}

}
