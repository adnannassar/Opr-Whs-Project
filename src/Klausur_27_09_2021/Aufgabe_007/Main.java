package Klausur_27_09_2021.Aufgabe_007;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader() ;
        r.addMessWert(new Messwert("Bonn", new Date(), 37.5f));
        r.addMessWert(new Messwert("Bonn", new Date(), 32.5f));
        r.addMessWert(new Messwert("Bonn", new Date(), 5.0f));

        Messwerteleser leser = new Messwerteleser(r);

        HitzeOrt hitzeOrt = new HitzeOrt("Bonn", 30.f );
        leser.setMsvr(hitzeOrt);

        leser.lies();

        System.out.println("Hitze-Messwerte in Bonn: " + hitzeOrt.getCounter());

        KaltOrt kaltOrt  = new KaltOrt("Bonn", 30.f );
        leser.setMsvr(kaltOrt);

        leser.lies();

        System.out.println("Kalt-Messwerte in Bonn: " + kaltOrt.getCounter());


    }
}
