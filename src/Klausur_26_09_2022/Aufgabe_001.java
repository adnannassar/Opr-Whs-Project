package Klausur_26_09_2022;

public abstract class Aufgabe_001 {

    public static void main(String[] args) {
        Rechtecke rechtecke = new Rechtecke(10, 20);
        System.out.println(rechtecke.gibText());
    }

    static abstract class Zeichenobjekt {
        public String gibText() {
            return "F=<" + fläche() + ">, U=<" + umfang() + ">";
        }

        public abstract double fläche();

        public abstract double umfang();

    }

    static class Rechtecke extends Zeichenobjekt {
        private double breite;
        private double länge;

        public Rechtecke(double breite, double länge) {
            this.breite = breite;
            this.länge = länge;
        }

        @Override
        public double fläche() {
            return breite * länge;
        }

        @Override
        public double umfang() {
            return 2 * (breite + länge);
        }
    }


}
