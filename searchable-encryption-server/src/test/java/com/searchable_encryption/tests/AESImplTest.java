package com.searchable_encryption.tests;

import org.junit.Before;
import org.junit.Test;

import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.sSKEEcore.impl.AESImpl;

import static org.junit.Assert.*;

public class AESImplTest {

    AES aes;

    @Before
    public void setUp() throws Exception {
        aes = new AESImpl();
        aes.setIV("1234567890123456");
    }

    @Test
    public void testDecrypt() throws Exception {
        String key = "anaaremere123456";
        String text = "yFLskg3lIyI3akfroNKmyQ==";

        String decrypt = aes.decrypt(text, key);

        assertEquals(decrypt, "Hello World");
    }

    @Test
    public void testEncrypt() throws Exception {
        String key = "anaaremere123456";
        String text = "Hello World";

        String encryptedText = aes.encrypt(text, key);

        assertEquals("yFLskg3lIyI3akfroNKmyQ==", encryptedText);
    }

    @Test
    public void testEncryptAndDecrypt() throws Exception {
        String key = "anaaremere123456";
        String text = "Hello World Hello WorldHello WorldHello WorldHello WorldHello WorldHello World";

        assertEquals(aes.decrypt(aes.encrypt(text, key), key), text);
    }
}
