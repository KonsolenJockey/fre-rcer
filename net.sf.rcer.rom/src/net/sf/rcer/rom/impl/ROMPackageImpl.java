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
import net.sf.rcer.rom.IRepositoryObjectContainer;
import net.sf.rcer.rom.PackagePermittedObjectTypes;
import net.sf.rcer.rom.PackageType;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.RepositoryPackage;

import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.impl.DDICPackageImpl;
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
	private EClass iRepositoryObjectContainerEClass = null;

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

		// Create package meta-data objects
		theROMPackage.createPackageContents();
		theDDICPackage.createPackageContents();

		// Initialize created meta-data
		theROMPackage.initializePackageContents();
		theDDICPackage.initializePackageContents();

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
	public EClass getIRepositoryObjectContainer() {
		return iRepositoryObjectContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIRepositoryObjectContainer_Objects() {
		return (EReference)iRepositoryObjectContainerEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_ProgramID() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_ObjectTypeID() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Name() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_SourceSystem() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_Author() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObject_Package() {
		return (EReference)repositoryObjectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObject_Collection() {
		return (EReference)repositoryObjectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryObject_Container() {
		return (EReference)repositoryObjectEClass.getEStructuralFeatures().get(12);
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
	public EAttribute getRepositoryObject_Generated() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_OriginalLocale() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_SoftwareComponent() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_ComponentRelease() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryObject_PackageName() {
		return (EAttribute)repositoryObjectEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getRepositoryPackage_ChangeRecodingEnabled() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ResponsibleUser() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_TransportLayer() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_Namespace() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_InterfacePrefix() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_PermittedObjectTypes() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_ObjectCreationRestricted() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_Type() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_CheckedAsServer() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepositoryPackage_CheckedAsClient() {
		return (EAttribute)repositoryPackageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepositoryPackage_SubPackages() {
		return (EReference)repositoryPackageEClass.getEStructuralFeatures().get(1);
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

		iRepositoryObjectContainerEClass = createEClass(IREPOSITORY_OBJECT_CONTAINER);
		createEReference(iRepositoryObjectContainerEClass, IREPOSITORY_OBJECT_CONTAINER__OBJECTS);

		repositoryObjectEClass = createEClass(REPOSITORY_OBJECT);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__OBJECT_TYPE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__LOADED);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__PROGRAM_ID);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__OBJECT_TYPE_ID);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__NAME);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__SOURCE_SYSTEM);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__AUTHOR);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__GENERATED);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__ORIGINAL_LOCALE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__SOFTWARE_COMPONENT);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__COMPONENT_RELEASE);
		createEAttribute(repositoryObjectEClass, REPOSITORY_OBJECT__PACKAGE_NAME);
		createEReference(repositoryObjectEClass, REPOSITORY_OBJECT__CONTAINER);
		createEReference(repositoryObjectEClass, REPOSITORY_OBJECT__PACKAGE);
		createEReference(repositoryObjectEClass, REPOSITORY_OBJECT__COLLECTION);

		repositoryObjectCollectionEClass = createEClass(REPOSITORY_OBJECT_COLLECTION);
		createEAttribute(repositoryObjectCollectionEClass, REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION);

		repositoryPackageEClass = createEClass(REPOSITORY_PACKAGE);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__DESCRIPTION);
		createEReference(repositoryPackageEClass, REPOSITORY_PACKAGE__SUB_PACKAGES);
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

		// Create enums
		repositoryObjectTypeEEnum = createEEnum(REPOSITORY_OBJECT_TYPE);
		packageTypeEEnum = createEEnum(PACKAGE_TYPE);
		packagePermittedObjectTypesEEnum = createEEnum(PACKAGE_PERMITTED_OBJECT_TYPES);

		// Create data types
		localeEDataType = createEDataType(LOCALE);
		iStatusEDataType = createEDataType(ISTATUS);
		jCoDestinationEDataType = createEDataType(JCO_DESTINATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		repositoryObjectCollectionEClass.getESuperTypes().add(this.getIRepositoryObjectContainer());
		repositoryPackageEClass.getESuperTypes().add(this.getRepositoryObject());
		repositoryPackageEClass.getESuperTypes().add(this.getIRepositoryObjectContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(localizedStringEClass, Map.Entry.class, "LocalizedString", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLocalizedString_Key(), this.getLocale(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getLocalizedString_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iRepositoryObjectContainerEClass, IRepositoryObjectContainer.class, "IRepositoryObjectContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIRepositoryObjectContainer_Objects(), this.getRepositoryObject(), this.getRepositoryObject_Container(), "objects", null, 0, -1, IRepositoryObjectContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getIRepositoryObjectContainer_Objects().getEKeys().add(this.getRepositoryObject_ObjectType());
		getIRepositoryObjectContainer_Objects().getEKeys().add(this.getRepositoryObject_Name());

		initEClass(repositoryObjectEClass, RepositoryObject.class, "RepositoryObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_ObjectType(), this.getRepositoryObjectType(), "objectType", "", 1, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_Loaded(), ecorePackage.getEBoolean(), "loaded", "false", 1, 1, RepositoryObject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_ProgramID(), ecorePackage.getEString(), "programID", "", 1, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_ObjectTypeID(), ecorePackage.getEString(), "objectTypeID", "", 1, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_Name(), ecorePackage.getEString(), "name", "", 1, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_SourceSystem(), ecorePackage.getEString(), "sourceSystem", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_Author(), ecorePackage.getEString(), "author", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_Generated(), ecorePackage.getEBoolean(), "generated", "false", 1, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getRepositoryObject_OriginalLocale(), this.getLocale(), "originalLocale", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_SoftwareComponent(), ecorePackage.getEString(), "softwareComponent", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_ComponentRelease(), ecorePackage.getEString(), "componentRelease", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRepositoryObject_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, RepositoryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryObject_Container(), this.getIRepositoryObjectContainer(), this.getIRepositoryObjectContainer_Objects(), "container", null, 0, 1, RepositoryObject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryObject_Package(), this.getRepositoryPackage(), null, "package", null, 0, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryObject_Collection(), this.getRepositoryObjectCollection(), null, "collection", null, 0, 1, RepositoryObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		addEOperation(repositoryObjectEClass, this.getIStatus(), "load", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(repositoryObjectCollectionEClass, RepositoryObjectCollection.class, "RepositoryObjectCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRepositoryObjectCollection_SourceConnection(), this.getJCoDestination(), "sourceConnection", null, 0, 1, RepositoryObjectCollection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(repositoryObjectCollectionEClass, this.getRepositoryPackage(), "getPackage", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, !IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(repositoryPackageEClass, RepositoryPackage.class, "RepositoryPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRepositoryPackage_Description(), this.getLocalizedString(), null, "description", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRepositoryPackage_SubPackages(), this.getRepositoryPackage(), null, "subPackages", null, 0, -1, RepositoryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getRepositoryPackage_SubPackages().getEKeys().add(this.getRepositoryObject_Name());
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

		// Initialize enums and add enum literals
		initEEnum(repositoryObjectTypeEEnum, RepositoryObjectType.class, "RepositoryObjectType"); //$NON-NLS-1$
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.UNKNOWN);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.PACKAGE);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.DOMAIN);
		addEEnumLiteral(repositoryObjectTypeEEnum, RepositoryObjectType.DATA_ELEMENT);

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

		// Create resource
		createResource(eNS_URI);
	}

} //ROMPackageImpl
