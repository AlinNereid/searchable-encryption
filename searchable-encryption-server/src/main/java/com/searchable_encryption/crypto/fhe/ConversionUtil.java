package com.searchable_encryption.crypto.fhe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public abstract class ConversionUtil {

    public static List<Bit> getBitList(Integer number) {
        String binaryRepresentationOfNumber = new BigInteger(number.toString()).toString(2);

        List<Bit> bitListOfNumber = new ArrayList<>();

        for (Character bit : binaryRepresentationOfNumber.toCharArray()) {
            bitListOfNumber.add(Bit.getBitFromCharacter(bit));
        }

        return bitListOfNumber;
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
