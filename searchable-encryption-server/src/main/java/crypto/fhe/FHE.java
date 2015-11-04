package crypto.fhe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;

public class FHE {

    private final int lambda = 6;

    private final int niu = lambda * lambda * lambda;
    private final int gama = lambda * lambda * lambda * lambda * lambda;
    private final int ro = lambda;

    private BigInteger secretKey;

    private List<BigInteger> publicKey;

    @PostConstruct
    private void initialize() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public BigInteger encrypt(Bit bit) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<BigInteger> encrypt(List<Bit> bitList) {
        List<BigInteger> encryptedBitList = new ArrayList<>();

        for (Bit bit : bitList) {
            encryptedBitList.add(this.encrypt(bit));
        }
        return encryptedBitList;
    }

    public List<Bit> decrypt(List<BigInteger> encryptedBitList) {
        List<Bit> decryptedBitList = new ArrayList<>();

        for (BigInteger encryptedBit : encryptedBitList) {
            decryptedBitList.add(this.decrypt(encryptedBit));
        }

        return decryptedBitList;
    }

    public Bit decrypt(BigInteger c) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public BigInteger reduceNoise(BigInteger encryptedBit) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<BigInteger> reduceNoise(List<BigInteger> encyptedBitList) {
        List<BigInteger> reencryptedBitList = new ArrayList<>();

        for (BigInteger encryptedBit : encyptedBitList) {
            reencryptedBitList.add(reduceNoise(encryptedBit));
        }

        return reencryptedBitList;
    }

    private BigInteger generateSecretKey() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private List<BigInteger> generatePublicKey() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Set<BigInteger> getRandomSubsetOfPublicKey() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
