package Klausur_08_07_2019;

public class Aufgabe_001 {
    public static void main(String[] args) {

    }

    abstract class Lebensmittel {
        public String gibZutaten() {
            return enthaeltZutat("Schwierigkeit") + "";
        }

        abstract boolean enthaeltZutat(String z);
    }
}
