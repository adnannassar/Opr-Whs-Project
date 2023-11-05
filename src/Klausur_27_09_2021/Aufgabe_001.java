package Klausur_27_09_2021;

public class Aufgabe_001 {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.m(10));
    }

    static public class A {
        public final int m(int a) {
            return a * this.n(a);
        }

        public int n(int a) {
            return 2 * a;
        }
    }

    static class B extends A {
        @Override
        public int n(int a) {
            return 3 * a;
        }
    }

}
