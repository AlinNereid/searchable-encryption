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
import java.util.List;

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


	protected byte[] getFirstKBytes(String s, int length){
		byte result[] = new byte[length];
		for(int i=0; i<length; i++) {
			result[i] = s.getBytes()[i];
		}
		return result;
	}

	protected byte[] getFirstKBytes(byte[] bytes, int length){
		byte result[] = new byte[length];
		for(int i=0; i<length; i++) {
			result[i] = bytes[i];
		}
		return result;
	}

	protected byte[] getLastKBytes(byte[] bytes, int length){
		byte result[] = new byte[length];
		for(int i=0; i<length; i++) {
			result[i] = bytes[i + length];
		}
		return result;
	}

	protected byte[] xorBytes(byte[] a, byte[] b, int length){
		byte result[] = new byte[length];
		for(int i=0; i<length; i++){
			result[i] = (byte) (a[i]^b[i]);
		}
		return result;
	}

	private String createKi(String leftSide) throws UnsupportedEncodingException {
		String ki = sskeencryptor.getPseudorandomfunction().generateRandomPiece(sskekeys.getKeyC(),leftSide);
		byte kiBytes[] = new byte[sskekeys.getKeyA().length()];
		for(int i=0; i<kiBytes.length;i++){
			kiBytes[i] = ki.getBytes()[i];
		}
		ki = new String(kiBytes,"ISO-8859-1");
		return ki;
	}

	@Override
	public String encryptWord(String word, int position) throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		String encryptedWord = sskeencryptor.getSymmetricencryptor().encrypt(word, sskekeys.getKeyA());
		int length = encryptedWord.length();
		String leftSide = encryptedWord.substring(0,length/2);
		String rightSide = encryptedWord.substring(length/2);
		String Si = sskeencryptor.getPseudorandomgenerator().generateKey(position,sskekeys.getKeyB());
		String ki = createKi(leftSide);
		byte siBytes[] = getFirstKBytes(Si ,leftSide.length());
		String siString = new String(siBytes,"ISO-8859-1");
		String encryptSiWithKi = sskeencryptor.getSymmetricencryptor().encrypt(siString,ki);
		byte encryptSiWithKiBytes[] = getFirstKBytes(encryptSiWithKi, rightSide.length());
		String Ti = new String(siBytes) + new String(encryptSiWithKiBytes);
        byte xorEncryptedWordWithTi[] = xorBytes(encryptedWord.getBytes(), Ti.getBytes(), Ti.getBytes().length);
        return  new String(xorEncryptedWordWithTi, "ISO-8859-1");
	}

	@Override
    public String decryptWord(String encryptedWord, int position) throws Exception {
        String si = sskedecryptor.getPseudorandomgenerator().generateKey(position,sskekeys.getKeyB());
        byte encryptedWordBytes[] = encryptedWord.getBytes("ISO-8859-1");
		byte leftSide[] = getFirstKBytes(encryptedWordBytes, encryptedWordBytes.length/2);
		byte siBytes[] = getFirstKBytes(si, leftSide.length);
		byte rightSide[] = getLastKBytes(encryptedWordBytes, encryptedWordBytes.length/2);
		byte computedLeftSide[] = xorBytes(si.getBytes(), leftSide, leftSide.length);
        String ki = sskeencryptor.getPseudorandomfunction().generateRandomPiece(sskekeys.getKeyC(), new String(computedLeftSide));
		byte kiBytes[] = getFirstKBytes(ki.getBytes(), sskekeys.getKeyA().length());
        String encryptSiWithKi = sskeencryptor.getSymmetricencryptor().encrypt(new String(siBytes,"ISO-8859-1"),  new String(kiBytes,"ISO-8859-1"));
		byte computedRightSide[] = xorBytes(encryptSiWithKi.getBytes(), rightSide, rightSide.length);
        return sskedecryptor.getSymmetricdecryptor().decrypt(new String(computedLeftSide) + new String(computedRightSide),getSskekeys().getKeyA());
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

	@Override
	public TokenSSKE generateToken(String word) throws Exception {
		String EW = sskeencryptor.getSymmetricencryptor().encrypt(word, sskekeys.getKeyA());
		TokenSSKE tokenSSKE = new TokenSSKE();
		tokenSSKE.setEWi(EW);
		int length = EW.length();
		String l = EW.substring(0,length/2);
		String ki = sskeencryptor.getPseudorandomfunction().generateRandomPiece(sskekeys.getKeyC(),l);
		byte b[] = new byte[sskekeys.getKeyA().length()];
		for(int i=0; i<b.length;i++){
			b[i] = ki.getBytes()[i];
		}
		ki = new String(b,"ISO-8859-1");
		tokenSSKE.setKi(ki);
		return tokenSSKE;
	}

	public boolean isWord(String enWord, TokenSSKE token) throws InvalidKeyException, UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException
	{
		
		
		byte rez[] = new byte[enWord.getBytes().length];

		if(token.getEWi().getBytes().length != enWord.getBytes().length)
			return false;
        
        for(int i=0;i<rez.length;i++)
        {
            rez[i] = (byte) (enWord.getBytes("ISO-8859-1")[i]^token.getEWi().getBytes("ISO-8859-1")[i]);
        }
        
        byte si[] = new byte[enWord.getBytes().length/2];
        for(int i=0;i<si.length;i++){
        	si[i] = rez[i];
        }
        String siString = new String(si,"ISO-8859-1");
        String s2 = sskeencryptor.getSymmetricencryptor().encrypt(siString,token.getKi());
		byte b3[] = new byte[s2.getBytes().length];
		for(int i=0;i<s2.getBytes().length;i++){
			b3[i] = s2.getBytes()[i];
		}
		for(int i=enWord.getBytes().length/2;i<enWord.getBytes().length;i++){
			if(rez[i]!=b3[i-enWord.getBytes().length/2]){
				return false;
			}
		}
		return true;
	}
	@Override
	public boolean isWordIn(List<String> encryptedText, TokenSSKE token)
			throws Exception {
		for (String enWord : encryptedText) {
			if(isWord(enWord, token)){
				return true;
			}
		}
		return false;
	}
} //SSKEImpl
