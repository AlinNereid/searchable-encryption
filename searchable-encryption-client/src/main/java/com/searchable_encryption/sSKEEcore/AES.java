/**
 */
package com.searchable_encryption.sSKEEcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link alin.sske.sSKEEcore.AES#getIV <em>IV</em>}</li>
 * <li>{@link alin.sske.sSKEEcore.AES#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getAES()
 * @model
 * @generated
 */
public interface AES extends SymmetricEncryptor, SymmetricDecryptor {

    /**
     * Returns the value of the '<em><b>IV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IV</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>IV</em>' attribute.
     * @see #setIV(String)
     * @see alin.sske.sSKEEcore.SSKEEcorePackage#getAES_IV()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getIV();

    /**
     * Sets the value of the '{@link alin.sske.sSKEEcore.AES#getIV <em>IV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>IV</em>' attribute.
     * @see #getIV()
     * @generated
     */
    void setIV(String value);

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute. The literals are from the enumeration
     * {@link alin.sske.sSKEEcore.BlockCipherModeOfOperation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Mode</em>' attribute.
     * @see alin.sske.sSKEEcore.BlockCipherModeOfOperation
     * @see #setMode(BlockCipherModeOfOperation)
     * @see alin.sske.sSKEEcore.SSKEEcorePackage#getAES_Mode()
     * @model
     * @generated
     */
    BlockCipherModeOfOperation getMode();

    /**
     * Sets the value of the '{@link alin.sske.sSKEEcore.AES#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see alin.sske.sSKEEcore.BlockCipherModeOfOperation
     * @see #getMode()
     * @generated
     */
    void setMode(BlockCipherModeOfOperation value);

} // AES
