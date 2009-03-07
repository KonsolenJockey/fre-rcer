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
package net.sf.rcer.rom.abapobj;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage
 * @generated
 */
public interface ABAPObjectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ABAPObjectsFactory eINSTANCE = net.sf.rcer.rom.abapobj.impl.ABAPObjectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ABAP Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ABAP Interface</em>'.
	 * @generated
	 */
	ABAPInterface createABAPInterface();

	/**
	 * Returns a new object of class '<em>Interface Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Attribute</em>'.
	 * @generated
	 */
	InterfaceAttribute createInterfaceAttribute();

	/**
	 * Returns a new object of class '<em>Interface Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Method</em>'.
	 * @generated
	 */
	InterfaceMethod createInterfaceMethod();

	/**
	 * Returns a new object of class '<em>Interface Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Event</em>'.
	 * @generated
	 */
	InterfaceEvent createInterfaceEvent();

	/**
	 * Returns a new object of class '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter</em>'.
	 * @generated
	 */
	MethodParameter createMethodParameter();

	/**
	 * Returns a new object of class '<em>Method Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Exception</em>'.
	 * @generated
	 */
	MethodException createMethodException();

	/**
	 * Returns a new object of class '<em>Event Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Parameter</em>'.
	 * @generated
	 */
	EventParameter createEventParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ABAPObjectsPackage getABAPObjectsPackage();

} //ABAPObjectsFactory
