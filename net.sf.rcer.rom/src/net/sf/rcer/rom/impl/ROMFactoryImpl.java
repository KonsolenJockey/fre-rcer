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
package net.sf.rcer.rom.impl;

import java.util.Map;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.*;

import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ROMFactoryImpl extends EFactoryImpl implements ROMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ROMFactory init() {
		try {
			ROMFactory theROMFactory = (ROMFactory)EPackage.Registry.INSTANCE.getEFactory(ROMPackage.eNS_URI);
			if (theROMFactory != null) {
				return theROMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ROMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ROMPackage.LOCALIZED_STRING: return (EObject)createLocalizedString();
			case ROMPackage.REPOSITORY_OBJECT_KEY: return createRepositoryObjectKey();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION: return createRepositoryObjectCollection();
			case ROMPackage.REPOSITORY_PACKAGE: return createRepositoryPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ROMPackage.REPOSITORY_OBJECT_TYPE:
				return createRepositoryObjectTypeFromString(eDataType, initialValue);
			case ROMPackage.PACKAGE_TYPE:
				return createPackageTypeFromString(eDataType, initialValue);
			case ROMPackage.PACKAGE_PERMITTED_OBJECT_TYPES:
				return createPackagePermittedObjectTypesFromString(eDataType, initialValue);
			case ROMPackage.LOCALE:
				return createLocaleFromString(eDataType, initialValue);
			case ROMPackage.OBJECT_NOT_FOUND_EXCEPTION:
				return createObjectNotFoundExceptionFromString(eDataType, initialValue);
			case ROMPackage.OBJECT_LOADING_EXCEPTION:
				return createObjectLoadingExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ROMPackage.REPOSITORY_OBJECT_TYPE:
				return convertRepositoryObjectTypeToString(eDataType, instanceValue);
			case ROMPackage.PACKAGE_TYPE:
				return convertPackageTypeToString(eDataType, instanceValue);
			case ROMPackage.PACKAGE_PERMITTED_OBJECT_TYPES:
				return convertPackagePermittedObjectTypesToString(eDataType, instanceValue);
			case ROMPackage.LOCALE:
				return convertLocaleToString(eDataType, instanceValue);
			case ROMPackage.OBJECT_NOT_FOUND_EXCEPTION:
				return convertObjectNotFoundExceptionToString(eDataType, instanceValue);
			case ROMPackage.OBJECT_LOADING_EXCEPTION:
				return convertObjectLoadingExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Locale, String> createLocalizedString() {
		LocalizedStringImpl localizedString = new LocalizedStringImpl();
		return localizedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectKey createRepositoryObjectKey() {
		RepositoryObjectKeyImpl repositoryObjectKey = new RepositoryObjectKeyImpl();
		return repositoryObjectKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectCollection createRepositoryObjectCollection() {
		RepositoryObjectCollectionImpl repositoryObjectCollection = new RepositoryObjectCollectionImpl();
		return repositoryObjectCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryPackage createRepositoryPackage() {
		RepositoryPackageImpl repositoryPackage = new RepositoryPackageImpl();
		return repositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectType createRepositoryObjectTypeFromString(EDataType eDataType, String initialValue) {
		RepositoryObjectType result = RepositoryObjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepositoryObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType createPackageTypeFromString(EDataType eDataType, String initialValue) {
		PackageType result = PackageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagePermittedObjectTypes createPackagePermittedObjectTypesFromString(EDataType eDataType, String initialValue) {
		PackagePermittedObjectTypes result = PackagePermittedObjectTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackagePermittedObjectTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale createLocaleFromString(EDataType eDataType, String initialValue) {
		return (Locale)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNotFoundException createObjectNotFoundExceptionFromString(EDataType eDataType, String initialValue) {
		return (ObjectNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNotFoundExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectLoadingException createObjectLoadingExceptionFromString(EDataType eDataType, String initialValue) {
		return (ObjectLoadingException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectLoadingExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROMPackage getROMPackage() {
		return (ROMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ROMPackage getPackage() {
		return ROMPackage.eINSTANCE;
	}

} //ROMFactoryImpl
