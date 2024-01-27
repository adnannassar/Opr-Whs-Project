package Klausur_Extra.Aufgabe_004;

import java.util.Date;

public class Benutzerverwalter {

    private ILoginProtokollierer protokollierer;

    public Benutzerverwalter(ILoginProtokollierer protokollierer) {
        this.protokollierer = protokollierer;
    }

    public Benutzer login(String benutzername, String passwort) {
        Date loginzeit = new Date(); // Aktueller Zeitpunkt
        boolean passwortRichtig = passwort.equals("12345");
        Benutzer benutzer = null;

        if (passwortRichtig) {
            benutzer = new Benutzer(benutzername, loginzeit);
        }
        protokollierer.protokolliere(benutzername, loginzeit, passwortRichtig);
        return benutzer;
    }
}
