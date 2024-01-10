package Klausur_12_07_2021;

enum Zeiteinheit {
    TAG(60 * 60 * 24),
    STUNDE(60 * 60),
    MINUTE(60),
    SEKUNDE(1);
    int sekunden;

    Zeiteinheit(int sekunden) {
        this.sekunden = sekunden;
    }

    public int sekunden() {
        return sekunden;
    }

    double in(Zeiteinheit zeiteinheit) {
        return (double) this.sekunden / zeiteinheit.sekunden;
    }
}

public class Aufgabe_010 {
    public static void main(String[] args) {
        System.out.println((Zeiteinheit.MINUTE.in(Zeiteinheit.STUNDE)));
    }
}
