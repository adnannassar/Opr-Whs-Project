package Klausur_Extra.Aufgabe_003;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class StreamInfoTest {

    @Test
    public void testQuersummeCorrectSummation() throws Exception {
        byte[] data = {1, 2, 3, 4, 5}; // Total sum = 15
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        long result = StreamInfo.quersumme(inputStream, 5);
        assertEquals(15, result);
    }

    @Test
    public void testQuersummeStreamTooShort() {
        byte[] data = {1, 2, 3};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> StreamInfo.quersumme(inputStream, 5),
                "Expected quersumme to throw, but it didn't"
        );

        assertTrue(thrown.getMessage().contains("Stream ist zu kurz"));
    }

}