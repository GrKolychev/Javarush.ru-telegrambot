package com.github.GrKolychev.jrtb.command;

import static com.github.GrKolychev.jrtb.command.CommandName.START;
import static com.github.GrKolychev.jrtb.command.StartCommand.START_MESSAGE;

public class StartCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
