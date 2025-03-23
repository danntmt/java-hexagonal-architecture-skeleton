package com.hexagonal.application.exceptions;

/**
 * Base exception for application-specific errors.
 * This exception should be used for errors that occur in the application layer.
 */
public class ApplicationException extends RuntimeException {

    /**
     * Creates a new ApplicationException with the specified message.
     *
     * @param message The error message
     */
    public ApplicationException(String message) {
        super(message);
    }

    /**
     * Creates a new ApplicationException with the specified message and cause.
     *
     * @param message The error message
     * @param cause The cause of the exception
     */
    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
} 