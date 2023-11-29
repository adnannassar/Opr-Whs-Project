package Klausur_27_09_2021;

import java.util.Iterator;
import java.util.LinkedList;

public class Aufgabe_003 {

    public static void main(String[] args) {

    }

    public class Temperatur {
        private float t;

        public Temperatur(float t) {
            if (t > -273.15f)
                this.t = t;
        }

        public float wert() {
            return t;
        }
    }

    public class Temperaturverwaltung {
        private final LinkedList<Temperatur> temperaturen;

        public Temperaturverwaltung() {
            temperaturen = new LinkedList<>();
        }

        public int fuegeHinzu(Temperatur t) {
            if (!temperaturen.contains(t)) {
                temperaturen.add(t);
            }
            return temperaturen.size();
        }
    }
}
