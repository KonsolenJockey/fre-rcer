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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ddic.DDICPackage
 * @generated
 */
public interface DDICFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDICFactory eINSTANCE = net.sf.rcer.rom.ddic.impl.DDICFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Domain Value Single</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Value Single</em>'.
	 * @generated
	 */
	DomainValueSingle createDomainValueSingle();

	/**
	 * Returns a new object of class '<em>Domain Value Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Value Range</em>'.
	 * @generated
	 */
	DomainValueRange createDomainValueRange();

	/**
	 * Returns a new object of class '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element</em>'.
	 * @generated
	 */
	DataElement createDataElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DDICPackage getDDICPackage();

} //DDICFactory
