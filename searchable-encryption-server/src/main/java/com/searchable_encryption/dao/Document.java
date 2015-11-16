package com.searchable_encryption.dao;

import org.exolab.castor.types.DateTime;

import java.util.UUID;

/**
 * Created by Alexandru on 11/2/2015.
 */
//@Table("documents")
public class Document {

   //@PrimaryKey
    private UUID documentId;

    private Long userId;
    private String data;
    private DateTime createdDate;

    public Long getUserId() {
        return userId;
    }

    public UUID getDocumentId() {
        return documentId;
    }

    public String getData() {
        return data;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public static class Builder {

        private UUID documentId;
        private Long userId;
        private String data;
        private DateTime createdDate;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder withDocumentId(UUID documentId) {
            this.documentId = documentId;
            return this;
        }

        public Builder withData(String data) {
            this.data = data;
            return this;
        }

        public Builder withCreatedDate(DateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Document build() {
            Document document = new Document();
            document.documentId = documentId;
            document.userId = userId;
            document.data = data;
            document.createdDate = createdDate;
            return document;
        }
    }
}
