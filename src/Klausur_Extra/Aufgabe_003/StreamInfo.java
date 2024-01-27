package Klausur_Extra.Aufgabe_003;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamInfo {
    public static long quersumme(InputStream is, int n) throws IOException {
        long sum = 0;
        int count = 0;
        int byteValue;

        while ((byteValue = is.read()) != -1) {
            sum += byteValue;
            count++;
            if (count == n) {
                break;
            }
        }

        if (count < n) {
            throw new IllegalArgumentException("Stream ist zu kurz");
        }

        return sum;
    }
}
