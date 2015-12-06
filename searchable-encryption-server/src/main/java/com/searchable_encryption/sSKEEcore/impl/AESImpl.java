/**
 */
package com.searchable_encryption.sSKEEcore.impl;

import com.searchable_encryption.sSKEEcore.BlockCipherModeOfOperation;
import com.searchable_encryption.sSKEEcore.SSKEEcorePackage;
import com.searchable_encryption.sSKEEcore.SymmetricDecryptor;
import com.searchable_encryption.sSKEEcore.AES;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link alin.sske.sSKEEcore.impl.AESImpl#getIV <em>IV</em>}</li>
 * <li>{@link alin.sske.sSKEEcore.impl.AESImpl#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AESImpl extends MinimalEObjectImpl.Container implements AES {

    /**
     * The default value of the '{@link #getIV() <em>IV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getIV()
     * @generated
     * @ordered
     */
    public static final String IV_EDEFAULT = "1234567890123456"; // 16 bytes IV

    /**
     * The cached value of the '{@link #getIV() <em>IV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getIV()
     * @generated
     * @ordered
     */
    protected String iv = IV_EDEFAULT;

    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final BlockCipherModeOfOperation MODE_EDEFAULT = BlockCipherModeOfOperation.CBC;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected BlockCipherModeOfOperation mode = MODE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public AESImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SSKEEcorePackage.Literals.AES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public String getIV() {
        return iv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setIV(String newIV) {
        String oldIV = iv;
        iv = newIV;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.AES__IV, oldIV, iv));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public BlockCipherModeOfOperation getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setMode(BlockCipherModeOfOperation newMode) {
        BlockCipherModeOfOperation oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, SSKEEcorePackage.AES__MODE, oldMode, mode));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public String decrypt(String encryptedData, String key) throws Exception {
        IvParameterSpec iv = new IvParameterSpec(getIV().getBytes("ISO-8859-1"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes("ISO-8859-1"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, iv);

        byte[] data = cipher.doFinal(Base64.decodeBase64(encryptedData));

        return new String(data);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public String encrypt(String data, String key) throws UnsupportedEncodingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        IvParameterSpec iv = new IvParameterSpec(getIV().getBytes("ISO-8859-1"));
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes("ISO-8859-1"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, iv);

        byte[] encryptedData = cipher.doFinal(data.getBytes("ISO-8859-1"));

        return Base64.encodeBase64String(encryptedData);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SSKEEcorePackage.AES__IV:
                return getIV();
            case SSKEEcorePackage.AES__MODE:
                return getMode();
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
            case SSKEEcorePackage.AES__IV:
                setIV((String) newValue);
                return;
            case SSKEEcorePackage.AES__MODE:
                setMode((BlockCipherModeOfOperation) newValue);
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
            case SSKEEcorePackage.AES__IV:
                setIV(IV_EDEFAULT);
                return;
            case SSKEEcorePackage.AES__MODE:
                setMode(MODE_EDEFAULT);
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
            case SSKEEcorePackage.AES__IV:
                return IV_EDEFAULT == null ? iv != null : !IV_EDEFAULT.equals(iv);
            case SSKEEcorePackage.AES__MODE:
                return mode != MODE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == SymmetricDecryptor.class) {
            switch (baseOperationID) {
                case SSKEEcorePackage.SYMMETRIC_DECRYPTOR___DECRYPT__STRING_STRING:
                    return SSKEEcorePackage.AES___DECRYPT__STRING_STRING;
                default:
                    return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SSKEEcorePackage.AES___DECRYPT__STRING_STRING:
                try {
                    decrypt((String) arguments.get(0), (String) arguments.get(1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            case SSKEEcorePackage.AES___ENCRYPT__STRING_STRING:
                try {
                    return encrypt((String) arguments.get(0), (String) arguments.get(1));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (NoSuchPaddingException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                } catch (InvalidAlgorithmParameterException e) {
                    e.printStackTrace();
                } catch (InvalidKeyException e) {
                    e.printStackTrace();
                } catch (BadPaddingException e) {
                    e.printStackTrace();
                } catch (IllegalBlockSizeException e) {
                    e.printStackTrace();
                }
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (IV: ");
        result.append(iv);
        result.append(", Mode: ");
        result.append(mode);
        result.append(')');
        return result.toString();
    }

} //AESImpl
