package com.searchable_encryption.crypto.fhe;

import java.math.BigInteger;

public enum Bit {

    ZERO(BigInteger.ZERO), ONE(BigInteger.ONE);

    private final BigInteger bit;

    private Bit(BigInteger bit) {
        this.bit = bit;
    }

    public BigInteger bitValue() {
        return bit;
    }

    public static Bit getBitFromBigInteger(BigInteger bitInteger) {
        switch (bitInteger.intValue()) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            default:
                throw new IllegalArgumentException("A bit has a value of zero or one.");
        }
    }

    public static Bit getBitFromCharacter(Character character) {
        switch (character) {
            case '0':
                return ZERO;
            case '1':
                return ONE;
            default:
                throw new IllegalArgumentException("A bit has a value of zero or one.");
        }
    }

    public static Bit and(Bit firstBit, Bit secondBit) {
        return Bit.getBitFromBigInteger(firstBit.bitValue().multiply(secondBit.bitValue()));
    }

    public static Bit xor(Bit firstBit, Bit secondBit) {
        return Bit.getBitFromBigInteger(firstBit.bitValue().add(secondBit.bitValue()).mod(new BigInteger("2")));
    }

    public static Character getCharacterFromBit(Bit bit) {
        switch (bit) {
            case ZERO:
                return '0';
            case ONE:
                return '1';
            default:
                throw new IllegalArgumentException("A bit has a value of zero or one.");
        }
    }
}
