/**
 */
package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.SSKE;
import alin.sske.sSKEEcore.SSKEDecryptor;
import alin.sske.sSKEEcore.SSKEEcorePackage;
import alin.sske.sSKEEcore.SSKEEncryptor;
import alin.sske.sSKEEcore.SSKEKeys;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSKE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEImpl#getSskekeys <em>Sskekeys</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEImpl#getSskedecryptor <em>Sskedecryptor</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.impl.SSKEImpl#getSskeencryptor <em>Sskeencryptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSKEImpl extends MinimalEObjectImpl.Container implements SSKE {
	/**
	 * The cached value of the '{@link #getSskekeys() <em>Sskekeys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSskekeys()
	 * @generated
	 * @ordered
	 */
	protected SSKEKeys sskekeys;

	/**
	 * The cached value of the '{@link #getSskedecryptor() <em>Sskedecryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSskedecryptor()
	 * @generated
	 * @ordered
	 */
	protected SSKEDecryptor sskedecryptor;

	/**
	 * The cached value of the '{@link #getSskeencryptor() <em>Sskeencryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSskeencryptor()
	 * @generated
	 * @ordered
	 */
	protected SSKEEncryptor sskeencryptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SSKEEcorePackage.Literals.SSKE;
	}

	@Override
	public String encryptWord(String word) throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		String EW = sskeencryptor.getSymmetricencryptor().encrypt(word, sskekeys.getKeyA());
		int length = EW.length();
		String l = EW.substring(0,length/2);
		String r = EW.substring(length/2);

		String si = sskeencryptor.getPseudorandomgenerator().generateKey(0,sskekeys.getKeyB());
		String ki = sskeencryptor.getPseudorandomfunction().generateRandomPiece(sskekeys.getKeyC(),l);
		byte b[] = new byte[sskekeys.getKeyA().length()];
		for(int i=0; i<b.length;i++){
			b[i] = ki.getBytes()[i];
		}
		ki = new String(b,"ISO-8859-1");
		String s2 = sskeencryptor.getSymmetricencryptor().encrypt(si,ki);
		byte b3[] = new byte[r.getBytes().length];
		for(int i=0;i<r.getBytes().length;i++){
			b3[i] = s2.getBytes()[i];
		}

		byte b2[] = new byte[l.getBytes().length];
		for(int i=0;i<l.getBytes().length;i++){
			b2[i] = si.getBytes()[i];
		}
		String Ti = new String(b2) + new String(b3);

        byte rez[] = new byte[Ti.getBytes().length];

        for(int i=0;i<Ti.getBytes().length;i++)
        {
            rez[i] = (byte) (EW.getBytes()[i]^Ti.getBytes()[i]);
        }

        byte EWb[] = new byte[Ti.getBytes().length];
        for(int i=0;i<Ti.getBytes().length;i++)
        {
            EWb[i] = (byte) (rez[i]^Ti.getBytes()[i]);
        }
        String enwod=  new String(rez, "ISO-8859-1");
        return enwod;
	}

    @Override
    public String decryptWord(String encryptedWord) throws Exception {
        String si = sskedecryptor.getPseudorandomgenerator().generateKey(0,sskekeys.getKeyB());
        byte [] encryptedWordBytes = encryptedWord.getBytes("ISO-8859-1");
        byte left[] = new byte[encryptedWordBytes.length/2];
        for(int i=0;i<left.length;i++){
            left[i] = encryptedWordBytes[i];
        }
        byte right[] = new byte[encryptedWordBytes.length/2];
        for(int i=0;i<right.length;i++){
            right[i] = encryptedWordBytes[i+encryptedWordBytes.length/2];
        }

        byte [] li = new byte[left.length];

        for(int i=0;i<left.length;i++){
            li[i] = (byte) (si.getBytes()[i] ^ left[i]);
        }

        String l = new String(li);

        String ki = sskeencryptor.getPseudorandomfunction().generateRandomPiece(sskekeys.getKeyC(),l);

        byte b[] = new byte[sskekeys.getKeyA().length()];
        for(int i=0; i<b.length;i++){
            b[i] = ki.getBytes()[i];
        }
        ki = new String(b,"ISO-8859-1");
        String s2 = sskeencryptor.getSymmetricencryptor().encrypt(si,ki);

        byte [] ri = new byte[left.length];
        for(int i=0;i<right.length;i++){
            ri[i] = (byte) (s2.getBytes()[i] ^ right[i]);
        }

        String  r = new String(ri);

        return sskedecryptor.getSymmetricdecryptor().decrypt(l+r,getSskekeys().getKeyA());
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEKeys getSskekeys() {
		return sskekeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSskekeys(SSKEKeys newSskekeys, NotificationChain msgs) {
		SSKEKeys oldSskekeys = sskekeys;
		sskekeys = newSskekeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEKEYS, oldSskekeys, newSskekeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSskekeys(SSKEKeys newSskekeys) {
		if (newSskekeys != sskekeys) {
			NotificationChain msgs = null;
			if (sskekeys != null)
				msgs = ((InternalEObject)sskekeys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEKEYS, null, msgs);
			if (newSskekeys != null)
				msgs = ((InternalEObject)newSskekeys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEKEYS, null, msgs);
			msgs = basicSetSskekeys(newSskekeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEKEYS, newSskekeys, newSskekeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEDecryptor getSskedecryptor() {
		return sskedecryptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSskedecryptor(SSKEDecryptor newSskedecryptor, NotificationChain msgs) {
		SSKEDecryptor oldSskedecryptor = sskedecryptor;
		sskedecryptor = newSskedecryptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEDECRYPTOR, oldSskedecryptor, newSskedecryptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSskedecryptor(SSKEDecryptor newSskedecryptor) {
		if (newSskedecryptor != sskedecryptor) {
			NotificationChain msgs = null;
			if (sskedecryptor != null)
				msgs = ((InternalEObject)sskedecryptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEDECRYPTOR, null, msgs);
			if (newSskedecryptor != null)
				msgs = ((InternalEObject)newSskedecryptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEDECRYPTOR, null, msgs);
			msgs = basicSetSskedecryptor(newSskedecryptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEDECRYPTOR, newSskedecryptor, newSskedecryptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEncryptor getSskeencryptor() {
		return sskeencryptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSskeencryptor(SSKEEncryptor newSskeencryptor, NotificationChain msgs) {
		SSKEEncryptor oldSskeencryptor = sskeencryptor;
		sskeencryptor = newSskeencryptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEENCRYPTOR, oldSskeencryptor, newSskeencryptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSskeencryptor(SSKEEncryptor newSskeencryptor) {
		if (newSskeencryptor != sskeencryptor) {
			NotificationChain msgs = null;
			if (sskeencryptor != null)
				msgs = ((InternalEObject)sskeencryptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEENCRYPTOR, null, msgs);
			if (newSskeencryptor != null)
				msgs = ((InternalEObject)newSskeencryptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SSKEEcorePackage.SSKE__SSKEENCRYPTOR, null, msgs);
			msgs = basicSetSskeencryptor(newSskeencryptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.SSKE__SSKEENCRYPTOR, newSskeencryptor, newSskeencryptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SSKEEcorePackage.SSKE__SSKEKEYS:
				return basicSetSskekeys(null, msgs);
			case SSKEEcorePackage.SSKE__SSKEDECRYPTOR:
				return basicSetSskedecryptor(null, msgs);
			case SSKEEcorePackage.SSKE__SSKEENCRYPTOR:
				return basicSetSskeencryptor(null, msgs);
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
			case SSKEEcorePackage.SSKE__SSKEKEYS:
				return getSskekeys();
			case SSKEEcorePackage.SSKE__SSKEDECRYPTOR:
				return getSskedecryptor();
			case SSKEEcorePackage.SSKE__SSKEENCRYPTOR:
				return getSskeencryptor();
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
			case SSKEEcorePackage.SSKE__SSKEKEYS:
				setSskekeys((SSKEKeys)newValue);
				return;
			case SSKEEcorePackage.SSKE__SSKEDECRYPTOR:
				setSskedecryptor((SSKEDecryptor)newValue);
				return;
			case SSKEEcorePackage.SSKE__SSKEENCRYPTOR:
				setSskeencryptor((SSKEEncryptor)newValue);
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
			case SSKEEcorePackage.SSKE__SSKEKEYS:
				setSskekeys((SSKEKeys)null);
				return;
			case SSKEEcorePackage.SSKE__SSKEDECRYPTOR:
				setSskedecryptor((SSKEDecryptor)null);
				return;
			case SSKEEcorePackage.SSKE__SSKEENCRYPTOR:
				setSskeencryptor((SSKEEncryptor)null);
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
			case SSKEEcorePackage.SSKE__SSKEKEYS:
				return sskekeys != null;
			case SSKEEcorePackage.SSKE__SSKEDECRYPTOR:
				return sskedecryptor != null;
			case SSKEEcorePackage.SSKE__SSKEENCRYPTOR:
				return sskeencryptor != null;
		}
		return super.eIsSet(featureID);
	}

} //SSKEImpl