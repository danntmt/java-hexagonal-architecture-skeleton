package com.hexagonal.core.domain.repositories;

import com.hexagonal.core.domain.aggregates.AggregateRoot;

import java.util.Optional;
import java.util.UUID;

/**
 * Generic repository interface for all aggregates.
 * Follows the repository pattern from DDD.
 *
 * @param <T> The aggregate type this repository handles
 */
public interface Repository<T extends AggregateRoot> {
    
    /**
     * Saves an aggregate to the repository.
     * This will also publish any domain events raised by the aggregate.
     *
     * @param aggregate The aggregate to save
     */
    void save(T aggregate);
    
    /**
     * Retrieves an aggregate by its ID.
     *
     * @param id The ID of the aggregate to retrieve
     * @return The aggregate, or empty if not found
     */
    Optional<T> findById(UUID id);
} 