package Vorlesung.ObjectClass;

import Vorlesung.Klassen_Vererbung.Person;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Car car1 = new Car("BMW-320-150ps", 200);
        Car car2 = new Car("BMW-320-150ps", 200);

        System.out.println(car1);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2));

    }
}

