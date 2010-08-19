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
package net.sf.rcer.rom.abapobj.util;

import net.sf.rcer.rom.RepositoryObject;

import net.sf.rcer.rom.abapobj.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage
 * @generated
 */
public class ABAPObjectsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ABAPObjectsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABAPObjectsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ABAPObjectsPackage.eINSTANCE;
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
	protected ABAPObjectsSwitch<Adapter> modelSwitch =
		new ABAPObjectsSwitch<Adapter>() {
			@Override
			public Adapter caseForwardDeclarations(ForwardDeclarations object) {
				return createForwardDeclarationsAdapter();
			}
			@Override
			public Adapter caseABAPInterface(ABAPInterface object) {
				return createABAPInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceAttribute(InterfaceAttribute object) {
				return createInterfaceAttributeAdapter();
			}
			@Override
			public Adapter caseClassAttribute(ClassAttribute object) {
				return createClassAttributeAdapter();
			}
			@Override
			public Adapter caseInterfaceMethod(InterfaceMethod object) {
				return createInterfaceMethodAdapter();
			}
			@Override
			public Adapter caseClassMethod(ClassMethod object) {
				return createClassMethodAdapter();
			}
			@Override
			public Adapter caseInterfaceEvent(InterfaceEvent object) {
				return createInterfaceEventAdapter();
			}
			@Override
			public Adapter caseClassEvent(ClassEvent object) {
				return createClassEventAdapter();
			}
			@Override
			public Adapter caseMethodParameter(MethodParameter object) {
				return createMethodParameterAdapter();
			}
			@Override
			public Adapter caseMethodException(MethodException object) {
				return createMethodExceptionAdapter();
			}
			@Override
			public Adapter caseEventParameter(EventParameter object) {
				return createEventParameterAdapter();
			}
			@Override
			public Adapter caseABAPClass(ABAPClass object) {
				return createABAPClassAdapter();
			}
			@Override
			public Adapter caseInterfaceImplementation(InterfaceImplementation object) {
				return createInterfaceImplementationAdapter();
			}
			@Override
			public Adapter caseRepositoryObject(RepositoryObject object) {
				return createRepositoryObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ForwardDeclarations <em>Forward Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ForwardDeclarations
	 * @generated
	 */
	public Adapter createForwardDeclarationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ABAPInterface <em>ABAP Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface
	 * @generated
	 */
	public Adapter createABAPInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute <em>Interface Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute
	 * @generated
	 */
	public Adapter createInterfaceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ClassAttribute
	 * @generated
	 */
	public Adapter createClassAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.InterfaceMethod <em>Interface Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod
	 * @generated
	 */
	public Adapter createInterfaceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ClassMethod <em>Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ClassMethod
	 * @generated
	 */
	public Adapter createClassMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.InterfaceEvent <em>Interface Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent
	 * @generated
	 */
	public Adapter createInterfaceEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ClassEvent <em>Class Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ClassEvent
	 * @generated
	 */
	public Adapter createClassEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter
	 * @generated
	 */
	public Adapter createMethodParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.MethodException <em>Method Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.MethodException
	 * @generated
	 */
	public Adapter createMethodExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.EventParameter <em>Event Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.EventParameter
	 * @generated
	 */
	public Adapter createEventParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.ABAPClass <em>ABAP Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass
	 * @generated
	 */
	public Adapter createABAPClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.rcer.rom.abapobj.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.rcer.rom.abapobj.InterfaceImplementation
	 * @generated
	 */
	public Adapter createInterfaceImplementationAdapter() {
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

} //ABAPObjectsAdapterFactory
