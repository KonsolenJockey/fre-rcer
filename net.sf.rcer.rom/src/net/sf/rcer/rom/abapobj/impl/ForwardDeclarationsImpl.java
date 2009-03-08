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

import java.util.Collection;

import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.ForwardDeclarations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward Declarations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl#getTypePools <em>Type Pools</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl#getInterfaceForwardDefinitions <em>Interface Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl#getClassForwardDefinitions <em>Class Forward Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ForwardDeclarationsImpl extends EObjectImpl implements ForwardDeclarations {
	/**
	 * The cached value of the '{@link #getTypePools() <em>Type Pools</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePools()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typePools;

	/**
	 * The cached value of the '{@link #getInterfaceForwardDefinitions() <em>Interface Forward Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceForwardDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interfaceForwardDefinitions;

	/**
	 * The cached value of the '{@link #getClassForwardDefinitions() <em>Class Forward Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassForwardDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classForwardDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardDeclarationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.FORWARD_DECLARATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypePools() {
		if (typePools == null) {
			typePools = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS);
		}
		return typePools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInterfaceForwardDefinitions() {
		if (interfaceForwardDefinitions == null) {
			interfaceForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS);
		}
		return interfaceForwardDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassForwardDefinitions() {
		if (classForwardDefinitions == null) {
			classForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS);
		}
		return classForwardDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS:
				return getTypePools();
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS:
				return getInterfaceForwardDefinitions();
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS:
				return getClassForwardDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS:
				getTypePools().clear();
				getTypePools().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				getInterfaceForwardDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
				getClassForwardDefinitions().addAll((Collection<? extends String>)newValue);
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
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS:
				getTypePools().clear();
				return;
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				return;
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
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
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS:
				return typePools != null && !typePools.isEmpty();
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS:
				return interfaceForwardDefinitions != null && !interfaceForwardDefinitions.isEmpty();
			case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS:
				return classForwardDefinitions != null && !classForwardDefinitions.isEmpty();
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
		result.append(" (typePools: "); //$NON-NLS-1$
		result.append(typePools);
		result.append(", interfaceForwardDefinitions: "); //$NON-NLS-1$
		result.append(interfaceForwardDefinitions);
		result.append(", classForwardDefinitions: "); //$NON-NLS-1$
		result.append(classForwardDefinitions);
		result.append(')');
		return result.toString();
	}

} //ForwardDeclarationsImpl
