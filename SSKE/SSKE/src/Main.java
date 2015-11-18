

import alin.sske.sSKEEcore.*;
import alin.sske.sSKEEcore.impl.*;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;

public class Main {
    public static void main(String strings[]) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException, ShortBufferException, BadPaddingException, IllegalBlockSizeException {

        SSKEEcoreFactoryImpl.init();
        SSKEEcoreFactoryImpl factory = new SSKEEcoreFactoryImpl();
        AES aes = factory.createAES();

        //aes.encrypt("dsadsa", "123");
        SSKE sske = factory.createSSKE();
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        SSKEKeysGenerator sskeGenerator = factory.createSSKEKeysGenerator();
        //sskeGenerator.generateKeys();

        SSKKeysTxt keysTxt = new SSKKeysTxtImpl(sskeKeys);
        SSKKeysJson keysJson = new SSKKeysJsonImpl(sskeKeys);

        String key = "anaaremere123456"; // 128 bit key
        String initVector = "1234567890123456"; // 16 bytes IV



        System.out.println(sskeKeys.toString());

        System.out.println(decrypt(key, initVector,
                encrypt(key, initVector, "Hello World")));
    }
    public static String encrypt(String key, String initVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            System.out.println("encrypted string: "
                    + Base64.encodeBase64String(encrypted));

            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
