package org.example;

import org.example.idatt2003.WrapLinesTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WrapLinesTextCommandTest {
    String newText = new WrapLinesTextCommand("P", "S").execute("first line\nsecond line");

    @Test
    public void positiveTest() {
        assertEquals(newText, "Pfirst lineS Psecond lineS");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            WrapLinesTextCommand wrong = new WrapLinesTextCommand(" ", " ");
        });

    }


}