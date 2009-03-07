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
import net.sf.rcer.rom.ddic.DataElementField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementFieldImpl#getDataElementName <em>Data Element Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementFieldImpl#getSearchHelpName <em>Search Help Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementFieldImpl#getSearchHelpField <em>Search Help Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataElementFieldImpl extends SingleFieldImpl implements DataElementField {
	/**
	 * The default value of the '{@link #getDataElementName() <em>Data Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataElementName() <em>Data Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElementName()
	 * @generated
	 * @ordered
	 */
	protected String dataElementName = DATA_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchHelpName() <em>Search Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchHelpName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_HELP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchHelpName() <em>Search Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchHelpName()
	 * @generated
	 * @ordered
	 */
	protected String searchHelpName = SEARCH_HELP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchHelpField() <em>Search Help Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchHelpField()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_HELP_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchHelpField() <em>Search Help Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchHelpField()
	 * @generated
	 * @ordered
	 */
	protected String searchHelpField = SEARCH_HELP_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.DATA_ELEMENT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataElementName() {
		return dataElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElementName(String newDataElementName) {
		String oldDataElementName = dataElementName;
		dataElementName = newDataElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME, oldDataElementName, dataElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchHelpName() {
		return searchHelpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchHelpName(String newSearchHelpName) {
		String oldSearchHelpName = searchHelpName;
		searchHelpName = newSearchHelpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_NAME, oldSearchHelpName, searchHelpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearchHelpField() {
		return searchHelpField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchHelpField(String newSearchHelpField) {
		String oldSearchHelpField = searchHelpField;
		searchHelpField = newSearchHelpField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD, oldSearchHelpField, searchHelpField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME:
				return getDataElementName();
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_NAME:
				return getSearchHelpName();
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD:
				return getSearchHelpField();
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
			case DDICPackage.DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME:
				setDataElementName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_NAME:
				setSearchHelpName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD:
				setSearchHelpField((String)newValue);
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
			case DDICPackage.DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME:
				setDataElementName(DATA_ELEMENT_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_NAME:
				setSearchHelpName(SEARCH_HELP_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD:
				setSearchHelpField(SEARCH_HELP_FIELD_EDEFAULT);
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
			case DDICPackage.DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME:
				return DATA_ELEMENT_NAME_EDEFAULT == null ? dataElementName != null : !DATA_ELEMENT_NAME_EDEFAULT.equals(dataElementName);
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_NAME:
				return SEARCH_HELP_NAME_EDEFAULT == null ? searchHelpName != null : !SEARCH_HELP_NAME_EDEFAULT.equals(searchHelpName);
			case DDICPackage.DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD:
				return SEARCH_HELP_FIELD_EDEFAULT == null ? searchHelpField != null : !SEARCH_HELP_FIELD_EDEFAULT.equals(searchHelpField);
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
		result.append(" (dataElementName: "); //$NON-NLS-1$
		result.append(dataElementName);
		result.append(", searchHelpName: "); //$NON-NLS-1$
		result.append(searchHelpName);
		result.append(", searchHelpField: "); //$NON-NLS-1$
		result.append(searchHelpField);
		result.append(')');
		return result.toString();
	}

} //DataElementFieldImpl
