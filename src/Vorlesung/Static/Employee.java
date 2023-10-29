package Vorlesung.Static;

public class Employee {
    int age;
    String name;
    int id;
    private static int counter = 0;

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
        this.id = ++counter;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static int getNumberOfEmployees() {
        return counter;
    }

}
