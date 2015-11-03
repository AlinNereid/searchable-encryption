package alin.sske.main;

import alin.sske.sSKEEcore.AES;
import alin.sske.sSKEEcore.SSKEEcoreFactory;
import alin.sske.sSKEEcore.impl.AESImpl;
import alin.sske.sSKEEcore.impl.SSKEEcoreFactoryImpl;

public class MainClass {
	public static void Main(String strings[]){
		SSKEEcoreFactoryImpl.init();
		SSKEEcoreFactoryImpl factory = new SSKEEcoreFactoryImpl();
		AES aes = factory.createAES();
		
		aes.encrypt("dsadsa", "123");
		
	}
}
