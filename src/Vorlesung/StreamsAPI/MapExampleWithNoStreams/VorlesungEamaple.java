package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VorlesungEamaple {
    public static void main(String[] args) {
        // example1();
        example2();
    }


    static void example1() {
        Stream
                .of("08/15", "4711", "501", "S04", "1250", "333", "475")
                .filter(wort -> wort.matches("[0-9]+"))
                .map(wort -> Integer.parseInt(wort))
                .filter(zahl -> zahl >= 500)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
    }

    static void example2() {
        IntStream.rangeClosed(111, 999)
                .filter(n -> n % (n / 100 + n / 10 % 10 + n % 10) == 0).forEach(System.out::println);
    }
}
