/**
 * Copyright (c) 2008 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id$
 *
 * $Id$
 */
package net.sf.rcer.rom.ddic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabular Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.TabularField#getTableTypeName <em>Table Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getTabularField()
 * @model
 * @generated
 */
public interface TabularField extends NamedField {
	/**
	 * Returns the value of the '<em><b>Table Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type Name</em>' attribute.
	 * @see #setTableTypeName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getTabularField_TableTypeName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTableTypeName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.TabularField#getTableTypeName <em>Table Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type Name</em>' attribute.
	 * @see #getTableTypeName()
	 * @generated
	 */
	void setTableTypeName(String value);

} // TabularField
