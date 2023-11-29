package Klausur_26_09_2022;

import com.sun.source.tree.Tree;

import java.util.*;

public abstract class Aufgabe_003 {

    public static void main(String[] args) {
        Map<String, Integer> ereignisseMap = new HashMap<>();
        ereignisseMap.put("Fitr", 2002);
        ereignisseMap.put("Adha", 2002);
        ereignisseMap.put("New Year", 2003);
        ereignisseMap.put("Weihnachten", 2004);
        ereignisseMap.put("Silvester", 2005);
        ereignisseMap.put("Ostern", 2005);
        ereignisseMap.put("Mother Day", 2005);
        //System.out.println(ereignisseMap);

        Map<Integer, TreeSet<String>> result = ereignisseNachJahren(ereignisseMap);
        System.out.println(result);
    }

    public static Map<Integer, TreeSet<String>> ereignisseNachJahren(Map<String, Integer> ereignisse) {
        Map<Integer, TreeSet<String>> resultMap = new HashMap<>();

        Collection<Integer> years = ereignisse.values();
        Set<String> keys = ereignisse.keySet();

        for (Integer year : years) {
            resultMap.put(year, new TreeSet<>());
        }

        for (String keyString : keys) {
            Integer valueOfOldMap = ereignisse.get(keyString);
            resultMap.get(valueOfOldMap).add(keyString);
        }
        return resultMap;
    }
}
