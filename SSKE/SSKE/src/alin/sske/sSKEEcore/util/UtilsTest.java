package alin.sske.sSKEEcore.util;

import org.junit.Test;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

/**
 * Created by alin_ on 11/15/2015.
 */
public class UtilsTest {

    @Test
    public void testXOR() throws Exception {
        String s1 = "FFFFFF";
        String s2 = "FFFFF1";

        byte [] b  = s2.getBytes();

        String rez = Utils.XOR(s1,s2);

        assertEquals  (1,1);
    }
}