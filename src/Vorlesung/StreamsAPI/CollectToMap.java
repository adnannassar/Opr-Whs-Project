package Vorlesung.StreamsAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
    public static void main(String[] args) {
      Map<String, Integer> map =
              Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam", "A", "AB")
                .map(String::toUpperCase)
                .collect(Collectors.toMap(Function.identity() , String::length));
        System.out.println(map);
    }
}
