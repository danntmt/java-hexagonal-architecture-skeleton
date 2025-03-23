package com.hexagonal.core.domain.valueobjects;

/**
 * Marker interface for all value objects in the domain.
 * In DDD, value objects are immutable objects defined by their attributes rather than identity.
 * They represent concepts that are important in the domain but don't have an identity.
 * 
 * Value objects must:
 * - Be immutable
 * - Have structural equality (equality based on all properties)
 * - Be self-validating (validate their invariants in the constructor)
 */
public interface ValueObject {
    // Marker interface for value objects
} 