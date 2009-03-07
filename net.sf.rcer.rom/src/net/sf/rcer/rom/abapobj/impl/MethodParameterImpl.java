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
package net.sf.rcer.rom.abapobj.impl;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.AttributeTypingType;
import net.sf.rcer.rom.abapobj.MethodParameter;
import net.sf.rcer.rom.abapobj.MethodParameterDeclarationType;

import net.sf.rcer.rom.impl.LocalizedStringImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#isCallByValue <em>Call By Value</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getTyping <em>Typing</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodParameterImpl extends EObjectImpl implements MethodParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> description;

	/**
	 * The default value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final MethodParameterDeclarationType DECLARATION_TYPE_EDEFAULT = MethodParameterDeclarationType.IMPORTING;

	/**
	 * The cached value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected MethodParameterDeclarationType declarationType = DECLARATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallByValue() <em>Call By Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallByValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_BY_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallByValue() <em>Call By Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallByValue()
	 * @generated
	 * @ordered
	 */
	protected boolean callByValue = CALL_BY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTyping() <em>Typing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyping()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeTypingType TYPING_EDEFAULT = AttributeTypingType.LIKE;

	/**
	 * The cached value of the '{@link #getTyping() <em>Typing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyping()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypingType typing = TYPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.METHOD_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ABAPObjectsPackage.METHOD_PARAMETER__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameterDeclarationType getDeclarationType() {
		return declarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationType(MethodParameterDeclarationType newDeclarationType) {
		MethodParameterDeclarationType oldDeclarationType = declarationType;
		declarationType = newDeclarationType == null ? DECLARATION_TYPE_EDEFAULT : newDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__DECLARATION_TYPE, oldDeclarationType, declarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallByValue() {
		return callByValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallByValue(boolean newCallByValue) {
		boolean oldCallByValue = callByValue;
		callByValue = newCallByValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__CALL_BY_VALUE, oldCallByValue, callByValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypingType getTyping() {
		return typing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyping(AttributeTypingType newTyping) {
		AttributeTypingType oldTyping = typing;
		typing = newTyping == null ? TYPING_EDEFAULT : newTyping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__TYPING, oldTyping, typing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.METHOD_PARAMETER__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ABAPObjectsPackage.METHOD_PARAMETER__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ABAPObjectsPackage.METHOD_PARAMETER__NAME:
				return getName();
			case ABAPObjectsPackage.METHOD_PARAMETER__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ABAPObjectsPackage.METHOD_PARAMETER__DECLARATION_TYPE:
				return getDeclarationType();
			case ABAPObjectsPackage.METHOD_PARAMETER__CALL_BY_VALUE:
				return isCallByValue() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPING:
				return getTyping();
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPE_NAME:
				return getTypeName();
			case ABAPObjectsPackage.METHOD_PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case ABAPObjectsPackage.METHOD_PARAMETER__OPTIONAL:
				return isOptional() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ABAPObjectsPackage.METHOD_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__DECLARATION_TYPE:
				setDeclarationType((MethodParameterDeclarationType)newValue);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__CALL_BY_VALUE:
				setCallByValue(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPING:
				setTyping((AttributeTypingType)newValue);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__OPTIONAL:
				setOptional(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ABAPObjectsPackage.METHOD_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__DECLARATION_TYPE:
				setDeclarationType(DECLARATION_TYPE_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__CALL_BY_VALUE:
				setCallByValue(CALL_BY_VALUE_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPING:
				setTyping(TYPING_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ABAPObjectsPackage.METHOD_PARAMETER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ABAPObjectsPackage.METHOD_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ABAPObjectsPackage.METHOD_PARAMETER__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ABAPObjectsPackage.METHOD_PARAMETER__DECLARATION_TYPE:
				return declarationType != DECLARATION_TYPE_EDEFAULT;
			case ABAPObjectsPackage.METHOD_PARAMETER__CALL_BY_VALUE:
				return callByValue != CALL_BY_VALUE_EDEFAULT;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPING:
				return typing != TYPING_EDEFAULT;
			case ABAPObjectsPackage.METHOD_PARAMETER__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ABAPObjectsPackage.METHOD_PARAMETER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ABAPObjectsPackage.METHOD_PARAMETER__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", declarationType: "); //$NON-NLS-1$
		result.append(declarationType);
		result.append(", callByValue: "); //$NON-NLS-1$
		result.append(callByValue);
		result.append(", typing: "); //$NON-NLS-1$
		result.append(typing);
		result.append(", typeName: "); //$NON-NLS-1$
		result.append(typeName);
		result.append(", defaultValue: "); //$NON-NLS-1$
		result.append(defaultValue);
		result.append(", optional: "); //$NON-NLS-1$
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //MethodParameterImpl
