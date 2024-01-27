package Klausur_Extra.Aufgabe_006;

import java.util.ArrayList;
import java.util.TreeMap;

public class MapList {
    private TreeMap<String, ArrayList<Integer>> hm;

    public MapList() {
        hm = new TreeMap<>();
    }

    public void fuegeHinzu(String schluessel, int zahl) {
        ArrayList<Integer> l = hm.get(schluessel);
        if (l != null) {
            l.add(zahl);
        } else {
            l = new ArrayList<>();
            l.add(zahl);
            hm.put(schluessel, l);
        }
    }

    public ArrayList<Integer> getList(String schluessel) {
        return hm.get(schluessel);
    }

    public static void main(String[] args) {
        MapList myMapList = new MapList();


        myMapList.fuegeHinzu("key1", 1);
        myMapList.fuegeHinzu("key1", 2);
        myMapList.fuegeHinzu("key2", 3);


        System.out.println("List for key1: " + myMapList.getList("key1"));
        System.out.println("List for key2: " + myMapList.getList("key2"));
    }
}
