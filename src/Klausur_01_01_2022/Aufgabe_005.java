package Klausur_01_01_2022;

import java.util.*;

public class Aufgabe_005 {
    public static void main(String[] args) {
        Vogelzaehlung vogelzaehlung = new Vogelzaehlung();
        vogelzaehlung.vogelHinzufügen("Hasson", 20);
        vogelzaehlung.vogelHinzufügen("Kanari", 10);
        vogelzaehlung.vogelHinzufügen("Sonono", 5);

        System.out.println(vogelzaehlung.alleVoegel());
        System.out.println("Anzahl alle: " + vogelzaehlung.anzahlAlleVögel());
        System.out.println("Anzahl Hasson: " + vogelzaehlung.anzahlBestimmteVogel("Hasson"));

    }

    static class Vogelzaehlung {
        private Map<String, Integer> vögelMap;

        public Vogelzaehlung() {
            vögelMap = new TreeMap<>();
        }

        public void vogelHinzufügen(String vogelName, int anzahl) {
            if (anzahl > 0 && vogelName != null) {
                vögelMap.put(vogelName, anzahl);
            }
        }

        public Collection<String> alleVoegel() {
            return vögelMap.keySet();
        }

        public int anzahlAlleVögel() {
            Collection<Integer> valuesList = vögelMap.values();
            int summe = 0;

            Iterator<Integer> it = valuesList.iterator();
            while (it.hasNext()) {
                summe += it.next();
            }
            /*
            for (Integer i : valuesList) {
                summe += i;
            }
            */

            return summe;
        }

        public int anzahlBestimmteVogel(String vogelName) {
            return vögelMap.getOrDefault(vogelName, 0);
        }

    }
}
