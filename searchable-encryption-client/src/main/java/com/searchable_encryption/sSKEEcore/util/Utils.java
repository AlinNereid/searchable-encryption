package com.searchable_encryption.sSKEEcore.util;


import java.math.BigInteger;

/**
 * Created by alin_ on 11/15/2015.
 */
public class Utils {
    public static String XOR(String s1, String s2){
        if(s1.length()!=s2.length())
            throw new IllegalArgumentException();
        BigInteger i1 = new BigInteger(s1,16);
        BigInteger i2 = new BigInteger(s2,16);
        BigInteger res = i1.xor(i2);

        StringBuilder builder = new StringBuilder();
        while (builder.length() < s1.length() - res.toString(16).length()) {
            builder.append('0');
        }
        builder.append(res.toString(16));
        return builder.toString();
    }
}
