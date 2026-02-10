package org.example;

import org.example.idatt2003.WrapSelectionTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WrapSelectionTextCommandTest {
    String newText = new WrapSelectionTextCommand("P", "S", "hello").execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "target target PhelloS");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            WrapSelectionTextCommand wrong = new WrapSelectionTextCommand(" ", " ", " ");
        });

    }

}