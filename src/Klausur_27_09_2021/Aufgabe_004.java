package Klausur_27_09_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Aufgabe_004 {
    public static void main(String[] args) {
        fuegeHinzu("Shaker", 10);
    }

    public static void fuegeHinzu(String schluessel, int zahl) {
        TreeMap<String, ArrayList<Integer>> hm = new TreeMap<>();
        hm.put("Shaker", new ArrayList<>(Arrays.asList(1, 2, 4, 1, 5)));
        hm.put("Amani", new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2)));
        hm.put("Omar", new ArrayList<>(Arrays.asList(4, 3, 4, 1, 5)));

        System.out.println("Before: " + hm);
        ArrayList<Integer> l = hm.get(schluessel);
        if (l != null) {
            l.add(zahl);
            hm.put(schluessel, l);
        }
        System.out.println("After:  " + hm);
    }
}
