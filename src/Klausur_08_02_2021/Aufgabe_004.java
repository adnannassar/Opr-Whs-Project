package Klausur_08_02_2021;

import java.util.HashSet;
import java.util.Objects;

public class Aufgabe_004 {
    public static void main(String[] args) {
        HashSet<Zeitdauer> hashSet = new HashSet<>();
        hashSet.add(new Zeitdauer(1, 100)); // 160 min
        hashSet.add(new Zeitdauer(2, 40)); //  160 min


        System.out.println(hashSet);


        Zeitdauer x = new Zeitdauer(1,1);
        Zeitdauer y = new Zeitdauer(1,1);

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

    }

    static class Zeitdauer {
        private int gesamtMinuten;

        public Zeitdauer(int stunden, int minuten) {
            if (stunden >= 0 && minuten >= 0) {
                this.gesamtMinuten = stunden * 60 + minuten;
            }
        }

        private int getStunden() {
            return this.gesamtMinuten / 60;
        }

        private int getMinuten() {
            return this.gesamtMinuten % 60;
        }

        @Override
        public String toString() {
            return getStunden() + ":" + getMinuten();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Zeitdauer zeitdauer = (Zeitdauer) o;
            return gesamtMinuten == zeitdauer.gesamtMinuten;
        }

        @Override
        public int hashCode() {
            return Objects.hash(gesamtMinuten);
        }
    }
}
