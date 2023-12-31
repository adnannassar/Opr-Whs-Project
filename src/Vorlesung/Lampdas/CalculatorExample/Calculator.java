package Vorlesung.Lampdas.CalculatorExample;

public class Calculator {
    public static void main(String[] args) {
        CalculateAction add = (a, b) -> a + b;
        CalculateAction sub = (a, b) -> a - b;
        CalculateAction mul = (a, b) -> a * b;
        CalculateAction div = (a, b) -> a / b;

        System.out.println(add.calculate(10, 20));
        System.out.println(sub.calculate(10, 20));
        System.out.println(mul.calculate(10, 20));
        System.out.println(div.calculate(10, 20));
    }
}

