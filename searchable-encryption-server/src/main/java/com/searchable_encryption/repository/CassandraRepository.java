package com.searchable_encryption.repository;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.searchable_encryption.dao.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.searchable_encryption.dao.Keyspaces.*;
import static com.searchable_encryption.dao.Tables.*;

/**
 * Created by Alexandru on 12/1/2015.
 */
@Repository
public class CassandraRepository {

    @Autowired
    private Session session;

    public List<Document> getAllDocuments(){
       ResultSet resultSet =  session.execute(QueryBuilder.select().from(SENCRYPT.toString(), DOCUMENTS.toString()));
        List<Row> rows = resultSet.all();
        List<Document> resultDccs = new ArrayList<>();
        for (Row row : rows){
            resultDccs.add(CassandraRepositoryHelper.getDocumentFromRow(row));
        }
        return resultDccs;
    }

    public String mockMethod(){
        return "MOCK";
    }
}
