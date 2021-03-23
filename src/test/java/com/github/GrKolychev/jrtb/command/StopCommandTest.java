package com.github.GrKolychev.jrtb.command;

import static com.github.GrKolychev.jrtb.command.CommandName.STOP;
import static com.github.GrKolychev.jrtb.command.StopCommand.STOP_MESSAGE;

public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
