package Klausur_Extra.Aufgabe_001;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Linie> linien = new ArrayList<>();
        linien.add(new Linie(2, 3, 2, 5));
        linien.add(new Linie(2, 5, 2, 3));
        linien.add(new Linie(2, 3, 2, 3));
        linien.add(new Linie(1, 3, 2, 3));

        Map<Punkt, Set<Punkt>> zuteilungen = Linie.gibZuteilungen(linien);

        for (Map.Entry<Punkt, Set<Punkt>> entry : zuteilungen.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
