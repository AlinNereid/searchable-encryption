package com.searchable_encryption.model;

import java.util.List;

public class DocumentResponse {

    private List<List<String>> encryptedDocuments;

    private EncryptionType encryptionType;

    public List<List<String>> getEncryptedDocuments() {
        return encryptedDocuments;
    }

    public void setEncryptedDocuments(List<List<String>> encryptedDocuments) {
        this.encryptedDocuments = encryptedDocuments;
    }

    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }
}
