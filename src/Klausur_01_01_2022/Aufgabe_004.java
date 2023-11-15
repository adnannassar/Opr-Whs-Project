package Klausur_01_01_2022;


import java.util.*;

public class Aufgabe_004 {
    public static void main(String[] args) {
        TreeMap<Fahrzeug, Integer> hashMap = new TreeMap<>();

        Fahrzeug f1 = new Fahrzeug("BWM");
        Fahrzeug f2 = new Fahrzeug("BWM");
        Fahrzeug f3 = new Fahrzeug("Audi");

        hashMap.put(f1, 200);
        hashMap.put(f2, 200);
        hashMap.put(f3, 100);

        System.out.println(hashMap);
    }

    public static class Fahrzeug implements Comparable<Fahrzeug> {
        private final String kennzeichen;

        public Fahrzeug(String kennzeichen) {
            this.kennzeichen = kennzeichen;
        }

        @Override
        public int compareTo(Fahrzeug o) {
            return this.kennzeichen.compareTo(o.kennzeichen);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fahrzeug fahrzeug = (Fahrzeug) o;
            return Objects.equals(kennzeichen, fahrzeug.kennzeichen);
        }

        @Override
        public int hashCode() {
            return Objects.hash(kennzeichen);
        }

        @Override
        public String toString() {
            return kennzeichen;
        }
    }


}
