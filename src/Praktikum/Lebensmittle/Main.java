package Praktikum.Lebensmittle;

public class Main {
    public static void main(String[] args) {
        Lebensmittel obstsalat = new Obstsalat();
        System.out.println(obstsalat.gibZutaten());
        System.out.println(obstsalat.enthaelt("Erdbeeren"));
        System.out.println(obstsalat.enthaelt("Apfel"));
    }
}