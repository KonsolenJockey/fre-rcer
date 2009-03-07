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
import net.sf.rcer.rom.ddic.StructureInclusion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.StructureInclusionImpl#getIncludedStructureName <em>Included Structure Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.StructureInclusionImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.StructureInclusionImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureInclusionImpl extends StructureFieldImpl implements StructureInclusion {
	/**
	 * The default value of the '{@link #getIncludedStructureName() <em>Included Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedStructureName()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDED_STRUCTURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludedStructureName() <em>Included Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedStructureName()
	 * @generated
	 * @ordered
	 */
	protected String includedStructureName = INCLUDED_STRUCTURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.STRUCTURE_INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludedStructureName() {
		return includedStructureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludedStructureName(String newIncludedStructureName) {
		String oldIncludedStructureName = includedStructureName;
		includedStructureName = newIncludedStructureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME, oldIncludedStructureName, includedStructureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.STRUCTURE_INCLUSION__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.STRUCTURE_INCLUSION__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME:
				return getIncludedStructureName();
			case DDICPackage.STRUCTURE_INCLUSION__GROUP_NAME:
				return getGroupName();
			case DDICPackage.STRUCTURE_INCLUSION__SUFFIX:
				return getSuffix();
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
			case DDICPackage.STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME:
				setIncludedStructureName((String)newValue);
				return;
			case DDICPackage.STRUCTURE_INCLUSION__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case DDICPackage.STRUCTURE_INCLUSION__SUFFIX:
				setSuffix((String)newValue);
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
			case DDICPackage.STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME:
				setIncludedStructureName(INCLUDED_STRUCTURE_NAME_EDEFAULT);
				return;
			case DDICPackage.STRUCTURE_INCLUSION__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case DDICPackage.STRUCTURE_INCLUSION__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
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
			case DDICPackage.STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME:
				return INCLUDED_STRUCTURE_NAME_EDEFAULT == null ? includedStructureName != null : !INCLUDED_STRUCTURE_NAME_EDEFAULT.equals(includedStructureName);
			case DDICPackage.STRUCTURE_INCLUSION__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case DDICPackage.STRUCTURE_INCLUSION__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
		result.append(" (includedStructureName: "); //$NON-NLS-1$
		result.append(includedStructureName);
		result.append(", groupName: "); //$NON-NLS-1$
		result.append(groupName);
		result.append(", suffix: "); //$NON-NLS-1$
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //StructureInclusionImpl
