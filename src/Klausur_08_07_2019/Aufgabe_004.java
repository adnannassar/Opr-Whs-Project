package Klausur_08_07_2019;

import java.io.*;

public class Aufgabe_004 {
    public static void main(String[] args) {
        File f1 = new File("IO_FilesAndFolders/names.txt");
        try (BufferedInputStream  bis  = new BufferedInputStream(new FileInputStream(f1))) {
            System.out.println(hatUntergrenze(bis, 2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean hatUntergrenze(InputStream is, int untergrenze) {
        int counter = 0;
        try {
            while ((is.read() != -1)) {
                counter++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return counter >= untergrenze;
    }
}
