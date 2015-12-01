/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

import alin.sske.sSKEEcore.impl.TokenSSKE;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSKE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.SSKE#getSskekeys <em>Sskekeys</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKE#getSskedecryptor <em>Sskedecryptor</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKE#getSskeencryptor <em>Sskeencryptor</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKE()
 * @model
 * @generated
 */
public interface SSKE extends EObject {
	/**
	 * Returns the value of the '<em><b>Sskekeys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sskekeys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sskekeys</em>' containment reference.
	 * @see #setSskekeys(SSKEKeys)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKE_Sskekeys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	String encryptWord(String word, int position) throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException;
	String decryptWord(String encryptedWord, int position) throws Exception;
	TokenSSKE generateToken(String word) throws Exception;
	boolean isWordIn(List<String> encryptedText,TokenSSKE token)throws Exception;
	SSKEKeys getSskekeys();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKE#getSskekeys <em>Sskekeys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sskekeys</em>' containment reference.
	 * @see #getSskekeys()
	 * @generated
	 */
	void setSskekeys(SSKEKeys value);

	/**
	 * Returns the value of the '<em><b>Sskedecryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sskedecryptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sskedecryptor</em>' containment reference.
	 * @see #setSskedecryptor(SSKEDecryptor)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKE_Sskedecryptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SSKEDecryptor getSskedecryptor();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKE#getSskedecryptor <em>Sskedecryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sskedecryptor</em>' containment reference.
	 * @see #getSskedecryptor()
	 * @generated
	 */
	void setSskedecryptor(SSKEDecryptor value);

	/**
	 * Returns the value of the '<em><b>Sskeencryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sskeencryptor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sskeencryptor</em>' containment reference.
	 * @see #setSskeencryptor(SSKEEncryptor)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKE_Sskeencryptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SSKEEncryptor getSskeencryptor();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKE#getSskeencryptor <em>Sskeencryptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sskeencryptor</em>' containment reference.
	 * @see #getSskeencryptor()
	 * @generated
	 */
	void setSskeencryptor(SSKEEncryptor value);

} // SSKE
