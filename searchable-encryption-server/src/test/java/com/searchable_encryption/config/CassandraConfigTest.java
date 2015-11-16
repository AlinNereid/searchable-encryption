package com.searchable_encryption.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Alexandru on 11/15/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { /*CassandraMigrationConfig.class,*/CassandraConfig.class
        })
public class CassandraConfigTest {


        @Autowired
        @Qualifier(value = "keyspace")
        private String keyspaceName;

        @Autowired
        private Cluster localCluster;

        @Autowired
        private Session session;

        @Autowired
        @Qualifier(value = "contactPoint")
        private String contactPoints;

        @Autowired
        private Integer cassandraPort;


        @Test
        public void shouldAutowireCassandraBeans(){
                assertNotNull("Cassandra port not instantiated",cassandraPort);
                assertNotNull("Contact point not instantiated",contactPoints);
                assertNotNull("Name space not instantiated", keyspaceName);
                assertNotNull("Session not instantiated",session);
                assertNotNull("Cluster not instantiated",localCluster);
        }
}
