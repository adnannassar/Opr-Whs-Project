package Klausur_01_10_2018;

public class Aufgabe_002 {
    public static void main(String[] args) {

    }

    class A {
        int a;

        public A(int a) { // for aufgabe 3 --> (int a , int b)
            this.a = a;
        }
    }

    class B extends A {
        public B(int a) {
            super(a);
        }
    }
}
