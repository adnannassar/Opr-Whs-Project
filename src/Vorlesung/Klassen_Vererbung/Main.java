package Vorlesung.Klassen_Vererbung;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Amani", 20);
        Student student1 = new Student("Shaker", 22, 129037109); // object!

        p1.printInfo();
        student1.printInfo();

    }
}




