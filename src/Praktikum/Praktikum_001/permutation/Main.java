package Praktikum.Praktikum_001.permutation;

public class Main {
    public static void main(String[] args) {
        Permutation p = new Permutation(10);

        p.gibAlsText();
        System.out.println(p.naechstePermutation());

        System.out.println("Swap 1 with 8");
        p.reOrder();
        p.gibAlsText();
        System.out.println(p.naechstePermutation());


    }
}
