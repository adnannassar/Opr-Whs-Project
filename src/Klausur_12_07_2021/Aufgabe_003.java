package Klausur_12_07_2021;

import java.beans.beancontext.BeanContext;
import java.util.*;

public class Aufgabe_003 {

    public static void main(String[] args) {
        List<Geldbetrag> beträge = new LinkedList<>();
        beträge.add(new Geldbetrag("EUR", 10));
        beträge.add(new Geldbetrag("EUR", 2));
        beträge.add(new Geldbetrag("EUR", 3));
        beträge.add(new Geldbetrag("DO", 100));
        beträge.add(new Geldbetrag("DO", 50));

        System.out.println(summiere(beträge));

    }

    public static TreeMap<String, Double> summiere(Collection<Geldbetrag> betraege) {
        TreeMap<String, Double> result = new TreeMap<>();
        for (Geldbetrag gb : betraege) {
            String wh = gb.waehrung;
            double betrag = gb.betrag;
            double actualBetrag = result.getOrDefault(wh, 0.0);
            result.put(gb.waehrung, actualBetrag + betrag);
        }
        return result;
    }

    static class Geldbetrag {
        private String waehrung;
        private double betrag;

        public Geldbetrag(String waehrung, double betrag) {
            this.waehrung = waehrung;
            this.betrag = betrag;
        }

        @Override
        public String toString() {
            return betrag + waehrung;
        }
    }
}
