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
package net.sf.rcer.rom.ddic.impl;

import java.util.Collection;

import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.ddic.TableField;
import net.sf.rcer.rom.impl.RepositoryObjectImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.TableImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.TableImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends RepositoryObjectImpl implements Table {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TableField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<TableField>(TableField.class, this, DDICPackage.TABLE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectCollection getCollection() {
		if (eContainerFeatureID != DDICPackage.TABLE__COLLECTION) return null;
		return (RepositoryObjectCollection)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDICPackage.TABLE__COLLECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, DDICPackage.TABLE__COLLECTION, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDICPackage.TABLE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DDICPackage.TABLE__COLLECTION:
				return eBasicSetContainer(null, DDICPackage.TABLE__COLLECTION, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case DDICPackage.TABLE__COLLECTION:
				return eInternalContainer().eInverseRemove(this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES, RepositoryObjectCollection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDICPackage.TABLE__FIELDS:
				return getFields();
			case DDICPackage.TABLE__COLLECTION:
				return getCollection();
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
			case DDICPackage.TABLE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends TableField>)newValue);
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
			case DDICPackage.TABLE__FIELDS:
				getFields().clear();
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
			case DDICPackage.TABLE__FIELDS:
				return fields != null && !fields.isEmpty();
			case DDICPackage.TABLE__COLLECTION:
				return getCollection() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated no
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType()
	 */
	@Override
	public RepositoryObjectType getObjectType() {
		return RepositoryObjectType.TABLE;
	}

	/**
	 * @generated no
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getProgramID()
	 */
	@Override
	public String getProgramID() {
		return "R3TR";
	}

	/**
	 * @generated no
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectTypeID()
	 */
	@Override
	public String getObjectTypeID() {
		return "TABL";
	}

} //TableImpl
