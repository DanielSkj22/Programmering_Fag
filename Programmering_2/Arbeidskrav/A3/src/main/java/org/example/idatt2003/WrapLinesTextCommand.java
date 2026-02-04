package org.example.idatt2003;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand{
    public WrapLinesTextCommand(String opening, String end){
        super(opening, end);
    }
    public String execute(String text){
        return Arrays.stream(text.split("\n"))
                .map(word -> opening.concat(word).concat(end))
                .collect(Collectors.joining(" "));
    }
}
