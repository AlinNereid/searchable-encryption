package com.searchable_encryption.tests;

import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.sSKEEcore.SSKEEncryptor;
import com.searchable_encryption.sSKEEcore.SSKEKeys;
import com.searchable_encryption.sSKEEcore.impl.AESImpl;
import com.searchable_encryption.sSKEEcore.impl.PRFImpl;
import com.searchable_encryption.sSKEEcore.impl.PRGImpl;
import com.searchable_encryption.sSKEEcore.impl.SSKEEcoreFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Ignore;

/**
 * Created by alin_ on 11/17/2015.
 */
public class SSKEImplTest {

    SSKE sske;

    SSKEEcoreFactoryImpl factory;

    @Before
    public void setUp() throws Exception {
        SSKEEcoreFactoryImpl.init();
        factory = new SSKEEcoreFactoryImpl();
        sske = factory.createSSKE();
        SSKEEncryptor sskeEncryptor = factory.createSSKEEncryptor();
        sskeEncryptor.setSymmetricencryptor(new AESImpl());
        sskeEncryptor.setPseudorandomfunction(new PRFImpl());
        sskeEncryptor.setPseudorandomgenerator(new PRGImpl());

        SSKEDecryptor sskeDecryptor = factory.createSSKEDecryptor();
        sskeDecryptor.setSymmetricdecryptor(new AESImpl());
        sskeDecryptor.setPseudorandomfunction(new PRFImpl());
        sskeDecryptor.setPseudorandomgenerator(new PRGImpl());

        sske.setSskedecryptor(sskeDecryptor);
        sske.setSskeencryptor(sskeEncryptor);
    }

    @Test
    public void testEncryptDecrypyWord() throws Exception {
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);

        String encryptWord = sske.encryptWord("wordword", 0);
        String word = sske.decryptWord(encryptWord, 0);

        assertEquals(word, "wordword");
    }

    @Test
    @Ignore
    public void testEncryptDecrypyWord2() throws Exception {
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);

        String encryptWord = sske.encryptWord("wordword", 0);

        sskeKeys.setKeyA("keybkeybkeybkeyd");

        String word = sske.decryptWord(encryptWord, 0);

        assertNotEquals(word, "wordword");

    }
}
