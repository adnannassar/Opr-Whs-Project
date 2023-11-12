package Vorlesung.Collection;


import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        Set<Car> set = new TreeSet<>();
        set.add(new Car("BMW", 300));
        set.add(new Car("AUDI", 220));


        System.out.println(set);
    }
}


