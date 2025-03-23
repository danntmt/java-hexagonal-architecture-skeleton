package com.hexagonal.application.handlers.queries;

import com.hexagonal.application.queries.Query;

/**
 * Generic interface for all query handlers in the system.
 * Following the CQRS pattern, query handlers execute queries and return results without changing state.
 *
 * @param <Q> The type of query this handler handles
 * @param <R> The type of result produced by handling the query
 */
public interface QueryHandler<Q extends Query<R>, R> {
    
    /**
     * Handles a query and returns a result.
     *
     * @param query The query to handle
     * @return The result of handling the query
     */
    R handle(Q query);
} 