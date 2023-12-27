package Klausur_27_09_2021.Aufgabe_007;

import java.util.LinkedList;
import java.util.List;

public class Reader {
    private List<Messwert> messwerte ;

    public Reader() {
        this.messwerte = new LinkedList<>();
    }

    public List<Messwert> getMesswerte() {
        return messwerte;
    }
    public void addMessWert(Messwert messwert){
        messwerte.add(messwert);
    }
}
