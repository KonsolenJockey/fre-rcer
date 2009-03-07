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
package net.sf.rcer.rom.ddic.impl;

import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.SingleField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.SingleFieldImpl#getReferenceTableName <em>Reference Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.SingleFieldImpl#getReferenceFieldName <em>Reference Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SingleFieldImpl extends NamedFieldImpl implements SingleField {
	/**
	 * The default value of the '{@link #getReferenceTableName() <em>Reference Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceTableName() <em>Reference Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTableName()
	 * @generated
	 * @ordered
	 */
	protected String referenceTableName = REFERENCE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceFieldName() <em>Reference Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceFieldName() <em>Reference Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFieldName()
	 * @generated
	 * @ordered
	 */
	protected String referenceFieldName = REFERENCE_FIELD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.SINGLE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceTableName() {
		return referenceTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceTableName(String newReferenceTableName) {
		String oldReferenceTableName = referenceTableName;
		referenceTableName = newReferenceTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.SINGLE_FIELD__REFERENCE_TABLE_NAME, oldReferenceTableName, referenceTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceFieldName() {
		return referenceFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFieldName(String newReferenceFieldName) {
		String oldReferenceFieldName = referenceFieldName;
		referenceFieldName = newReferenceFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.SINGLE_FIELD__REFERENCE_FIELD_NAME, oldReferenceFieldName, referenceFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.SINGLE_FIELD__REFERENCE_TABLE_NAME:
				return getReferenceTableName();
			case DDICPackage.SINGLE_FIELD__REFERENCE_FIELD_NAME:
				return getReferenceFieldName();
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
			case DDICPackage.SINGLE_FIELD__REFERENCE_TABLE_NAME:
				setReferenceTableName((String)newValue);
				return;
			case DDICPackage.SINGLE_FIELD__REFERENCE_FIELD_NAME:
				setReferenceFieldName((String)newValue);
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
			case DDICPackage.SINGLE_FIELD__REFERENCE_TABLE_NAME:
				setReferenceTableName(REFERENCE_TABLE_NAME_EDEFAULT);
				return;
			case DDICPackage.SINGLE_FIELD__REFERENCE_FIELD_NAME:
				setReferenceFieldName(REFERENCE_FIELD_NAME_EDEFAULT);
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
			case DDICPackage.SINGLE_FIELD__REFERENCE_TABLE_NAME:
				return REFERENCE_TABLE_NAME_EDEFAULT == null ? referenceTableName != null : !REFERENCE_TABLE_NAME_EDEFAULT.equals(referenceTableName);
			case DDICPackage.SINGLE_FIELD__REFERENCE_FIELD_NAME:
				return REFERENCE_FIELD_NAME_EDEFAULT == null ? referenceFieldName != null : !REFERENCE_FIELD_NAME_EDEFAULT.equals(referenceFieldName);
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
		result.append(" (referenceTableName: "); //$NON-NLS-1$
		result.append(referenceTableName);
		result.append(", referenceFieldName: "); //$NON-NLS-1$
		result.append(referenceFieldName);
		result.append(')');
		return result.toString();
	}

} //SingleFieldImpl
