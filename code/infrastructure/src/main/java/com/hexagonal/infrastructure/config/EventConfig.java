package com.hexagonal.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Configuration for asynchronous event handling.
 * This class sets up the necessary beans to handle domain events asynchronously.
 */
@Configuration
@EnableAsync
public class EventConfig {
    
    /**
     * Creates an ApplicationEventMulticaster that handles events asynchronously.
     * This allows events to be published and handled without blocking the publishing thread.
     * 
     * @return The configured ApplicationEventMulticaster
     */
    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return eventMulticaster;
    }
} 