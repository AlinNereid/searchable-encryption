package core;

import crypto.*;
import java.io.File;
import java.io.FileWriter;
import java.security.Security;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		Security.addProvider(new BouncyCastleProvider());
		
		IBS ibs = new IBS();
		/*AsymmetricCipherKeyPair keyPair = ibs.setup(ibs.createParameters(256, 256, "a.properties"));		
		CipherParameters secretKey = ibs.extract(keyPair, "01001101");*/
		AsymmetricCipherKeyPair keyPair = null;
		CipherParameters secretKey = null;
		
		String message = "Hello World!!!";
		byte[] signature = ibs.sign(message, secretKey);
		
		/*String message = "abc";
		byte[] signature = {1, 2, 3};*/
		
		//CipherParameters publicKey = keyPair.getPublic();
		CipherParameters publicKey = null;
		
		System.out.println(ibs.verify(publicKey, message, "01001101", signature));		   
		System.out.println(ibs.verify(publicKey, message, "01001100", signature));		
	}

}
