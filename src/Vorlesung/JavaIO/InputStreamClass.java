package Vorlesung.JavaIO;

import java.io.*;

public class InputStreamClass {
    public static void main(String[] args) {
        File f = new File("IO_FilesAndFolders/Names.txt");
        System.out.println("Reading..");
        printContentOfFile(f);

        System.out.println("\n\nWriting new Content...");
        writeTextInFile("Amani\nAdnan\nNisreen\nShaker\nOmar\nAbdo\nEsraa", f);
        System.out.println("\nReading again..");
        printContentOfFile(f);
    }

    private static void printContentOfFile(File f) {
        try (FileInputStream fis = new FileInputStream(f)) {
            int temp;
            while ((temp = fis.read()) != -1) {
                System.out.print((char) temp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeTextInFile(String text, File f) {
        try (FileOutputStream fos = new FileOutputStream(f);) {
            if (!text.isEmpty()) {
                for (char c : text.toCharArray()) {
                    fos.write(c);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
