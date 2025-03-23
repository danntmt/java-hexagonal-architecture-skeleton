package com.hexagonal.application.handlers.commands;

import com.hexagonal.application.commands.Command;

/**
 * Generic interface for all command handlers in the system.
 * Following the CQRS pattern, command handlers execute commands and change the system's state.
 *
 * @param <T> The type of command this handler handles
 * @param <R> The type of result produced by handling the command (can be Void)
 */
public interface CommandHandler<T extends Command, R> {
    
    /**
     * Handles a command and returns a result.
     *
     * @param command The command to handle
     * @return The result of handling the command
     */
    R handle(T command);
} 