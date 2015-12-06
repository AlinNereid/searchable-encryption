package com.searchable_encryption.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.searchable_encryption.business.DocumentBusiness;
import com.searchable_encryption.dao.Document;
import com.searchable_encryption.dto.DocumentRequest;
import com.searchable_encryption.dto.DocumentResponse;
import com.searchable_encryption.dto.SearchRequest;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/documents", produces = MediaType.APPLICATION_JSON_VALUE)
public class DocumentController {

    @Autowired
    private DocumentBusiness documentBusiness;

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public HttpEntity<Document> addDocument(@RequestBody DocumentRequest documentRequest) throws JsonProcessingException {

        Document document = this.documentBusiness.addDocument(documentRequest);

        return new ResponseEntity<>(document, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public HttpEntity<DocumentResponse> searchDocuments(@RequestBody SearchRequest searchRequest) throws IOException, Exception {

        DocumentResponse documentResponse = this.documentBusiness.searchDocuments(searchRequest);

        return new ResponseEntity<>(documentResponse, HttpStatus.OK);
    }
}
