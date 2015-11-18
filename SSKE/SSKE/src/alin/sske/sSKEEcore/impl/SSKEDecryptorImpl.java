/**
 */
package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.PseudoRandomFunction;
import alin.sske.sSKEEcore.PseudoRandomGenerator;
import alin.sske.sSKEEcore.SSKEDecryptor;
import alin.sske.sSKEEcore.SSKEEcorePackage;
import alin.sske.sSKEEcore.SymmetricDecryptor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSKE Decryptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEDecryptorImpl#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEDecryptorImpl#getPseudorandomfunction <em>Pseudorandomfunction</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEDecryptorImpl#getSymmetricdecryptor <em>Symmetricdecryptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSKEDecryptorImpl extends MinimalEObjectImpl.Container implements SSKEDecryptor {
	/**
	 * The cached value of the '{@link #getPseudorandomgenerator() <em>Pseudorandomgenerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudorandomgenerator()
	 * @generated
	 * @ordered
	 */
	protected PseudoRandomGenerator pseudorandomgenerator;

	/**
	 * The cached value of the '{@link #getPseudorandomfunction() <em>Pseudorandomfunction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudorandomfunction()
	 * @generated
	 * @ordered
	 */
	protected PseudoRandomFunction pseudorandomfunction;

	/**
	 * The cached value of the '{@link #getSymmetricdecryptor() <em>Symmetricdecryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetricdecryptor()
	 * @generated
	 * @ordered
	 */
	protected SymmetricDecryptor symmetricdecryptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEDecryptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SSKEEcorePackage.Literals.SSKE_DECRYPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoRandomGenerator getPseudorandomgenerator() {
		return pseudorandomgenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPseudorandomgenerator(PseudoRandomGenerator newPseudorandomgenerator, NotificationChain msgs) {
		PseudoRandomGenerator oldPseudorandomgenerator = pseudorandomgenerator;
		pseudorandomgenerator = newPseudorandomgenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR, oldPseudorandomgenerator, newPseudorandomgenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudorandomgenerator(PseudoRandomGenerator newPseudorandomgenerator) {
		if (newPseudorandomgenerator != pseudorandomgenerator) {
			NotificationChain msgs = null;
			if (pseudorandomgenerator != null)
				msgs = ((InternalEObject)pseudorandomgenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR, null, msgs);
			if (newPseudorandomgenerator != null)
				msgs = ((InternalEObject)newPseudorandomgenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR, null, msgs);
			msgs = basicSetPseudorandomgenerator(newPseudorandomgenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR, newPseudorandomgenerator, newPseudorandomgenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudoRandomFunction getPseudorandomfunction() {
		return pseudorandomfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPseudorandomfunction(PseudoRandomFunction newPseudorandomfunction, NotificationChain msgs) {
		PseudoRandomFunction oldPseudorandomfunction = pseudorandomfunction;
		pseudorandomfunction = newPseudorandomfunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION, oldPseudorandomfunction, newPseudorandomfunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudorandomfunction(PseudoRandomFunction newPseudorandomfunction) {
		if (newPseudorandomfunction != pseudorandomfunction) {
			NotificationChain msgs = null;
			if (pseudorandomfunction != null)
				msgs = ((InternalEObject)pseudorandomfunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION, null, msgs);
			if (newPseudorandomfunction != null)
				msgs = ((InternalEObject)newPseudorandomfunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION, null, msgs);
			msgs = basicSetPseudorandomfunction(newPseudorandomfunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION, newPseudorandomfunction, newPseudorandomfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricDecryptor getSymmetricdecryptor() {
		return symmetricdecryptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymmetricdecryptor(SymmetricDecryptor newSymmetricdecryptor, NotificationChain msgs) {
		SymmetricDecryptor oldSymmetricdecryptor = symmetricdecryptor;
		symmetricdecryptor = newSymmetricdecryptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR, oldSymmetricdecryptor, newSymmetricdecryptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetricdecryptor(SymmetricDecryptor newSymmetricdecryptor) {
		if (newSymmetricdecryptor != symmetricdecryptor) {
			NotificationChain msgs = null;
			if (symmetricdecryptor != null)
				msgs = ((InternalEObject)symmetricdecryptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR, null, msgs);
			if (newSymmetricdecryptor != null)
				msgs = ((InternalEObject)newSymmetricdecryptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR, null, msgs);
			msgs = basicSetSymmetricdecryptor(newSymmetricdecryptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR, newSymmetricdecryptor, newSymmetricdecryptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR:
				return basicSetPseudorandomgenerator(null, msgs);
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION:
				return basicSetPseudorandomfunction(null, msgs);
			case SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR:
				return basicSetSymmetricdecryptor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR:
				return getPseudorandomgenerator();
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION:
				return getPseudorandomfunction();
			case SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR:
				return getSymmetricdecryptor();
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
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR:
				setPseudorandomgenerator((PseudoRandomGenerator)newValue);
				return;
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION:
				setPseudorandomfunction((PseudoRandomFunction)newValue);
				return;
			case SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR:
				setSymmetricdecryptor((SymmetricDecryptor)newValue);
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
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR:
				setPseudorandomgenerator((PseudoRandomGenerator)null);
				return;
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION:
				setPseudorandomfunction((PseudoRandomFunction)null);
				return;
			case SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR:
				setSymmetricdecryptor((SymmetricDecryptor)null);
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
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR:
				return pseudorandomgenerator != null;
			case SSKEEcorePackage.SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION:
				return pseudorandomfunction != null;
			case SSKEEcorePackage.SSKE_DECRYPTOR__SYMMETRICDECRYPTOR:
				return symmetricdecryptor != null;
		}
		return super.eIsSet(featureID);
	}

} //SSKEDecryptorImpl
