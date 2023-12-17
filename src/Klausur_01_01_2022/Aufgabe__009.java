package Klausur_01_01_2022;

import java.io.*;

public class Aufgabe__009 {
    public static void main(String[] args) {
        File from = new File("IO_FilesAndFolders/names.txt");
        File to = new File("IO_FilesAndFolders/CopyOfNames.txt");
        try (FileOutputStream fis = new FileOutputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            long erg = kopiere(new FileInputStream(from), new FileOutputStream(to), 3);
            System.out.println(erg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static long kopiere(InputStream is, OutputStream os, long n) {
        long allByte = 0;
        try {
            int tmp;
            while ((tmp = is.read()) != -1 && n > 0) {
                os.write(tmp);
                n--;
                allByte++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allByte;
    }
}
