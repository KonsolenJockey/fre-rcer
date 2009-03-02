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

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.ddic.DDICFactory;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.rom.ddic.DomainValue;
import net.sf.rcer.rom.ddic.DomainValueRange;
import net.sf.rcer.rom.ddic.DomainValueSingle;

import net.sf.rcer.rom.impl.ROMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DDICPackageImpl extends EPackageImpl implements DDICPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainValueSingleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainValueRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dictionaryDataTypeEEnum = null;

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
	 * @see net.sf.rcer.rom.ddic.DDICPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DDICPackageImpl() {
		super(eNS_URI, DDICFactory.eINSTANCE);
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
	public static DDICPackage init() {
		if (isInited) return (DDICPackage)EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI);

		// Obtain or create and register package
		DDICPackageImpl theDDICPackage = (DDICPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DDICPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DDICPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ROMPackageImpl theROMPackage = (ROMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI) instanceof ROMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI) : ROMPackage.eINSTANCE);

		// Create package meta-data objects
		theDDICPackage.createPackageContents();
		theROMPackage.createPackageContents();

		// Initialize created meta-data
		theDDICPackage.initializePackageContents();
		theROMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDDICPackage.freeze();

		return theDDICPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Description() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_DictionaryDataType() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Length() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_OutputLength() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Decimals() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_CaseSensitive() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Signed() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ValueListFixed() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ValueTableName() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ConversionExit() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Values() {
		return (EReference)domainEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainValue() {
		return domainValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainValue_Domain() {
		return (EReference)domainValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainValue_Position() {
		return (EAttribute)domainValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainValue_Range() {
		return (EAttribute)domainValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainValue_Description() {
		return (EReference)domainValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainValueSingle() {
		return domainValueSingleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainValueSingle_Value() {
		return (EAttribute)domainValueSingleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainValueRange() {
		return domainValueRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainValueRange_LowerBoundary() {
		return (EAttribute)domainValueRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainValueRange_UpperBoundary() {
		return (EAttribute)domainValueRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDictionaryDataType() {
		return dictionaryDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDICFactory getDDICFactory() {
		return (DDICFactory)getEFactoryInstance();
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
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__DESCRIPTION);
		createEAttribute(domainEClass, DOMAIN__DICTIONARY_DATA_TYPE);
		createEAttribute(domainEClass, DOMAIN__LENGTH);
		createEAttribute(domainEClass, DOMAIN__OUTPUT_LENGTH);
		createEAttribute(domainEClass, DOMAIN__DECIMALS);
		createEAttribute(domainEClass, DOMAIN__CASE_SENSITIVE);
		createEAttribute(domainEClass, DOMAIN__SIGNED);
		createEAttribute(domainEClass, DOMAIN__VALUE_LIST_FIXED);
		createEAttribute(domainEClass, DOMAIN__VALUE_TABLE_NAME);
		createEAttribute(domainEClass, DOMAIN__CONVERSION_EXIT);
		createEReference(domainEClass, DOMAIN__VALUES);

		domainValueEClass = createEClass(DOMAIN_VALUE);
		createEReference(domainValueEClass, DOMAIN_VALUE__DOMAIN);
		createEAttribute(domainValueEClass, DOMAIN_VALUE__POSITION);
		createEAttribute(domainValueEClass, DOMAIN_VALUE__RANGE);
		createEReference(domainValueEClass, DOMAIN_VALUE__DESCRIPTION);

		domainValueSingleEClass = createEClass(DOMAIN_VALUE_SINGLE);
		createEAttribute(domainValueSingleEClass, DOMAIN_VALUE_SINGLE__VALUE);

		domainValueRangeEClass = createEClass(DOMAIN_VALUE_RANGE);
		createEAttribute(domainValueRangeEClass, DOMAIN_VALUE_RANGE__LOWER_BOUNDARY);
		createEAttribute(domainValueRangeEClass, DOMAIN_VALUE_RANGE__UPPER_BOUNDARY);

		// Create enums
		dictionaryDataTypeEEnum = createEEnum(DICTIONARY_DATA_TYPE);
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
		ROMPackage theROMPackage = (ROMPackage)EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		domainValueSingleEClass.getESuperTypes().add(this.getDomainValue());
		domainValueRangeEClass.getESuperTypes().add(this.getDomainValue());

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDomain_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDomain_Description().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDomain_DictionaryDataType(), this.getDictionaryDataType(), "dictionaryDataType", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_Length(), ecorePackage.getEInt(), "length", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_OutputLength(), ecorePackage.getEInt(), "outputLength", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_Decimals(), ecorePackage.getEInt(), "decimals", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_Signed(), ecorePackage.getEBoolean(), "signed", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_ValueListFixed(), ecorePackage.getEBoolean(), "valueListFixed", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_ValueTableName(), ecorePackage.getEString(), "valueTableName", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomain_ConversionExit(), ecorePackage.getEString(), "conversionExit", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDomain_Values(), this.getDomainValue(), this.getDomainValue_Domain(), "values", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getDomain_Values().getEKeys().add(this.getDomainValue_Position());

		initEClass(domainValueEClass, DomainValue.class, "DomainValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDomainValue_Domain(), this.getDomain(), this.getDomain_Values(), "domain", null, 1, 1, DomainValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomainValue_Position(), ecorePackage.getEInt(), "position", null, 1, 1, DomainValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomainValue_Range(), ecorePackage.getEBoolean(), "range", null, 1, 1, DomainValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDomainValue_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, DomainValue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDomainValue_Description().getEKeys().add(theROMPackage.getLocalizedString_Key());

		initEClass(domainValueSingleEClass, DomainValueSingle.class, "DomainValueSingle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDomainValueSingle_Value(), ecorePackage.getEString(), "value", null, 1, 1, DomainValueSingle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(domainValueRangeEClass, DomainValueRange.class, "DomainValueRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDomainValueRange_LowerBoundary(), ecorePackage.getEString(), "lowerBoundary", null, 1, 1, DomainValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDomainValueRange_UpperBoundary(), ecorePackage.getEString(), "upperBoundary", null, 1, 1, DomainValueRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(dictionaryDataTypeEEnum, DictionaryDataType.class, "DictionaryDataType"); //$NON-NLS-1$
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.ACCOUNTING_PERIOD);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.CHARACTER);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.CLIENT);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.CURRENCY_KEY);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.CURRENCY_VALUE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.DATE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.DECIMAL);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.FLOATING_POINT);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.INT_BYTE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.INT_WORD);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.INT_DWORD);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.LOCALE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.LONG_CHARACTER_SEQUENCE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.LONG_BYTE_SEQUENCE);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.NUMERICAL_CHARACTER);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.PRECISION);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.QUANTITY);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.BYTES);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.BYTE_STRING);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.SHORT_CHARACTER_STRING);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.CHARACTER_STRING);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.TIME);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.VAR_CHARACTER);
		addEEnumLiteral(dictionaryDataTypeEEnum, DictionaryDataType.UNIT);

		// Create resource
		createResource(eNS_URI);
	}

} //DDICPackageImpl
