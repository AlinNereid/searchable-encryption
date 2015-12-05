package com.searchable_encryption.repository;

import com.datastax.driver.core.Row;
import com.searchable_encryption.dao.Document;
import com.searchable_encryption.dao.EncryptionType;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by Alexandru on 12/1/2015.
 */
public class CassandraRepositoryHelper {

    public static final String DOCUMENT_ID="documentid";
    public static final String DOCUMENT_DATA="documentdata";
    public static final String USER_ID="userid";
    public static final String DOC_TIME="docTime";
    public static final String ENC_TYPE="encType";

    public static Document getDocumentFromRow(Row row){
        return Document.Builder.newBuilder()
                     .withDocumentId(row.getLong(DOCUMENT_ID))
                     .withData(row.getString(DOCUMENT_DATA))
                     .withCreatedDate(getDocDate(row))
                     .withEncryptionType(EncryptionType.valueOf(row.getString(ENC_TYPE)))
                     .withUserId(row.getUUID(USER_ID)).build();
    }



    private static DateTime getDocDate(Row row) {
        return new DateTime(row.getDate(DOC_TIME)).toDateTime(DateTimeZone.UTC);
    }
}

