/**
 */
package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.SSKEEcorePackage;
import alin.sske.sSKEEcore.SSKEKeys;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSKE Keys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEKeysImpl#getKeyA <em>Key A</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEKeysImpl#getKeyB <em>Key B</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEKeysImpl#getKeyC <em>Key C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSKEKeysImpl extends MinimalEObjectImpl.Container implements SSKEKeys {
	/**
	 * The default value of the '{@link #getKeyA() <em>Key A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyA()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyA() <em>Key A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyA()
	 * @generated
	 * @ordered
	 */
	protected String keyA = KEY_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyB() <em>Key B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyB()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyB() <em>Key B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyB()
	 * @generated
	 * @ordered
	 */
	protected String keyB = KEY_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyC() <em>Key C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyC()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyC() <em>Key C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyC()
	 * @generated
	 * @ordered
	 */
	protected String keyC = KEY_C_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEKeysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SSKEEcorePackage.Literals.SSKE_KEYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyA() {
		return keyA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyA(String newKeyA) {
		String oldKeyA = keyA;
		keyA = newKeyA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_KEYS__KEY_A, oldKeyA, keyA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyB() {
		return keyB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyB(String newKeyB) {
		String oldKeyB = keyB;
		keyB = newKeyB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_KEYS__KEY_B, oldKeyB, keyB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyC() {
		return keyC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyC(String newKeyC) {
		String oldKeyC = keyC;
		keyC = newKeyC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_KEYS__KEY_C, oldKeyC, keyC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SSKEEcorePackage.SSKE_KEYS__KEY_A:
				return getKeyA();
			case SSKEEcorePackage.SSKE_KEYS__KEY_B:
				return getKeyB();
			case SSKEEcorePackage.SSKE_KEYS__KEY_C:
				return getKeyC();
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
			case SSKEEcorePackage.SSKE_KEYS__KEY_A:
				setKeyA((String)newValue);
				return;
			case SSKEEcorePackage.SSKE_KEYS__KEY_B:
				setKeyB((String)newValue);
				return;
			case SSKEEcorePackage.SSKE_KEYS__KEY_C:
				setKeyC((String)newValue);
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
			case SSKEEcorePackage.SSKE_KEYS__KEY_A:
				setKeyA(KEY_A_EDEFAULT);
				return;
			case SSKEEcorePackage.SSKE_KEYS__KEY_B:
				setKeyB(KEY_B_EDEFAULT);
				return;
			case SSKEEcorePackage.SSKE_KEYS__KEY_C:
				setKeyC(KEY_C_EDEFAULT);
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
			case SSKEEcorePackage.SSKE_KEYS__KEY_A:
				return KEY_A_EDEFAULT == null ? keyA != null : !KEY_A_EDEFAULT.equals(keyA);
			case SSKEEcorePackage.SSKE_KEYS__KEY_B:
				return KEY_B_EDEFAULT == null ? keyB != null : !KEY_B_EDEFAULT.equals(keyB);
			case SSKEEcorePackage.SSKE_KEYS__KEY_C:
				return KEY_C_EDEFAULT == null ? keyC != null : !KEY_C_EDEFAULT.equals(keyC);
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
		result.append(" (keyA: ");
		result.append(keyA);
		result.append(", keyB: ");
		result.append(keyB);
		result.append(", keyC: ");
		result.append(keyC);
		result.append(')');
		return result.toString();
	}

} //SSKEKeysImpl
