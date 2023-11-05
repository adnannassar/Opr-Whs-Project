package Klausur_26_09_2022;

public class Aufgabe_002 {
    public static void main(String[] args) {
        A a;
        a = new A();

        System.out.println(a.m(10));

        a = new A(10);
        System.out.println(a.m(10));

    }

    static class A {
        int extraValue;
        public A() {
        }

        public A(int extraValue) {
            this.extraValue = extraValue;
        }



        public int m(int n) {
            return (5 * n) + extraValue;
        }
    }
}
