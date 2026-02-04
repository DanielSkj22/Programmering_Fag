package org.example.idatt2003;

public class CapitalizeTextCommand{
    public CapitalizeTextCommand(){
    }
    public String execute(String text){
        text = text.substring(0,1).toUpperCase()+text.substring(1);
        return text;
    }
}
