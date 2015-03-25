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
package net.sf.rcer.rom.abapobj.impl;

import net.sf.rcer.rom.abapobj.*;

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
public class ABAPObjectsFactoryImpl extends EFactoryImpl implements ABAPObjectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ABAPObjectsFactory init() {
		try {
			ABAPObjectsFactory theABAPObjectsFactory = (ABAPObjectsFactory)EPackage.Registry.INSTANCE.getEFactory(ABAPObjectsPackage.eNS_URI);
			if (theABAPObjectsFactory != null) {
				return theABAPObjectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ABAPObjectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPObjectsFactoryImpl() {
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
			case ABAPObjectsPackage.ABAP_INTERFACE: return createABAPInterface();
			case ABAPObjectsPackage.INTERFACE_ATTRIBUTE: return createInterfaceAttribute();
			case ABAPObjectsPackage.CLASS_ATTRIBUTE: return createClassAttribute();
			case ABAPObjectsPackage.INTERFACE_METHOD: return createInterfaceMethod();
			case ABAPObjectsPackage.CLASS_METHOD: return createClassMethod();
			case ABAPObjectsPackage.INTERFACE_EVENT: return createInterfaceEvent();
			case ABAPObjectsPackage.CLASS_EVENT: return createClassEvent();
			case ABAPObjectsPackage.METHOD_PARAMETER: return createMethodParameter();
			case ABAPObjectsPackage.METHOD_EXCEPTION: return createMethodException();
			case ABAPObjectsPackage.EVENT_PARAMETER: return createEventParameter();
			case ABAPObjectsPackage.ABAP_CLASS: return createABAPClass();
			case ABAPObjectsPackage.INTERFACE_IMPLEMENTATION: return createInterfaceImplementation();
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
			case ABAPObjectsPackage.ATTRIBUTE_SCOPE:
				return createAttributeScopeFromString(eDataType, initialValue);
			case ABAPObjectsPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case ABAPObjectsPackage.ATTRIBUTE_TYPING_TYPE:
				return createAttributeTypingTypeFromString(eDataType, initialValue);
			case ABAPObjectsPackage.METHOD_SCOPE:
				return createMethodScopeFromString(eDataType, initialValue);
			case ABAPObjectsPackage.METHOD_PARAMETER_DECLARATION_TYPE:
				return createMethodParameterDeclarationTypeFromString(eDataType, initialValue);
			case ABAPObjectsPackage.CLASS_CREATION_SCOPE:
				return createClassCreationScopeFromString(eDataType, initialValue);
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
			case ABAPObjectsPackage.ATTRIBUTE_SCOPE:
				return convertAttributeScopeToString(eDataType, instanceValue);
			case ABAPObjectsPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case ABAPObjectsPackage.ATTRIBUTE_TYPING_TYPE:
				return convertAttributeTypingTypeToString(eDataType, instanceValue);
			case ABAPObjectsPackage.METHOD_SCOPE:
				return convertMethodScopeToString(eDataType, instanceValue);
			case ABAPObjectsPackage.METHOD_PARAMETER_DECLARATION_TYPE:
				return convertMethodParameterDeclarationTypeToString(eDataType, instanceValue);
			case ABAPObjectsPackage.CLASS_CREATION_SCOPE:
				return convertClassCreationScopeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPInterface createABAPInterface() {
		ABAPInterfaceImpl abapInterface = new ABAPInterfaceImpl();
		return abapInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceAttribute createInterfaceAttribute() {
		InterfaceAttributeImpl interfaceAttribute = new InterfaceAttributeImpl();
		return interfaceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAttribute createClassAttribute() {
		ClassAttributeImpl classAttribute = new ClassAttributeImpl();
		return classAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceMethod createInterfaceMethod() {
		InterfaceMethodImpl interfaceMethod = new InterfaceMethodImpl();
		return interfaceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMethod createClassMethod() {
		ClassMethodImpl classMethod = new ClassMethodImpl();
		return classMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceEvent createInterfaceEvent() {
		InterfaceEventImpl interfaceEvent = new InterfaceEventImpl();
		return interfaceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassEvent createClassEvent() {
		ClassEventImpl classEvent = new ClassEventImpl();
		return classEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodException createMethodException() {
		MethodExceptionImpl methodException = new MethodExceptionImpl();
		return methodException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventParameter createEventParameter() {
		EventParameterImpl eventParameter = new EventParameterImpl();
		return eventParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPClass createABAPClass() {
		ABAPClassImpl abapClass = new ABAPClassImpl();
		return abapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceImplementation createInterfaceImplementation() {
		InterfaceImplementationImpl interfaceImplementation = new InterfaceImplementationImpl();
		return interfaceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeScope createAttributeScopeFromString(EDataType eDataType, String initialValue) {
		AttributeScope result = AttributeScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypingType createAttributeTypingTypeFromString(EDataType eDataType, String initialValue) {
		AttributeTypingType result = AttributeTypingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodScope createMethodScopeFromString(EDataType eDataType, String initialValue) {
		MethodScope result = MethodScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParameterDeclarationType createMethodParameterDeclarationTypeFromString(EDataType eDataType, String initialValue) {
		MethodParameterDeclarationType result = MethodParameterDeclarationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodParameterDeclarationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassCreationScope createClassCreationScopeFromString(EDataType eDataType, String initialValue) {
		ClassCreationScope result = ClassCreationScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassCreationScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPObjectsPackage getABAPObjectsPackage() {
		return (ABAPObjectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ABAPObjectsPackage getPackage() {
		return ABAPObjectsPackage.eINSTANCE;
	}

} //ABAPObjectsFactoryImpl
