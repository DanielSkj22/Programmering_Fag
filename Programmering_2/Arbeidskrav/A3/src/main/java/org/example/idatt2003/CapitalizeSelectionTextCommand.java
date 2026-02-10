package org.example.idatt2003;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
    private String selection;
    public CapitalizeSelectionTextCommand(String selection){
        if (selection.contains(" ")){
            throw new IllegalArgumentException("Cannot contain empty spaces");
        }
        this.selection = selection;
    }
    @Override
    public String execute(String text){
        text = text.replace(selection, selection.substring(0,1).toUpperCase()+selection.substring(1));
        return text;
    }

    public String getSelection(){
        return selection;
    }
}
