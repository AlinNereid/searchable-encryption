package com.searchable_encryption.builder;

import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.sSKEEcore.impl.AESImpl;
import com.searchable_encryption.sSKEEcore.impl.PRFImpl;
import com.searchable_encryption.sSKEEcore.impl.PRGImpl;
import com.searchable_encryption.sSKEEcore.impl.SSKEEcoreFactoryImpl;

public final class SSKEBuilder {

    public static SSKE buildSSKEComponent() {
        SSKE sske;

        SSKEEcoreFactoryImpl factory;

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

        SSKEKeys sskeKeys = factory.createSSKEKeys();
        sskeKeys.setKeyA("keyakeyakeyakeyd");
        sskeKeys.setKeyB("keybkeybkeybkeyb");
        sskeKeys.setKeyC("keyckeyckeyckeyc");
        sske.setSskekeys(sskeKeys);

        return sske;
    }
}
