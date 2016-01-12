package alin.sske.sSKEEcore.tests;

import alin.sske.sSKEEcore.SSKE;
import alin.sske.sSKEEcore.SSKEDecryptor;
import alin.sske.sSKEEcore.SSKEEncryptor;
import alin.sske.sSKEEcore.SSKEKeys;
import alin.sske.sSKEEcore.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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


        String encryptWord = sske.encryptWord("wordword",0);
        String word = sske.decryptWord(encryptWord,0);

        assertEquals(word, "wordword");
    }

     @Test
    public void testEncryptDecrypyWord3() throws Exception {
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);


        String encryptWord = sske.encryptWord("word2word",0);
        String word = sske.decryptWord(encryptWord,0);

        assertEquals(word, "word2word");
    }

    @Test
    public void testEncrypt() throws Exception {
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);


        String encryptWord = sske.encryptWord("word2word",0);
        assertEquals(encryptWord, "\u008AØ\u0092 Ó\u008B\u001Ezo·\u008Aî\u001C3\u0015a<t;Zg\u0012\\R");
        String word = sske.decryptWord(encryptWord,0);

        assertEquals(word, "word2word");
    }

    @Test
    public void testEncryptDecrypyWord2() throws Exception {
        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);


        String encryptWord = sske.encryptWord("wordword",0);

        sskeKeys.setKeyA("keybkeybkeybkeyd");

        String word = sske.decryptWord(encryptWord,0);

        assertNotEquals(word, "wordword");

    }
}