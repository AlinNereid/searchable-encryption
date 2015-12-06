package com.searchable_encryption.business;

import com.searchable_encryption.Application;
import com.searchable_encryption.builder.SSKEBuilder;
import com.searchable_encryption.dao.EncryptionType;
import com.searchable_encryption.dto.DocumentRequest;
import com.searchable_encryption.dto.DocumentResponse;
import com.searchable_encryption.dto.SearchRequest;
import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.sSKEEcore.impl.TokenSSKE;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DocumentBusinessTest {

    @Autowired
    private DocumentBusiness documentBusiness;

    @Test
    public void test() throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException,
            IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, Exception {
        SSKE sske = SSKEBuilder.buildSSKEComponent();

        List<String> text = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            text.add("Text" + i);
        }
        List<String> encryptedText = new ArrayList<>();

        for (int i = 0; i < text.size(); i++) {
            String enWord = sske.encryptWord(text.get(i), i);
            encryptedText.add(enWord);
        }

        DocumentRequest documentRequest = new DocumentRequest();
        documentRequest.setEncryptionType(EncryptionType.SSKE);
        documentRequest.setEncryptedWords(encryptedText);
        documentBusiness.addDocument(documentRequest);

        TokenSSKE token = sske.generateToken("Text23");
        List<TokenSSKE> tokens = new ArrayList<>();
        tokens.add(token);

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.setTokens(tokens);
        searchRequest.setEncryptionType(EncryptionType.SSKE);

        DocumentResponse documentResponse = this.documentBusiness.searchDocuments(searchRequest);

        List<List<String>> encryptedDocuments = documentResponse.getEncryptedDocuments();

        for (List<String> encryptedDocument : encryptedDocuments) {
            List<String> decryptedText = new ArrayList<>();

            for (int i = 0; i < encryptedDocument.size(); i++) {
                String enWord = sske.decryptWord(encryptedDocument.get(i), i);
                decryptedText.add(enWord);
            }

            for (int i = 0; i < decryptedText.size(); i++) {
                System.out.println(decryptedText.get(i));
            }
        }

    }
}
