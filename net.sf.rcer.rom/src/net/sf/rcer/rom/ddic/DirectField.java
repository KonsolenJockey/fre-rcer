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

import net.sf.rcer.conn.locales.Locale;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.DirectField#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DirectField#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DirectField#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DirectField#getDecimals <em>Decimals</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDirectField()
 * @model
 * @generated
 */
public interface DirectField extends SingleField {
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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDirectField_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

	/**
	 * Returns the value of the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.ddic.DictionaryDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Data Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see #setDictionaryDataType(DictionaryDataType)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDirectField_DictionaryDataType()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DictionaryDataType getDictionaryDataType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DirectField#getDictionaryDataType <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Data Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see #getDictionaryDataType()
	 * @generated
	 */
	void setDictionaryDataType(DictionaryDataType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDirectField_Length()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DirectField#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimals</em>' attribute.
	 * @see #setDecimals(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDirectField_Decimals()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getDecimals();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DirectField#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
	void setDecimals(int value);

} // DirectField
