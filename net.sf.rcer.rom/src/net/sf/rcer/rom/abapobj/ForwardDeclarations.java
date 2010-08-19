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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Declarations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getTypePools <em>Type Pools</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getInterfaceForwardDefinitions <em>Interface Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getClassForwardDefinitions <em>Class Forward Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getForwardDeclarations()
 * @model abstract="true"
 * @generated
 */
public interface ForwardDeclarations extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Pools</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pools</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pools</em>' attribute list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getForwardDeclarations_TypePools()
	 * @model
	 * @generated
	 */
	EList<String> getTypePools();

	/**
	 * Returns the value of the '<em><b>Interface Forward Definitions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Forward Definitions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Forward Definitions</em>' attribute list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getForwardDeclarations_InterfaceForwardDefinitions()
	 * @model
	 * @generated
	 */
	EList<String> getInterfaceForwardDefinitions();

	/**
	 * Returns the value of the '<em><b>Class Forward Definitions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Forward Definitions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Forward Definitions</em>' attribute list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getForwardDeclarations_ClassForwardDefinitions()
	 * @model
	 * @generated
	 */
	EList<String> getClassForwardDefinitions();

} // ForwardDeclarations
