package Klausur_12_07_2021.Test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ReadTokonitzerTest {

    private StringReader reader;

    private StringIndexOutOfBoundsException exception;

    private Reader r1;
    private Reader r2;

    @BeforeEach
    @Test
    void setUp() {
        reader = new StringReader("Viel Erfolg bei OPR.");

        exception =
                assertThrows(StringIndexOutOfBoundsException.class, () -> {
                    "Haus".charAt(4);
                });
    }

    @Test
    void test1() {
        ReaderTokenizer tokenizer = new ReaderTokenizer(reader, ". ");
        Set<String> woerterAusTokonizer = tokenizer.gibWoerter();
        Set<String> wörter = Set.of("Viel", "Erfolg", "bei", "OPR");
        assertEquals(wörter, woerterAusTokonizer);
    }

    @Test
    void test2() {
        ReaderTokenizer tokenizer = new ReaderTokenizer(reader, ".,!");
        Set<String> woerterAusTokonizer = tokenizer.gibWoerter();
        Set<String> wörter = Set.of("Viel Erfolg bei OPR");
        assertEquals(wörter, woerterAusTokonizer);
    }

    @Test
    void testAufgabe008() {
        // assertTrue(exception.getMessage().contains("out of range: 4"));
        assertEquals("String index out of range: 4", exception.getMessage());
    }


}
