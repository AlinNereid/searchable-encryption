package com.searchable_encryption.tests;

import com.searchable_encryption.sSKEEcore.PseudoRandomFunction;
import com.searchable_encryption.sSKEEcore.impl.PRFImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alin_ on 11/17/2015.
 */
public class PRFImplTest {
    PseudoRandomFunction prf = new PRFImpl();
    @Test
    public void testGenerateRandomPiece() throws Exception {
        String key = "cheie1";
        String seed = "seed";
        String key2 = "cheie3";

        assertEquals(prf.generateRandomPiece(key,seed),prf.generateRandomPiece(key,seed));
        assertNotEquals(prf.generateRandomPiece(key,seed),prf.generateRandomPiece(key2,seed));
    }
}