package Praktikum.Praktikum_001.katalog;

/**
 * Diese Klasse enthält Methoden zum Test der Klasse Katalog.
 */
public class KatalogShow {

  /**
   * Liefert einen Katalog mit drei Büchern.
   *
   * @return Katalog mit drei Büchern
   */
  private static Katalog erzeugeKatalog() {

    Katalog katalog = new Katalog();

    katalog.fuegeHinzu(
        new Buch("Asterix bei den Goten", "Uderzo", 9.80f, 1968));
    katalog.fuegeHinzu(
        new Buch("Asterix in Helvetien", "Uderzo", 9.80f, 1977));
    katalog.fuegeHinzu(
        new Buch("Die große Überfahrt", "Uderzo", 9.80f, 1983));

    return katalog;
  }

  /**
   * Testet Methode gibArtikelliste.
   */
  private static void testeGibArtikelliste() {

    Katalog katalog = new Katalog();

    // Leerer Katalog
    System.out.println("Liste:\n" + katalog.gibArtikelliste());

    Buch buch = new Buch("Asterix der Gallier", "Uderzo", 9.80f, 1965);
    katalog.fuegeHinzu(buch);

    // Katalog mit einem Buch
    System.out.println("Liste:\n" + katalog.gibArtikelliste());

    // Katalog mit drei Büchern
    System.out.println("Liste:\n" + erzeugeKatalog().gibArtikelliste());
  }

  /**
   * Gibt Textdarstellung von Büchern auf dem Bildschirm aus.
   *
   * @param buecher Bücher, die textuell ausgegeben werden
   */
  private static void gibArtikellisteAus(Buch[] buecher) {

    for (Buch buch : buecher) {
      System.out.println(buch.gibText());
    }
    System.out.println();
  }

  /**
   * Testet Methode gibTreffer.
   */
  private static void testeGibTreffer() {

    Katalog katalog = erzeugeKatalog();

    // erwartet: Goten und Helvetien
    gibArtikellisteAus(katalog.gibTreffer("Aster"));

    // erwartet: Goten
    gibArtikellisteAus(katalog.gibTreffer("d"));
  }

  /**
   * Ruft Testmethoden auf.
   *
   * @param args wird nicht verwendet
   */
  public static void main(String[] args) {

    testeGibArtikelliste();
    testeGibTreffer();
  }
}
