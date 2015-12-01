package core;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class MainClass {
	
	public static void main(String[] args) {
		Security.addProvider(new BouncyCastleProvider());
	}

}
