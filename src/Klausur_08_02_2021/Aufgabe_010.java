package Klausur_08_02_2021;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Aufgabe_010 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("IO_FilesAndFolders/File.txt"));
            System.out.println(test(r, "Aha"));

            System.out.println("Count :  " + count(r, "aha"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean test(BufferedReader r, String endWord) {
        return r.lines().anyMatch(
                zeile -> zeile.startsWith("@")
                        &&
                        zeile.toLowerCase()
                                .toLowerCase()
                                .endsWith(endWord.toLowerCase()));
    }

    public static long count(BufferedReader r, String endWord) {
        return r.lines().filter( zeile -> zeile.startsWith("@")
                &&
                zeile.toLowerCase()
                        .toLowerCase()
                        .endsWith(endWord.toLowerCase())).count();
    }
}
