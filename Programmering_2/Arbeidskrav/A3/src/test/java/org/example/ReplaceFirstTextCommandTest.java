package org.example;

import org.example.idatt2003.ReplaceFirstTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceFirstTextCommandTest {
    String newText = new ReplaceFirstTextCommand("target", "replacement").execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "replacement target hello");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReplaceFirstTextCommand wrong = new ReplaceFirstTextCommand(" ", " ");
        });

    }

}