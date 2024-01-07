package Klausur_08_02_2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Aufgabe_011 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(
                2, 4, 6, 8
        ));

        try {
            BufferedReader r = new BufferedReader(new FileReader("IO_FilesAndFolders/Vorlesungen.txt"));
            Optional<String> optionalResult = aufgabe_011_a(r, 40);
            System.out.println(optionalResult.get());

            boolean erg = aufgabe_011_b(r, 10);
            System.out.println("Alle zeilen >= 10 --> " + erg);

            System.out.println(aufgabe_011_c(l));



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Optional<String> aufgabe_011_a(BufferedReader r, int n) {
        return r.lines()
                .filter(zeile -> zeile.length() >= n)
                .findFirst();
        // Rückgabetyp von diesem Ausdruck ist Optional<String>
    }

    public static boolean aufgabe_011_b(BufferedReader r, int n) {
        return r.lines().allMatch(zeile -> zeile.length() >= n);
    }

    public static boolean aufgabe_011_c(List<Integer> l) {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(n -> n % 2 == 0)
                .toList()
                .containsAll(l);
    }

    public static LongStream aufgabe_011_d() {
        return LongStream.iterate(0, n -> n * 2 + 1 ); //0, 1, 3, 7, 15, 31, 63,...
    }


}
