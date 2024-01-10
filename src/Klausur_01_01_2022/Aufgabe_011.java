package Klausur_01_01_2022;

import java.util.Optional;
import java.util.stream.Stream;

enum Paket {
    S(2),
    M(5),
    L(10),
    XL(25);
    private int maxGewicht;

    Paket(int maxGewicht) {
        this.maxGewicht = maxGewicht;
    }

    public int maxGewicht() {
        return maxGewicht;
    }
}

public class Aufgabe_011 {
    public static Optional<Paket> paket(double gewicht) {
        return Stream.of(Paket.values())
                .filter(p -> gewicht <= p.maxGewicht())
                .findFirst();
    }

    public static void main(String[] args) {
        //  System.out.println(paket(30).orElse(null));
        if (paket(13).isPresent()) {
            System.out.println(paket(13).get());
        } else {
            System.out.println("gewicht ist zu groß");
        }

    }
}
