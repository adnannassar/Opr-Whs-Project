package Klausur_Extra.Aufgabe_001;

import java.util.*;

public class Linie {
    private Punkt start;
    private Punkt ende;

    public Linie(int x1, int y1, int x2, int y2) {
        this.start = new Punkt(x1, y1);
        this.ende = new Punkt(x2, y2);
    }

    public static Map<Punkt, Set<Punkt>> gibZuteilungen(List<Linie> linien) {
        Map<Punkt, Set<Punkt>> zuteilungen = new HashMap<>();

        for (Linie linie : linien) {
            if (!zuteilungen.containsKey(linie.start)) {
                zuteilungen.put(linie.start, new HashSet<>());
            }
            zuteilungen.get(linie.start).add(linie.ende);

            if (!zuteilungen.containsKey(linie.ende)) {
                zuteilungen.put(linie.ende, new HashSet<>());
            }
            zuteilungen.get(linie.ende).add(linie.start);
        }

        return zuteilungen;
    }
}
