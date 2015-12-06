/**
 */
package com.searchable_encryption.sSKEEcore.impl;

import com.searchable_encryption.sSKEEcore.AES;
import com.searchable_encryption.sSKEEcore.SSKE;
import com.searchable_encryption.sSKEEcore.BlockCipherModeOfOperation;
import com.searchable_encryption.sSKEEcore.SSKEDecryptor;
import com.searchable_encryption.sSKEEcore.SSKEEcoreFactory;
import com.searchable_encryption.sSKEEcore.SSKEEcorePackage;
import com.searchable_encryption.sSKEEcore.SSKEEncryptor;
import com.searchable_encryption.sSKEEcore.SSKEKeys;
import com.searchable_encryption.sSKEEcore.SSKEKeysGenerator;
import com.searchable_encryption.sSKEEcore.SSKKeysJson;
import com.searchable_encryption.sSKEEcore.SSKKeysTxt;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SSKEEcoreFactoryImpl extends EFactoryImpl implements SSKEEcoreFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static SSKEEcoreFactory init() {
        try {
            SSKEEcoreFactory theSSKEEcoreFactory = (SSKEEcoreFactory) EPackage.Registry.INSTANCE.getEFactory(SSKEEcorePackage.eNS_URI);
            if (theSSKEEcoreFactory != null) {
                return theSSKEEcoreFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SSKEEcoreFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public SSKEEcoreFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR:
                return createSSKEEncryptor();
            case SSKEEcorePackage.SSKE_DECRYPTOR:
                return createSSKEDecryptor();
            case SSKEEcorePackage.AES:
                return createAES();
            case SSKEEcorePackage.SSKE_KEYS:
                return createSSKEKeys();
            case SSKEEcorePackage.SSK_KEYS_TXT:
                return createSSKKeysTxt();
            case SSKEEcorePackage.SSKE:
                return createSSKE();
            case SSKEEcorePackage.SSKE_KEYS_GENERATOR:
                return createSSKEKeysGenerator();
            case SSKEEcorePackage.SSK_KEYS_JSON:
                return createSSKKeysJson();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SSKEEcorePackage.BLOCK_CIPHER_MODE_OF_OPERATION:
                return createBlockCipherModeOfOperationFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SSKEEcorePackage.BLOCK_CIPHER_MODE_OF_OPERATION:
                return convertBlockCipherModeOfOperationToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEEncryptor createSSKEEncryptor() {
        SSKEEncryptorImpl sskeEncryptor = new SSKEEncryptorImpl();
        return sskeEncryptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEDecryptor createSSKEDecryptor() {
        SSKEDecryptorImpl sskeDecryptor = new SSKEDecryptorImpl();
        return sskeDecryptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public AES createAES() {
        AESImpl aes = new AESImpl();
        return aes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEKeys createSSKEKeys() {
        SSKEKeysImpl sskeKeys = new SSKEKeysImpl();
        return sskeKeys;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKKeysTxt createSSKKeysTxt() {
        SSKKeysTxtImpl sskKeysTxt = new SSKKeysTxtImpl(null);
        return sskKeysTxt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKE createSSKE() {
        SSKEImpl sske = new SSKEImpl();
        return sske;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEKeysGenerator createSSKEKeysGenerator() {
        SSKEKeysGeneratorImpl sskeKeysGenerator = new SSKEKeysGeneratorImpl();
        return sskeKeysGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKKeysJson createSSKKeysJson() {
        SSKKeysJsonImpl sskKeysJson = new SSKKeysJsonImpl(null);
        return sskKeysJson;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public BlockCipherModeOfOperation createBlockCipherModeOfOperationFromString(EDataType eDataType, String initialValue) {
        BlockCipherModeOfOperation result = BlockCipherModeOfOperation.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public String convertBlockCipherModeOfOperationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEEcorePackage getSSKEEcorePackage() {
        return (SSKEEcorePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @deprecated @generated
     */
    @Deprecated
    public static SSKEEcorePackage getPackage() {
        return SSKEEcorePackage.eINSTANCE;
    }

} //SSKEEcoreFactoryImpl
