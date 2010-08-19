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
package net.sf.rcer.rom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Package Permitted Object Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ROMPackage#getPackagePermittedObjectTypes()
 * @model
 * @generated
 */
public enum PackagePermittedObjectTypes implements Enumerator {
	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(0, "ALL", "ALL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DESCRIPTIVE OBJECTS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE_OBJECTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTIVE_OBJECTS_ONLY(1, "DESCRIPTIVE_OBJECTS_ONLY", "D"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FUNCTIONAL OBJECTS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_OBJECTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_OBJECTS_ONLY(2, "FUNCTIONAL_OBJECTS_ONLY", "F"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OTR OBJECTS ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTR_OBJECTS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	OTR_OBJECTS_ONLY(3, "OTR_OBJECTS_ONLY", "O"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 0;

	/**
	 * The '<em><b>DESCRIPTIVE OBJECTS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESCRIPTIVE OBJECTS ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTIVE_OBJECTS_ONLY
	 * @model literal="D"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTIVE_OBJECTS_ONLY_VALUE = 1;

	/**
	 * The '<em><b>FUNCTIONAL OBJECTS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTIONAL OBJECTS ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_OBJECTS_ONLY
	 * @model literal="F"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_OBJECTS_ONLY_VALUE = 2;

	/**
	 * The '<em><b>OTR OBJECTS ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTR OBJECTS ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTR_OBJECTS_ONLY
	 * @model literal="O"
	 * @generated
	 * @ordered
	 */
	public static final int OTR_OBJECTS_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Package Permitted Object Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PackagePermittedObjectTypes[] VALUES_ARRAY =
		new PackagePermittedObjectTypes[] {
			ALL,
			DESCRIPTIVE_OBJECTS_ONLY,
			FUNCTIONAL_OBJECTS_ONLY,
			OTR_OBJECTS_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Package Permitted Object Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PackagePermittedObjectTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Package Permitted Object Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagePermittedObjectTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackagePermittedObjectTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Permitted Object Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagePermittedObjectTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PackagePermittedObjectTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Package Permitted Object Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagePermittedObjectTypes get(int value) {
		switch (value) {
			case ALL_VALUE: return ALL;
			case DESCRIPTIVE_OBJECTS_ONLY_VALUE: return DESCRIPTIVE_OBJECTS_ONLY;
			case FUNCTIONAL_OBJECTS_ONLY_VALUE: return FUNCTIONAL_OBJECTS_ONLY;
			case OTR_OBJECTS_ONLY_VALUE: return OTR_OBJECTS_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PackagePermittedObjectTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PackagePermittedObjectTypes
