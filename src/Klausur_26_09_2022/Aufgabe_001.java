package Klausur_26_09_2022;

public class Aufgabe_001 {

    public static void main(String[] args) {
        Rechtecke rechtecke = new Rechtecke(10, 20);
        System.out.println(rechtecke.gibText());
    }

    static abstract class Zeichenobjekt {
        public abstract String gibText();
    }

    static class Rechtecke extends Zeichenobjekt {
        private double breite;
        private double länge;

        public Rechtecke(double breite, double länge) {
            this.breite = breite;
            this.länge = länge;
        }

        @Override
        public final String gibText() {
            return "F=<" + fläche() + ">, U=<" + umfang() + ">";
        }

        private double fläche() {
            return this.breite * this.länge;
        }

        private double umfang() {
            return 2 * (this.breite + this.länge);
        }


    }


}
