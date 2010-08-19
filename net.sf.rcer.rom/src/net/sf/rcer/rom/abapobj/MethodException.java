/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
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
package net.sf.rcer.rom.abapobj;

import net.sf.rcer.conn.locales.Locale;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodException#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodException#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodException()
 * @model
 * @generated
 */
public interface MethodException extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodException_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodException#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' map.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodException_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

} // MethodException
