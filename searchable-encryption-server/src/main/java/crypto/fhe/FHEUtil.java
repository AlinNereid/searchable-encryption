package crypto.fhe;

import dao.fhe.FHEParameters;
import java.math.BigInteger;
import java.util.List;

public abstract class FHEUtil {

    public static FHEParameters serializeParameters(BigInteger secretKey, List<BigInteger> publicKey) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static List<BigInteger> deserializePublicKey(FHEParameters fheParameters) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static BigInteger deserializeSecretKey(FHEParameters fheParameters) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private FHEUtil() {

    }
}
