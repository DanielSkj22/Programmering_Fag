package org.example.idatt2003;

public class CapitalizeSelectionTextCommand {
    private String selection;
    public CapitalizeSelectionTextCommand(String selection){
        this.selection = selection;
    }
    public String execute(String text){
        text = text.replace(selection, selection.substring(0,1).toUpperCase()+selection.substring(1));
        return text;
    }
    public String getSelection(){
        return selection;
    }
}
