package com.searchable_encryption.model;

import org.springframework.stereotype.Component;

/**
 * Created by Alexandru on 12/8/2015.
 */
@Component
public class DocumentDto {


    private String text;
    private EncryptionType encryptionType;

    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    public DocumentDto setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    public String getText() {
        return text;
    }

    public DocumentDto setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "DocumentDto{" +
                "text='" + text + '\'' +
                ", encryptionType=" + encryptionType +
                '}';
    }
}
