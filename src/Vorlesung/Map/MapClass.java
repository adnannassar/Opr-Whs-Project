package Vorlesung.Map;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Map<String, Float> studentsMap = new LinkedHashMap<>();
        studentsMap.put("Abdou", 1.0f);
        studentsMap.put("Amani", 2.0f);
        studentsMap.put("Esraa", 3.0f);

        System.out.println(studentsMap);
        Set<String> keys = studentsMap.keySet();
        System.out.println(keys);

        Collection<Float> noten = studentsMap.values();
        System.out.println(noten);

        System.out.println(studentsMap.containsKey("Amani"));

    }
}
