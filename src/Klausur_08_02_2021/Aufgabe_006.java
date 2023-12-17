package Klausur_08_02_2021;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class Aufgabe_006 {
    public static void main(String[] args) {
        File file = new File("IO_FilesAndFolders/names.txt");


        Set<Byte> set = new HashSet<>();
        set.add(((byte) 'A'));
        set.add(((byte) 'd'));
        set.add(((byte) 'n'));
        set.add(((byte) 'a'));
        set.add(((byte) 'n'));


        try {
            System.out.println(enthaelt(new FileInputStream(file), set));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static boolean enthaelt(InputStream is, Set<Byte> set) throws IOException {
        int counter = 0;
        while (is.read() != -1) {
            counter++;
        }
        byte[] bytes = new byte[counter];
        int tmp;
        int i = 0;
        while ((tmp = is.read()) != -1) {
            bytes[i] = (byte) tmp;
            i++;
        }

        for (int j = 0; j < bytes.length; j++) {
            if (!set.contains(bytes[j])) {
                return false;
            }
        }
        return true;
    }

}
