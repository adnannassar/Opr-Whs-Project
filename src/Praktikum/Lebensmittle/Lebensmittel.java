package Praktikum.Lebensmittle;

public abstract class Lebensmittel {

    public abstract String gibZutaten();


    public boolean enthaelt(String zutat) {
        String zutatenString = gibZutaten();
        if (zutatenString.equals("Keine Zutaten")) {
            return false;
        }
        return zutatenString.contains(zutat);
    }
}
