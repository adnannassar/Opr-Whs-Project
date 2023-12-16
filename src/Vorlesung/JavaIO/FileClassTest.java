package Vorlesung.JavaIO;


import java.io.File;
import java.io.FileFilter;

public class FileClassTest {
    public static void main(String[] args) {
       // PdfFilter pdfFilter = new PdfFilter();
        File file = new File("IO_FilesAndFolders");
        if (file.isDirectory()) {
            File[] allFiles = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().toLowerCase().endsWith("jpeg");
                }
            });
            for (File f : allFiles) {
                System.out.println(f.getName());
            }
        }
    }
}
