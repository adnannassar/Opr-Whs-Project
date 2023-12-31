package Klausur_01_01_2022;

import java.util.Comparator;
import java.util.TreeSet;

public class Aufgabe_007 {
    public static void main(String[] args) {
        TreeSet<String> woerter = new TreeSet<>((o1, o2) -> {
            int resultOfLengthComp = Integer.compare(o1.length(), o2.length());
            if (resultOfLengthComp == 0) {
                return o1.compareTo(o2);
            } else {
                return resultOfLengthComp;
            }
        });

        woerter.add("Apfel"); // 5
        woerter.add("Birne"); // 5
        woerter.add("birne"); // 5
        woerter.add("Banana");// 6
        woerter.add("Kiwi"); // 4
        System.out.println(woerter);
    }


}
