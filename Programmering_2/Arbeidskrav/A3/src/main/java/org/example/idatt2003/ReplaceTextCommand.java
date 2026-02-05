package org.example.idatt2003;

public class ReplaceTextCommand implements TextCommand{
    protected String target;
    protected String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }
    @Override
    public String execute(String text) {
        text = text.replaceAll(target, replacement);
        return text;
    }
}
