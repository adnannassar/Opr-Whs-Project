package Vorlesung.Iterator;

import Klausur_03_07_2023.Aufgabe_001;

import java.util.*;

public class IteratorOnMaps {
    public static void main(String[] args) {
        Map<String, Float> studentsMap = new TreeMap<>();
        studentsMap.put("Abdou", 1.0f);
        studentsMap.put("Amani", 2.0f);
        studentsMap.put("Esraa", 3.0f);
        studentsMap.put("Amjad", 2.3f);

        Iterator<String > itOnKeys = studentsMap.keySet().iterator();
        while (itOnKeys.hasNext()){
            System.out.println(itOnKeys.next());
        }
    }
}
