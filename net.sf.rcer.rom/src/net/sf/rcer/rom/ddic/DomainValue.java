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

import net.sf.rcer.conn.locales.Locale;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValue#getDomain <em>Domain</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValue#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValue#isRange <em>Range</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DomainValue#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValue()
 * @model abstract="true"
 * @generated
 */
public interface DomainValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.Domain#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValue_Domain()
	 * @see net.sf.rcer.rom.ddic.Domain#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DomainValue#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValue_Position()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DomainValue#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValue_Range()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isRange();

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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomainValue_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

} // DomainValue
