package Vorlesung.ObjectClass;

public class Main extends Object {
    public static void main(String[] args) {
        Object c;
        Car car2 = new Car();
        Test t = new Test();
        System.out.println(car2.hashCode());
        System.out.println(t.hashCode());

    }

    static class Car {

    }

    static class Test {

    }


}
