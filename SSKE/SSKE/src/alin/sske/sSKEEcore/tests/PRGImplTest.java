package alin.sske.sSKEEcore.tests;

import alin.sske.sSKEEcore.PseudoRandomGenerator;
import alin.sske.sSKEEcore.impl.PRGImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alin_ on 11/15/2015.
 */
public class PRGImplTest {
    PseudoRandomGenerator pseudoRandomGenerator = new PRGImpl();
    @Test
    public void testGenerateKey() throws Exception {
        String key = pseudoRandomGenerator.generateKey(10, "a");
        String key2 = pseudoRandomGenerator.generateKey(10, "a");
        String key3 = pseudoRandomGenerator.generateKey(11, "a");
        assertEquals(key, key2);
        assertNotEquals(key,key3);
    }
}