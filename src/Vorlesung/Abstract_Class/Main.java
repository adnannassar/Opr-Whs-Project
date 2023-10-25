package Vorlesung.Abstract_Class;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        Form form = new Square("Form", "Red", 10);
        Square square = new Square("Square", "Blue", 5);
        System.out.println(square.berechneFläche());

        Rectangle rectangle = new Rectangle("Rectangle", "Yellow", 5, 3);
        Triangle triangle = new Triangle("Triangle", "Orange", 2, 4, 6);
        Circle circle = new Circle("Circle", "Black", 1.5);

        printFormInfo(square);
        printFormInfo(rectangle);
        printFormInfo(circle);
        printFormInfo(triangle);
        add(1, 2); // 3
        add(5, 7); // 3
        add(-1, -2); // 3
        add(10, 20); // 3

    }

    static void printFormInfo(Form form) {
        form.printNameAndColor();
        System.out.println("Fläche: " + form.berechneFläche());
    }

    static int add(int a, int b) {
        return a + b;
    }
}
