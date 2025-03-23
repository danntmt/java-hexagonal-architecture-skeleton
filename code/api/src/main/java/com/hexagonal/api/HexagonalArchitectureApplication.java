package com.hexagonal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Spring Boot application class.
 * This is the entry point to the application.
 */
@SpringBootApplication
@ComponentScan(basePackages = {
    "com.hexagonal.core",
    "com.hexagonal.application",
    "com.hexagonal.infrastructure",
    "com.hexagonal.api"
})
@EntityScan("com.hexagonal.infrastructure")
public class HexagonalArchitectureApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HexagonalArchitectureApplication.class, args);
    }
} 