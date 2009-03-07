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
package net.sf.rcer.rom.ddic.util;

import java.util.List;

import net.sf.rcer.rom.RepositoryObject;

import net.sf.rcer.rom.ddic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ddic.DDICPackage
 * @generated
 */
public class DDICSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DDICPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDICSwitch() {
		if (modelPackage == null) {
			modelPackage = DDICPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DDICPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseRepositoryObject(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DOMAIN_VALUE: {
				DomainValue domainValue = (DomainValue)theEObject;
				T result = caseDomainValue(domainValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DOMAIN_VALUE_SINGLE: {
				DomainValueSingle domainValueSingle = (DomainValueSingle)theEObject;
				T result = caseDomainValueSingle(domainValueSingle);
				if (result == null) result = caseDomainValue(domainValueSingle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DOMAIN_VALUE_RANGE: {
				DomainValueRange domainValueRange = (DomainValueRange)theEObject;
				T result = caseDomainValueRange(domainValueRange);
				if (result == null) result = caseDomainValue(domainValueRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseRepositoryObject(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseRepositoryObject(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseRepositoryObject(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.STRUCTURE_FIELD: {
				StructureField structureField = (StructureField)theEObject;
				T result = caseStructureField(structureField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.TABLE_FIELD: {
				TableField tableField = (TableField)theEObject;
				T result = caseTableField(tableField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.NAMED_FIELD: {
				NamedField namedField = (NamedField)theEObject;
				T result = caseNamedField(namedField);
				if (result == null) result = caseStructureField(namedField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.STRUCTURE_INCLUSION: {
				StructureInclusion structureInclusion = (StructureInclusion)theEObject;
				T result = caseStructureInclusion(structureInclusion);
				if (result == null) result = caseStructureField(structureInclusion);
				if (result == null) result = caseTableField(structureInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.SINGLE_FIELD: {
				SingleField singleField = (SingleField)theEObject;
				T result = caseSingleField(singleField);
				if (result == null) result = caseNamedField(singleField);
				if (result == null) result = caseTableField(singleField);
				if (result == null) result = caseStructureField(singleField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DATA_ELEMENT_FIELD: {
				DataElementField dataElementField = (DataElementField)theEObject;
				T result = caseDataElementField(dataElementField);
				if (result == null) result = caseSingleField(dataElementField);
				if (result == null) result = caseNamedField(dataElementField);
				if (result == null) result = caseTableField(dataElementField);
				if (result == null) result = caseStructureField(dataElementField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.DIRECT_FIELD: {
				DirectField directField = (DirectField)theEObject;
				T result = caseDirectField(directField);
				if (result == null) result = caseSingleField(directField);
				if (result == null) result = caseNamedField(directField);
				if (result == null) result = caseTableField(directField);
				if (result == null) result = caseStructureField(directField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.STRUCTURED_FIELD: {
				StructuredField structuredField = (StructuredField)theEObject;
				T result = caseStructuredField(structuredField);
				if (result == null) result = caseNamedField(structuredField);
				if (result == null) result = caseStructureField(structuredField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDICPackage.TABULAR_FIELD: {
				TabularField tabularField = (TabularField)theEObject;
				T result = caseTabularField(tabularField);
				if (result == null) result = caseNamedField(tabularField);
				if (result == null) result = caseStructureField(tabularField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainValue(DomainValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Value Single</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Value Single</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainValueSingle(DomainValueSingle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Value Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Value Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainValueRange(DomainValueRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureField(StructureField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableField(TableField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedField(NamedField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureInclusion(StructureInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleField(SingleField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElementField(DataElementField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectField(DirectField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredField(StructuredField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabular Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabular Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabularField(TabularField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryObject(RepositoryObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DDICSwitch
