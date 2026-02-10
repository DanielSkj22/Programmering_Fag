package org.example.idatt2003;

import java.util.List;

public class Script implements TextCommand {
    private final List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }
    @Override
    public String execute(String text) {
        String nyText = text;
        for(TextCommand command : textCommands){
            nyText = command.execute(nyText);
        }
        return nyText;
    }

}
