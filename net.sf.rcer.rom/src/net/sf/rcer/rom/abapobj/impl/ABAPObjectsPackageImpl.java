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

import net.sf.rcer.rom.ROMPackage;

import net.sf.rcer.rom.abapobj.ABAPInterface;
import net.sf.rcer.rom.abapobj.ABAPObjectsFactory;
import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.AttributeScope;
import net.sf.rcer.rom.abapobj.AttributeTypingType;
import net.sf.rcer.rom.abapobj.EventParameter;
import net.sf.rcer.rom.abapobj.InterfaceAttribute;
import net.sf.rcer.rom.abapobj.InterfaceEvent;
import net.sf.rcer.rom.abapobj.InterfaceMethod;
import net.sf.rcer.rom.abapobj.MethodException;
import net.sf.rcer.rom.abapobj.MethodParameter;
import net.sf.rcer.rom.abapobj.MethodParameterDeclarationType;
import net.sf.rcer.rom.abapobj.MethodScope;

import net.sf.rcer.rom.ddic.DDICPackage;

import net.sf.rcer.rom.ddic.impl.DDICPackageImpl;

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
public class ABAPObjectsPackageImpl extends EPackageImpl implements ABAPObjectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abapInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodParameterDeclarationTypeEEnum = null;

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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ABAPObjectsPackageImpl() {
		super(eNS_URI, ABAPObjectsFactory.eINSTANCE);
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
	public static ABAPObjectsPackage init() {
		if (isInited) return (ABAPObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(ABAPObjectsPackage.eNS_URI);

		// Obtain or create and register package
		ABAPObjectsPackageImpl theABAPObjectsPackage = (ABAPObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ABAPObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ABAPObjectsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DDICPackageImpl theDDICPackage = (DDICPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI) instanceof DDICPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDICPackage.eNS_URI) : DDICPackage.eINSTANCE);
		ROMPackageImpl theROMPackage = (ROMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI) instanceof ROMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ROMPackage.eNS_URI) : ROMPackage.eINSTANCE);

		// Create package meta-data objects
		theABAPObjectsPackage.createPackageContents();
		theDDICPackage.createPackageContents();
		theROMPackage.createPackageContents();

		// Initialize created meta-data
		theABAPObjectsPackage.initializePackageContents();
		theDDICPackage.initializePackageContents();
		theROMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theABAPObjectsPackage.freeze();

		return theABAPObjectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABAPInterface() {
		return abapInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABAPInterface_Description() {
		return (EReference)abapInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABAPInterface_Collection() {
		return (EReference)abapInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_ExitInterface() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_UnicodeChecked() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABAPInterface_Methods() {
		return (EReference)abapInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_Interfaces() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABAPInterface_Attributes() {
		return (EReference)abapInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABAPInterface_Events() {
		return (EReference)abapInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_TypePools() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_InterfaceForwardDefinitions() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABAPInterface_ClassForwardDefinitions() {
		return (EAttribute)abapInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceAttribute() {
		return interfaceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_Name() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAttribute_Description() {
		return (EReference)interfaceAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_Typing() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_TypeName() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_Scope() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_ReadOnly() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceAttribute_DefaultValue() {
		return (EAttribute)interfaceAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceMethod() {
		return interfaceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_Name() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethod_Description() {
		return (EReference)interfaceMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_Scope() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_EventHandler() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_EventClass() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_EventName() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceMethod_ClassBasedExceptions() {
		return (EAttribute)interfaceMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethod_Parameters() {
		return (EReference)interfaceMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceMethod_Exceptions() {
		return (EReference)interfaceMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceEvent() {
		return interfaceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceEvent_Name() {
		return (EAttribute)interfaceEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceEvent_Description() {
		return (EReference)interfaceEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceEvent_Scope() {
		return (EAttribute)interfaceEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceEvent_Parameters() {
		return (EReference)interfaceEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodParameter() {
		return methodParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_Name() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodParameter_Description() {
		return (EReference)methodParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_DeclarationType() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_CallByValue() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_Typing() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_TypeName() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_DefaultValue() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodParameter_Optional() {
		return (EAttribute)methodParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodException() {
		return methodExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodException_Name() {
		return (EAttribute)methodExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodException_Description() {
		return (EReference)methodExceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventParameter() {
		return eventParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventParameter_Name() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventParameter_Description() {
		return (EReference)eventParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventParameter_Typing() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventParameter_TypeName() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventParameter_DefaultValue() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventParameter_Optional() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeScope() {
		return attributeScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeTypingType() {
		return attributeTypingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodScope() {
		return methodScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodParameterDeclarationType() {
		return methodParameterDeclarationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPObjectsFactory getABAPObjectsFactory() {
		return (ABAPObjectsFactory)getEFactoryInstance();
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
		abapInterfaceEClass = createEClass(ABAP_INTERFACE);
		createEReference(abapInterfaceEClass, ABAP_INTERFACE__DESCRIPTION);
		createEReference(abapInterfaceEClass, ABAP_INTERFACE__COLLECTION);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__EXIT_INTERFACE);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__UNICODE_CHECKED);
		createEReference(abapInterfaceEClass, ABAP_INTERFACE__METHODS);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__INTERFACES);
		createEReference(abapInterfaceEClass, ABAP_INTERFACE__ATTRIBUTES);
		createEReference(abapInterfaceEClass, ABAP_INTERFACE__EVENTS);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__TYPE_POOLS);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS);
		createEAttribute(abapInterfaceEClass, ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS);

		interfaceAttributeEClass = createEClass(INTERFACE_ATTRIBUTE);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__NAME);
		createEReference(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__DESCRIPTION);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__TYPING);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__TYPE_NAME);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__SCOPE);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__READ_ONLY);
		createEAttribute(interfaceAttributeEClass, INTERFACE_ATTRIBUTE__DEFAULT_VALUE);

		interfaceMethodEClass = createEClass(INTERFACE_METHOD);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__NAME);
		createEReference(interfaceMethodEClass, INTERFACE_METHOD__DESCRIPTION);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__SCOPE);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__EVENT_HANDLER);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__EVENT_CLASS);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__EVENT_NAME);
		createEAttribute(interfaceMethodEClass, INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS);
		createEReference(interfaceMethodEClass, INTERFACE_METHOD__PARAMETERS);
		createEReference(interfaceMethodEClass, INTERFACE_METHOD__EXCEPTIONS);

		interfaceEventEClass = createEClass(INTERFACE_EVENT);
		createEAttribute(interfaceEventEClass, INTERFACE_EVENT__NAME);
		createEReference(interfaceEventEClass, INTERFACE_EVENT__DESCRIPTION);
		createEAttribute(interfaceEventEClass, INTERFACE_EVENT__SCOPE);
		createEReference(interfaceEventEClass, INTERFACE_EVENT__PARAMETERS);

		methodParameterEClass = createEClass(METHOD_PARAMETER);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__NAME);
		createEReference(methodParameterEClass, METHOD_PARAMETER__DESCRIPTION);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__DECLARATION_TYPE);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__CALL_BY_VALUE);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__TYPING);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__TYPE_NAME);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__DEFAULT_VALUE);
		createEAttribute(methodParameterEClass, METHOD_PARAMETER__OPTIONAL);

		methodExceptionEClass = createEClass(METHOD_EXCEPTION);
		createEAttribute(methodExceptionEClass, METHOD_EXCEPTION__NAME);
		createEReference(methodExceptionEClass, METHOD_EXCEPTION__DESCRIPTION);

		eventParameterEClass = createEClass(EVENT_PARAMETER);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__NAME);
		createEReference(eventParameterEClass, EVENT_PARAMETER__DESCRIPTION);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__TYPING);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__TYPE_NAME);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__DEFAULT_VALUE);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__OPTIONAL);

		// Create enums
		attributeScopeEEnum = createEEnum(ATTRIBUTE_SCOPE);
		attributeTypingTypeEEnum = createEEnum(ATTRIBUTE_TYPING_TYPE);
		methodScopeEEnum = createEEnum(METHOD_SCOPE);
		methodParameterDeclarationTypeEEnum = createEEnum(METHOD_PARAMETER_DECLARATION_TYPE);
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
		abapInterfaceEClass.getESuperTypes().add(theROMPackage.getRepositoryObject());

		// Initialize classes and features; add operations and parameters
		initEClass(abapInterfaceEClass, ABAPInterface.class, "ABAPInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getABAPInterface_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getABAPInterface_Collection(), theROMPackage.getRepositoryObjectCollection(), null, "collection", null, 0, 1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getABAPInterface_ExitInterface(), ecorePackage.getEBoolean(), "exitInterface", "false", 1, 1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getABAPInterface_UnicodeChecked(), ecorePackage.getEBoolean(), "unicodeChecked", "true", 1, 1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getABAPInterface_Methods(), this.getInterfaceMethod(), null, "methods", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getABAPInterface_Methods().getEKeys().add(this.getInterfaceMethod_Name());
		initEAttribute(getABAPInterface_Interfaces(), ecorePackage.getEString(), "interfaces", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getABAPInterface_Attributes(), this.getInterfaceAttribute(), null, "attributes", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getABAPInterface_Attributes().getEKeys().add(this.getInterfaceAttribute_Name());
		initEReference(getABAPInterface_Events(), this.getInterfaceEvent(), null, "events", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getABAPInterface_Events().getEKeys().add(this.getInterfaceEvent_Name());
		initEAttribute(getABAPInterface_TypePools(), ecorePackage.getEString(), "typePools", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getABAPInterface_InterfaceForwardDefinitions(), ecorePackage.getEString(), "interfaceForwardDefinitions", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getABAPInterface_ClassForwardDefinitions(), ecorePackage.getEString(), "classForwardDefinitions", null, 0, -1, ABAPInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceAttributeEClass, InterfaceAttribute.class, "InterfaceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInterfaceAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterfaceAttribute_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceAttribute_Typing(), this.getAttributeTypingType(), "typing", null, 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceAttribute_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceAttribute_Scope(), this.getAttributeScope(), "scope", null, 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceAttribute_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "false", 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getInterfaceAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1, InterfaceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceMethodEClass, InterfaceMethod.class, "InterfaceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterfaceMethod_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_Scope(), this.getMethodScope(), "scope", null, 1, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_EventHandler(), ecorePackage.getEBoolean(), "eventHandler", null, 1, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_EventClass(), ecorePackage.getEString(), "eventClass", null, 0, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceMethod_ClassBasedExceptions(), ecorePackage.getEBoolean(), "classBasedExceptions", null, 1, 1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterfaceMethod_Parameters(), this.getMethodParameter(), null, "parameters", null, 0, -1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getInterfaceMethod_Parameters().getEKeys().add(this.getMethodParameter_Name());
		initEReference(getInterfaceMethod_Exceptions(), this.getMethodException(), null, "exceptions", null, 0, -1, InterfaceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getInterfaceMethod_Exceptions().getEKeys().add(this.getMethodException_Name());

		initEClass(interfaceEventEClass, InterfaceEvent.class, "InterfaceEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInterfaceEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, InterfaceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterfaceEvent_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, InterfaceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInterfaceEvent_Scope(), this.getMethodScope(), "scope", null, 1, 1, InterfaceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInterfaceEvent_Parameters(), this.getEventParameter(), null, "parameters", null, 0, -1, InterfaceEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		getInterfaceEvent_Parameters().getEKeys().add(this.getEventParameter_Name());

		initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMethodParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodParameter_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParameter_DeclarationType(), this.getMethodParameterDeclarationType(), "declarationType", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParameter_CallByValue(), ecorePackage.getEBoolean(), "callByValue", "false", 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getMethodParameter_Typing(), this.getAttributeTypingType(), "typing", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParameter_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodParameter_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(methodExceptionEClass, MethodException.class, "MethodException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMethodException_Name(), ecorePackage.getEString(), "name", null, 1, 1, MethodException.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getMethodException_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, MethodException.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eventParameterEClass, EventParameter.class, "EventParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEventParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getEventParameter_Description(), theROMPackage.getLocalizedString(), null, "description", null, 0, -1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEventParameter_Typing(), this.getAttributeTypingType(), "typing", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEventParameter_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEventParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getEventParameter_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize enums and add enum literals
		initEEnum(attributeScopeEEnum, AttributeScope.class, "AttributeScope"); //$NON-NLS-1$
		addEEnumLiteral(attributeScopeEEnum, AttributeScope.INSTANCE_ATTRIBUTE);
		addEEnumLiteral(attributeScopeEEnum, AttributeScope.STATIC_ATTRIBUTE);
		addEEnumLiteral(attributeScopeEEnum, AttributeScope.CONSTANT);

		initEEnum(attributeTypingTypeEEnum, AttributeTypingType.class, "AttributeTypingType"); //$NON-NLS-1$
		addEEnumLiteral(attributeTypingTypeEEnum, AttributeTypingType.LIKE);
		addEEnumLiteral(attributeTypingTypeEEnum, AttributeTypingType.TYPE);
		addEEnumLiteral(attributeTypingTypeEEnum, AttributeTypingType.TYPE_REF_TO);
		addEEnumLiteral(attributeTypingTypeEEnum, AttributeTypingType.CODING);

		initEEnum(methodScopeEEnum, MethodScope.class, "MethodScope"); //$NON-NLS-1$
		addEEnumLiteral(methodScopeEEnum, MethodScope.INSTANCE);
		addEEnumLiteral(methodScopeEEnum, MethodScope.STATIC);

		initEEnum(methodParameterDeclarationTypeEEnum, MethodParameterDeclarationType.class, "MethodParameterDeclarationType"); //$NON-NLS-1$
		addEEnumLiteral(methodParameterDeclarationTypeEEnum, MethodParameterDeclarationType.IMPORTING);
		addEEnumLiteral(methodParameterDeclarationTypeEEnum, MethodParameterDeclarationType.EXPORTING);
		addEEnumLiteral(methodParameterDeclarationTypeEEnum, MethodParameterDeclarationType.CHANGING);
		addEEnumLiteral(methodParameterDeclarationTypeEEnum, MethodParameterDeclarationType.RETURNING);

		// Create resource
		createResource(eNS_URI);
	}

} //ABAPObjectsPackageImpl
