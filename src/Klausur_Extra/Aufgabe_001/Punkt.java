package Klausur_Extra.Aufgabe_001;

import java.util.Objects;

public class Punkt {

    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Punkt)) return false;
        Punkt other = (Punkt) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Punkt(" + x + ", " + y + ")";
    }
}
