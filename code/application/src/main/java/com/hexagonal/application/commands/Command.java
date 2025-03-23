package com.hexagonal.application.commands;

/**
 * Marker interface for all commands in the system.
 * Following the CQRS pattern, commands represent intentions to change the system's state.
 * Commands should be named in the imperative tense, e.g., CreateOrder, UpdateCustomer.
 */
public interface Command {
    // Marker interface for commands
} 