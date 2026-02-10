package org.example;

import org.example.idatt2003.CapitalizeWordsTextCommand;
import org.example.idatt2003.ReplaceTextCommand;
import org.example.idatt2003.Script;
import org.example.idatt2003.WrapTextCommand;
import org.junit.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScriptTest {

    String exampleText = "target target hello";

    @Test
    public void positiveTest(){
        Script newPipeline = new Script(List.of(new ReplaceTextCommand("hello", "morn"),
                new CapitalizeWordsTextCommand(), new WrapTextCommand("P", "S")));
        assertEquals("PTarget Target MornS", newPipeline.execute(exampleText));
    }
}