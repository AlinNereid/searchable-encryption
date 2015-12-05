package com.searchable_encryption.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    @Loggable
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
