package crypto;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidParameterSpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class AuthenticatedEncryption {
	
	static byte[] encryptThenMac(byte[] data, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidParameterSpecException, IllegalBlockSizeException, BadPaddingException {
		//encrypt
		SecretKey secretKey = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");		
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		AlgorithmParameters params = cipher.getParameters();
		byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
		byte[] ciphertext = cipher.doFinal(data);
		
		//mac
		byte[] mac_data = Arrays.concatenate(ciphertext, iv);
		byte[] tag = new byte[128];
		                      
		BlockCipher macCipher = new AESEngine();
		Mac mac = new CBCBlockCipherMac(macCipher, 128);
		mac.init(new KeyParameter(key));
		mac.update(mac_data, 0, mac_data.length);
		mac.doFinal(tag, 0);				
		
		return Arrays.concatenate(mac_data, tag);
	}
	
}
