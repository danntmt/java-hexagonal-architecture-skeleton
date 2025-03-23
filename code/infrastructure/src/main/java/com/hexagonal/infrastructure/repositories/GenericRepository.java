package com.hexagonal.infrastructure.repositories;

import com.hexagonal.core.domain.aggregates.AggregateRoot;
import com.hexagonal.core.domain.repositories.Repository;
import org.springframework.context.ApplicationEventPublisher;

import java.util.Optional;
import java.util.UUID;

/**
 * Generic implementation of the Repository interface without event sourcing.
 * This repository handles persistence of aggregates and publishing of domain events.
 *
 * @param <T> The type of aggregate this repository handles
 */
public abstract class GenericRepository<T extends AggregateRoot> implements Repository<T> {
    
    private final ApplicationEventPublisher eventPublisher;
    
    /**
     * Creates a new repository.
     *
     * @param eventPublisher The Spring ApplicationEventPublisher
     */
    protected GenericRepository(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void save(T aggregate) {
        // Set the event publisher on the aggregate to enable event publishing
        aggregate.setEventPublisher(eventPublisher);
        
        // Persist the aggregate (implementation depends on the specific repository)
        saveAggregate(aggregate);
    }
    
    /**
     * Persists the aggregate to the storage.
     * This method must be implemented by concrete repositories.
     *
     * @param aggregate The aggregate to persist
     */
    protected abstract void saveAggregate(T aggregate);
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<T> findById(UUID id) {
        Optional<T> aggregateOptional = findAggregateById(id);
        
        // Set the event publisher on the aggregate if it exists
        aggregateOptional.ifPresent(aggregate -> 
            aggregate.setEventPublisher(eventPublisher));
        
        return aggregateOptional;
    }
    
    /**
     * Retrieves an aggregate by its ID from the storage.
     * This method must be implemented by concrete repositories.
     *
     * @param id The ID of the aggregate to retrieve
     * @return An Optional containing the aggregate, or empty if not found
     */
    protected abstract Optional<T> findAggregateById(UUID id);
} 