package Vorlesung.StreamsAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapWithStream {
    public static void main(String[] args) {
        System.out.println("Streams of Integers with map");
        Stream.of(1, 2, 3, 4, 5).map(n -> n * 2).forEach(System.out::println);

        System.out.println("\nStreams of Students with map");
        Stream.of(
                new Student("Shaker", 20),
                new Student("Amani", 21),
                new Student("Omar", 22)
        ).map(n -> n.age).forEach(System.out::println);


        System.out.println("\nStreams of String with map");
        Stream.of("Hallo", "World").flatMap(
                word -> Arrays.stream(word.split(""))).forEach(System.out::println);
    }
}


