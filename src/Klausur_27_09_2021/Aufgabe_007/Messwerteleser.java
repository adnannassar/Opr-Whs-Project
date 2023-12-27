package Klausur_27_09_2021.Aufgabe_007;

import java.util.Iterator;

public class Messwerteleser {
    private Reader r;
    private Iterator<Messwert> it;

    private Messwertverarbeiter msvr ;

    public Messwerteleser(Reader r ) {
        this.r = r;

    }

    public void setMsvr(Messwertverarbeiter msvr) {
        this.msvr = msvr;
    }

    public boolean gibtEsWeiterenMesswert() {
        return it.hasNext();
    }

    public Messwert gibNaechstenMesswert() {
        return it.next();
    }

    public void lies() {
        this.it = this.r.getMesswerte().iterator();
        while (this.gibtEsWeiterenMesswert()) {
            Messwert wert = this.gibNaechstenMesswert();
            msvr.verarbeiten(wert);
        }
    }


}
