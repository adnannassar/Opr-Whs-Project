package Vorlesung.JavaIO;

import java.io.*;

public class CopyClass {

    public static void main(String[] args) {
        copyTextTest();
        copyTextTestBuffered();
        copyImageTest();
        copyImageTestBuffered();

    }


    private static void copyTextTest() {
        File from = new File("IO_FilesAndFolders/Folder_001/Names.txt");
        File to = new File("IO_FilesAndFolders/Folder_001/CopyOfNames.txt");
        Uhr uhr = new Uhr();
        uhr.startTime();
        copy(from, to);
        uhr.stopTime();
        System.out.println("Copy vom Text Datei hat " + uhr.getDuration() / 1000000 + "ms gedauert");
    }

    private static void copyTextTestBuffered() {
        File from = new File("IO_FilesAndFolders/Folder_001/Names.txt");
        File to = new File("IO_FilesAndFolders/Folder_001/CopyOfNames.txt");
        Uhr uhr = new Uhr();
        uhr.startTime();
        copyBuffered(from, to);
        uhr.stopTime();
        System.out.println("Buffered Copy vom Text Datei hat " + uhr.getDuration() / 1000000 + "ms gedauert");
    }

    private static void copyImageTest() {
        File from = new File("IO_FilesAndFolders/Picture002.jpg");
        File to = new File("IO_FilesAndFolders/CopyOfPicture002.jpg");
        Uhr uhr = new Uhr();
        uhr.startTime();
        copy(from, to);
        uhr.stopTime();
        System.out.println("Copy vom Text Datei hat " + uhr.getDuration() / 1000000 + "ms gedauert");
    }

    private static void copyImageTestBuffered() {
        File from = new File("IO_FilesAndFolders/Picture002.jpg");
        File to = new File("IO_FilesAndFolders/CopyOfPicture002.jpg");
        Uhr uhr = new Uhr();
        uhr.startTime();
        copyBuffered(from, to);
        uhr.stopTime();
        System.out.println("Buffered Copy vom Text Datei hat " + uhr.getDuration() / 1000000 + "ms gedauert");
    }

    private static void copy(File from, File to) {
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            int temp;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copyBuffered(File from, File to) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));
            int temp;
            while ((temp = bis.read()) != -1) {
                bos.write(temp);
            }
            bis.close();
            bos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
