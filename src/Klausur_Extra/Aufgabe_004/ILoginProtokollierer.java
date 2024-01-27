package Klausur_Extra.Aufgabe_004;

import java.util.Date;

public interface ILoginProtokollierer {
    void protokolliere(String benutzername, Date loginzeit, boolean erfolg);
}
