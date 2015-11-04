package crypto.fhe;

import java.math.BigInteger;
import java.util.List;

public abstract class ConversionUtil {

    public static List<Bit> getBitList(Integer number) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static Integer getIntegerFromBitList(List<Bit> bitList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String encodeToString(List<BigInteger> numberList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static List<BigInteger> decodeFromString(String encodedNumberList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private ConversionUtil() {
    }
}
