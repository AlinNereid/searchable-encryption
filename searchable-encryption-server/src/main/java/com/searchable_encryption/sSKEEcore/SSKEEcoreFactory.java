/**
 */
package com.searchable_encryption.sSKEEcore;

import com.searchable_encryption.sSKEEcore.impl.SSKEEcoreFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage
 * @generated
 */
public interface SSKEEcoreFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    SSKEEcoreFactory eINSTANCE = SSKEEcoreFactoryImpl.init();

    /**
     * Returns a new object of class '<em>SSKE Encryptor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSKE Encryptor</em>'.
     * @generated
     */
    SSKEEncryptor createSSKEEncryptor();

    /**
     * Returns a new object of class '<em>SSKE Decryptor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSKE Decryptor</em>'.
     * @generated
     */
    SSKEDecryptor createSSKEDecryptor();

    /**
     * Returns a new object of class '<em>AES</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>AES</em>'.
     * @generated
     */
    AES createAES();

    /**
     * Returns a new object of class '<em>SSKE Keys</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSKE Keys</em>'.
     * @generated
     */
    SSKEKeys createSSKEKeys();

    /**
     * Returns a new object of class '<em>SSK Keys Txt</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSK Keys Txt</em>'.
     * @generated
     */
    SSKKeysTxt createSSKKeysTxt();

    /**
     * Returns a new object of class '<em>SSKE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSKE</em>'.
     * @generated
     */
    SSKE createSSKE();

    /**
     * Returns a new object of class '<em>SSKE Keys Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSKE Keys Generator</em>'.
     * @generated
     */
    SSKEKeysGenerator createSSKEKeysGenerator();

    /**
     * Returns a new object of class '<em>SSK Keys Json</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>SSK Keys Json</em>'.
     * @generated
     */
    SSKKeysJson createSSKKeysJson();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    SSKEEcorePackage getSSKEEcorePackage();

} //SSKEEcoreFactory
