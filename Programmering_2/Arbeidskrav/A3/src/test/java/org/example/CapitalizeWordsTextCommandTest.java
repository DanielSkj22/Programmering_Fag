package org.example;

import org.example.idatt2003.CapitalizeWordsTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeWordsTextCommandTest {
    String newText = new CapitalizeWordsTextCommand().execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "Target Target Hello");
    }

}