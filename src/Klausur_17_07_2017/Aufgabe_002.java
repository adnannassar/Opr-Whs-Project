package Klausur_17_07_2017;

public class Aufgabe_002 {
    public static void main(String[] args) {

    }

    class A {
        private int va;

        public A(int v) {
            this.va = v;
        }

        public int gibWert() {
            return va;
        }
    }

    class B extends A {
        public B(int v) {
            super(v);
        }

        public int gibWert() {
            return 10 * super.gibWert();
        }
    }
}
