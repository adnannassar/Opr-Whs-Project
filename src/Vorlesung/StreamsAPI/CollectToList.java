package Vorlesung.StreamsAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static void main(String[] args) {
        Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Israa", "Omar", "Abdou", "Mariam")
                .filter(name -> name.toLowerCase().endsWith("r"))
                .map(String::toUpperCase)
                .collect(Collectors.toList()).forEach(System.out::println);



    }
}
