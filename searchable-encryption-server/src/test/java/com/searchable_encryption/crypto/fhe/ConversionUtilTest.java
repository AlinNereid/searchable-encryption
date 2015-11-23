package com.searchable_encryption.crypto.fhe;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConversionUtilTest {

    @Test
    public void getBitListShouldReturnTheCorrespondingBitListForAnInteger() {
        Integer number = 7;

        List<Bit> bitList = ConversionUtil.getBitList(number);

        assertEquals(3, bitList.size());
        assertEquals(Bit.ONE, bitList.get(0));
        assertEquals(Bit.ONE, bitList.get(1));
        assertEquals(Bit.ONE, bitList.get(2));
    }
}
