package Klausur_03_07_2023;

public class Aufgabe_001 {

    public static void main(String[] args) {
    }

    public static class E {
        public int m(int n) {
            return 1;
        }
    }

    public static class F extends E {


        public int m(int n) {
            return n * n;
        }
    }
}
