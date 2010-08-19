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

import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.TabularField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabular Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.TabularFieldImpl#getTableTypeName <em>Table Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabularFieldImpl extends NamedFieldImpl implements TabularField {
	/**
	 * The default value of the '{@link #getTableTypeName() <em>Table Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableTypeName() <em>Table Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableTypeName()
	 * @generated
	 * @ordered
	 */
	protected String tableTypeName = TABLE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabularFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.TABULAR_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableTypeName() {
		return tableTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableTypeName(String newTableTypeName) {
		String oldTableTypeName = tableTypeName;
		tableTypeName = newTableTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.TABULAR_FIELD__TABLE_TYPE_NAME, oldTableTypeName, tableTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.TABULAR_FIELD__TABLE_TYPE_NAME:
				return getTableTypeName();
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
			case DDICPackage.TABULAR_FIELD__TABLE_TYPE_NAME:
				setTableTypeName((String)newValue);
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
			case DDICPackage.TABULAR_FIELD__TABLE_TYPE_NAME:
				setTableTypeName(TABLE_TYPE_NAME_EDEFAULT);
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
			case DDICPackage.TABULAR_FIELD__TABLE_TYPE_NAME:
				return TABLE_TYPE_NAME_EDEFAULT == null ? tableTypeName != null : !TABLE_TYPE_NAME_EDEFAULT.equals(tableTypeName);
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
		result.append(" (tableTypeName: "); //$NON-NLS-1$
		result.append(tableTypeName);
		result.append(')');
		return result.toString();
	}

} //TabularFieldImpl
