package com.searchable_encryption.app;

import com.searchable_encryption.config.TilesConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TilesConfiguration.class)
public class ApplicationClient {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationClient.class, args);
    }

}
