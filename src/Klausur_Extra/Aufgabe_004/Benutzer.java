package Klausur_Extra.Aufgabe_004;

import java.util.Date;

public class Benutzer {
    private String benutzername;
    private Date loginzeit;
    public Benutzer(String benutzername, Date loginzeit) {
        this.benutzername = benutzername;
        this.loginzeit = loginzeit;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public Date getLoginzeit() {
        return loginzeit;
    }

    public void setLoginzeit(Date loginzeit) {
        this.loginzeit = loginzeit;
    }
}
