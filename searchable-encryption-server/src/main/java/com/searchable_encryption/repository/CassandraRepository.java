package com.searchable_encryption.repository;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.searchable_encryption.dao.Document;
import com.searchable_encryption.dao.EncryptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.searchable_encryption.dao.Keyspaces.*;
import static com.searchable_encryption.dao.Tables.*;
import static com.searchable_encryption.repository.CassandraRepositoryHelper.*;

/**
 * Created by Alexandru on 12/1/2015.
 */
@Repository
public class CassandraRepository {

    private static final List<String> VAL_KEYS = new ArrayList<String>()
        {{  add(DOCUMENT_ID);
            add(USER_ID);
            add(DOCUMENT_DATA);
            add(DOC_TIME);
            add(ENC_TYPE);
        }};

    @Autowired
    private Session session;

    public Document getDocumentById(long docId){
        ResultSet resultSet =  session.execute(QueryBuilder.select().from(SENCRYPT.toString(), DOCUMENTS.toString()).where(QueryBuilder.eq(DOCUMENT_ID, docId)));
        List<Row> rows = resultSet.all();
        return rows.size()!=0 ? getDocumentFromRow(rows.get(0)) : null;
    }

    public Document getDocumentByIdAndEncType(long docId,EncryptionType encryptionType){
        ResultSet resultSet =  session.execute(QueryBuilder.select().from(SENCRYPT.toString(), DOCUMENTS.toString()).where(QueryBuilder.eq(DOCUMENT_ID, docId)).and(QueryBuilder.eq(ENC_TYPE, encryptionType.toString())));
        List<Row> rows = resultSet.all();
        return rows.size()!=0 ? getDocumentFromRow(rows.get(0)) : null;
    }

    public List<Document> getAllDocumentsByEncType(EncryptionType encryptionType){
        ResultSet resultSet =  session.execute(QueryBuilder.select().from(SENCRYPT.toString(), DOCUMENTS.toString()).where(QueryBuilder.eq(ENC_TYPE,encryptionType.toString())));
        List<Row> rows = resultSet.all();
        List<Document> resultDccs = new ArrayList<>();
        for (Row row : rows){
            resultDccs.add(getDocumentFromRow(row));
        }
        return resultDccs;
    }

    public List<Document> getAllDocuments(){
       ResultSet resultSet =  session.execute(QueryBuilder.select().from(SENCRYPT.toString(), DOCUMENTS.toString()));
        List<Row> rows = resultSet.all();
        List<Document> resultDccs = new ArrayList<>();
        for (Row row : rows){
            resultDccs.add(getDocumentFromRow(row));
        }
        return resultDccs;
    }

    public void insertDocuments(Iterable<Document> documents){
        for(Document document : documents){
            this.insertDocument(document);
        }
    }

    public void insertDocument(Document document){
         Insert oneInsert = QueryBuilder.insertInto(SENCRYPT.toString(),DOCUMENTS.toString()).values(VAL_KEYS,getValues(document));
        ResultSet resultSet = session.execute(oneInsert);
    }

    private List<Object> getValues(Document document){
        List<Object> values = new ArrayList<>();
        values.add(document.getDocumentId());
        values.add(document.getUserId());
        values.add(document.getData());
        values.add(document.getCreatedDate().getMillis());
        values.add(document.getEncryptionType().toString());
        return values;
    }

    public String mockMethod(){
        return "MOCK";
    }
}
