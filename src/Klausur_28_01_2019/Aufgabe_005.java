package Klausur_28_01_2019;

import java.io.*;

public class Aufgabe_005 {
    public static void main(String[] args) {
        try{
            MyBufferedInputStream myBufferedInputStream =
                    new MyBufferedInputStream(10,
                            new FileInputStream(new File("IO_FilesAndFolders/names.txt")));

            while (myBufferedInputStream.hasMoreBytes()){
                System.out.println((char) myBufferedInputStream.nextByte());
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static class MyBufferedInputStream {
        BufferedInputStream bufferedInputStream;

        public MyBufferedInputStream(int size, InputStream inputStream) {
            bufferedInputStream = new BufferedInputStream(inputStream, size);
        }

        boolean hasMoreBytes() {
            try {
                return nextByte() != -1;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        int nextByte() throws IOException {
          return bufferedInputStream.read();
        }
    }
}
