package com.github.GrKolychev.jrtb.command;

/**
 * Enumeration for {@link Command}'s.
 */

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    NO("no command");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}
