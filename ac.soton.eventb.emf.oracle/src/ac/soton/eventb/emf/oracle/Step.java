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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.oracle.Step#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.oracle.Step#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.oracle.OraclePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Entry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.oracle.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getStep_Args()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getArgs();

} // Step
