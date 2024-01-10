package Vorlesung.Enums;

public enum Wochentag  {
    MONTAG(), DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;


    public boolean istWochenende() {
        return this == SAMSTAG || this == SONNTAG;
    }

    public Wochentag naechsterTag() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}