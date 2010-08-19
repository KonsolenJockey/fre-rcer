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
package net.sf.rcer.rom.ddic.impl;

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl;
import net.sf.rcer.rom.ddic.DDICFactory;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.DataElementField;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.DirectField;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.rom.ddic.DomainValue;
import net.sf.rcer.rom.ddic.DomainValueRange;
import net.sf.rcer.rom.ddic.DomainValueSingle;

import net.sf.rcer.rom.ddic.EnqueueObject;
import net.sf.rcer.rom.ddic.NamedField;
import net.sf.rcer.rom.ddic.ReferredObjectType;
import net.sf.rcer.rom.ddic.SearchHelp;
import net.sf.rcer.rom.ddic.SingleField;
import net.sf.rcer.rom.ddic.Structure;
import net.sf.rcer.rom.ddic.StructureField;
import net.sf.rcer.rom.ddic.StructureInclusion;
import net.sf.rcer.rom.ddic.StructuredField;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.ddic.TableField;
import net.sf.rcer.rom.ddic.TableType;
import net.sf.rcer.rom.ddic.TabularField;
import net.sf.rcer.rom.ddic.TypeKind;
import net.sf.rcer.rom.ddic.View;
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
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabularFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchHelpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enqueueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dictionaryDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referredObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeKindEEnum = null;

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
		ABAPObjectsPackageImpl theABAPObjectsPackage = (ABAPObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI) instanceof ABAPObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI) : ABAPObjectsPackage.eINSTANCE);

		// Create package meta-data objects
		theDDICPackage.createPackageContents();
		theROMPackage.createPackageContents();
		theABAPObjectsPackage.createPackageContents();

		// Initialize created meta-data
		theDDICPackage.initializePackageContents();
		theROMPackage.initializePackageContents();
		theABAPObjectsPackage.initializePackageContents();

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
	public EReference getDomain_Collection() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Description() {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_DictionaryDataType() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Length() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_OutputLength() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Decimals() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_CaseSensitive() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Signed() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ValueListFixed() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ValueTableName() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ConversionExit() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Values() {
		return (EReference)domainEClass.getEStructuralFeatures().get(11);
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
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Collection() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Description() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Heading() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_MaxHeadingLength() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_ShortText() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_MaxShortTextLength() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_MediumText() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_MaxMediumTextLength() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_LongText() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_MaxLongTextLength() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_TypeName() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ParameterID() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Logged() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ValueHelpName() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ValueHelpFieldName() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_DefaultFieldName() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_DictionaryDataType() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Length() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_OutputLength() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Decimals() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_CaseSensitive() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Signed() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ValueListFixed() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ValueTableName() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ConversionExit() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_TypeKind() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_ReferredType() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Fields() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Collection() {
		return (EReference)structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Fields() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Collection() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureField() {
		return structureFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableField() {
		return tableFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedField() {
		return namedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedField_Name() {
		return (EAttribute)namedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureInclusion() {
		return structureInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureInclusion_IncludedStructureName() {
		return (EAttribute)structureInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureInclusion_GroupName() {
		return (EAttribute)structureInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureInclusion_Suffix() {
		return (EAttribute)structureInclusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleField() {
		return singleFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleField_ReferenceTableName() {
		return (EAttribute)singleFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleField_ReferenceFieldName() {
		return (EAttribute)singleFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementField() {
		return dataElementFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElementField_DataElementName() {
		return (EAttribute)dataElementFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElementField_SearchHelpName() {
		return (EAttribute)dataElementFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElementField_SearchHelpField() {
		return (EAttribute)dataElementFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectField() {
		return directFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectField_Description() {
		return (EReference)directFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectField_DictionaryDataType() {
		return (EAttribute)directFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectField_Length() {
		return (EAttribute)directFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectField_Decimals() {
		return (EAttribute)directFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredField() {
		return structuredFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredField_StructureName() {
		return (EAttribute)structuredFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabularField() {
		return tabularFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabularField_TableTypeName() {
		return (EAttribute)tabularFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Collection() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Collection() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchHelp() {
		return searchHelpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchHelp_Collection() {
		return (EReference)searchHelpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnqueueObject() {
		return enqueueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnqueueObject_Collection() {
		return (EReference)enqueueObjectEClass.getEStructuralFeatures().get(0);
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
	public EEnum getReferredObjectType() {
		return referredObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeKind() {
		return typeKindEEnum;
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
		createEReference(domainEClass, DOMAIN__COLLECTION);
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

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__COLLECTION);
		createEReference(dataElementEClass, DATA_ELEMENT__DESCRIPTION);
		createEReference(dataElementEClass, DATA_ELEMENT__HEADING);
		createEAttribute(dataElementEClass, DATA_ELEMENT__MAX_HEADING_LENGTH);
		createEReference(dataElementEClass, DATA_ELEMENT__SHORT_TEXT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH);
		createEReference(dataElementEClass, DATA_ELEMENT__MEDIUM_TEXT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH);
		createEReference(dataElementEClass, DATA_ELEMENT__LONG_TEXT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__MAX_LONG_TEXT_LENGTH);
		createEAttribute(dataElementEClass, DATA_ELEMENT__TYPE_NAME);
		createEAttribute(dataElementEClass, DATA_ELEMENT__PARAMETER_ID);
		createEAttribute(dataElementEClass, DATA_ELEMENT__LOGGED);
		createEAttribute(dataElementEClass, DATA_ELEMENT__VALUE_HELP_NAME);
		createEAttribute(dataElementEClass, DATA_ELEMENT__VALUE_HELP_FIELD_NAME);
		createEAttribute(dataElementEClass, DATA_ELEMENT__DEFAULT_FIELD_NAME);
		createEAttribute(dataElementEClass, DATA_ELEMENT__DICTIONARY_DATA_TYPE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__LENGTH);
		createEAttribute(dataElementEClass, DATA_ELEMENT__OUTPUT_LENGTH);
		createEAttribute(dataElementEClass, DATA_ELEMENT__DECIMALS);
		createEAttribute(dataElementEClass, DATA_ELEMENT__CASE_SENSITIVE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__SIGNED);
		createEAttribute(dataElementEClass, DATA_ELEMENT__VALUE_LIST_FIXED);
		createEAttribute(dataElementEClass, DATA_ELEMENT__VALUE_TABLE_NAME);
		createEAttribute(dataElementEClass, DATA_ELEMENT__CONVERSION_EXIT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__TYPE_KIND);
		createEAttribute(dataElementEClass, DATA_ELEMENT__REFERRED_TYPE);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__FIELDS);
		createEReference(structureEClass, STRUCTURE__COLLECTION);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__FIELDS);
		createEReference(tableEClass, TABLE__COLLECTION);

		structureFieldEClass = createEClass(STRUCTURE_FIELD);

		tableFieldEClass = createEClass(TABLE_FIELD);

		namedFieldEClass = createEClass(NAMED_FIELD);
		createEAttribute(namedFieldEClass, NAMED_FIELD__NAME);

		structureInclusionEClass = createEClass(STRUCTURE_INCLUSION);
		createEAttribute(structureInclusionEClass, STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME);
		createEAttribute(structureInclusionEClass, STRUCTURE_INCLUSION__GROUP_NAME);
		createEAttribute(structureInclusionEClass, STRUCTURE_INCLUSION__SUFFIX);

		singleFieldEClass = createEClass(SINGLE_FIELD);
		createEAttribute(singleFieldEClass, SINGLE_FIELD__REFERENCE_TABLE_NAME);
		createEAttribute(singleFieldEClass, SINGLE_FIELD__REFERENCE_FIELD_NAME);

		dataElementFieldEClass = createEClass(DATA_ELEMENT_FIELD);
		createEAttribute(dataElementFieldEClass, DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME);
		createEAttribute(dataElementFieldEClass, DATA_ELEMENT_FIELD__SEARCH_HELP_NAME);
		createEAttribute(dataElementFieldEClass, DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD);

		directFieldEClass = createEClass(DIRECT_FIELD);
		createEReference(directFieldEClass, DIRECT_FIELD__DESCRIPTION);
		createEAttribute(directFieldEClass, DIRECT_FIELD__DICTIONARY_DATA_TYPE);
		createEAttribute(directFieldEClass, DIRECT_FIELD__LENGTH);
		createEAttribute(directFieldEClass, DIRECT_FIELD__DECIMALS);

		structuredFieldEClass = createEClass(STRUCTURED_FIELD);
		createEAttribute(structuredFieldEClass, STRUCTURED_FIELD__STRUCTURE_NAME);

		tabularFieldEClass = createEClass(TABULAR_FIELD);
		createEAttribute(tabularFieldEClass, TABULAR_FIELD__TABLE_TYPE_NAME);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__COLLECTION);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__COLLECTION);

		searchHelpEClass = createEClass(SEARCH_HELP);
		createEReference(searchHelpEClass, SEARCH_HELP__COLLECTION);

		enqueueObjectEClass = createEClass(ENQUEUE_OBJECT);
		createEReference(enqueueObjectEClass, ENQUEUE_OBJECT__COLLECTION);

		// Create enums
		dictionaryDataTypeEEnum = createEEnum(DICTIONARY_DATA_TYPE);
		referredObjectTypeEEnum = createEEnum(REFERRED_OBJECT_TYPE);
		typeKindEEnum = createEEnum(TYPE_KIND);
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
		dataElementEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		structureEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		tableEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		namedFieldEClass.getESuperTypes().add(this.getStructureField());
		structureInclusionEClass.getESuperTypes().add(this.getStructureField());
		structureInclusionEClass.getESuperTypes().add(this.getTableField());
		singleFieldEClass.getESuperTypes().add(this.getNamedField());
		singleFieldEClass.getESuperTypes().add(this.getTableField());
		dataElementFieldEClass.getESuperTypes().add(this.getSingleField());
		directFieldEClass.getESuperTypes().add(this.getSingleField());
		structuredFieldEClass.getESuperTypes().add(this.getNamedField());
		tabularFieldEClass.getESuperTypes().add(this.getNamedField());
		tableTypeEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		viewEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		searchHelpEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());
		enqueueObjectEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDomain_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_Domains(), "collection", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
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

		initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDataElement_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_DataElements(), "collection", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataElement_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDataElement_Description().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEReference(getDataElement_Heading(), theROMPackage.getLocalizedString(), null, "heading", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDataElement_Heading().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDataElement_MaxHeadingLength(), ecorePackage.getEInt(), "maxHeadingLength", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataElement_ShortText(), theROMPackage.getLocalizedString(), null, "shortText", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDataElement_ShortText().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDataElement_MaxShortTextLength(), ecorePackage.getEInt(), "maxShortTextLength", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataElement_MediumText(), theROMPackage.getLocalizedString(), null, "mediumText", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDataElement_MediumText().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDataElement_MaxMediumTextLength(), ecorePackage.getEInt(), "maxMediumTextLength", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataElement_LongText(), theROMPackage.getLocalizedString(), null, "longText", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDataElement_LongText().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDataElement_MaxLongTextLength(), ecorePackage.getEInt(), "maxLongTextLength", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ParameterID(), ecorePackage.getEString(), "parameterID", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Logged(), ecorePackage.getEBoolean(), "logged", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ValueHelpName(), ecorePackage.getEString(), "valueHelpName", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ValueHelpFieldName(), ecorePackage.getEString(), "valueHelpFieldName", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_DefaultFieldName(), ecorePackage.getEString(), "defaultFieldName", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_DictionaryDataType(), this.getDictionaryDataType(), "dictionaryDataType", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Length(), ecorePackage.getEInt(), "length", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_OutputLength(), ecorePackage.getEInt(), "outputLength", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Decimals(), ecorePackage.getEInt(), "decimals", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_CaseSensitive(), ecorePackage.getEBoolean(), "caseSensitive", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Signed(), ecorePackage.getEBoolean(), "signed", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ValueListFixed(), ecorePackage.getEBoolean(), "valueListFixed", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ValueTableName(), ecorePackage.getEString(), "valueTableName", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ConversionExit(), ecorePackage.getEString(), "conversionExit", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_TypeKind(), this.getTypeKind(), "typeKind", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_ReferredType(), this.getReferredObjectType(), "referredType", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStructure_Fields(), this.getStructureField(), null, "fields", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStructure_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_Structures(), "collection", null, 0, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTable_Fields(), this.getTableField(), null, "fields", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTable_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_Tables(), "collection", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(structureFieldEClass, StructureField.class, "StructureField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(tableFieldEClass, TableField.class, "TableField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(namedFieldEClass, NamedField.class, "NamedField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNamedField_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(structureInclusionEClass, StructureInclusion.class, "StructureInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStructureInclusion_IncludedStructureName(), ecorePackage.getEString(), "includedStructureName", null, 1, 1, StructureInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStructureInclusion_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, StructureInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStructureInclusion_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, StructureInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(singleFieldEClass, SingleField.class, "SingleField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSingleField_ReferenceTableName(), ecorePackage.getEString(), "referenceTableName", null, 0, 1, SingleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getSingleField_ReferenceFieldName(), ecorePackage.getEString(), "referenceFieldName", null, 0, 1, SingleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(dataElementFieldEClass, DataElementField.class, "DataElementField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDataElementField_DataElementName(), ecorePackage.getEString(), "dataElementName", null, 1, 1, DataElementField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElementField_SearchHelpName(), ecorePackage.getEString(), "searchHelpName", null, 0, 1, DataElementField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElementField_SearchHelpField(), ecorePackage.getEString(), "searchHelpField", null, 0, 1, DataElementField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(directFieldEClass, DirectField.class, "DirectField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDirectField_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, DirectField.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		getDirectField_Description().getEKeys().add(theROMPackage.getLocalizedString_Key());
		initEAttribute(getDirectField_DictionaryDataType(), this.getDictionaryDataType(), "dictionaryDataType", null, 0, 1, DirectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDirectField_Length(), ecorePackage.getEInt(), "length", null, 1, 1, DirectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDirectField_Decimals(), ecorePackage.getEInt(), "decimals", null, 1, 1, DirectField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(structuredFieldEClass, StructuredField.class, "StructuredField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStructuredField_StructureName(), ecorePackage.getEString(), "structureName", null, 1, 1, StructuredField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(tabularFieldEClass, TabularField.class, "TabularField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTabularField_TableTypeName(), ecorePackage.getEString(), "tableTypeName", null, 1, 1, TabularField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTableType_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_TableTypes(), "collection", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getView_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_Views(), "collection", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(searchHelpEClass, SearchHelp.class, "SearchHelp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSearchHelp_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_SeachHelps(), "collection", null, 0, 1, SearchHelp.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(enqueueObjectEClass, EnqueueObject.class, "EnqueueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnqueueObject_Collection(), theROMPackage.getRepositoryObjectCollection(), theROMPackage.getRepositoryObjectCollection_EnqueueObjects(), "collection", null, 0, 1, EnqueueObject.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

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

		initEEnum(referredObjectTypeEEnum, ReferredObjectType.class, "ReferredObjectType"); //$NON-NLS-1$
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.UNKNOWN);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.ANY);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.OBJECT);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.DATA);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.DICTIONARY_TYPE);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.DATA_ELEMENT);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.STRUCTURE);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.TABLE_TYPE);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.CLASS);
		addEEnumLiteral(referredObjectTypeEEnum, ReferredObjectType.INTERFACE);

		initEEnum(typeKindEEnum, TypeKind.class, "TypeKind"); //$NON-NLS-1$
		addEEnumLiteral(typeKindEEnum, TypeKind.DICTIONARY_TYPE);
		addEEnumLiteral(typeKindEEnum, TypeKind.BUILT_IN_TYPE);
		addEEnumLiteral(typeKindEEnum, TypeKind.STRUCTURE);
		addEEnumLiteral(typeKindEEnum, TypeKind.TABLE_TYPE);
		addEEnumLiteral(typeKindEEnum, TypeKind.REFERENCE);
		addEEnumLiteral(typeKindEEnum, TypeKind.DOMAIN);

		// Create resource
		createResource(eNS_URI);
	}

} //DDICPackageImpl
