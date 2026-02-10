package org.example;

import org.example.idatt2003.ReplaceTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceTextCommandTest {
    String newText = new ReplaceTextCommand("target", "replacement").execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "replacement replacement hello");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReplaceTextCommand wrong = new ReplaceTextCommand(" ", " ");
        });

    }
}