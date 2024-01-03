package Vorlesung.StreamsAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        System.out.println(Stream.of("Java", "Python", "Html" , "C")
                                .map(name -> name.length())
                                .reduce(0, (a, b) -> a + b));
    }
}
