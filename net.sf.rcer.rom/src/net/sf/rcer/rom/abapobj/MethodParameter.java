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
 * A representation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#isCallByValue <em>Call By Value</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getTyping <em>Typing</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.MethodParameter#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter()
 * @model
 * @generated
 */
public interface MethodParameter extends EObject {
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#getName <em>Name</em>}' attribute.
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.abapobj.MethodParameterDeclarationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.MethodParameterDeclarationType
	 * @see #setDeclarationType(MethodParameterDeclarationType)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_DeclarationType()
	 * @model required="true"
	 * @generated
	 */
	MethodParameterDeclarationType getDeclarationType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#getDeclarationType <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.MethodParameterDeclarationType
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(MethodParameterDeclarationType value);

	/**
	 * Returns the value of the '<em><b>Call By Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call By Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call By Value</em>' attribute.
	 * @see #setCallByValue(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_CallByValue()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isCallByValue();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#isCallByValue <em>Call By Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call By Value</em>' attribute.
	 * @see #isCallByValue()
	 * @generated
	 */
	void setCallByValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Typing</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.abapobj.AttributeTypingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.AttributeTypingType
	 * @see #setTyping(AttributeTypingType)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_Typing()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeTypingType getTyping();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#getTyping <em>Typing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typing</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.AttributeTypingType
	 * @see #getTyping()
	 * @generated
	 */
	void setTyping(AttributeTypingType value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_TypeName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameter_Optional()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.MethodParameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // MethodParameter
