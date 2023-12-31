package Klausur_26_09_2022;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aufgabe_009 {

    interface DoubleStream {
        IntStream mapToInt(MapToIn mapToIn);
    }

    @FunctionalInterface
    interface MapToIn {
        int apply(double value);
    }
}
