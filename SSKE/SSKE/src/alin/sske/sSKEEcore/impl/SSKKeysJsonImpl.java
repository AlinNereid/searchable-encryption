/**
 */
package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.SSKEEcorePackage;
import alin.sske.sSKEEcore.SSKEKeys;
import alin.sske.sSKEEcore.SSKKeysJson;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSK Keys Json</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKKeysJsonImpl#getSskekeys <em>Sskekeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSKKeysJsonImpl extends MinimalEObjectImpl.Container implements SSKKeysJson {
	/**
	 * The cached value of the '{@link #getSskekeys() <em>Sskekeys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSskekeys()
	 * @generated
	 * @ordered
	 */
	protected SSKEKeys sskekeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKKeysJsonImpl(SSKEKeys sskkeys) {
		this.sskekeys = sskkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SSKEEcorePackage.Literals.SSK_KEYS_JSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEKeys getSskekeys() {
		if (sskekeys != null && sskekeys.eIsProxy()) {
			InternalEObject oldSskekeys = (InternalEObject)sskekeys;
			sskekeys = (SSKEKeys)eResolveProxy(oldSskekeys);
			if (sskekeys != oldSskekeys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS, oldSskekeys, sskekeys));
			}
		}
		return sskekeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEKeys basicGetSskekeys() {
		return sskekeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSskekeys(SSKEKeys newSskekeys) {
		SSKEKeys oldSskekeys = sskekeys;
		sskekeys = newSskekeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS, oldSskekeys, sskekeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEKeys SSKeysJson(SSKEKeys sskekeys) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void convertToJson() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadFromJson() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS:
				if (resolve) return getSskekeys();
				return basicGetSskekeys();
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
			case SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS:
				setSskekeys((SSKEKeys)newValue);
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
			case SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS:
				setSskekeys((SSKEKeys)null);
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
			case SSKEEcorePackage.SSK_KEYS_JSON__SSKEKEYS:
				return sskekeys != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SSKEEcorePackage.SSK_KEYS_JSON___SS_KEYS_JSON__SSKEKEYS:
				return SSKeysJson((SSKEKeys)arguments.get(0));
			case SSKEEcorePackage.SSK_KEYS_JSON___CONVERT_TO_JSON:
				convertToJson();
				return null;
			case SSKEEcorePackage.SSK_KEYS_JSON___LOAD_FROM_JSON:
				loadFromJson();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SSKKeysJsonImpl
