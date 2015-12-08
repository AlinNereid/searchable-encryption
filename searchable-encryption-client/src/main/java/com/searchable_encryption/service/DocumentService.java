package com.searchable_encryption.service;

import com.searchable_encryption.model.Document;
import com.searchable_encryption.consumer.ServiceConsumer;
import com.searchable_encryption.model.DocumentResponse;
import com.searchable_encryption.model.SavedDocument;
import com.searchable_encryption.model.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    public static final String SAVE_DOCUMENT_URL = "http://localhost:8081/documents";
    public static final String SEARCH_DOCUMENTS_URL = "http://localhost:8081/documents/search";
    @Autowired
    private ServiceConsumer serviceConsumer;

    public SavedDocument saveDocument(Document document) {
        return serviceConsumer.postRequest(SAVE_DOCUMENT_URL, document, SavedDocument.class);
    }

    public DocumentResponse searchDocuments(SearchRequest searchRequest) {
        return serviceConsumer.postRequest(SEARCH_DOCUMENTS_URL, searchRequest, DocumentResponse.class);
    }
}
