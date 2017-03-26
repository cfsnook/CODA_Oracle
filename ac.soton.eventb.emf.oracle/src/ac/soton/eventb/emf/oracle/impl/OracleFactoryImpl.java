/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.oracle.impl;

import ac.soton.eventb.emf.oracle.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
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
public class OracleFactoryImpl extends EFactoryImpl implements OracleFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OracleFactory init() {
		try {
			OracleFactory theOracleFactory = (OracleFactory)EPackage.Registry.INSTANCE.getEFactory("http://soton.ac.uk/models/eventb/oracle"); //$NON-NLS-1$ 
			if (theOracleFactory != null) {
				return theOracleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OracleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OracleFactoryImpl() {
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
			case OraclePackage.ORACLE: return createOracle();
			case OraclePackage.RUN: return createRun();
			case OraclePackage.SNAPSHOT: return createSnapshot();
			case OraclePackage.STRING_TO_STRING_MAP_ENTRY: return (EObject)createStringToStringMapEntry();
			case OraclePackage.STEP: return createStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oracle createOracle() {
		OracleImpl oracle = new OracleImpl();
		return oracle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Snapshot createSnapshot() {
		SnapshotImpl snapshot = new SnapshotImpl();
		return snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMapEntry() {
		StringToStringMapEntryImpl stringToStringMapEntry = new StringToStringMapEntryImpl();
		return stringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OraclePackage getOraclePackage() {
		return (OraclePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OraclePackage getPackage() {
		return OraclePackage.eINSTANCE;
	}

} //OracleFactoryImpl
