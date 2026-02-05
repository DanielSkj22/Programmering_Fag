package org.example.idatt2003;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {
    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }
    @Override
    public String execute(String text) {
        text = text.replaceFirst(target, replacement);
        return text;
    }
}
