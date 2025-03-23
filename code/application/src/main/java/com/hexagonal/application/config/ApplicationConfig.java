package com.hexagonal.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for the application layer.
 * This enables component scanning for command and query handlers.
 */
@Configuration
@ComponentScan(basePackages = {
    "com.hexagonal.application.handlers.commands",
    "com.hexagonal.application.handlers.queries"
})
public class ApplicationConfig {
    // Configuration is done via annotations
} 