package com.searchable_encryption.config;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Alexandru on 11/18/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CassandraMigrationConfig.class,CassandraConfig.class
})
public class CassandraMigrationTest {

    @Autowired
    @Qualifier(value = "keyspace")
    private String keyspaceName;


    @Autowired
    private Session session;

    private static final String migrationVersionTable = "cassandra_migration_version";

    @Test
    public void migrationShouldBeAddedToVersionTable(){
        Select selectAll = QueryBuilder.select().all().from(keyspaceName,migrationVersionTable);

        ResultSet resultSet =  session.execute(selectAll);

        List<Row> rows = resultSet.all();

        Assert.assertNotEquals(0,rows.size());
    }
}
