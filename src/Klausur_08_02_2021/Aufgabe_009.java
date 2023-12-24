package Klausur_08_02_2021;

import java.util.Objects;
import java.util.TreeMap;

public class Aufgabe_009 {
    public static void main(String[] args) {
    }

    class Rechteck implements Comparable<Rechteck> {
        private int breite;
        private int hoehe;

        public Rechteck(int breite, int hoehe) {
            this.breite = breite;
            this.hoehe = hoehe;
        }

        @Override
        public int compareTo(Rechteck r1) {
            if (hoehe != r1.hoehe) {
                return r1.hoehe - this.hoehe;
            } else {
                return this.breite - r1.breite;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rechteck rechteck = (Rechteck) o;
            return breite == rechteck.breite && hoehe == rechteck.hoehe;
        }

        @Override
        public int hashCode() {
            return Objects.hash(breite, hoehe);
        }
    }
}
