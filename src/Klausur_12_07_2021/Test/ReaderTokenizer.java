package Klausur_12_07_2021.Test;


import java.io.Reader;
import java.util.Set;

class ReaderTokenizer{
    private Reader reader;
    private String trennzeichen;

    public ReaderTokenizer(Reader r, String trennzeichen ) {
        this.reader =r;
        this.trennzeichen = trennzeichen;
    }

    public Set<String> gibWoerter() {
       return Set.of("Viel", "Erfolg", "bei", "OPR");
    }
}