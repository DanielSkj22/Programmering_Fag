package org.idatt2003;

public class ReplaceTextCommand {
    protected String target;
    protected String replacement;
    public ReplaceTextCommand(String target, String replacement){
        this.target = target;
        this.replacement = replacement;
    }
    public String getTarget(){
        return target;
    }
    public String getReplacement(){
        return replacement;
    }
}
