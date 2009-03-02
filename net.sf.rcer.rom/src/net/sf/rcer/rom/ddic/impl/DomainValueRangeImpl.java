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
import net.sf.rcer.rom.ddic.DomainValueRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Value Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl#getLowerBoundary <em>Lower Boundary</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl#getUpperBoundary <em>Upper Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainValueRangeImpl extends DomainValueImpl implements DomainValueRange {
	/**
	 * The default value of the '{@link #getLowerBoundary() <em>Lower Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_BOUNDARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerBoundary() <em>Lower Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundary()
	 * @generated
	 * @ordered
	 */
	protected String lowerBoundary = LOWER_BOUNDARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBoundary() <em>Upper Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_BOUNDARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperBoundary() <em>Upper Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundary()
	 * @generated
	 * @ordered
	 */
	protected String upperBoundary = UPPER_BOUNDARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainValueRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.DOMAIN_VALUE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerBoundary() {
		return lowerBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundary(String newLowerBoundary) {
		String oldLowerBoundary = lowerBoundary;
		lowerBoundary = newLowerBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN_VALUE_RANGE__LOWER_BOUNDARY, oldLowerBoundary, lowerBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperBoundary() {
		return upperBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundary(String newUpperBoundary) {
		String oldUpperBoundary = upperBoundary;
		upperBoundary = newUpperBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN_VALUE_RANGE__UPPER_BOUNDARY, oldUpperBoundary, upperBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.DOMAIN_VALUE_RANGE__LOWER_BOUNDARY:
				return getLowerBoundary();
			case DDICPackage.DOMAIN_VALUE_RANGE__UPPER_BOUNDARY:
				return getUpperBoundary();
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
			case DDICPackage.DOMAIN_VALUE_RANGE__LOWER_BOUNDARY:
				setLowerBoundary((String)newValue);
				return;
			case DDICPackage.DOMAIN_VALUE_RANGE__UPPER_BOUNDARY:
				setUpperBoundary((String)newValue);
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
			case DDICPackage.DOMAIN_VALUE_RANGE__LOWER_BOUNDARY:
				setLowerBoundary(LOWER_BOUNDARY_EDEFAULT);
				return;
			case DDICPackage.DOMAIN_VALUE_RANGE__UPPER_BOUNDARY:
				setUpperBoundary(UPPER_BOUNDARY_EDEFAULT);
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
			case DDICPackage.DOMAIN_VALUE_RANGE__LOWER_BOUNDARY:
				return LOWER_BOUNDARY_EDEFAULT == null ? lowerBoundary != null : !LOWER_BOUNDARY_EDEFAULT.equals(lowerBoundary);
			case DDICPackage.DOMAIN_VALUE_RANGE__UPPER_BOUNDARY:
				return UPPER_BOUNDARY_EDEFAULT == null ? upperBoundary != null : !UPPER_BOUNDARY_EDEFAULT.equals(upperBoundary);
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
		result.append(" (lowerBoundary: "); //$NON-NLS-1$
		result.append(lowerBoundary);
		result.append(", upperBoundary: "); //$NON-NLS-1$
		result.append(upperBoundary);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see net.sf.rcer.rom.ddic.impl.DomainValueImpl#isRange()
	 * @generated no
	 */
	@Override
	public boolean isRange() {
		return true;
	}

} //DomainValueRangeImpl
