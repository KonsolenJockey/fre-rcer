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
package net.sf.rcer.rom.abapobj.impl;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.AttributeScope;
import net.sf.rcer.rom.abapobj.AttributeTypingType;
import net.sf.rcer.rom.abapobj.InterfaceAttribute;

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
 * An implementation of the model object '<em><b>Interface Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getTyping <em>Typing</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceAttributeImpl extends EObjectImpl implements InterfaceAttribute {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeScope SCOPE_EDEFAULT = AttributeScope.INSTANCE_ATTRIBUTE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected AttributeScope scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.INTERFACE_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DESCRIPTION);
		}
		return description;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPING, oldTyping, typing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(AttributeScope newScope) {
		AttributeScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DESCRIPTION:
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
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__NAME:
				return getName();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPING:
				return getTyping();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPE_NAME:
				return getTypeName();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__SCOPE:
				return getScope();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__READ_ONLY:
				return isReadOnly();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
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
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPING:
				setTyping((AttributeTypingType)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__SCOPE:
				setScope((AttributeScope)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPING:
				setTyping(TYPING_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPING:
				return typing != TYPING_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(", typing: "); //$NON-NLS-1$
		result.append(typing);
		result.append(", typeName: "); //$NON-NLS-1$
		result.append(typeName);
		result.append(", scope: "); //$NON-NLS-1$
		result.append(scope);
		result.append(", readOnly: "); //$NON-NLS-1$
		result.append(readOnly);
		result.append(", defaultValue: "); //$NON-NLS-1$
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //InterfaceAttributeImpl
