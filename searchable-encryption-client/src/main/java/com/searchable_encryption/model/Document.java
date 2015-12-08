package com.searchable_encryption.model;

import java.util.List;

public class Document {

    private List<String> encryptedWords;

    private EncryptionType encryptionType;

    public List<String> getEncryptedWords() {
        return encryptedWords;
    }

    public void setEncryptedWords(List<String> encryptedWords) {
        this.encryptedWords = encryptedWords;
    }

    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
    }
}
