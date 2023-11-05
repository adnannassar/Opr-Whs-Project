package Klausur_08_02_2021;

public class Aufgabe_001 {
    public static void main(String[] args) {
        Rechtecke rechtecke = new Rechtecke(10, 20);
        System.out.println(rechtecke.gibText());
    }

    static abstract class Zeichenobjekt {
        public abstract String gibText();

        public abstract boolean istGroesser(Zeichenobjekt zeichenobjekt);

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
        public boolean istGroesser(Zeichenobjekt zeichenobjekt) {
            return this.fläche() > zeichenobjekt.fläche();
        }


        @Override
        public final String gibText() {
            return "F=<" + fläche() + ">, U=<" + umfang() + ">";
        }

        @Override
        public double fläche() {
            return this.breite * this.länge;
        }

        @Override
        public double umfang() {
            return 2 * (this.breite + this.länge);
        }


    }
}
