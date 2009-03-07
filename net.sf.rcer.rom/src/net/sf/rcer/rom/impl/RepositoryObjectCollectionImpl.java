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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;
import net.sf.rcer.conn.tools.ITableContents;
import net.sf.rcer.conn.tools.ITableLine;
import net.sf.rcer.conn.tools.TableReader;
import net.sf.rcer.conn.tools.TableReaderBuffer;
import net.sf.rcer.rom.PackagePermittedObjectTypes;
import net.sf.rcer.rom.PackageType;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectKey;
import net.sf.rcer.rom.RepositoryPackage;
import net.sf.rcer.rom.ddic.DDICFactory;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.rom.ddic.DomainValueRange;
import net.sf.rcer.rom.ddic.DomainValueSingle;
import net.sf.rcer.rom.ddic.ReferredObjectType;
import net.sf.rcer.rom.ddic.Structure;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.ddic.TypeKind;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementData;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementReader;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementText;
import net.sf.rcer.rom.ddic.rfc.RFCDomainData;
import net.sf.rcer.rom.ddic.rfc.RFCDomainReader;
import net.sf.rcer.rom.ddic.rfc.RFCDomainValue;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Object Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryObjectCollectionImpl extends EObjectImpl implements RepositoryObjectCollection {
	/**
	 * The default value of the '{@link #getSourceConnection() <em>Source Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected static final JCoDestination SOURCE_CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceConnection() <em>Source Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected JCoDestination sourceConnection = SOURCE_CONNECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryPackage> packages;

	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domains;

	/**
	 * The cached value of the '{@link #getDataElements() <em>Data Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElement> dataElements;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structures;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryObjectCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROMPackage.Literals.REPOSITORY_OBJECT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JCoDestination getSourceConnection() {
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConnection(JCoDestination newSourceConnection) {
		JCoDestination oldSourceConnection = sourceConnection;
		sourceConnection = newSourceConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION, oldSourceConnection, sourceConnection));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<RepositoryPackage>(RepositoryPackage.class, this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES, ROMPackage.REPOSITORY_PACKAGE__COLLECTION);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getDomains() {
		if (domains == null) {
			domains = new EObjectContainmentWithInverseEList<Domain>(Domain.class, this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS, DDICPackage.DOMAIN__COLLECTION);
		}
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElement> getDataElements() {
		if (dataElements == null) {
			dataElements = new EObjectContainmentWithInverseEList<DataElement>(DataElement.class, this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS, DDICPackage.DATA_ELEMENT__COLLECTION);
		}
		return dataElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentWithInverseEList<Structure>(Structure.class, this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES, DDICPackage.STRUCTURE__COLLECTION);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentWithInverseEList<Table>(Table.class, this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES, DDICPackage.TABLE__COLLECTION);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws ObjectNotFoundException 
	 * @generated and changed
	 */
	public RepositoryPackage getPackage(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException {
		if (load && getSourceConnection() == null) {
			throw new IllegalArgumentException("Source connection must be set when requesting loading of objects.");
		}
		for (RepositoryPackage pkg: getPackages()) {
			if (pkg.getName().equals(name)) {
				if (load && !pkg.isLoaded()) {
					loadPackage(pkg);
				}
				return pkg;
			}
		}
		// package was not found so far
		if (load) {
			RepositoryPackage pkg = ROMFactory.eINSTANCE.createRepositoryPackage();
			pkg.setName(name);
			loadPackage(pkg);
			return pkg;
		}
		throw new ObjectNotFoundException("Package " + name + " not found.");
	}

	/**
	 * Loads the data of a repository package. 
	 * @param pkg
	 * @generated no
	 */
	private void loadPackage(RepositoryPackage pkg) throws ObjectNotFoundException, ObjectLoadingException {
		loadRepositoryData(pkg);
		try {
			// --- read the package data from TDEVC --------------------------------------------------------------------
			
			TableReader reader = TableReaderBuffer.getInstance(getSourceConnection()).getTableReader("TDEVC");
			ITableContents result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", pkg.getName()));

			if (result.isEmpty()) {
				throw new ObjectNotFoundException(MessageFormat.format(
						"Unable to read the package data (TDEVC) for package {0}", pkg.getName()));
			}
			if (result.size() > 1) {
				throw new ObjectLoadingException(MessageFormat.format(
						"Received multiple lines while reading the package data (TDEVC) for package {0}", pkg.getName()));				
			}

			try {
				final ITableLine line = result.getLine(0);
				// IMPORTANT - we overwrite the value from TADIR because that line (R3TR DEVC) always points to itself!
				pkg.setPackageName(line.getValue("PARENTCL"));
				
				pkg.setChangeRecodingEnabled(line.getBooleanValue("KORRFLAG"));
				pkg.setResponsibleUser(line.getValue("AS4USER"));
				pkg.setTransportLayer(line.getValue("PDEVCLASS"));
				pkg.setNamespace(line.getValue("NAMESPACE"));
				pkg.setInterfacePrefix(line.getValue("INTFPREFX"));
				pkg.setObjectCreationRestricted(line.getBooleanValue("RESTRICTED"));
				pkg.setCheckedAsServer(line.getBooleanValue("SRV_CHECK"));
				pkg.setCheckedAsClient(line.getBooleanValue("CLI_CHECK"));

				final String packtype = line.getValue("PACKTYPE");
				if (packtype.equals("")) {
					pkg.setPermittedObjectTypes(PackagePermittedObjectTypes.ALL);
				} else {
					switch(packtype.charAt(0)) {
					case ' ': 
						pkg.setPermittedObjectTypes(PackagePermittedObjectTypes.ALL);
						break;
					case 'D':
						pkg.setPermittedObjectTypes(PackagePermittedObjectTypes.DESCRIPTIVE_OBJECTS_ONLY);
						break;
					case 'F':
						pkg.setPermittedObjectTypes(PackagePermittedObjectTypes.FUNCTIONAL_OBJECTS_ONLY);
						break;
					case 'O':
						pkg.setPermittedObjectTypes(PackagePermittedObjectTypes.OTR_OBJECTS_ONLY);
						break;
					default: 
						throw new ObjectLoadingException(MessageFormat.format(
								"Unexpected value {0} in field PACKTYPE of the package data (TDEVC) for package {1}",
								packtype, pkg.getName())) ;				
					}
				}

				final String mainpack = line.getValue("MAINPACK");
				if (mainpack.equals("")) {
					pkg.setType(PackageType.STANDARD);
				} else {
					switch(mainpack.charAt(0)) {
					case ' ': 
						pkg.setType(PackageType.STANDARD);
						break;
					case 'X':
						pkg.setType(PackageType.MAIN);
						break;
					case 'S':
						pkg.setType(PackageType.STRUCTURAL);
						break;
					default: 
						throw new ObjectLoadingException(MessageFormat.format(
								"Unexpected value {0} in field MAINPACK of the package data (TDEVC) for package {1}", 
								packtype, pkg.getName())) ;				
					}
				}
			} catch (Exception e) {
				throw new ObjectLoadingException(MessageFormat.format(
						"Error converting the package data from TDEVC for package {0}", pkg.getName()), e);				
			}		

			// --- read the package texts from TDEVCT ------------------------------------------------------------------

			reader = TableReaderBuffer.getInstance(getSourceConnection()).getTableReader("TDEVCT");
			result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", pkg.getName()));
			
			pkg.getDescription().clear();
			for (final ITableLine line: result) {
				try {
					final String id = line.getValue("SPRAS");
					if (id.length() > 0) {
						final Locale locale = LocaleRegistry.getInstance().getLocaleByID(id);
						pkg.getDescription().put(locale, line.getValue("CTEXT"));
					}
				} catch (Exception e) {
					// ignore this for now, it's only the description after all
				}
			}
			
			// --- read the contained subpackages ----------------------------------------------------------------------
			
			reader = TableReaderBuffer.getInstance(getSourceConnection()).getTableReader("TDEVC");
			result = reader.read(MessageFormat.format("PARENTCL = ''{0}''", pkg.getName()));
			
			for (final ITableLine line: result) {
				try {
					pkg.getSubPackageNames().add(line.getValue("DEVCLASS"));
				} catch (Exception e) {
					throw new ObjectLoadingException(MessageFormat.format(
							"Error reading the sub-packages of package {0}", pkg.getName()), e);				
				}		
			}

			// --- read the contained objects --------------------------------------------------------------------------
			
			reader = TableReaderBuffer.getInstance(getSourceConnection()).getTableReader("TADIR");
			result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", pkg.getName()));
			
			for (final ITableLine line: result) {
				try {
					RepositoryObjectKey key = ROMFactory.eINSTANCE.createRepositoryObjectKey();
					key.setProgramID(line.getValue("PGMID"));
					key.setObjectTypeID(line.getValue("OBJECT"));
					key.setName(line.getValue("OBJ_NAME"));
					pkg.getObjectKeys().add(key);
				} catch (Exception e) {
					throw new ObjectLoadingException(MessageFormat.format(
							"Error reading the contents of package {0}", pkg.getName()), e);				
				}		
			}
			
		} catch (JCoException e) {
			throw new ObjectLoadingException(MessageFormat.format(
					"Error loading the package data from TDEVC/TDEVCT for package {0}", pkg.getName()), e);				
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public Domain getDomain(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException {
		if (load && getSourceConnection() == null) {
			throw new IllegalArgumentException("Source connection must be set when requesting loading of objects.");
		}
		for (Domain dom: getDomains()) {
			if (dom.getName().equals(name)) {
				if (load && !dom.isLoaded()) {
					loadDomain(dom);
				}
				return dom;
			}
		}
		// domain was not found so far
		if (load) {
			Domain dom = DDICFactory.eINSTANCE.createDomain();
			dom.setName(name);
			loadDomain(dom);
			return dom;

		}
		throw new ObjectNotFoundException("Domain " + name + " not found.");
	}

	/**
	 * Loads a domain from the SAP R/3 system.
	 * @param dom
	 * @generated no
	 */
	private void loadDomain(Domain dom) throws ObjectNotFoundException, ObjectLoadingException {
		loadRepositoryData(dom);
		try {
			RFCDomainReader reader = new RFCDomainReader();
			reader.setDomainName(dom.getName());
			reader.setLocaleID(dom.getOriginalLocale().getID());
			reader.execute(getSourceConnection());

			final RFCDomainData data = reader.getDomainData();
			dom.getDescription().put(dom.getOriginalLocale(), data.getDescription());
			dom.setDictionaryDataType(DictionaryDataType.get(data.getDataType()));
			dom.setLength(data.getLength());
			dom.setOutputLength(data.getOutputLength());
			dom.setDecimals(data.getDecimals());
			dom.setCaseSensitive(data.isCaseSensitive());
			dom.setSigned(data.isSigned());
			dom.setValueListFixed(data.isValueListFixed());
			dom.setValueTableName(data.getValueTable());
			dom.setConversionExit(data.getConversionExit());
			
			for (final RFCDomainValue value: reader.getValues()) {
				if (value.getLocaleID().equals(dom.getOriginalLocale().getID())) {
					if ((value.getUpperValue() != null) && (value.getUpperValue().length() > 0)) {
						DomainValueRange v = DDICFactory.eINSTANCE.createDomainValueRange();
						v.setPosition(value.getPosition());
						v.setLowerBoundary(value.getLowerValue());
						v.setUpperBoundary(value.getUpperValue());
						v.getDescription().put(dom.getOriginalLocale(), value.getDescription());
						dom.getValues().add(v);
					} else {
						DomainValueSingle v = DDICFactory.eINSTANCE.createDomainValueSingle();
						v.setPosition(value.getPosition());
						v.setValue(value.getLowerValue());
						v.getDescription().put(dom.getOriginalLocale(), value.getDescription());
						dom.getValues().add(v);
					}
				}
			}
		} catch (JCoException e) {
			throw new ObjectLoadingException(MessageFormat.format("Error loading domain {0}", dom.getName()), e);				
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public DataElement getDataElement(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException {
		if (load && getSourceConnection() == null) {
			throw new IllegalArgumentException("Source connection must be set when requesting loading of objects.");
		}
		for (DataElement elem: getDataElements()) {
			if (elem.getName().equals(name)) {
				if (load && !elem.isLoaded()) {
					loadDataElement(elem);
				}
				return elem;
			}
		}
		// data element was not found so far
		if (load) {
			DataElement elem = DDICFactory.eINSTANCE.createDataElement();
			elem.setName(name);
			loadDataElement(elem);
			return elem;
		}
		throw new ObjectNotFoundException("Data Element " + name + " not found.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed 
	 */
	public RepositoryObject loadObject(RepositoryObjectKey key) throws ObjectNotFoundException, ObjectLoadingException {
		if (key.getProgramID().equals("R3TR")) {
			if (key.getObjectTypeID().equals("DEVC")) {
				return getPackage(key.getName(), true);
			}
			if (key.getObjectTypeID().equals("DOMA")) {
				return getDomain(key.getName(), true);
			}
			if (key.getObjectTypeID().equals("DTEL")) {
				return getDomain(key.getName(), true);
			}
		}
		throw new ObjectLoadingException(MessageFormat.format("Unable to load repository object {0} {1} {2}.",
				key.getProgramID(), key.getObjectTypeID(), key.getName()));
	}

	/**
	 * Loads the data of a data element from the SAP R/3 system.
	 * @param elem
	 * @generated no
	 */
	private void loadDataElement(DataElement elem) throws ObjectNotFoundException, ObjectLoadingException {
		loadRepositoryData(elem);
		try {
			RFCDataElementReader reader = new RFCDataElementReader();
			reader.setDataElementName(elem.getName());
			reader.setLocaleID(elem.getOriginalLocale().getID());
			reader.execute(getSourceConnection());

			final RFCDataElementData data = reader.getDataElementData();
			elem.setTypeName(data.getTypeName());
			elem.setParameterID(data.getParameterID());
			elem.setLogged(data.isLogged());
			elem.setMaxHeadingLength(data.getHeadingLength());
			elem.setMaxShortTextLength(data.getShortTextLength());
			elem.setMaxMediumTextLength(data.getMediumTextLength());
			elem.setMaxLongTextLength(data.getLongTextLength());
			elem.setValueHelpName(data.getSearchHelpName());
			elem.setValueHelpFieldName(data.getSearchHelpField());
			elem.setDefaultFieldName(data.getDefaultFieldName());
			elem.setDictionaryDataType(DictionaryDataType.get(data.getDataType()));
			elem.setLength(data.getLength());
			elem.setOutputLength(data.getOutputLength());
			elem.setDecimals(data.getDecimals());
			elem.setCaseSensitive(data.isCaseSensitive());
			elem.setSigned(data.isSigned());
			elem.setValueListFixed(data.isValueListFixed());
			elem.setValueTableName(data.getValueTable());
			elem.setConversionExit(data.getConversionExit());
			elem.setTypeKind(TypeKind.get(data.getTypeKind()));
			elem.setReferredType(ReferredObjectType.get(data.getReferenceKind()));

			for (final RFCDataElementText text: reader.getTexts()) {
				Locale locale = LocaleRegistry.getInstance().getLocaleByID(text.getLocaleID());
				elem.getDescription().put(locale, text.getDescription());
				elem.getHeading().put(locale, text.getHeading());
				elem.getShortText().put(locale, text.getShortText());
				elem.getMediumText().put(locale, text.getMediumText());
				elem.getLongText().put(locale, text.getLongText());
			}
			
		} catch (JCoException e) {
			throw new ObjectLoadingException(MessageFormat.format("Error loading data element {0}", elem.getName()), e);				
		} catch (LocaleNotFoundException e) {
			throw new ObjectLoadingException(MessageFormat.format("Error loading data element {0}", elem.getName()), e);				
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomains()).basicAdd(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataElements()).basicAdd(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructures()).basicAdd(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				return ((InternalEList<?>)getDataElements()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION:
				return getSourceConnection();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				return getPackages();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				return getDomains();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				return getDataElements();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				return getStructures();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				return getTables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION:
				setSourceConnection((JCoDestination)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends RepositoryPackage>)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				getDomains().clear();
				getDomains().addAll((Collection<? extends Domain>)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				getDataElements().clear();
				getDataElements().addAll((Collection<? extends DataElement>)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends Structure>)newValue);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends Table>)newValue);
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
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION:
				setSourceConnection(SOURCE_CONNECTION_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				getPackages().clear();
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				getDomains().clear();
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				getDataElements().clear();
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				getStructures().clear();
				return;
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				getTables().clear();
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
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION:
				return SOURCE_CONNECTION_EDEFAULT == null ? sourceConnection != null : !SOURCE_CONNECTION_EDEFAULT.equals(sourceConnection);
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES:
				return packages != null && !packages.isEmpty();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS:
				return domains != null && !domains.isEmpty();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS:
				return dataElements != null && !dataElements.isEmpty();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case ROMPackage.REPOSITORY_OBJECT_COLLECTION__TABLES:
				return tables != null && !tables.isEmpty();
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
		result.append(" (sourceConnection: "); //$NON-NLS-1$
		result.append(sourceConnection);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Loads the repository header data of the object from table TADIR. 
	 * @throws ObjectLoadingException 
	 * @generated no
	 */
	protected void loadRepositoryData(RepositoryObject object) throws ObjectLoadingException {
		try {
			List<String> criteria = new ArrayList<String>();
			criteria.add(MessageFormat.format("PGMID    = ''{0}'' AND", object.getProgramID()));
			criteria.add(MessageFormat.format("OBJECT   = ''{0}'' AND", object.getObjectTypeID()));
			criteria.add(MessageFormat.format("OBJ_NAME = ''{0}''",     object.getName()));
			TableReader reader = TableReaderBuffer.getInstance(getSourceConnection()).getTableReader("TADIR");
			ITableContents result = reader.read(criteria);

			if (result.isEmpty()) {
				throw new ObjectLoadingException(MessageFormat.format(
						"Unable to read the repository data (TADIR) for object {0} {1} {2}",
						object.getProgramID(), object.getObjectTypeID(), object.getName()));
			}
			if (result.size() > 1) {
				throw new ObjectLoadingException(MessageFormat.format(
						"Received multiple lines while reading the repository data (TADIR) for object {0} {1} {2}",
						object.getProgramID(), object.getObjectTypeID(), object.getName()));				
			}

			try {
				final ITableLine line = result.getLine(0);
				object.setSourceSystem(line.getValue("SRCSYSTEM"));
				object.setAuthor(line.getValue("AUTHOR"));
				object.setGenerated(line.getBooleanValue("GENFLAG"));
				final String masterlang = line.getValue("MASTERLANG");
				if (masterlang.length() > 0) {
					object.setOriginalLocale(LocaleRegistry.getInstance().getLocaleByID(masterlang));
				}
				object.setSoftwareComponent(line.getValue("COMPONENT"));
				object.setComponentRelease(line.getValue("CRELEASE"));
				object.setPackageName(line.getValue("DEVCLASS"));
			} catch (Exception e) {
				throw new ObjectLoadingException(MessageFormat.format(
						"Error converting the repository object data from TADIR for object {0} {1} {2}",
						object.getProgramID(), object.getObjectTypeID(), object.getName()), e);				
			}		
		} catch (JCoException e) {
			throw new ObjectLoadingException(MessageFormat.format(
					"Error loading the repository object data from TADIR for object {0} {1} {2}",
					object.getProgramID(), object.getObjectTypeID(), object.getName()), e);				
		}
	}
	

} //RepositoryObjectCollectionImpl
