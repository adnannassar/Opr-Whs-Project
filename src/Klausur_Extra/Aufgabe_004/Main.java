package Klausur_Extra.Aufgabe_004;

public class Main {
    public static void main(String[] args) {
        Loginzaehler loginzaehler = new Loginzaehler();
        Benutzerverwalter benutzerverwalter = new Benutzerverwalter(loginzaehler);


        benutzerverwalter.login("user1", "12345");
        benutzerverwalter.login("user2", "wrongpassword");
        benutzerverwalter.login("user3", "12345");
        benutzerverwalter.login("user4", "incorrect");


        System.out.println("Erfolgreiche Logins: " + loginzaehler.getErfolgreicheLogins());
        System.out.println("Erfolglose Logins: " + loginzaehler.getErfolgloseLogins());
    }
}