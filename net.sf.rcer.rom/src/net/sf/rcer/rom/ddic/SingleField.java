/**
 * Copyright (c) 2008 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id: rom.genmodel 171 2009-03-06 10:46:43Z vwegert $
 *
 * $Id$
 */
package net.sf.rcer.rom.ddic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.SingleField#getReferenceTableName <em>Reference Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.SingleField#getReferenceFieldName <em>Reference Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getSingleField()
 * @model abstract="true"
 * @generated
 */
public interface SingleField extends NamedField, TableField {
	/**
	 * Returns the value of the '<em><b>Reference Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Table Name</em>' attribute.
	 * @see #setReferenceTableName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getSingleField_ReferenceTableName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getReferenceTableName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.SingleField#getReferenceTableName <em>Reference Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Table Name</em>' attribute.
	 * @see #getReferenceTableName()
	 * @generated
	 */
	void setReferenceTableName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Field Name</em>' attribute.
	 * @see #setReferenceFieldName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getSingleField_ReferenceFieldName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getReferenceFieldName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.SingleField#getReferenceFieldName <em>Reference Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Field Name</em>' attribute.
	 * @see #getReferenceFieldName()
	 * @generated
	 */
	void setReferenceFieldName(String value);

} // SingleField
