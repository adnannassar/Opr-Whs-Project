package Praktikum.Praktikum_002.Personal;

public class Main {
    public static void main(String[] args) {

        Vorgesetzter hermann = new Vorgesetzter("Hermann Wichtiger");
        hermann.setBestellLimit(500);

        Vorgesetzter waltraud = new Vorgesetzter("Waltraud Wichtig");
        waltraud.setzeVorgesetzten(hermann);
        waltraud.setBestellLimit(50);

        Mitarbeiter walter = new Mitarbeiter("Walter Winkelmann");
        walter.setzeVorgesetzten(waltraud);

        Mitarbeiter willi = new Mitarbeiter("Willi Winzig");


        System.out.println(waltraud.gibInfo());
        System.out.println(hermann.gibInfo());
        System.out.println(walter.gibInfo());
        System.out.println(willi.gibInfo());

        System.out.println(walter.gibHierarchie());


        System.out.println(willi.darfBestellen(50));
    }
}
