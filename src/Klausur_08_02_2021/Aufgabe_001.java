package Klausur_08_02_2021;

public class Aufgabe_001 {
    public static void main(String[] args) {
        Rechtecke r1 = new Rechtecke(10, 20);
        Rechtecke r2 = new Rechtecke(2, 4);
        System.out.println(r1.gibText());
        System.out.println(r1.istGroesser(r2));

    }

    static abstract class Zeichenobjekt {
        public abstract String gibText();

        public boolean istGroesser(Zeichenobjekt zeichenobjekt){
            return this.fläche() > zeichenobjekt.fläche();
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
