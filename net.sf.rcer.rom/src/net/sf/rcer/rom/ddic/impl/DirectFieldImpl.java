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
package net.sf.rcer.rom.ddic.impl;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.DirectField;

import net.sf.rcer.rom.impl.LocalizedStringImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl#getDecimals <em>Decimals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectFieldImpl extends SingleFieldImpl implements DirectField {
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
	 * The default value of the '{@link #getDictionaryDataType() <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DictionaryDataType DICTIONARY_DATA_TYPE_EDEFAULT = DictionaryDataType.ACCOUNTING_PERIOD;

	/**
	 * The cached value of the '{@link #getDictionaryDataType() <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDataType()
	 * @generated
	 * @ordered
	 */
	protected DictionaryDataType dictionaryDataType = DICTIONARY_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected int decimals = DECIMALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.DIRECT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DIRECT_FIELD__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryDataType getDictionaryDataType() {
		return dictionaryDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryDataType(DictionaryDataType newDictionaryDataType) {
		DictionaryDataType oldDictionaryDataType = dictionaryDataType;
		dictionaryDataType = newDictionaryDataType == null ? DICTIONARY_DATA_TYPE_EDEFAULT : newDictionaryDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DIRECT_FIELD__DICTIONARY_DATA_TYPE, oldDictionaryDataType, dictionaryDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DIRECT_FIELD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimals() {
		return decimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimals(int newDecimals) {
		int oldDecimals = decimals;
		decimals = newDecimals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DIRECT_FIELD__DECIMALS, oldDecimals, decimals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDICPackage.DIRECT_FIELD__DESCRIPTION:
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
			case DDICPackage.DIRECT_FIELD__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case DDICPackage.DIRECT_FIELD__DICTIONARY_DATA_TYPE:
				return getDictionaryDataType();
			case DDICPackage.DIRECT_FIELD__LENGTH:
				return getLength();
			case DDICPackage.DIRECT_FIELD__DECIMALS:
				return getDecimals();
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
			case DDICPackage.DIRECT_FIELD__DICTIONARY_DATA_TYPE:
				setDictionaryDataType((DictionaryDataType)newValue);
				return;
			case DDICPackage.DIRECT_FIELD__LENGTH:
				setLength((Integer)newValue);
				return;
			case DDICPackage.DIRECT_FIELD__DECIMALS:
				setDecimals((Integer)newValue);
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
			case DDICPackage.DIRECT_FIELD__DICTIONARY_DATA_TYPE:
				setDictionaryDataType(DICTIONARY_DATA_TYPE_EDEFAULT);
				return;
			case DDICPackage.DIRECT_FIELD__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DDICPackage.DIRECT_FIELD__DECIMALS:
				setDecimals(DECIMALS_EDEFAULT);
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
			case DDICPackage.DIRECT_FIELD__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DDICPackage.DIRECT_FIELD__DICTIONARY_DATA_TYPE:
				return dictionaryDataType != DICTIONARY_DATA_TYPE_EDEFAULT;
			case DDICPackage.DIRECT_FIELD__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DDICPackage.DIRECT_FIELD__DECIMALS:
				return decimals != DECIMALS_EDEFAULT;
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
		result.append(" (dictionaryDataType: "); //$NON-NLS-1$
		result.append(dictionaryDataType);
		result.append(", length: "); //$NON-NLS-1$
		result.append(length);
		result.append(", decimals: "); //$NON-NLS-1$
		result.append(decimals);
		result.append(')');
		return result.toString();
	}

} //DirectFieldImpl
