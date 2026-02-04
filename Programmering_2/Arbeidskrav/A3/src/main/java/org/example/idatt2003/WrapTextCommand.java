package org.example.idatt2003;

public class WrapTextCommand {
    protected String opening;
    protected String end;
    public WrapTextCommand(String opening, String end){
    this.opening = opening;
    this.end = end;
    }
    public String  getOpening(){
    return opening;
    }
    public String  getEnd(){
        return end;
    }
    public String execute(String text){
        text = opening.concat(text).concat(end);
        return text;
    }
}
