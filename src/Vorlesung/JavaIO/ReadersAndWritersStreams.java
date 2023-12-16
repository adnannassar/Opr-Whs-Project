package Vorlesung.JavaIO;

import java.io.*;
import java.util.Scanner;

public class ReadersAndWritersStreams {
    public static void main(String[] args) {
        writeIntoFileUsingReader
                (new File("IO_FilesAndFolders/Greetings.txt"),
                        "Hallo Welcome in Java Kurse");
    }

    public static void writeIntoFileUsingReader(File f, String message) {
        try (PrintWriter printWriter = new PrintWriter(f)) {
            printWriter.println(message);
            printWriter.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
