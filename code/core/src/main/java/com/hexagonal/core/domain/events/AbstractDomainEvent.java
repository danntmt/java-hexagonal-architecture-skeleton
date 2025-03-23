package com.hexagonal.core.domain.events;

import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

/**
 * Base abstract class for all domain events.
 * Provides common properties and behavior for all events.
 * Compatible with Spring Events but does not extend ApplicationEvent
 * to avoid method conflicts.
 */
@Getter
public abstract class AbstractDomainEvent implements DomainEvent {
    
    private final UUID eventId;
    private final UUID aggregateId;
    private final long version;
    private final Instant eventTimestamp;
    private final Object source;
    
    /**
     * Creates a new domain event.
     * 
     * @param source The source of the event (typically the aggregate)
     * @param aggregateId The ID of the aggregate this event applies to
     * @param version The version of the aggregate after this event was applied
     */
    protected AbstractDomainEvent(Object source, UUID aggregateId, long version) {
        this.source = source;
        this.eventId = UUID.randomUUID();
        this.aggregateId = aggregateId;
        this.version = version;
        this.eventTimestamp = Instant.now();
    }

} 