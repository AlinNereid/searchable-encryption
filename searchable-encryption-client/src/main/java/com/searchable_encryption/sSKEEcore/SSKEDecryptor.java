/**
 */
package com.searchable_encryption.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSKE Decryptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEDecryptor#getSymmetricdecryptor <em>Symmetricdecryptor</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEDecryptor()
 * @model
 * @generated
 */
public interface SSKEDecryptor extends EObject {
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
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEDecryptor_Pseudorandomgenerator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PseudoRandomGenerator getPseudorandomgenerator();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}' containment reference.
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
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEDecryptor_Pseudorandomfunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PseudoRandomFunction getPseudorandomfunction();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudorandomfunction</em>' containment reference.
	 * @see #getPseudorandomfunction()
	 * @generated
	 */
	void setPseudorandomfunction(PseudoRandomFunction value);

	/**
	 * Returns the value of the '<em><b>Symmetricdecryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symmetricdecryptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetricdecryptor</em>' containment reference.
	 * @see #setSymmetricdecryptor(SymmetricDecryptor)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEDecryptor_Symmetricdecryptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymmetricDecryptor getSymmetricdecryptor();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEDecryptor#getSymmetricdecryptor <em>Symmetricdecryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetricdecryptor</em>' containment reference.
	 * @see #getSymmetricdecryptor()
	 * @generated
	 */
	void setSymmetricdecryptor(SymmetricDecryptor value);

} // SSKEDecryptor
