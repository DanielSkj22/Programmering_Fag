package org.example.idatt2003;

public class ReplaceTextCommand extends ReplaceFirstTextCommand{
    protected String target;
    protected String replacement;
    public ReplaceTextCommand(String target, String replacement){
        super(target, replacement);
        this.target = target;
        this.replacement = replacement;
    }
    public String execute(String text){
        return text;
    }
}
