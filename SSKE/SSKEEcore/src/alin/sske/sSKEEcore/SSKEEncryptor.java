/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSKE Encryptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.SSKEEncryptor#getSymmetricencryptor <em>Symmetricencryptor</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEEncryptor()
 * @model
 * @generated
 */
public interface SSKEEncryptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Symmetricencryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symmetricencryptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetricencryptor</em>' containment reference.
	 * @see #setSymmetricencryptor(SymmetricEncryptor)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEEncryptor_Symmetricencryptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymmetricEncryptor getSymmetricencryptor();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEEncryptor#getSymmetricencryptor <em>Symmetricencryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetricencryptor</em>' containment reference.
	 * @see #getSymmetricencryptor()
	 * @generated
	 */
	void setSymmetricencryptor(SymmetricEncryptor value);

	/**
	 * Returns the value of the '<em><b>Pseudorandomgenerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudorandomgenerator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudorandomgenerator</em>' containment reference.
	 * @see #setPseudorandomgenerator(PseudoRandomGenerator)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEEncryptor_Pseudorandomgenerator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PseudoRandomGenerator getPseudorandomgenerator();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudorandomgenerator</em>' containment reference.
	 * @see #getPseudorandomgenerator()
	 * @generated
	 */
	void setPseudorandomgenerator(PseudoRandomGenerator value);

	/**
	 * Returns the value of the '<em><b>Pseudorandomfunction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudorandomfunction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudorandomfunction</em>' containment reference.
	 * @see #setPseudorandomfunction(PseudoRandomFunction)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEEncryptor_Pseudorandomfunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PseudoRandomFunction getPseudorandomfunction();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudorandomfunction</em>' containment reference.
	 * @see #getPseudorandomfunction()
	 * @generated
	 */
	void setPseudorandomfunction(PseudoRandomFunction value);

} // SSKEEncryptor
