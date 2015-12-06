package com.searchable_encryption.dto;

import com.searchable_encryption.dao.EncryptionType;
import java.util.List;

public class DocumentRequest {

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
