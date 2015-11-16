package com.searchable_encryption.config;

import com.contrastsecurity.cassandra.migration.CassandraMigration;
import com.contrastsecurity.cassandra.migration.config.Cluster;
import com.contrastsecurity.cassandra.migration.config.Keyspace;
import com.datastax.driver.core.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by Alexandru on 11/15/2015.
 */
@Configuration
public class CassandraMigrationConfig {


    private static final Logger LOGGER = LoggerFactory.getLogger(CassandraMigrationConfig.class);
    private static String MIGRATION_DIR = "/db/migration/cassandra";

    @Autowired
    @Qualifier(value = "keyspace")
    private String keyspaceName;

    @Autowired
    private com.datastax.driver.core.Cluster localCluster;

    @Autowired
    @Qualifier(value = "contactPoint")
    private String contactPoints;

    @Autowired
    private Integer cassandraPort;

    @PostConstruct
    public void init() throws InterruptedException {
        LOGGER.info("Starting migration...");
        Thread.sleep(5000);
        initMigrate().migrate();
        LOGGER.info("Migration ended");
    }

    private Keyspace initKeyspace(){
        Keyspace keyspace = new Keyspace();
        keyspace.setName(keyspaceName);
        keyspace.getCluster().setContactpoints(contactPoints);
        keyspace.getCluster().setPort(cassandraPort);
        return keyspace;
    }

    public CassandraMigration initMigrate(){
        Keyspace keyspace = this.initKeyspace();
        CassandraMigration cm = new CassandraMigration();
        cm.getConfigs().setScriptsLocations(new String[]{MIGRATION_DIR});
        cm.setKeyspace(keyspace);
       return cm;
    }
}
