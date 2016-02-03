/**
 * Copyright (c) 2012, University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package ac.soton.eventb.emf.oracle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.oracle.Entry#getClock <em>Clock</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.oracle.Entry#getMachine <em>Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.oracle.OraclePackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(String)
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getEntry_Clock()
	 * @model
	 * @generated
	 */
	String getClock();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.oracle.Entry#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(String value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' attribute.
	 * @see #setMachine(String)
	 * @see ac.soton.eventb.emf.oracle.OraclePackage#getEntry_Machine()
	 * @model
	 * @generated
	 */
	String getMachine();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.oracle.Entry#getMachine <em>Machine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' attribute.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(String value);

} // Entry
