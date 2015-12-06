package com.searchable_encryption.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.UUID;

/**
 * Created by Alexandru on 11/2/2015.
 */
@Table("documents")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Document {

    @PrimaryKey
    private Long documentId;

    private UUID userId;
    private String data;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    private DateTime createdDate;

    private EncryptionType encryptionType;

    public UUID getUserId() {
        return userId;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public String getData() {
        return data;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Document document = (Document) o;

        if (!documentId.equals(document.documentId)) {
            return false;
        }
        if (!userId.equals(document.userId)) {
            return false;
        }
        if (!data.equals(document.data)) {
            return false;
        }
        return encryptionType == document.encryptionType;

    }

    @Override
    public int hashCode() {
        int result = documentId.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + data.hashCode();
        result = 31 * result + encryptionType.hashCode();
        return result;
    }

    public static class Builder {

        private Long documentId;
        private UUID userId;
        private String data;
        private DateTime createdDate;
        private EncryptionType encryptionType;

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withUserId(UUID userId) {
            this.userId = userId;
            return this;
        }

        public Builder withDocumentId(Long documentId) {
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

        public Builder withEncryptionType(EncryptionType encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }

        public Document build() {
            Document document = new Document();
            document.documentId = documentId;
            document.userId = userId;
            document.data = data;
            document.createdDate = createdDate;
            document.encryptionType = encryptionType;
            return document;
        }
    }
}
