package com.searchable_encryption.config;

import com.datastax.driver.core.Session;
import com.searchable_encryption.repository.CassandraRepository;
import com.searchable_encryption.repository.annotations.CassandraPrep;
import org.cassandraunit.CQLDataLoader;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Alexandru on 12/1/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CassandraConfig.class,CassandraRepository.class,CompleteConfig.class})
public class CassandraRepositoryTest {

    @Autowired
    private Session session;

    @Autowired
    private CassandraRepository cassandraRepository;

    @Before
    public void setUp(){
        CQLDataLoader cqlDataLoader = new CQLDataLoader(session);
       // cqlDataLoader.load(new ClassPathCQLDataSet(""));
    }

    @Test
    public void shouldGetAllDocuments(){
            cassandraRepository.getAllDocuments();
    }

    @Test
    public void shouldRun(){
        cassandraRepository.mockMethod();
    }
}
