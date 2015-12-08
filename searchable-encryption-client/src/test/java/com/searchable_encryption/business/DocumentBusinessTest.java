package com.searchable_encryption.business;

import com.searchable_encryption.ApplicationClient;
import com.searchable_encryption.model.EncryptionType;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationClient.class)
@WebAppConfiguration
public class DocumentBusinessTest {

    @Autowired
    private DocumentBusiness documentBusiness;

    @Test
    @Ignore
    public void runTest() throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, Exception {
        String text = "mama are mere";

        documentBusiness.saveDocument(text, EncryptionType.SSKE);

        List<String> searchedWords = new ArrayList<>();

        searchedWords.add("man");

        List<List<String>> searchDocuments = documentBusiness.searchDocuments(searchedWords, EncryptionType.SSKE);

        System.out.println(searchDocuments);
    }
}
