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
 * A representation of the model object '<em><b>Structured Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.StructuredField#getStructureName <em>Structure Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructuredField()
 * @model
 * @generated
 */
public interface StructuredField extends NamedField {
	/**
	 * Returns the value of the '<em><b>Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Name</em>' attribute.
	 * @see #setStructureName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructuredField_StructureName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getStructureName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.StructuredField#getStructureName <em>Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Name</em>' attribute.
	 * @see #getStructureName()
	 * @generated
	 */
	void setStructureName(String value);

} // StructuredField
