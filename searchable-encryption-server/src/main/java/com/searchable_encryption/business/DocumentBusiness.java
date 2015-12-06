package com.searchable_encryption.business;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.searchable_encryption.builder.SSKEBuilder;
import com.searchable_encryption.dao.Document;
import com.searchable_encryption.dto.DocumentRequest;
import com.searchable_encryption.dto.DocumentResponse;
import com.searchable_encryption.dto.SearchRequest;
import com.searchable_encryption.repository.CassandraRepository;
import java.security.SecureRandom;
import com.searchable_encryption.sSKEEcore.*;
import com.searchable_encryption.sSKEEcore.impl.TokenSSKE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentBusiness {

    @Autowired
    private CassandraRepository cassandraRepository;

    public Document addDocument(DocumentRequest documentRequest) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Document document = Document.Builder.newBuilder()
                .withCreatedDate(DateTime.now())
                .withEncryptionType(documentRequest.getEncryptionType())
                .withDocumentId(new SecureRandom().nextLong())
                .withData(objectMapper.writeValueAsString(documentRequest.getEncryptedWords()))
                .build();

        this.cassandraRepository.insertDocument(document);

        return document;
    }

    public DocumentResponse searchDocuments(SearchRequest searchRequest) throws IOException, Exception {
        List<List<String>> encryptedDocuments = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();

        SSKE sskeComponent = SSKEBuilder.buildSSKEComponent();

        List<Document> documents = this.cassandraRepository.getAllDocumentsByEncType(searchRequest.getEncryptionType());

        for (Document document : documents) {
            List<String> encryptedDocument = objectMapper.readValue(document.getData(), List.class);

            encryptedDocuments.add(encryptedDocument);

            for (TokenSSKE token : searchRequest.getTokens()) {
                if (!sskeComponent.isWordIn(encryptedDocument, token)) {
                    encryptedDocuments.remove(encryptedDocument);
                    break;
                }
            }
        }

        DocumentResponse documentResponse = new DocumentResponse();
        documentResponse.setEncryptedDocuments(encryptedDocuments);
        documentResponse.setEncryptionType(searchRequest.getEncryptionType());

        return documentResponse;
    }
}
