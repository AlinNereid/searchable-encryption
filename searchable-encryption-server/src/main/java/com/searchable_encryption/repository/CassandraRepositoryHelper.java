package com.searchable_encryption.repository;

import com.datastax.driver.core.Row;
import com.searchable_encryption.dao.Document;

/**
 * Created by Alexandru on 12/1/2015.
 */
public class CassandraRepositoryHelper {

    public static final String DOCUMENT_ID="documentid";
    public static final String DOCUMENT_DATA="documentdata";
    public static final String USER_ID="userid";

    public static Document getDocumentFromRow(Row row){
       return Document.Builder.newBuilder()
                .withDocumentId(row.getLong(DOCUMENT_ID))
                .withData(row.getString(DOCUMENT_DATA))
                .withUserId(row.getUUID(USER_ID)).build();
    }
}
