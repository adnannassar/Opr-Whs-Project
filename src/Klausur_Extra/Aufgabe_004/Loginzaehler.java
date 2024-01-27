package Klausur_Extra.Aufgabe_004;

import java.util.Date;

class Loginzaehler implements ILoginProtokollierer {
    private int erfolgreicheLogins = 0;
    private int erfolgloseLogins = 0;

    public int getErfolgreicheLogins() {
        return erfolgreicheLogins;
    }

    public int getErfolgloseLogins() {
        return erfolgloseLogins;
    }

    @Override
    public void protokolliere(String benutzername, Date loginzeit, boolean erfolg) {
        if (erfolg) {
            erfolgreicheLogins++;
        } else {
            erfolgloseLogins++;
        }
    }
}