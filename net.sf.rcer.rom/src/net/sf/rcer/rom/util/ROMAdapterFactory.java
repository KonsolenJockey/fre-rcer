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
package net.sf.rcer.rom.util;

import java.util.Map;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ROMPackage
 * @generated
 */
public class ROMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ROMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ROMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROMSwitch<Adapter> modelSwitch =
		new ROMSwitch<Adapter>() {
			@Override
			public Adapter caseLocalizedString(Map.Entry<Locale, String> object) {
				return createLocalizedStringAdapter();
			}
			@Override
			public Adapter caseRepositoryObjectKey(RepositoryObjectKey object) {
				return createRepositoryObjectKeyAdapter();
			}
			@Override
			public Adapter caseRepositoryObject(RepositoryObject object) {
				return createRepositoryObjectAdapter();
			}
			@Override
			public Adapter caseRepositoryObjectCollection(RepositoryObjectCollection object) {
				return createRepositoryObjectCollectionAdapter();
			}
			@Override
			public Adapter caseRepositoryPackage(RepositoryPackage object) {
				return createRepositoryPackageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createLocalizedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.RepositoryObjectKey <em>Repository Object Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.RepositoryObjectKey
	 * @generated
	 */
	public Adapter createRepositoryObjectKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.RepositoryObject <em>Repository Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.RepositoryObject
	 * @generated
	 */
	public Adapter createRepositoryObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.RepositoryObjectCollection <em>Repository Object Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection
	 * @generated
	 */
	public Adapter createRepositoryObjectCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.RepositoryPackage <em>Repository Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.RepositoryPackage
	 * @generated
	 */
	public Adapter createRepositoryPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ROMAdapterFactory
