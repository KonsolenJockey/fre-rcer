/**
 * Copyright (c) 2008 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id: rom.genmodel 171 2009-03-06 10:46:43Z vwegert $
 *
 * $Id$
 */
package net.sf.rcer.rom.impl;

import java.text.MessageFormat;

import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObjectKey;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Object Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectKeyImpl#getProgramID <em>Program ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectKeyImpl#getObjectTypeID <em>Object Type ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectKeyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryObjectKeyImpl extends EObjectImpl implements RepositoryObjectKey {
	/**
	 * The default value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramID() <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramID()
	 * @generated
	 * @ordered
	 */
	protected String programID = PROGRAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectTypeID() <em>Object Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectTypeID() <em>Object Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeID()
	 * @generated
	 * @ordered
	 */
	protected String objectTypeID = OBJECT_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryObjectKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROMPackage.Literals.REPOSITORY_OBJECT_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramID() {
		return programID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramID(String newProgramID) {
		String oldProgramID = programID;
		programID = newProgramID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT_KEY__PROGRAM_ID, oldProgramID, programID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectTypeID() {
		return objectTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeID(String newObjectTypeID) {
		String oldObjectTypeID = objectTypeID;
		objectTypeID = newObjectTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID, oldObjectTypeID, objectTypeID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT_KEY__PROGRAM_ID:
				return getProgramID();
			case ROMPackage.REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID:
				return getObjectTypeID();
			case ROMPackage.REPOSITORY_OBJECT_KEY__NAME:
				return getName();
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
			case ROMPackage.REPOSITORY_OBJECT_KEY__PROGRAM_ID:
				setProgramID((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID:
				setObjectTypeID((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_KEY__NAME:
				setName((String)newValue);
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
			case ROMPackage.REPOSITORY_OBJECT_KEY__PROGRAM_ID:
				setProgramID(PROGRAM_ID_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID:
				setObjectTypeID(OBJECT_TYPE_ID_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT_KEY__NAME:
				setName(NAME_EDEFAULT);
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
			case ROMPackage.REPOSITORY_OBJECT_KEY__PROGRAM_ID:
				return PROGRAM_ID_EDEFAULT == null ? programID != null : !PROGRAM_ID_EDEFAULT.equals(programID);
			case ROMPackage.REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID:
				return OBJECT_TYPE_ID_EDEFAULT == null ? objectTypeID != null : !OBJECT_TYPE_ID_EDEFAULT.equals(objectTypeID);
			case ROMPackage.REPOSITORY_OBJECT_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		return MessageFormat.format("{0} {1} {2}", programID, objectTypeID, name);
	}

} //RepositoryObjectKeyImpl
