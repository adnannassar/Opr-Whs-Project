package Klausur_08_07_2019;

import java.lang.annotation.Native;

public class Aufgabe_002 {
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.getVa());
    }

    static class A{
        private int va;

        public A(int value) {
            this.va = value;
        }

        public int getVa() {
            return va;
        }
    }
    static class B extends A{

        public B(int value) {
            super(value);
        }

        @Override
        public int getVa() {
            return 10 * super.getVa();
        }
    }
}
