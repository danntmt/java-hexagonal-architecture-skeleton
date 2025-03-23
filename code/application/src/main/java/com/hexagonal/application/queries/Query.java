package com.hexagonal.application.queries;

/**
 * Marker interface for all queries in the system.
 * Following the CQRS pattern, queries represent requests for information without changing the system's state.
 * Queries should be named descriptively, e.g., GetOrderById, FindCustomersByLastName.
 *
 * @param <R> The type of result this query returns
 */
public interface Query<R> {
    // Marker interface for queries
} 