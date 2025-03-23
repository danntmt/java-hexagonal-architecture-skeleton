package com.hexagonal.core.domain.services;

/**
 * Marker interface for all domain services.
 * In DDD, domain services represent operations that don't naturally belong to an entity or value object,
 * especially operations that involve multiple domain objects or complex business rules.
 * 
 * Domain services:
 * - Are stateless
 * - Express domain concepts that can't be naturally modeled as entities or value objects
 * - Express significant domain processes or transformations
 */
public interface DomainService {
    // Marker interface for domain services
} 