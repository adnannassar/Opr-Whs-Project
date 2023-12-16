package Vorlesung.JavaIO;

import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.getName().toLowerCase().endsWith(".pdf")) {
            return true;
        } else {
            return false;
        }

    }
}
