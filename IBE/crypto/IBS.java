package crypto;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.digests.SHA256Digest;

import it.unisa.dia.gas.crypto.jpbc.signature.ps06.engines.PS06Signer;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.generators.PS06ParametersGenerator;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.generators.PS06SecretKeyGenerator;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.generators.PS06SetupGenerator;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06Parameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06PublicKeyParameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06SecretKeyGenerationParameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06SecretKeyParameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06SetupGenerationParameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06SignParameters;
import it.unisa.dia.gas.crypto.jpbc.signature.ps06.params.PS06VerifyParameters;
import it.unisa.dia.gas.plaf.jpbc.pairing.PairingFactory;

public class IBS {
	/**
	 * Se extrage cheia secreta pentru o anumita identitate.
	 * @param keyPair
	 * @param identity
	 * @return
	 */
	public CipherParameters extract(AsymmetricCipherKeyPair keyPair, String identity) {
		if(keyPair == null) {
			return null;
		}
		
		PS06SecretKeyGenerator extract = new PS06SecretKeyGenerator();
		extract.init(new PS06SecretKeyGenerationParameters(keyPair, identity));
		
		return extract.generateKey();
	}
	
	/**
	 * Se genereaza o pereche de chei master publica si secreta pentru schema IBE.
	 * @param parameters
	 * @return
	 */
	public AsymmetricCipherKeyPair setup(PS06Parameters parameters) {
		PS06SetupGenerator setup = new PS06SetupGenerator();
		setup.init(new PS06SetupGenerationParameters(null, parameters));
		
		return setup.generateKeyPair();
	}
	
	/**
	 * Genereaza parametrii pentru curba eliptica.
	 * @param nU
	 * @param nM
	 * @param configFile
	 * @return
	 */
	public PS06Parameters createParameters(int nU, int nM, String configFile) {
		return new PS06ParametersGenerator().init(
				PairingFactory.getPairingParameters(configFile), 
				nU, nM).generateParameters();
	}
	
	/**
	 * Signs a message using a secret key corresponding to an identity.
	 * @param message
	 * @param secretKey
	 * @return
	 */
	public byte[] sign(String message, CipherParameters secretKey) {
		if(secretKey == null) {
			return null;
		}
		
		byte[] bytes = message.getBytes();
		
		PS06Signer signer = new PS06Signer(new SHA256Digest());
		signer.init(true, new PS06SignParameters((PS06SecretKeyParameters) secretKey));
		signer.update(bytes, 0, bytes.length);
		
		byte[] signature = null;		
		try {
			signature = signer.generateSignature();
		}
		catch(CryptoException e) {
			System.out.println(e.getMessage());
		}
		
		return signature;
	}
	
	/**
	 * Verifies a signature using the master public key and the identity.
	 * @param publicKey
	 * @param message
	 * @param identity
	 * @param signature
	 * @return
	 */
	public boolean verify(CipherParameters publicKey, String message, String identity, byte[] signature) {
		if(publicKey == null) {
			return false;
		}
		
		byte[] bytes = message.getBytes();
		
		PS06Signer signer = new PS06Signer(new SHA256Digest());
		signer.init(false, new PS06VerifyParameters((PS06PublicKeyParameters) publicKey, identity));
		signer.update(bytes, 0, bytes.length);
		
		return signer.verifySignature(signature);
	}
}
