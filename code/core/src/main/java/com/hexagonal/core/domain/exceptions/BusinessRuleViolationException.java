package com.hexagonal.core.domain.exceptions;

/**
 * Exception thrown when a business rule is violated.
 * This exception should be used when domain validation fails.
 */
public class BusinessRuleViolationException extends RuntimeException {

    /**
     * Creates a new BusinessRuleViolationException with the specified message.
     *
     * @param message The error message
     */
    public BusinessRuleViolationException(String message) {
        super(message);
    }

    /**
     * Creates a new BusinessRuleViolationException with the specified message and cause.
     *
     * @param message The error message
     * @param cause The cause of the exception
     */
    public BusinessRuleViolationException(String message, Throwable cause) {
        super(message, cause);
    }
} 