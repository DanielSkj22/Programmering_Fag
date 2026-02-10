package org.example;

import org.example.idatt2003.CapitalizeSelectionTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeSelectionTextCommandTest {
    String newText = new CapitalizeSelectionTextCommand("target").execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "Target Target hello");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            CapitalizeSelectionTextCommand wrong = new CapitalizeSelectionTextCommand(" ");
        });

    }

}