package com.searchable_encryption.config;

import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.searchable_encryption.dao.Document;
import com.searchable_encryption.repository.CassandraRepository;
import org.cassandraunit.CQLDataLoader;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

import static com.searchable_encryption.dao.EncryptionType.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Alexandru on 12/1/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CassandraConfig.class, CassandraRepository.class})
public class CassandraRepositoryTest {

    @Autowired
    private Session session;

    @Autowired
    private CassandraRepository cassandraRepository;

    @Before
    public void setUp() {
        session.execute(QueryBuilder.truncate("sencrypt", "documents"));
        CQLDataLoader cqlDataLoader = new CQLDataLoader(session);
        cqlDataLoader.load(new ClassPathCQLDataSet("cassandra/batch-test.cql"));
    }

    @Test
    public void shouldGetAllDocumentsByEncType() {
        List<Document> documentList = cassandraRepository.getAllDocumentsByEncType(SSKE);
        assertEquals(2, documentList.size());
    }

    @Test
    public void shouldGetAllDocuments() {
        List<Document> documentList = cassandraRepository.getAllDocuments();
        assertEquals(3, documentList.size());
    }

    @Test
    public void shouldInsertAndGetDocumentByEncType() {
        cassandraRepository.insertDocument(prepareDocument().build());
        List<Document> documentList = cassandraRepository.getAllDocumentsByEncType(IBE);
        assertEquals(1, documentList.size());
    }

    @Test
    public void shouldInsertAndGetDocumentByIdAndEncType() {
        long id = 1212121L;
        Document docInsert = prepareDocument().withDocumentId(id).build();
        cassandraRepository.insertDocument(docInsert);
        Document docSelect = cassandraRepository.getDocumentByIdAndEncType(id, IBE);
        assertEquals(docInsert, docSelect);
    }

    private Document.Builder prepareDocument() {
        return Document.Builder.newBuilder()
                .withDocumentId(111113L)
                .withData("Some data dude")
                .withUserId(UUID.randomUUID())
                .withCreatedDate(DateTime.now())
                .withEncryptionType(IBE);
    }
}
