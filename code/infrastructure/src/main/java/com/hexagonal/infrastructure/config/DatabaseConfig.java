package com.hexagonal.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuration for database and JPA.
 * This enables Spring Data JPA repositories and transaction management.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.hexagonal.infrastructure")
@EnableTransactionManagement
public class DatabaseConfig {
    // Configuration is done via annotations and application.properties
} 