package Klausur_08_02_2021;

import Klausur_03_07_2023.Aufgabe_001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Aufgabe_010 {
    public static void main(String[] args) {
        File f1 = new File("IO_FilesAndFolders/names.txt");
        File f2 = new File("IO_FilesAndFolders/Notes.txt");

        try {
            FileReader fileReader1 = new FileReader(f1);
            FileReader fileReader2 = new FileReader(f2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    boolean sindGleich(Reader r1, Reader r2, short s) {
        return true;
    }
}
