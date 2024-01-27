package Klausur_Extra.Aufgabe_005;

public class Main {
    public static void main(String[] args) {
        DoubleToIntFunction f = (double value) -> (int) value;
        System.out.println(f.apply(3.14));
    }
}
