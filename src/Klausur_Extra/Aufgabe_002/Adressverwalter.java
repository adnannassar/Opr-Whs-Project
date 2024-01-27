package Klausur_Extra.Aufgabe_002;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Adressverwalter {
    private final Map<Adresse, Set<String>> adressen;

    public Adressverwalter() {
        adressen = new HashMap<>();
    }

    public void fuegeHinzu(String plz, String strasse, String person) {
        Adresse adresse = new Adresse(plz, strasse);

        if (!adressen.containsKey(adresse)) {
            adressen.put(adresse, new HashSet<>());
        }

        Set<String> personenSet = adressen.get(adresse);
        personenSet.add(person);
    }

    public Set<String> gibPersonen(String plz, String strasse) {
        Adresse adresse = new Adresse(plz, strasse);
        if (!adressen.containsKey(adresse)) {
            throw new IllegalArgumentException("No entry found for the given address.");
        }
        return new HashSet<>(adressen.get(adresse));
    }
}
