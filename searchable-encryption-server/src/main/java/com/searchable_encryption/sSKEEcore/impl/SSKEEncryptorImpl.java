/**
 */
package com.searchable_encryption.sSKEEcore.impl;

import com.searchable_encryption.sSKEEcore.PseudoRandomFunction;
import com.searchable_encryption.sSKEEcore.PseudoRandomGenerator;
import com.searchable_encryption.sSKEEcore.SSKEEcorePackage;
import com.searchable_encryption.sSKEEcore.SSKEEncryptor;
import com.searchable_encryption.sSKEEcore.SymmetricEncryptor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSKE Encryptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link alin.sske.sSKEEcore.impl.SSKEEncryptorImpl#getSymmetricencryptor <em>Symmetricencryptor</em>}</li>
 * <li>{@link alin.sske.sSKEEcore.impl.SSKEEncryptorImpl#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}</li>
 * <li>{@link alin.sske.sSKEEcore.impl.SSKEEncryptorImpl#getPseudorandomfunction <em>Pseudorandomfunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSKEEncryptorImpl extends MinimalEObjectImpl.Container implements SSKEEncryptor {

    /**
     * The cached value of the '{@link #getSymmetricencryptor() <em>Symmetricencryptor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSymmetricencryptor()
     * @generated
     * @ordered
     */
    protected SymmetricEncryptor symmetricencryptor;

    /**
     * The cached value of the '{@link #getPseudorandomgenerator() <em>Pseudorandomgenerator</em>}' containment
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPseudorandomgenerator()
     * @generated
     * @ordered
     */
    protected PseudoRandomGenerator pseudorandomgenerator;

    /**
     * The cached value of the '{@link #getPseudorandomfunction() <em>Pseudorandomfunction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPseudorandomfunction()
     * @generated
     * @ordered
     */
    protected PseudoRandomFunction pseudorandomfunction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    protected SSKEEncryptorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SSKEEcorePackage.Literals.SSKE_ENCRYPTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SymmetricEncryptor getSymmetricencryptor() {
        return symmetricencryptor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetSymmetricencryptor(SymmetricEncryptor newSymmetricencryptor, NotificationChain msgs) {
        SymmetricEncryptor oldSymmetricencryptor = symmetricencryptor;
        symmetricencryptor = newSymmetricencryptor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR, oldSymmetricencryptor, newSymmetricencryptor);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setSymmetricencryptor(SymmetricEncryptor newSymmetricencryptor) {
        if (newSymmetricencryptor != symmetricencryptor) {
            NotificationChain msgs = null;
            if (symmetricencryptor != null) {
                msgs = ((InternalEObject) symmetricencryptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR, null, msgs);
            }
            if (newSymmetricencryptor != null) {
                msgs = ((InternalEObject) newSymmetricencryptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR, null, msgs);
            }
            msgs = basicSetSymmetricencryptor(newSymmetricencryptor, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR, newSymmetricencryptor, newSymmetricencryptor));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PseudoRandomGenerator getPseudorandomgenerator() {
        return pseudorandomgenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetPseudorandomgenerator(PseudoRandomGenerator newPseudorandomgenerator, NotificationChain msgs) {
        PseudoRandomGenerator oldPseudorandomgenerator = pseudorandomgenerator;
        pseudorandomgenerator = newPseudorandomgenerator;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR, oldPseudorandomgenerator, newPseudorandomgenerator);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setPseudorandomgenerator(PseudoRandomGenerator newPseudorandomgenerator) {
        if (newPseudorandomgenerator != pseudorandomgenerator) {
            NotificationChain msgs = null;
            if (pseudorandomgenerator != null) {
                msgs = ((InternalEObject) pseudorandomgenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR, null, msgs);
            }
            if (newPseudorandomgenerator != null) {
                msgs = ((InternalEObject) newPseudorandomgenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR, null, msgs);
            }
            msgs = basicSetPseudorandomgenerator(newPseudorandomgenerator, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR, newPseudorandomgenerator, newPseudorandomgenerator));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PseudoRandomFunction getPseudorandomfunction() {
        return pseudorandomfunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public NotificationChain basicSetPseudorandomfunction(PseudoRandomFunction newPseudorandomfunction, NotificationChain msgs) {
        PseudoRandomFunction oldPseudorandomfunction = pseudorandomfunction;
        pseudorandomfunction = newPseudorandomfunction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION, oldPseudorandomfunction, newPseudorandomfunction);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setPseudorandomfunction(PseudoRandomFunction newPseudorandomfunction) {
        if (newPseudorandomfunction != pseudorandomfunction) {
            NotificationChain msgs = null;
            if (pseudorandomfunction != null) {
                msgs = ((InternalEObject) pseudorandomfunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION, null, msgs);
            }
            if (newPseudorandomfunction != null) {
                msgs = ((InternalEObject) newPseudorandomfunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION, null, msgs);
            }
            msgs = basicSetPseudorandomfunction(newPseudorandomfunction, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION, newPseudorandomfunction, newPseudorandomfunction));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR:
                return basicSetSymmetricencryptor(null, msgs);
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR:
                return basicSetPseudorandomgenerator(null, msgs);
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION:
                return basicSetPseudorandomfunction(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR:
                return getSymmetricencryptor();
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR:
                return getPseudorandomgenerator();
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION:
                return getPseudorandomfunction();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR:
                setSymmetricencryptor((SymmetricEncryptor) newValue);
                return;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR:
                setPseudorandomgenerator((PseudoRandomGenerator) newValue);
                return;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION:
                setPseudorandomfunction((PseudoRandomFunction) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR:
                setSymmetricencryptor((SymmetricEncryptor) null);
                return;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR:
                setPseudorandomgenerator((PseudoRandomGenerator) null);
                return;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION:
                setPseudorandomfunction((PseudoRandomFunction) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SSKEEcorePackage.SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR:
                return symmetricencryptor != null;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR:
                return pseudorandomgenerator != null;
            case SSKEEcorePackage.SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION:
                return pseudorandomfunction != null;
        }
        return super.eIsSet(featureID);
    }

} //SSKEEncryptorImpl
