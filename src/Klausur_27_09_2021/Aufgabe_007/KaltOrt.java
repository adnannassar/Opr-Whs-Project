package Klausur_27_09_2021.Aufgabe_007;

public class KaltOrt implements Messwertverarbeiter {
    private String ort;
    private float schwellwert;

    private int counter;

    public KaltOrt(String ort, float schwellwert) {
        this.ort = ort;
        this.schwellwert = schwellwert;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void verarbeiten(Messwert messwert) {
        if(messwert.getOrt().equals(this.ort) &&
            messwert.getTemprature() < this.schwellwert){
            counter++;
        }
    }
}
