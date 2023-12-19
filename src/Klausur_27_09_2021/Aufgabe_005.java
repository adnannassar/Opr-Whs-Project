package Klausur_27_09_2021;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

public class Aufgabe_005 {
    public static void main(String[] args) {
        File f1 = new File("IO_FilesAndFolders/names.txt");
        try (FileReader fileReader1 = new FileReader(f1)) {
            System.out.println(minLaengeUndZeichen(fileReader1, (short) 5, (short) 2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean minLaengeUndZeichen(Reader r, short l, short n) throws IOException {
        if (r == null) {
            throw new IllegalArgumentException("Reader darf nicht null sein!");
        }
        if (l <= 0 || n <= 0) {
            throw new IllegalArgumentException("l und n müssen größer null sein!");
        }

        HashSet<Integer> set = new HashSet<>();
        int counter = 0;
        int temp;
        while ((counter < l && (temp = r.read()) != -1)) {
            set.add(temp);
            counter++;
        }
        return set.size() == n;
    }
}


