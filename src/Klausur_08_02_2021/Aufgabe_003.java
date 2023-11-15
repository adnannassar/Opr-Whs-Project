package Klausur_08_02_2021;

import java.util.*;

public class Aufgabe_003 {
    public static void main(String[] args) {

        String[] wörter = {"Fahrrad", "123 Abflussreinigung", "Fahrstuhl",
                "frische Blumen", "Fahrrad", "Pfirsich"};

        Map<Character, Collection<String>> resultMap = erzeugeIndex(wörter);
        System.out.println(resultMap);
    }

    public static Map<Character, Collection<String>> erzeugeIndex(String[] wörter) {
        Map<Character, Collection<String>> map = new HashMap<>();
        for (String wort : wörter) {
            char anfangsbuchstabe = wort.charAt(0);
            if (!map.containsKey(anfangsbuchstabe)) {
                map.put(anfangsbuchstabe, new HashSet<>());
            }
            map.get(anfangsbuchstabe).add(wort);
        }
        return map;
    }
}
