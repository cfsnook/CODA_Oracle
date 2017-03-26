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
package ac.soton.eventb.emf.oracle;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.oracle.Snapshot#getValues <em>Values</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.oracle.Snapshot#isResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.oracle.OraclePackage#getSnapshot()
 * @model
 * @generated
 */
public interface Snapshot extends Entry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getSnapshot_Values()
	 * @model mapType="ac.soton.eventb.emf.oracle.StringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getValues();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(boolean)
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getSnapshot_Result()
	 * @model
	 * @generated
	 */
	boolean isResult();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.oracle.Snapshot#isResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #isResult()
	 * @generated
	 */
	void setResult(boolean value);

} // Snapshot
