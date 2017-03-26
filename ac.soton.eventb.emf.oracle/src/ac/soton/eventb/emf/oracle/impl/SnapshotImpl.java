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

import ac.soton.eventb.emf.oracle.OraclePackage;
import ac.soton.eventb.emf.oracle.Snapshot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.oracle.impl.SnapshotImpl#getValues <em>Values</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.oracle.impl.SnapshotImpl#isResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SnapshotImpl extends EntryImpl implements Snapshot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, University of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> values;

	/**
	 * The default value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected boolean result = RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OraclePackage.Literals.SNAPSHOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getValues() {
		if (values == null) {
			values = new EcoreEMap<String,String>(OraclePackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, OraclePackage.SNAPSHOT__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(boolean newResult) {
		boolean oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OraclePackage.SNAPSHOT__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OraclePackage.SNAPSHOT__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case OraclePackage.SNAPSHOT__VALUES:
				if (coreType) return getValues();
				else return getValues().map();
			case OraclePackage.SNAPSHOT__RESULT:
				return isResult();
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
			case OraclePackage.SNAPSHOT__VALUES:
				((EStructuralFeature.Setting)getValues()).set(newValue);
				return;
			case OraclePackage.SNAPSHOT__RESULT:
				setResult((Boolean)newValue);
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
			case OraclePackage.SNAPSHOT__VALUES:
				getValues().clear();
				return;
			case OraclePackage.SNAPSHOT__RESULT:
				setResult(RESULT_EDEFAULT);
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
			case OraclePackage.SNAPSHOT__VALUES:
				return values != null && !values.isEmpty();
			case OraclePackage.SNAPSHOT__RESULT:
				return result != RESULT_EDEFAULT;
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
		result.append(" (result: "); //$NON-NLS-1$
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //SnapshotImpl
