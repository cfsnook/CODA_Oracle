/**
 * Copyright (c) 2012, University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.oracle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.oracle.OracleFactory
 * @model kind="package"
 * @generated
 */
public interface OraclePackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oracle"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/oracle"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oracle"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OraclePackage eINSTANCE = ac.soton.eventb.emf.oracle.impl.OraclePackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.OracleImpl <em>Oracle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.OracleImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getOracle()
	 * @generated
	 */
	int ORACLE = 0;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE__RUNS = 0;

	/**
	 * The number of structural features of the '<em>Oracle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORACLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.RunImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getRun()
	 * @generated
	 */
	int RUN = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.EntryImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CLOCK = 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__MACHINE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.SnapshotImpl <em>Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.SnapshotImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getSnapshot()
	 * @generated
	 */
	int SNAPSHOT = 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__CLOCK = ENTRY__CLOCK;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__MACHINE = ENTRY__MACHINE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__VALUES = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT__RESULT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.StringToStringMapEntryImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.oracle.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.oracle.impl.StepImpl
	 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CLOCK = ENTRY__CLOCK;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MACHINE = ENTRY__MACHINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ARGS = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.oracle.Oracle <em>Oracle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oracle</em>'.
	 * @see ac.soton.eventb.emf.oracle.Oracle
	 * @generated
	 */
	EClass getOracle();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.oracle.Oracle#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see ac.soton.eventb.emf.oracle.Oracle#getRuns()
	 * @see #getOracle()
	 * @generated
	 */
	EReference getOracle_Runs();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.oracle.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see ac.soton.eventb.emf.oracle.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.oracle.Run#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see ac.soton.eventb.emf.oracle.Run#getEntries()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Entries();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.oracle.Run#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.soton.eventb.emf.oracle.Run#getName()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Name();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.oracle.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see ac.soton.eventb.emf.oracle.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.oracle.Entry#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see ac.soton.eventb.emf.oracle.Entry#getClock()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Clock();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.oracle.Entry#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine</em>'.
	 * @see ac.soton.eventb.emf.oracle.Entry#getMachine()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Machine();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.oracle.Snapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshot</em>'.
	 * @see ac.soton.eventb.emf.oracle.Snapshot
	 * @generated
	 */
	EClass getSnapshot();

	/**
	 * Returns the meta object for the map '{@link ac.soton.eventb.emf.oracle.Snapshot#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Values</em>'.
	 * @see ac.soton.eventb.emf.oracle.Snapshot#getValues()
	 * @see #getSnapshot()
	 * @generated
	 */
	EReference getSnapshot_Values();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.oracle.Snapshot#isResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see ac.soton.eventb.emf.oracle.Snapshot#isResult()
	 * @see #getSnapshot()
	 * @generated
	 */
	EAttribute getSnapshot_Result();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 *        keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.oracle.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see ac.soton.eventb.emf.oracle.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.oracle.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ac.soton.eventb.emf.oracle.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute list '{@link ac.soton.eventb.emf.oracle.Step#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see ac.soton.eventb.emf.oracle.Step#getArgs()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Args();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OracleFactory getOracleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.OracleImpl <em>Oracle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.OracleImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getOracle()
		 * @generated
		 */
		EClass ORACLE = eINSTANCE.getOracle();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORACLE__RUNS = eINSTANCE.getOracle_Runs();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.RunImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__ENTRIES = eINSTANCE.getRun_Entries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__NAME = eINSTANCE.getRun_Name();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.EntryImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__CLOCK = eINSTANCE.getEntry_Clock();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__MACHINE = eINSTANCE.getEntry_Machine();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.SnapshotImpl <em>Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.SnapshotImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getSnapshot()
		 * @generated
		 */
		EClass SNAPSHOT = eINSTANCE.getSnapshot();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAPSHOT__VALUES = eINSTANCE.getSnapshot_Values();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAPSHOT__RESULT = eINSTANCE.getSnapshot_Result();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.StringToStringMapEntryImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.oracle.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.oracle.impl.StepImpl
		 * @see ac.soton.eventb.emf.oracle.impl.OraclePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ARGS = eINSTANCE.getStep_Args();

	}

} //OraclePackage
