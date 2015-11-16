package com.searchable_encryption.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.convert.CassandraConverter;
import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;

/**
 * Created by Alexandru on 11/1/2015.
 */
@Configuration
@PropertySources({@PropertySource(value = { "classpath:service.properties" })})
public class CassandraConfig {

    @Autowired
    private Environment env;


    @Bean(name = "contactPoint")
    public String contactPoints(){
        return env.getProperty("cassandra.contactpoints");
    }
    @Bean(name = "keyspace")
    public String keySpaceName(){
        return env.getProperty("cassandra.keyspace");
    }

    @Bean(name = "port")
    public Integer cassandraPort(){
        return env.getProperty("cassandra.port",Integer.class);
    }
    @Bean
    public Cluster cluster() {

       return Cluster.builder()
                .addContactPoints(contactPoints())
                .build();
    }


  /*  @Bean
    public CassandraMappingContext mappingContext() {
        return new BasicCassandraMappingContext();
    }

    @Bean
    public CassandraConverter converter() {
        return new MappingCassandraConverter(mappingContext());
    }*/

    @Bean
    public Session session() throws Exception {
        return cluster().connect(keySpaceName());
    }

   /* @Bean
    public CassandraOperations cassandraTemplate() throws Exception {
        return new CassandraTemplate(session().);
    }*/
}