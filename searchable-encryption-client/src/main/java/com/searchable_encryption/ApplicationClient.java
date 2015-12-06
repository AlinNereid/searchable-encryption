package com.searchable_encryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationClient {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationClient.class, args);
    }

}
