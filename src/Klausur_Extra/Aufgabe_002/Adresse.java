package Klausur_Extra.Aufgabe_002;

import java.util.Objects;

public class Adresse {
    private String plz;
    private String strasse;

    public Adresse(String plz, String strasse) {
        this.plz = plz;
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Adresse)) return false;
        Adresse other = (Adresse) obj;
        return Objects.equals(plz, other.plz) && Objects.equals(strasse, other.strasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plz, strasse);
    }
}
