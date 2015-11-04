/**
 */
package alin.sske.sSKEEcore.util;

import alin.sske.sSKEEcore.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see alin.sske.sSKEEcore.SSKEEcorePackage
 * @generated
 */
public class SSKEEcoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SSKEEcorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEcoreSwitch() {
		if (modelPackage == null) {
			modelPackage = SSKEEcorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SSKEEcorePackage.SSKE_ENCRYPTOR: {
				SSKEEncryptor sskeEncryptor = (SSKEEncryptor)theEObject;
				T result = caseSSKEEncryptor(sskeEncryptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSKE_DECRYPTOR: {
				SSKEDecryptor sskeDecryptor = (SSKEDecryptor)theEObject;
				T result = caseSSKEDecryptor(sskeDecryptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.PSEUDO_RANDOM_GENERATOR: {
				PseudoRandomGenerator pseudoRandomGenerator = (PseudoRandomGenerator)theEObject;
				T result = casePseudoRandomGenerator(pseudoRandomGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.PSEUDO_RANDOM_FUNCTION: {
				PseudoRandomFunction pseudoRandomFunction = (PseudoRandomFunction)theEObject;
				T result = casePseudoRandomFunction(pseudoRandomFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SYMMETRIC_ENCRYPTOR: {
				SymmetricEncryptor symmetricEncryptor = (SymmetricEncryptor)theEObject;
				T result = caseSymmetricEncryptor(symmetricEncryptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SYMMETRIC_DECRYPTOR: {
				SymmetricDecryptor symmetricDecryptor = (SymmetricDecryptor)theEObject;
				T result = caseSymmetricDecryptor(symmetricDecryptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.AES: {
				AES aes = (AES)theEObject;
				T result = caseAES(aes);
				if (result == null) result = caseSymmetricEncryptor(aes);
				if (result == null) result = caseSymmetricDecryptor(aes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSKE_KEYS: {
				SSKEKeys sskeKeys = (SSKEKeys)theEObject;
				T result = caseSSKEKeys(sskeKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSK_KEYS_TXT: {
				SSKKeysTxt sskKeysTxt = (SSKKeysTxt)theEObject;
				T result = caseSSKKeysTxt(sskKeysTxt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSKE: {
				SSKE sske = (SSKE)theEObject;
				T result = caseSSKE(sske);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSKE_KEYS_GENERATOR: {
				SSKEKeysGenerator sskeKeysGenerator = (SSKEKeysGenerator)theEObject;
				T result = caseSSKEKeysGenerator(sskeKeysGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SSKEEcorePackage.SSK_KEYS_JSON: {
				SSKKeysJson sskKeysJson = (SSKKeysJson)theEObject;
				T result = caseSSKKeysJson(sskKeysJson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSKE Encryptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSKE Encryptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKEEncryptor(SSKEEncryptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSKE Decryptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSKE Decryptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKEDecryptor(SSKEDecryptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Random Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Random Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoRandomGenerator(PseudoRandomGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Random Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Random Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoRandomFunction(PseudoRandomFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Encryptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Encryptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricEncryptor(SymmetricEncryptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Decryptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Decryptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricDecryptor(SymmetricDecryptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAES(AES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSKE Keys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSKE Keys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKEKeys(SSKEKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSK Keys Txt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSK Keys Txt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKKeysTxt(SSKKeysTxt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSKE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSKE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKE(SSKE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSKE Keys Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSKE Keys Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKEKeysGenerator(SSKEKeysGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSK Keys Json</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSK Keys Json</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSKKeysJson(SSKKeysJson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SSKEEcoreSwitch
