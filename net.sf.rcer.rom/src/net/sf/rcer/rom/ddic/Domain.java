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

import net.sf.rcer.rom.RepositoryObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getOutputLength <em>Output Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#isSigned <em>Signed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#isValueListFixed <em>Value List Fixed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getValueTableName <em>Value Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getConversionExit <em>Conversion Exit</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Domain#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends RepositoryObject {
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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_Description()
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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_DictionaryDataType()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DictionaryDataType getDictionaryDataType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getDictionaryDataType <em>Dictionary Data Type</em>}' attribute.
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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_Length()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Length</em>' attribute.
	 * @see #setOutputLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_OutputLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getOutputLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getOutputLength <em>Output Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Length</em>' attribute.
	 * @see #getOutputLength()
	 * @generated
	 */
	void setOutputLength(int value);

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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_Decimals()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getDecimals();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
	void setDecimals(int value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_CaseSensitive()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isCaseSensitive();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed</em>' attribute.
	 * @see #setSigned(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_Signed()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#isSigned <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed</em>' attribute.
	 * @see #isSigned()
	 * @generated
	 */
	void setSigned(boolean value);

	/**
	 * Returns the value of the '<em><b>Value List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value List Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value List Fixed</em>' attribute.
	 * @see #setValueListFixed(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_ValueListFixed()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isValueListFixed();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#isValueListFixed <em>Value List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List Fixed</em>' attribute.
	 * @see #isValueListFixed()
	 * @generated
	 */
	void setValueListFixed(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Table Name</em>' attribute.
	 * @see #setValueTableName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_ValueTableName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getValueTableName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getValueTableName <em>Value Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Table Name</em>' attribute.
	 * @see #getValueTableName()
	 * @generated
	 */
	void setValueTableName(String value);

	/**
	 * Returns the value of the '<em><b>Conversion Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Exit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Exit</em>' attribute.
	 * @see #setConversionExit(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_ConversionExit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getConversionExit();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.Domain#getConversionExit <em>Conversion Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Exit</em>' attribute.
	 * @see #getConversionExit()
	 * @generated
	 */
	void setConversionExit(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.DomainValue}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.DomainValue#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDomain_Values()
	 * @see net.sf.rcer.rom.ddic.DomainValue#getDomain
	 * @model opposite="domain" containment="true" keys="position"
	 * @generated
	 */
	EList<DomainValue> getValues();

} // Domain
