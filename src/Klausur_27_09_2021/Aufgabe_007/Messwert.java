package Klausur_27_09_2021.Aufgabe_007;

import java.util.Date;

public class Messwert {
    private String ort;
    private Date zeitpunkt;
    private float temprature;

    public Messwert(String ort, Date zeitpunkt, float temprature) {
        this.ort = ort;
        this.zeitpunkt = zeitpunkt;
        this.temprature = temprature;
    }

    public String getOrt() {
        return ort;
    }

    public Date getZeitpunkt() {
        return zeitpunkt;
    }

    public float getTemprature() {
        return temprature;
    }

    @Override
    public String toString() {
        return ort + ", " + zeitpunkt.toLocaleString() + ", " + temprature;
    }
}
