package org.example.idatt2003;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {
    public CapitalizeWordsTextCommand(){
    }
    @Override
    public String execute(String text){
        return Arrays.stream(text.split(" "))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
