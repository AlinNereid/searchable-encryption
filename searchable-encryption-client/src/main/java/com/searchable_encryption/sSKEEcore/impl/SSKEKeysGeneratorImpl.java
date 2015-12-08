/**
 */
package com.searchable_encryption.sSKEEcore.impl;

import com.searchable_encryption.sSKEEcore.SSKEEcorePackage;
import com.searchable_encryption.sSKEEcore.SSKEKeys;
import com.searchable_encryption.sSKEEcore.SSKEKeysGenerator;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSKE Keys Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SSKEKeysGeneratorImpl extends MinimalEObjectImpl.Container implements SSKEKeysGenerator {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    protected SSKEKeysGeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SSKEEcorePackage.Literals.SSKE_KEYS_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SSKEKeys generateKeys() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SSKEEcorePackage.SSKE_KEYS_GENERATOR___GENERATE_KEYS:
                return generateKeys();
        }
        return super.eInvoke(operationID, arguments);
    }

} //SSKEKeysGeneratorImpl
