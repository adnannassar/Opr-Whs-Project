package Klausur_26_09_2022;

import java.util.Objects;

public class Aufgabe_004 {
    class Rechteck {
        private int breite;
        private int laenge;

        public Rechteck(int breite, int laenge) {
            if (breite > 0 || laenge > 0) {
                this.breite = breite;
                this.laenge = laenge;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rechteck rechteck = (Rechteck) o;
            return this.fläche() == rechteck.fläche();
        }

        private int fläche() {
            return this.laenge * this.breite;
        }

        @Override
        public int hashCode() {
            return Objects.hash(breite, laenge);
        }
    }
}
