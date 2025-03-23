package com.hexagonal.core.domain.aggregates;

import com.hexagonal.core.domain.events.DomainEvent;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEventPublisher;

import java.util.UUID;

/**
 * Base abstract class for all aggregate roots.
 * Follows DDD principles and allows domain event publishing.
 * An aggregate root is the entry point to an aggregate and ensures its invariants.
 */
public abstract class AggregateRoot {
    
    @Getter
    private final UUID id;

    @Setter
    private ApplicationEventPublisher eventPublisher;
    
    protected AggregateRoot(UUID id) {
        this.id = id;
    }

    /**
     * Publishes a domain event.
     * 
     * @param event The event to publish
     */
    protected void publishEvent(DomainEvent event) {
        if (eventPublisher != null) {
            eventPublisher.publishEvent(event);
        }
    }
} 