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

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectKey;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.RepositoryPackage;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getSourceSystem <em>Source System</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#isGenerated <em>Generated</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getOriginalLocale <em>Original Locale</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getComponentRelease <em>Component Release</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RepositoryObjectImpl extends EObjectImpl implements RepositoryObject {
	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final RepositoryObjectType OBJECT_TYPE_EDEFAULT = RepositoryObjectType.UNKNOWN;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOADED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean loaded = LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceSystem() <em>Source System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceSystem() <em>Source System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSystem()
	 * @generated
	 * @ordered
	 */
	protected String sourceSystem = SOURCE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected boolean generated = GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalLocale() <em>Original Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalLocale()
	 * @generated
	 * @ordered
	 */
	protected static final Locale ORIGINAL_LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalLocale() <em>Original Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalLocale()
	 * @generated
	 * @ordered
	 */
	protected Locale originalLocale = ORIGINAL_LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareComponent() <em>Software Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareComponent() <em>Software Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareComponent()
	 * @generated
	 * @ordered
	 */
	protected String softwareComponent = SOFTWARE_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentRelease() <em>Component Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentRelease() <em>Component Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentRelease()
	 * @generated
	 * @ordered
	 */
	protected String componentRelease = COMPONENT_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROMPackage.Literals.REPOSITORY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public abstract RepositoryObjectType getObjectType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoaded(boolean newLoaded) {
		boolean oldLoaded = loaded;
		loaded = newLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__LOADED, oldLoaded, loaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public abstract String getProgramID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public abstract String getObjectTypeID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public RepositoryObjectKey getKey() {
		RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
		key.setProgramID(getProgramID());
		key.setObjectTypeID(getObjectTypeID());
		key.setName(getName());
		return key;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceSystem() {
		return sourceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSystem(String newSourceSystem) {
		String oldSourceSystem = sourceSystem;
		sourceSystem = newSourceSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM, oldSourceSystem, sourceSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public abstract RepositoryObjectCollection getCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public RepositoryPackage getPackage(boolean load) throws ObjectNotFoundException, ObjectLoadingException {
		String pkg = getPackageName();
		if ((pkg == null) || (pkg.equals(""))) {
			return null;
		} 
		if (getCollection() == null) {
			throw new UnsupportedOperationException("Retrieving the package is only possible if the object is contained in a repository object collection.");
		}
		return getCollection().getPackage(pkg, load);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(boolean newGenerated) {
		boolean oldGenerated = generated;
		generated = newGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__GENERATED, oldGenerated, generated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale getOriginalLocale() {
		return originalLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalLocale(Locale newOriginalLocale) {
		Locale oldOriginalLocale = originalLocale;
		originalLocale = newOriginalLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE, oldOriginalLocale, originalLocale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareComponent() {
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareComponent(String newSoftwareComponent) {
		String oldSoftwareComponent = softwareComponent;
		softwareComponent = newSoftwareComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT, oldSoftwareComponent, softwareComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentRelease() {
		return componentRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentRelease(String newComponentRelease) {
		String oldComponentRelease = componentRelease;
		componentRelease = newComponentRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE, oldComponentRelease, componentRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE:
				return getObjectType();
			case ROMPackage.REPOSITORY_OBJECT__NAME:
				return getName();
			case ROMPackage.REPOSITORY_OBJECT__LOADED:
				return isLoaded();
			case ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM:
				return getSourceSystem();
			case ROMPackage.REPOSITORY_OBJECT__AUTHOR:
				return getAuthor();
			case ROMPackage.REPOSITORY_OBJECT__GENERATED:
				return isGenerated();
			case ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE:
				return getOriginalLocale();
			case ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT:
				return getSoftwareComponent();
			case ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE:
				return getComponentRelease();
			case ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME:
				return getPackageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT__NAME:
				setName((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__LOADED:
				setLoaded((Boolean)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM:
				setSourceSystem((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__GENERATED:
				setGenerated((Boolean)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE:
				setOriginalLocale((Locale)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT:
				setSoftwareComponent((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE:
				setComponentRelease((String)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__LOADED:
				setLoaded(LOADED_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM:
				setSourceSystem(SOURCE_SYSTEM_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__GENERATED:
				setGenerated(GENERATED_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE:
				setOriginalLocale(ORIGINAL_LOCALE_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT:
				setSoftwareComponent(SOFTWARE_COMPONENT_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE:
				setComponentRelease(COMPONENT_RELEASE_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE:
				return getObjectType() != OBJECT_TYPE_EDEFAULT;
			case ROMPackage.REPOSITORY_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ROMPackage.REPOSITORY_OBJECT__LOADED:
				return loaded != LOADED_EDEFAULT;
			case ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM:
				return SOURCE_SYSTEM_EDEFAULT == null ? sourceSystem != null : !SOURCE_SYSTEM_EDEFAULT.equals(sourceSystem);
			case ROMPackage.REPOSITORY_OBJECT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ROMPackage.REPOSITORY_OBJECT__GENERATED:
				return generated != GENERATED_EDEFAULT;
			case ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE:
				return ORIGINAL_LOCALE_EDEFAULT == null ? originalLocale != null : !ORIGINAL_LOCALE_EDEFAULT.equals(originalLocale);
			case ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT:
				return SOFTWARE_COMPONENT_EDEFAULT == null ? softwareComponent != null : !SOFTWARE_COMPONENT_EDEFAULT.equals(softwareComponent);
			case ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE:
				return COMPONENT_RELEASE_EDEFAULT == null ? componentRelease != null : !COMPONENT_RELEASE_EDEFAULT.equals(componentRelease);
			case ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", loaded: "); //$NON-NLS-1$
		result.append(loaded);
		result.append(", sourceSystem: "); //$NON-NLS-1$
		result.append(sourceSystem);
		result.append(", author: "); //$NON-NLS-1$
		result.append(author);
		result.append(", generated: "); //$NON-NLS-1$
		result.append(generated);
		result.append(", originalLocale: "); //$NON-NLS-1$
		result.append(originalLocale);
		result.append(", softwareComponent: "); //$NON-NLS-1$
		result.append(softwareComponent);
		result.append(", componentRelease: "); //$NON-NLS-1$
		result.append(componentRelease);
		result.append(", packageName: "); //$NON-NLS-1$
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //RepositoryObjectImpl
