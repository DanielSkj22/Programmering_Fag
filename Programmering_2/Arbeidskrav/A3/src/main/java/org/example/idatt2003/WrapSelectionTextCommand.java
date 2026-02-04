package org.example.idatt2003;

public class WrapSelectionTextCommand extends WrapTextCommand {
    private String selection;
    public WrapSelectionTextCommand(String opening, String end, String selection){
        super(opening, end);
        this.selection = selection;
    }
    public String execute(String text){
        text = text.replace(getSelection(),opening.concat(selection).concat(end));
        return text;
    }
    public String getSelection(){
        return selection;
    }
}
