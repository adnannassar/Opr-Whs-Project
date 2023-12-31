package Praktikum.Praktikum_001.katalog;

import java.util.StringTokenizer;

/**
 * Ein Objekt dieser Klasse repräsentiert ein Buch.
 */
public class Buch {

    /**
     * Wörter, die bei der Prüfung, ob ein Buch zu einem Suchbegriff passt, nicht berücksichtigt
     * werden sollen.
     */
    private static final String[] AUSSCHLUSSWOERTER
            = new String[]{"der", "die", "das", "und", "oder"};

    /**
     * Titel dieses Buchs.
     */
    private final String titel;

    /**
     * Autor dieses Buchs.
     */
    private final String autor;

    /**
     * Preis dieses Buchs.
     */
    private final float preis;

    /**
     * Erscheinungsjahr dieses Buchs.
     */
    private final int erscheinungsjahr;

    /**
     * Erzeugt ein Objekt dieser Klasse für die angegebenen Daten.
     *
     * @param titel            Titel dieses Buchs
     * @param autor            Autor dieses Buchs
     * @param preis            Preis dieses Buchs
     * @param erscheinungsjahr Erscheinungsjahr dieses Buchs
     */
    public Buch(String titel, String autor, float preis, int erscheinungsjahr) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    /**
     * Gibt zurück, ob das übergebene Wort in der Liste der Ausschlusswörter enthalten ist.
     *
     * @param wort Wort, für das geprüft werden soll, ob es ein Ausschlusswort ist
     * @return {@code true} genau dann, wenn das Wort ein Ausschlusswort
     * ist
     */
    private static boolean istAusschlusswort(String wort) {
        if (wort != null) {
            for (int i = 0; i < AUSSCHLUSSWOERTER.length; i++) {
                if (AUSSCHLUSSWOERTER[i].equals(wort)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /**
     * Prüft, ob dieses Buch zum Suchbegriff passt. Das Buch passt, wenn sein Titel ein Wort enthält,
     * das kein Ausschlusswort ist und mit dem Suchbegriff beginnt.
     *
     * @param suchbegriff Begriff, für den geprüft wird, ob dieses Buch dazu passt
     * @return {@code true} genau dann, wenn dieses Buch zum Suchbegriff
     * passt
     */
    public boolean passtZu(String suchbegriff) {

        /*
         * StringTokenizer verwenden, da die einzelnen Wörter des Titels untersucht werden müssen.
         */
        StringTokenizer st = new StringTokenizer(titel);

        /*
         * Gibt an, ob ein passendes Wort aus dem Titel gefunden wurde.
         */
        boolean wortGefunden = false;

        /*
         * Wörter des Titels mit Suchbegriff vergleichen.
         */
        while (st.hasMoreTokens() && !wortGefunden) {
            String word = st.nextToken();
            if (word.startsWith(suchbegriff) && !istAusschlusswort(word)) {
                wortGefunden = true;
            }
        }

        return wortGefunden;
    }

    /**
     * Liefert textuelle Darstellung dieses Buchs.
     *
     * @return textuelle Darstellung dieses Buchs (Titel, Autor, Erscheinungsjahr und Preis durch
     * Semikolon getrennt)
     */
    public String gibText() {
        return (titel + "; " + autor + "; "
                + erscheinungsjahr + "; €" + preis);
    }
}
