package org.example;

import org.example.idatt2003.WrapTextCommand;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WrapTextCommandTest {
    String newText = new WrapTextCommand("P", "S").execute("target target hello");

    @Test
    public void positiveTest() {
        assertEquals(newText, "Ptarget target helloS");
    }

    @Test
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            WrapTextCommand wrong = new WrapTextCommand(" ", " ");
        });

    }

}