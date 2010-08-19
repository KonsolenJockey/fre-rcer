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
package net.sf.rcer.rom.ddic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Value Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValueRange#getLowerBoundary <em>Lower Boundary</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValueRange#getUpperBoundary <em>Upper Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValueRange()
 * @model
 * @generated
 */
public interface DomainValueRange extends DomainValue {
	/**
	 * Returns the value of the '<em><b>Lower Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Boundary</em>' attribute.
	 * @see #setLowerBoundary(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValueRange_LowerBoundary()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLowerBoundary();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DomainValueRange#getLowerBoundary <em>Lower Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Boundary</em>' attribute.
	 * @see #getLowerBoundary()
	 * @generated
	 */
	void setLowerBoundary(String value);

	/**
	 * Returns the value of the '<em><b>Upper Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Boundary</em>' attribute.
	 * @see #setUpperBoundary(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValueRange_UpperBoundary()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUpperBoundary();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DomainValueRange#getUpperBoundary <em>Upper Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Boundary</em>' attribute.
	 * @see #getUpperBoundary()
	 * @generated
	 */
	void setUpperBoundary(String value);

} // DomainValueRange
