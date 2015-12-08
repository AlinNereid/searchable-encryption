package com.searchable_encryption.business;

import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.builder.SSKEBuilder;
import com.searchable_encryption.model.Document;
import com.searchable_encryption.model.DocumentResponse;
import com.searchable_encryption.model.EncryptionType;
import com.searchable_encryption.model.SavedDocument;
import com.searchable_encryption.model.SearchRequest;
import com.searchable_encryption.sSKEEcore.impl.TokenSSKE;
import com.searchable_encryption.service.DocumentService;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentBusiness {

    @Autowired
    private DocumentService documentService;

    private final SSKE sske = SSKEBuilder.buildSSKEComponent();

    public SavedDocument saveDocument(String text, EncryptionType encryptionType) throws NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        String[] words = text.split(" ");

        List<String> encryptedWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            encryptedWords.add(sske.encryptWord(words[i], i));
        }

        Document document = new Document();

        document.setEncryptedWords(encryptedWords);
        document.setEncryptionType(encryptionType);

        return documentService.saveDocument(document);
    }

    public List<List<String>> searchDocuments(List<String> searchedWords, EncryptionType encryptionType) throws Exception {

        List<TokenSSKE> tokens = new ArrayList<>();

        for (String searchedWord : searchedWords) {
            tokens.add(sske.generateToken(searchedWord));
        }

        SearchRequest searchRequest = new SearchRequest();

        searchRequest.setTokens(tokens);
        searchRequest.setEncryptionType(encryptionType);

        DocumentResponse searchDocuments = documentService.searchDocuments(searchRequest);

        List<List<String>> decryptedDocuments = new ArrayList<>();

        for (List<String> encryptedDocument : searchDocuments.getEncryptedDocuments()) {
            List<String> decryptedDocument = new ArrayList<>();

            for (int i = 0; i < encryptedDocument.size(); i++) {
                decryptedDocument.add(sske.decryptWord(encryptedDocument.get(i), i));
            }

            decryptedDocuments.add(decryptedDocument);
        }

        return decryptedDocuments;
    }
}
