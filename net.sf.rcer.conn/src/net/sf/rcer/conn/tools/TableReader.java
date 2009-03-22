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
package net.sf.rcer.conn.tools;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.rcer.conn.Messages;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoFunctionTemplate;
import com.sap.conn.jco.JCoTable;

/**
 * An encapsulation of the function module RFC_READ_TABLE that allows access to SAP R/3 database tables.
 * @author vwegert
 *
 */
public class TableReader {

	private JCoDestination destination;
	private String tableName;
	private JCoFunctionTemplate template;
	private List<String> selectedFields = new ArrayList<String>();
	private TableStructure structure;

	/**
	 * Default constructor.
	 * @param destination the RFC destination to use to obtain the table structure and contents
	 * @param tableName the name of the database table
	 * @throws JCoException 
	 */
	public TableReader(JCoDestination destination, String tableName) throws JCoException {
		super();
		this.destination = destination;
		this.tableName = tableName;
		this.template = destination.getRepository().getFunctionTemplate("RFC_READ_TABLE"); //$NON-NLS-1$
		loadStructure();
	}

	/**
	 * @return the name of the table
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @return the structure of the table
	 */
	public ITableStructure getStructure() {
		return structure;
	}
	
	/**
	 * Resets the list of selected fields so that no field is selected for retrieval.
	 */
	public void clearFieldSelection() {
		selectedFields.clear();
	}

	/**
	 * Adds a field to the list of fields to retrieve.
	 * @param fieldName the name of the field to add
	 * @throws FieldNotFoundException
	 */
	public void addField(String fieldName) throws FieldNotFoundException { 
		structure.getField(fieldName); // to ensure that the field exists
		selectedFields.add(fieldName);
	}

	/**
	 * Adds a field to the list of fields to retrieve.
	 * @param field the descriptor of the field to add
	 * @throws FieldNotFoundException 
	 */
	public void addField(ITableField field) throws FieldNotFoundException {
		structure.getField(field.getFieldName()); // to ensure that the field exists
		selectedFields.add(field.getFieldName());
	}
	
	/**
	 * Executes RFC_READ_TABLE with a set of selection criteria specified as strings. 
	 * @param selectionCriteria
	 * @return the contents read
	 * @throws JCoException
	 */
	public ITableContents read(String ... selectionCriteria) throws JCoException {
		JCoFunction readFunction = template.getFunction();
		readFunction.getImportParameterList().setValue("QUERY_TABLE", tableName); //$NON-NLS-1$

		JCoTable options = readFunction.getTableParameterList().getTable("OPTIONS"); //$NON-NLS-1$
		options.clear();
		if (selectionCriteria != null) {
			for (final String criterion: selectionCriteria) {
				if (criterion.length() > 72) {
					throw new IllegalArgumentException(Messages.TableReader_SelectionCriteriaTooLong);
				}
				options.appendRow();
				options.setValue("TEXT", criterion); //$NON-NLS-1$
			}
		}

		setFieldList(readFunction);
		readFunction.execute(destination);
		return new TableContents(tableName, 
				readFunction.getTableParameterList().getTable("FIELDS"),  //$NON-NLS-1$
				readFunction.getTableParameterList().getTable("DATA")); //$NON-NLS-1$
	}

	/**
	 * Executes RFC_READ_TABLE with a set of selection criteria specified as strings. 
	 * @param selectionCriteria
	 * @return the contents read
	 * @throws JCoException 
	 */
	public ITableContents read(Collection<String> selectionCriteria) throws JCoException {

		JCoFunction readFunction = template.getFunction();
		readFunction.getImportParameterList().setValue("QUERY_TABLE", tableName); //$NON-NLS-1$

		JCoTable options = readFunction.getTableParameterList().getTable("OPTIONS"); //$NON-NLS-1$
		options.clear();
		if (selectionCriteria != null) {
			for (final String criterion: selectionCriteria) {
				if (criterion.length() > 72) {
					throw new IllegalArgumentException(Messages.TableReader_SelectionCriteriaTooLong);
				}
				options.appendRow();
				options.setValue("TEXT", criterion); //$NON-NLS-1$
			}
		}

		setFieldList(readFunction);
		readFunction.execute(destination);
		return new TableContents(tableName, 
				readFunction.getTableParameterList().getTable("FIELDS"),  //$NON-NLS-1$
				readFunction.getTableParameterList().getTable("DATA")); //$NON-NLS-1$

	}

	/**
	 * Executes RFC_READ_TABLE with the current set of selected fields and a single selection criterion. 
	 * @param criterion the selection criterion
	 * @return the contents read
	 * @throws JCoException 
	 */
	public ITableContents read(String criterion) throws JCoException {

		if ((criterion != null) && (criterion.length() > 72)) {
			throw new IllegalArgumentException(Messages.TableReader_SelectionCriteriaTooLong);
		}

		JCoFunction readFunction = template.getFunction();
		readFunction.getImportParameterList().setValue("QUERY_TABLE", tableName); //$NON-NLS-1$

		JCoTable options = readFunction.getTableParameterList().getTable("OPTIONS"); //$NON-NLS-1$
		options.clear();
		if ((criterion != null) && (criterion.length() > 0)) {
			options.appendRow();
			options.setValue("TEXT", criterion); //$NON-NLS-1$
		}

		setFieldList(readFunction);
		readFunction.execute(destination);
		return new TableContents(tableName, 
				readFunction.getTableParameterList().getTable("FIELDS"),  //$NON-NLS-1$
				readFunction.getTableParameterList().getTable("DATA")); //$NON-NLS-1$
	}

	/**
	 * Executes RFC_READ_TABLE with the current set of selected fields but without selection criteria. 
	 * @return the contents read
	 * @throws JCoException 
	 */
	public ITableContents read() throws JCoException {
		JCoFunction readFunction = template.getFunction();
		readFunction.getImportParameterList().setValue("QUERY_TABLE", tableName); //$NON-NLS-1$
		readFunction.getTableParameterList().getTable("OPTIONS").clear(); //$NON-NLS-1$
		setFieldList(readFunction);
		readFunction.execute(destination);
		return new TableContents(tableName, 
				readFunction.getTableParameterList().getTable("FIELDS"),  //$NON-NLS-1$
				readFunction.getTableParameterList().getTable("DATA")); //$NON-NLS-1$
	}

	/**
	 * Adjusts the field list so that only the selected fields are read.
	 * @param readFunction
	 */
	private void setFieldList(JCoFunction readFunction) {
		int length = 0;
		JCoTable fields = readFunction.getTableParameterList().getTable("FIELDS"); //$NON-NLS-1$
		fields.clear();
		if (selectedFields.isEmpty()) {
			for (final ITableField field: structure.getFieldList()) {
				length += field.getLength();
				fields.appendRow();
				fields.setValue("FIELDNAME", field.getFieldName());				 //$NON-NLS-1$
			}
		} else {
			for (final String field: selectedFields) {
				try {
					length += structure.getField(field).getLength();
					fields.appendRow();
					fields.setValue("FIELDNAME", field); //$NON-NLS-1$
				} catch (FieldNotFoundException e) {
					throw new IllegalArgumentException(MessageFormat.format(Messages.TableReader_UnknownField, field), e);
				}
			}
		}
		if (length > 512) {
			throw new IllegalArgumentException(Messages.TableReader_ResultTooLong);
		}
	}

	/**
	 * Retrieves the table structure from the SAP R/3 system.
	 * @throws JCoException 
	 */
	private void loadStructure() throws JCoException {
		// call RFC_READ_TABLE without requesting any data
		JCoFunction readFieldListFunction = template.getFunction();
		readFieldListFunction.getImportParameterList().setValue("QUERY_TABLE", tableName); //$NON-NLS-1$
		readFieldListFunction.getImportParameterList().setValue("NO_DATA", tableName); //$NON-NLS-1$
		readFieldListFunction.execute(destination);
		structure = new TableStructure(tableName, readFieldListFunction.getTableParameterList().getTable("FIELDS")); //$NON-NLS-1$
	}

}
