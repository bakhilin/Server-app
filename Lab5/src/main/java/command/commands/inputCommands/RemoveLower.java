package command.commands.inputCommands;


import command.Command;
import command.ElementCommand;
import command.commands.Invoker;

import java.text.ParseException;

public class RemoveLower extends Invoker {
    private Command removeLowerEl;
    private static final String COMMAND_NAME = RemoveLower.class.getSimpleName();

    public static String getCommandName() {
        return COMMAND_NAME;
    }


    public RemoveLower(Command removeLowerEl) {
        this.removeLowerEl = removeLowerEl;
    }

    public void removeLower(String e) throws ParseException {
        removeLowerEl.execute();
    }

    @Override
    public void doCommand(String e) throws ParseException {
        removeLowerEl.execute();
    }
}
