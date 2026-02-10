package org.example;

import org.example.idatt2003.CapitalizeTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CapitalizeTextCommandTest {
    String newText = new CapitalizeTextCommand().execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "Target target hello");
    }

}