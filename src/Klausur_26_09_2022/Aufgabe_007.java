package Klausur_26_09_2022;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Aufgabe_007 {

    public static void main(String[] args) {

    }

    public static boolean hatMindestlaenge(InputStream is, long l) throws IOException {
            return is.available() == l;
    }
}
