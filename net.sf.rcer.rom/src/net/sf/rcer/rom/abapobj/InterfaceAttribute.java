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

import net.sf.rcer.conn.locales.Locale;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTyping <em>Typing</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getScope <em>Scope</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute()
 * @model
 * @generated
 */
public interface InterfaceAttribute extends EObject {
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getName <em>Name</em>}' attribute.
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_Typing()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeTypingType getTyping();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTyping <em>Typing</em>}' attribute.
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_TypeName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.abapobj.AttributeScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.AttributeScope
	 * @see #setScope(AttributeScope)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_Scope()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	AttributeScope getScope();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.AttributeScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(AttributeScope value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_ReadOnly()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getInterfaceAttribute_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // InterfaceAttribute
