package Klausur_01_01_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

public class Aufgabe_008 {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1: ");
        aufgabe8_1();
        System.out.println("\nAufgabe 2: ");
        aufgabe8_2();
        System.out.println("\nAufgabe 3: ");
        System.out.println(aufgabe8_3(3, new File("IO_FilesAndFolders/Vorlesungen.txt")));
    }

    public static void aufgabe8_1() {
        Set<Konto> konten = new HashSet<>(Arrays.asList(
                new Konto(true, 500),
                new Konto(false, 100),
                new Konto(true, 200),
                new Konto(false, 300)
        ));


        double summ =
                konten.stream()
                        .filter(k -> k.istPrivatkonto())
                        .mapToDouble(k -> k.kontostand())
                        .sum();

        /*double summ2 = konten.stream()
                .filter(Konto::istPrivatkonto)
                .mapToDouble(Konto::kontostand)
                .sum();

         */

        System.out.println(summ);
       // System.out.println(summ2);
    }

    public static void aufgabe8_2() {
        Stream.of(15, 2, 3, 7, 4, 31, 60, 5, 11, 6)
                .filter(a -> istPrimzahl(a))
                .sorted()
                .forEach(System.out::println);
    }

    public static boolean aufgabe8_3(int n, File f) {
        try {
            boolean result = Stream.of(
                    new BufferedReader(new FileReader(f))
                            .lines().allMatch(zeile -> zeile.length() >= n)
            ).allMatch(entry -> entry == true);
            return result;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean istPrimzahl(long n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}


class Konto {
    private boolean isPrivat;
    private float kontoStand;

    public Konto(boolean isPrivat, float kontoStand) {
        this.isPrivat = isPrivat;
        this.kontoStand = kontoStand;
    }

    boolean istPrivatkonto() {
        return isPrivat;
    }

    float kontostand() {
        return kontoStand;
    }

}
