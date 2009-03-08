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
package net.sf.rcer.rom.impl;

import java.util.Map;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.PackagePermittedObjectTypes;
import net.sf.rcer.rom.PackageType;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectKey;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.RepositoryPackage;
import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.impl.DDICPackageImpl;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.sap.conn.jco.JCoDestination;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ROMPackageImpl extends EPackageImpl implements ROMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryObjectKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryObjectCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repositoryObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packagePermittedObjectTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iStatusEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jCoDestinationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectNotFoundExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectLoadingExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.rcer.rom.ROMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ROMPackageImpl() {
		super(eNS_URI, ROMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ROMPackage init() {
		if (isInited) return (ROMPackage)EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI);

		// Obtain or create and register package
		ROMPackageImpl theROMPackage = (ROMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ROMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ROMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DDICPackageImpl theDDICPackage = (DDICPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI) instanceof DDICPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI) : DDICPackage.eINSTANCE);
		ABAPObjectsPackageImpl theABAPObjectsPackage = (ABAPObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI) instanceof ABAPObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI) : ABAPObjectsPackage.eINSTANCE);

		// Create package meta-data objects
		theROMPackage.createPackageContents();
		theDDICPackage.createPackageContents();
		theABAPObjectsPackage.createPackageContents();

		// Initialize created meta-data
		theROMPackage.initializePackageContents();
		theDDICPackage.initializePackageContents();
		theABAPObjectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theROMPackage.freeze();

		return theROMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedString() {
		return localizedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedString_Key() {
		return (EAttribute)localizedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalizedString_Value() {
		return (EAttribute)localizedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryObjectKey() {
		return repositoryObjectKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObjectKey_ProgramID() {
		return (EAttribute)repositoryObjectKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObjectKey_ObjectTypeID() {
		return (EAttribute)repositoryObjectKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObjectKey_Name() {
		return (EAttribute)repositoryObjectKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryObject() {
		return repositoryObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_ObjectType() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Loaded() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Name() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_SourceSystem() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Author() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryObjectCollection() {
		return repositoryObjectCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObjectCollection_SourceConnection() {
		return (EAttribute)repositoryObjectCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Packages() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Domains() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_DataElements() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Structures() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Tables() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_TableTypes() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Views() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_SeachHelps() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_EnqueueObjects() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Interfaces() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObjectCollection_Classes() {
		return (EReference)repositoryObjectCollectionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Generated() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_OriginalLocale() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_SoftwareComponent() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_ComponentRelease() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_PackageName() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepositoryPackage() {
		return repositoryPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryPackage_Description() {
		return (EReference)repositoryPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryPackage_ObjectKeys() {
		return (EReference)repositoryPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ChangeRecodingEnabled() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ResponsibleUser() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_TransportLayer() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_Namespace() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_InterfacePrefix() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_PermittedObjectTypes() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ObjectCreationRestricted() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_Type() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_CheckedAsServer() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_CheckedAsClient() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryPackage_Collection() {
		return (EReference)repositoryPackageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ObjectsLoaded() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryPackage_Objects() {
		return (EReference)repositoryPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_SubPackageNames() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepositoryObjectType() {
		return repositoryObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackageType() {
		return packageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackagePermittedObjectTypes() {
		return packagePermittedObjectTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocale() {
		return localeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIStatus() {
		return iStatusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJCoDestination() {
		return jCoDestinationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObjectNotFoundException() {
		return objectNotFoundExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObjectLoadingException() {
		return objectLoadingExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROMFactory getROMFactory() {
		return (ROMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		localizedStringEClass = createEClass(LOCALIZED_STRING);
		createEAttribute(localizedStringEClass, LOCALIZED_STRING__KEY);
		createEAttribute(localizedStringEClass, LOCALIZED_STRING__VALUE);

		repositoryObjectKeyEClass = createEClass(REPOSITORY_OBJECT_KEY);
		createEAttribute(repositoryObjectKeyEClass, REPOSITORY_OBJECT_KEY__PROGRAM_ID);
		createEAttribute(repositoryObjectKeyEClass, REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID);
		createEAttribute(repositoryObjectKeyEClass, REPOSITORY_OBJECT_KEY__NAME);

		repositoryObjectEClass = createEClass(REPOSITORY_OBJECT);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__OBJECT_TYPE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__NAME);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__LOADED);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__SOURCE_SYSTEM);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__AUTHOR);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__GENERATED);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__ORIGINAL_LOCALE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__SOFTWARE_COMPONENT);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__COMPONENT_RELEASE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__PACKAGE_NAME);

		repositoryObjectCollectionEClass = createEClass(REPOSITORY_OBJECT_COLLECTION);
		createEAttribute(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__PACKAGES);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__DOMAINS);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__STRUCTURES);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__TABLES);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__TABLE_TYPES);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__VIEWS);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__SEACH_HELPS);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__ENQUEUE_OBJECTS);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__INTERFACES);
		createEReference(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__CLASSES);

		repositoryPackageEClass = createEClass(REPOSITORY_PACKAGE);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__DESCRIPTION);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__OBJECT_KEYS);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__OBJECTS);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__RESPONSIBLE_USER);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__TRANSPORT_LAYER);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__NAMESPACE);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__INTERFACE_PREFIX);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__TYPE);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__CHECKED_AS_SERVER);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__CHECKED_AS_CLIENT);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__COLLECTION);
		createEAttribute(repositoryPackageEClass, REPOSITORY_PACKAGE__OBJECTS_LOADED);

		// Create enums
		repositoryObjectTypeEEnum = createEEnum(REPOSITORY_OBJECT_TYPE);
		packageTypeEEnum = createEEnum(PACKAGE_TYPE);
		packagePermittedObjectTypesEEnum = createEEnum(PACKAGE_PERMITTED_OBJECT_TYPES);

		// Create data types
		localeEDataType = createEDataType(LOCALE);
		iStatusEDataType = createEDataType(ISTATUS);
		jCoDestinationEDataType = createEDataType(JCO_DESTINATION);
		objectNotFoundExceptionEDataType = createEDataType(OBJECT_NOT_FOUND_EXCEPTION);
		objectLoadingExceptionEDataType = createEDataType(OBJECT_LOADING_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DDICPackage theDDICPackage = (DDICPackage)EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI);
		ABAPObjectsPackage theABAPObjectsPackage = (ABAPObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		repositoryPackageEClass.getESuperTypes().add(this.getRepositoryObject());

		// Initialize classes and features; add operations and parameters
		initEClass(localizedStringEClass, Map.Entry.class, "LocalizedString", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLocalizedString_Key(), this.getLocale(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocalizedString_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(repositoryObjectKeyEClass, RepositoryObjectKey.class, "RepositoryObjectKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRepositoryObjectKey_ProgramID(), ecorePackage.getEString(), "programID", null, 1, 1, RepositoryObjectKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObjectKey_ObjectTypeID(), ecorePackage.getEString(), "objectTypeID", null, 1, 1, RepositoryObjectKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObjectKey_Name(), ecorePackage.getEString(), "name", null, 1, 1, RepositoryObjectKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(repositoryObjectEClass, RepositoryObject.class, "RepositoryObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_ObjectType(), this.getRepositoryObjectType(), "objectType", "", 1, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_Name(), ecorePackage.getEString(), "name", "", 1, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_Loaded(), ecorePackage.getEBoolean(), "loaded", "false", 1, 1, RepositoryObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_SourceSystem(), ecorePackage.getEString(), "sourceSystem", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_Author(), ecorePackage.getEString(), "author", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_Generated(), ecorePackage.getEBoolean(), "generated", "false", 1, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_OriginalLocale(), this.getLocale(), "originalLocale", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_SoftwareComponent(), ecorePackage.getEString(), "softwareComponent", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_ComponentRelease(), ecorePackage.getEString(), "componentRelease", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(repositoryObjectEClass, this.getRepositoryObjectCollection(), "getCollection", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(repositoryObjectEClass, this.getRepositoryPackage(), "getPackage", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		addEOperation(repositoryObjectEClass, ecorePackage.getEString(), "getProgramID", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(repositoryObjectEClass, ecorePackage.getEString(), "getObjectTypeID", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(repositoryObjectEClass, this.getRepositoryObjectKey(), "getKey", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(repositoryObjectCollectionEClass, RepositoryObjectCollection.class, "RepositoryObjectCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRepositoryObjectCollection_SourceConnection(), this.getJCoDestination(), "sourceConnection", null, 0, 1, RepositoryObjectCollection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryObjectCollection_Packages(), this.getRepositoryPackage(), this.getRepositoryPackage_Collection(), "packages", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Packages().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Domains(), theDDICPackage.getDomain(), theDDICPackage.getDomain_Collection(), "domains", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Domains().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_DataElements(), theDDICPackage.getDataElement(), theDDICPackage.getDataElement_Collection(), "dataElements", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_DataElements().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Structures(), theDDICPackage.getStructure(), theDDICPackage.getStructure_Collection(), "structures", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Structures().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Tables(), theDDICPackage.getTable(), theDDICPackage.getTable_Collection(), "tables", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Tables().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_TableTypes(), theDDICPackage.getTableType(), theDDICPackage.getTableType_Collection(), "tableTypes", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_TableTypes().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Views(), theDDICPackage.getView(), theDDICPackage.getView_Collection(), "views", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Views().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_SeachHelps(), theDDICPackage.getSearchHelp(), theDDICPackage.getSearchHelp_Collection(), "seachHelps", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_SeachHelps().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_EnqueueObjects(), theDDICPackage.getEnqueueObject(), theDDICPackage.getEnqueueObject_Collection(), "enqueueObjects", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_EnqueueObjects().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Interfaces(), theABAPObjectsPackage.getABAPInterface(), null, "interfaces", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Interfaces().getEKeys().add(this.getRepositoryObject_Name());
		initEReference(getRepositoryObjectCollection_Classes(), theABAPObjectsPackage.getABAPClass(), null, "classes", null, 0, -1, RepositoryObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryObjectCollection_Classes().getEKeys().add(this.getRepositoryObject_Name());

		op = addEOperation(repositoryObjectCollectionEClass, this.getRepositoryObject(), "loadObject", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getRepositoryObjectKey(), "key", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, this.getRepositoryPackage(), "getPackage", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getDomain(), "getDomain", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getDataElement(), "getDataElement", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getStructure(), "getStructure", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getTable(), "getTable", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getTableType(), "getTableType", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getView(), "getView", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getSearchHelp(), "getSearchHelp", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theDDICPackage.getEnqueueObject(), "getEnqueueObject", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theABAPObjectsPackage.getABAPInterface(), "getABAPInterface", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		op = addEOperation(repositoryObjectCollectionEClass, theABAPObjectsPackage.getABAPClass(), "getABAPClass", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "load", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		initEClass(repositoryPackageEClass, RepositoryPackage.class, "RepositoryPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRepositoryPackage_Description(), this.getLocalizedString(), null, "description", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryPackage_ObjectKeys(), this.getRepositoryObjectKey(), null, "objectKeys", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryPackage_ObjectKeys().getEKeys().add(this.getRepositoryObjectKey_ProgramID());
		getRepositoryPackage_ObjectKeys().getEKeys().add(this.getRepositoryObjectKey_ObjectTypeID());
		getRepositoryPackage_ObjectKeys().getEKeys().add(this.getRepositoryObjectKey_Name());
		initEReference(getRepositoryPackage_Objects(), this.getRepositoryObject(), null, "objects", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryPackage_Objects().getEKeys().add(this.getRepositoryObject_ObjectType());
		getRepositoryPackage_Objects().getEKeys().add(this.getRepositoryObject_Name());
		initEAttribute(getRepositoryPackage_SubPackageNames(), ecorePackage.getEString(), "subPackageNames", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_ChangeRecodingEnabled(), ecorePackage.getEBoolean(), "changeRecodingEnabled", "true", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryPackage_ResponsibleUser(), ecorePackage.getEString(), "responsibleUser", null, 0, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_TransportLayer(), ecorePackage.getEString(), "transportLayer", null, 0, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_InterfacePrefix(), ecorePackage.getEString(), "interfacePrefix", null, 0, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_PermittedObjectTypes(), this.getPackagePermittedObjectTypes(), "permittedObjectTypes", "ALL", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryPackage_ObjectCreationRestricted(), ecorePackage.getEBoolean(), "objectCreationRestricted", "false", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryPackage_Type(), this.getPackageType(), "type", "STANDARD", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryPackage_CheckedAsServer(), ecorePackage.getEBoolean(), "checkedAsServer", "false", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryPackage_CheckedAsClient(), ecorePackage.getEBoolean(), "checkedAsClient", "false", 1, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getRepositoryPackage_Collection(), this.getRepositoryObjectCollection(), this.getRepositoryObjectCollection_Packages(), "collection", null, 0, 1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryPackage_ObjectsLoaded(), ecorePackage.getEBoolean(), "objectsLoaded", "false", 1, 1, RepositoryPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(repositoryPackageEClass, null, "loadContents", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEBoolean(), "failOnError", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getObjectNotFoundException());
		addEException(op, this.getObjectLoadingException());

		// Initialize enums and add enum literals
		initEEnum(repositoryObjectTypeEEnum, RepositoryObjectType.class, "RepositoryObjectType"); //$NON-NLS-1$
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.UNKNOWN);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.PACKAGE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.DOMAIN);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.DATA_ELEMENT);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.TABLE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.STRUCTURE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.TABLE_TYPE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.VIEW);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.SEARCH_HELP);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.ENQUEUE_OBJECT);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.INTERFACE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.CLASS);

		initEEnum(packageTypeEEnum, PackageType.class, "PackageType"); //$NON-NLS-1$
		addEEnumLiteral(packageTypeEEnum, PackageType.STANDARD);
		addEEnumLiteral(packageTypeEEnum, PackageType.MAIN);
		addEEnumLiteral(packageTypeEEnum, PackageType.STRUCTURAL);

		initEEnum(packagePermittedObjectTypesEEnum, PackagePermittedObjectTypes.class, "PackagePermittedObjectTypes"); //$NON-NLS-1$
		addEEnumLiteral(packagePermittedObjectTypesEEnum, PackagePermittedObjectTypes.ALL);
		addEEnumLiteral(packagePermittedObjectTypesEEnum, PackagePermittedObjectTypes.DESCRIPTIVE_OBJECTS_ONLY);
		addEEnumLiteral(packagePermittedObjectTypesEEnum, PackagePermittedObjectTypes.FUNCTIONAL_OBJECTS_ONLY);
		addEEnumLiteral(packagePermittedObjectTypesEEnum, PackagePermittedObjectTypes.OTR_OBJECTS_ONLY);

		// Initialize data types
		initEDataType(localeEDataType, Locale.class, "Locale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(iStatusEDataType, IStatus.class, "IStatus", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(jCoDestinationEDataType, JCoDestination.class, "JCoDestination", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(objectNotFoundExceptionEDataType, ObjectNotFoundException.class, "ObjectNotFoundException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(objectLoadingExceptionEDataType, ObjectLoadingException.class, "ObjectLoadingException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //ROMPackageImpl
