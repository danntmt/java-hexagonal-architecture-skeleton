package com.hexagonal.core.domain.events;

import java.time.Instant;
import java.util.UUID;

/**
 * Base interface for all domain events in the system.
 * Domain events represent something that has happened in the domain and
 * can be used to trigger side effects or notify other components.
 */
public interface DomainEvent {
    
    /**
     * The unique identifier of the event.
     * @return the event ID
     */
    UUID getEventId();
    
    /**
     * The timestamp when the event occurred.
     * @return the event timestamp
     */
    Instant getEventTimestamp();
    
    /**
     * The ID of the aggregate that this event applies to.
     * @return the aggregate ID
     */
    UUID getAggregateId();
    
    /**
     * The version of the aggregate after this event was applied.
     * This is used for optimistic concurrency control.
     * @return the aggregate version
     */
    long getVersion();
} 