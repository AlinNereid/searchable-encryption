

import alin.sske.sSKEEcore.AES;
import alin.sske.sSKEEcore.SSKEEcoreFactory;
import alin.sske.sSKEEcore.SSKEKeys;
import alin.sske.sSKEEcore.SSKEKeysGenerator;
import alin.sske.sSKEEcore.SSKKeysJson;
import alin.sske.sSKEEcore.SSKKeysTxt;
import alin.sske.sSKEEcore.impl.AESImpl;
import alin.sske.sSKEEcore.impl.SSKEEcoreFactoryImpl;
import alin.sske.sSKEEcore.impl.SSKKeysJsonImpl;
import alin.sske.sSKEEcore.impl.SSKKeysTxtImpl;

public class MainClass {
	public static void main(String strings[]){
		SSKEEcoreFactoryImpl.init();
		SSKEEcoreFactoryImpl factory = new SSKEEcoreFactoryImpl();
		AES aes = factory.createAES();
		
		//aes.encrypt("dsadsa", "123");
		
		SSKEKeys sskeKeys = factory.createSSKEKeys();
		SSKEKeysGenerator sskeGenerator = factory.createSSKEKeysGenerator();
		//sskeGenerator.generateKeys();
		
		SSKKeysTxt keysTxt = new SSKKeysTxtImpl(sskeKeys);
		SSKKeysJson keysJson = new SSKKeysJsonImpl(sskeKeys);
		
		
		System.out.println(sskeKeys.toString());
		
		EncryptedWords encryptedWords = new EncryptedWords();

	      for(Iterator iter = encryptedWords.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("EncryptedWord : " + name);
	      } 	
	}
}
