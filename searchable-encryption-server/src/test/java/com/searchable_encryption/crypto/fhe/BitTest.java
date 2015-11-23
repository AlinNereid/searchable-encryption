package com.searchable_encryption.crypto.fhe;

import java.math.BigInteger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BitTest {

    @Test
    public void getBitFromBigIntegerShouldReturnAZeroBitForAValueOfZero() {
        Bit actualBit = Bit.getBitFromBigInteger(BigInteger.ZERO);

        assertEquals(Bit.ZERO, actualBit);
    }

    @Test
    public void getBitFromBigIntegerShouldReturnAOneBitForAValueOfOne() {
        Bit actualBit = Bit.getBitFromBigInteger(BigInteger.ONE);

        assertEquals(Bit.ONE, actualBit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBitFromBigIntegerShouldThrowExceptionForIncorrectValue() {
        Bit.getBitFromBigInteger(BigInteger.TEN);
    }

    @Test
    public void getBitFromCharacterShouldReturnAZeroBitForAZeroCharacter() {
        Bit actualBit = Bit.getBitFromCharacter('0');

        assertEquals(Bit.ZERO, actualBit);
    }

    @Test
    public void getBitFromCharacterShouldReturnAOneBitForAOneCharacter() {
        Bit actualBit = Bit.getBitFromCharacter('1');

        assertEquals(Bit.ONE, actualBit);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getBitFromCharacterShouldThrowExceptionForAnInvalidCharacter() {
        Bit.getBitFromCharacter('2');
    }

    @Test
    public void zeroAndZeroIsZero() {
        Bit result = Bit.and(Bit.ZERO, Bit.ZERO);

        assertEquals(Bit.ZERO, result);
    }

    @Test
    public void zeroAndOneIsZero() {
        Bit result = Bit.and(Bit.ZERO, Bit.ONE);

        assertEquals(Bit.ZERO, result);
    }

    @Test
    public void oneAndZeroIsZero() {
        Bit result = Bit.and(Bit.ONE, Bit.ZERO);

        assertEquals(Bit.ZERO, result);
    }

    @Test
    public void oneAndOneIsOne() {
        Bit result = Bit.and(Bit.ONE, Bit.ONE);

        assertEquals(Bit.ONE, result);
    }

    @Test
    public void zeroXorZeroIsZero() {
        Bit result = Bit.xor(Bit.ZERO, Bit.ZERO);

        assertEquals(Bit.ZERO, result);
    }

    @Test
    public void zeroXorOneIsOne() {
        Bit result = Bit.xor(Bit.ZERO, Bit.ONE);

        assertEquals(Bit.ONE, result);
    }

    @Test
    public void oneXorZeroIsOne() {
        Bit result = Bit.xor(Bit.ONE, Bit.ZERO);

        assertEquals(Bit.ONE, result);
    }

    @Test
    public void oneXorOneIsZero() {
        Bit result = Bit.xor(Bit.ONE, Bit.ONE);

        assertEquals(Bit.ZERO, result);
    }

    @Test
    public void getCharacterFromBitShouldReturnZeroFromABitOfOne() {
        Character result = Bit.getCharacterFromBit(Bit.ZERO);

        assertEquals(new Character('0'), result);
    }

    @Test
    public void getCharacterFromBitShouldReturnOneFromABitOfOne() {
        Character result = Bit.getCharacterFromBit(Bit.ONE);

        assertEquals(new Character('1'), result);
    }
}
