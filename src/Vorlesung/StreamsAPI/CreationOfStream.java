package Vorlesung.StreamsAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStream {
    public static void main(String[] args) {
        // Create From List
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> numberStream = numbers.stream();

        // Create From Array
        Integer[] array = {1, 2, 3, 4, 5};
        Stream <Integer> arrayStream =  Arrays.stream(array);

        // Direct
        Stream<String> stringStream = Stream.of("Abdou" , "Shaker", "Zainab");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        // Generate
        Stream<Double> randomNumbers1 = Stream.generate( () -> Math.random());
        Stream<Double> randomNumbers2 = Stream.generate( Math::random);
    }
}
