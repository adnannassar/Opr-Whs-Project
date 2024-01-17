package Klausur_12_07_2021.Test;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe_010 {

    @Test
    void test1() {
        StringTokenizer tokenizer = new StringTokenizer("E-Bike", "-");
        NoSuchElementException e = assertThrows(NoSuchElementException.class, () -> {
            for (int i = 0; i < 3; i++) {
                tokenizer.nextToken();
            }
        });

        assertNotNull(e);

    }

    @Test
    void test2() {
        StringTokenizer tokenizer = new StringTokenizer("E-Bike-1", "-");
        assertDoesNotThrow(() -> {
            for (int i = 0; i < 3; i++) {
                tokenizer.nextToken();
            }
        });
    }
}
