package Klausur_03_07_2023;

public class Zutat {
    private String name;
    private boolean istVegan;

    public Zutat(String name, boolean istVegan) {
        this.name = name;
        this.istVegan = istVegan;
    }

    public final String gibName() {
        return this.name;
    }

    public boolean istVegan() {
        return istVegan;
    }
}

