package Klausur_12_07_2021;

import java.io.*;

public class Aufgabe_05 {
    public static void main(String[] args) {
        File f1 = new File("IO_FilesAndFolders/names.txt");
        File f2 = new File("IO_FilesAndFolders/Notes.txt");
        try (FileReader fileReader1 = new FileReader(f1);
             FileReader fileReader2 = new FileReader(f2)) {
            System.out.println(sindGleich(fileReader1, fileReader2,(short) 2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean sindGleich(Reader r1, Reader r2, short s) throws IOException {
        int tmp1, tmp2;
        int i = 0;
        while (i != s) {
            tmp1 = r1.read();
            tmp2 = r2.read();
            if (tmp1 != tmp2) {
                return false;
            }
            i++;
        }
        return true;
    }
}
