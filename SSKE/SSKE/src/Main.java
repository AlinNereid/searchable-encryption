

import alin.sske.sSKEEcore.*;
import alin.sske.sSKEEcore.impl.*;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String strings[]) throws Exception {

        SSKE sske;

        SSKEEcoreFactoryImpl factory;
        
    	SSKEEcoreFactoryImpl.init();
        factory = new SSKEEcoreFactoryImpl();
        sske = factory.createSSKE();
        SSKEEncryptor sskeEncryptor = factory.createSSKEEncryptor();
        sskeEncryptor.setSymmetricencryptor(new AESImpl());
        sskeEncryptor.setPseudorandomfunction(new PRFImpl());
        sskeEncryptor.setPseudorandomgenerator(new PRGImpl());

        SSKEDecryptor sskeDecryptor = factory.createSSKEDecryptor();
        sskeDecryptor.setSymmetricdecryptor(new AESImpl());
        sskeDecryptor.setPseudorandomfunction(new PRFImpl());
        sskeDecryptor.setPseudorandomgenerator(new PRGImpl());

        sske.setSskedecryptor(sskeDecryptor);
        sske.setSskeencryptor(sskeEncryptor);
        
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);


//        String encryptWord = sske.encryptWord("wordword12",0);
//        encryptWord = sske.encryptWord("wordword12",0);
//        encryptWord = sske.encryptWord("wordword14",0);
//        encryptWord = sske.encryptWord("wordword14",0);
//        encryptWord = sske.encryptWord("wordword12",0);
//        
//        String word = sske.decryptWord(encryptWord,0);
//
//        encryptWord = sske.encryptWord("wordword14",2);
//        
//        word = sske.decryptWord(encryptWord,2);
        
        
        List<String> text = new ArrayList<String>();
//        text.add("Ana");
//        text.add("are");
//        text.add("multe");
//        text.add("mere");
//        text.add("verzi");
//        text.add("si");
	      for(int i=0;i<100001;i++){
	    	  text.add("Text" + i); 
	      }
        List<String> encryptedText = new ArrayList<String>();
        
        for(int i=0;i<text.size();i++){
        	String enWord = sske.encryptWord(text.get(i), i);
        	encryptedText.add(enWord);
        }
//        
//        List<String> decryptedText = new ArrayList<String>();
//        
//        for(int i=0;i<encryptedText.size();i++){
//        	String enWord = sske.decryptWord(encryptedText.get(i), i);
//        	decryptedText.add(enWord);
//        }
//        
//        for (int i = 0; i < decryptedText.size(); i++) {
//			System.out.println(decryptedText.get(i));
//		}
        
        TokenSSKE token =  sske.generateToken("Text100001");
        System.out.println(sske.isWordIn(encryptedText,token));
    }
}
