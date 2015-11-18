package com.searchable_encryption.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.postgresql.Driver;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by Alexandru on 11/18/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PostgresConfig.class
})
public class PostgressConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    @Qualifier(value = "pgDriver")
     private Class pgDriver;

    @Autowired
    @Qualifier(value = "pgHost")
    private String pgHost;

    @Autowired
    @Qualifier(value = "pgPort")
    private Integer pgPort;

    @Autowired
    @Qualifier(value = "pgUser")
    private String pgUser;

    @Autowired
    @Qualifier(value = "pgPass")
    private String pgPass;

    @Test
    public void shouldAutoWiredPostgresProperties(){
        assertNotNull("Driver not instantiated",pgDriver);
        assertNotNull("Host  not instantiated",pgHost);
        assertNotNull("Port not instantiated", pgPort);
        assertNotNull("Username not instantiated",pgUser);
        assertNotNull("Pass not instantiated",pgPass);
    }


    @Test(expected = NoSuchBeanDefinitionException.class)
    public void shouldThrowExceptionWhenGettingBeanFromContext(){
       Class postgresDriver = (Class) applicationContext.getBean("pgdriver");
        assertNotNull("pg",postgresDriver);
    }

    @Test
    public void shouldCheckAppliedMigration(){
        fail("Not Implemented");
    }

}
