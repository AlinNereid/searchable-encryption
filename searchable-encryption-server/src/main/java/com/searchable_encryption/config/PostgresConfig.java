package com.searchable_encryption.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

/**
 * Created by Alexandru on 11/18/2015.
 */
@Configuration
@PropertySources({@PropertySource(value = { "classpath:service.properties" })})
public class PostgresConfig {

    @Autowired
    private Environment env;

    @Bean(name = "pgDriver")
    public Class driver(){
        return env.getPropertyAsClass("postgres.driver",org.postgresql.Driver.class);
    }

    @Bean(name = "pgHost")
    public String host(){
        return env.getProperty("postgres.host");
    }

    @Bean(name = "pgPort")
    public Integer port(){
        return env.getProperty("postgres.port",Integer.class);
    }

    @Bean(name = "pgUser")
    public String username(){
        return env.getProperty("postgres.username");
    }

    @Bean(name = "pgPass")
    public String password(){
        return env.getProperty("postgres.password");
    }

    //TODO Connection manager in order to check db migration

}
