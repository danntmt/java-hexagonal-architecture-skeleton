package com.hexagonal.infrastructure.listeners;

import com.hexagonal.core.domain.events.DomainEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Example listener for domain events.
 * This class demonstrates how to handle domain events asynchronously.
 */
@Component
public class DomainEventListener {
    
    private static final Logger logger = LoggerFactory.getLogger(DomainEventListener.class);
    
    /**
     * Handles all domain events asynchronously.
     * This method will be called whenever a domain event is published.
     * 
     * @param event The domain event to handle
     */
    @Async
    @EventListener
    public void handleDomainEvent(DomainEvent event) {
        logger.info("Handling domain event: {} with ID: {}", 
                event.getClass().getSimpleName(), 
                event.getEventId());
        
        // Here you would implement specific logic based on the event type
        // For example, you might send notifications, update read models, etc.
    }
    
    /**
     * You can also create specific handlers for certain types of events
     * by creating methods that accept specific event types:
     * 
     * @EventListener
     * public void handleSpecificEvent(SomeSpecificEvent event) {
     *     // Handle the specific event
     * }
     */
} 