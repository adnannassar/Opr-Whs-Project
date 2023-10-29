package Vorlesung.Static;

import Praktikum.Praktikum_002.Personal.Mitarbeiter;

public class Main {
    public static void main(String[] args) {
        Employee omar = new Employee("Omar", 20); // 1
        omar.printInfo();

        Employee shaker = new Employee("Shaker", 22); //2
        shaker.printInfo();


        Employee shaker2 = new Employee("Shaker", 22); //2
        shaker.printInfo();

        System.out.println(Employee.getNumberOfEmployees());

    }
}
