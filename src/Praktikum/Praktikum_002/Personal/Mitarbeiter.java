package Praktikum.Praktikum_002.Personal;

public class Mitarbeiter {
    private String name;
    protected int bestellLimit = 30;
    private Vorgesetzter vorgesetzter;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public void setzeAllgemeinesLimit(int newBestellLimit) {
        this.bestellLimit = newBestellLimit;
    }


    public double getBestellLimit() {
        return bestellLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setzeVorgesetzten(Vorgesetzter vorgesetzter) {
        this.vorgesetzter = vorgesetzter;
    }

    public Vorgesetzter getVorgesetzter() {
        return vorgesetzter;
    }

    public boolean darfBestellen(int betrag) {
        return betrag <= bestellLimit;
    }

    public final String gibInfo() {
        String infoString = "Ich bin ";
        if (vorgesetzter != null) {
            infoString += getClass().getSimpleName() +
                    ", Name " + name + ". Mein Vorgesetzter ist "
                    + vorgesetzter.getName();
        } else {
            infoString += "freier " + getClass().getSimpleName() +
                    ", Name " + name;
        }
        infoString += ". Mein Bestelllimit ist " + bestellLimit + " EUR.";
        return infoString;
    }

    public void setBestellLimit(int bestellLimit) {
        this.bestellLimit = bestellLimit;
    }

    public String gibHierarchie() {
        String result = "";
        if (vorgesetzter != null) {
            result += "\n";
            Vorgesetzter temp = vorgesetzter;
            while (temp != null) {
                result += temp.getName() + "\n";
                temp = temp.getVorgesetzter();
            }
        }
        return result + name;
    }
}
