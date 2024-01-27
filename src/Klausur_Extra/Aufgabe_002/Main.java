package Klausur_Extra.Aufgabe_002;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Adressverwalter adressverwalter = new Adressverwalter();

        adressverwalter.fuegeHinzu("12345", "Musterstraße", "Max Mustermann");
        adressverwalter.fuegeHinzu("12345", "Musterstraße", "Erika Musterfrau");
        adressverwalter.fuegeHinzu("67890", "Beispielweg", "John Doe");
        adressverwalter.fuegeHinzu("67890", "Beispielweg", "Jane Doe");


        // adresse vorhanden!
        try {
            Set<String> personenMusterstrasse = adressverwalter.gibPersonen("12345", "Musterstraße");
            System.out.println("Personen in Musterstraße: " + personenMusterstrasse);

            Set<String> personenBeispielweg = adressverwalter.gibPersonen("67890", "Beispielweg");
            System.out.println("Personen in Beispielweg: " + personenBeispielweg);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // adresse nicht vorhanden!
        try {
            Set<String> personenUnbekannt = adressverwalter.gibPersonen("11111", "Unbekannt");
            System.out.println("Personen in Unbekannt: " + personenUnbekannt);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
