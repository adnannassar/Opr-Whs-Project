package Vorlesung.Klassen_Vererbung;

public class Student extends Person {
    private int mtrNummer;

    public Student(String name, int age, int mtrNummer) {
        super(name, age);
        this.mtrNummer = mtrNummer;
    }

    @Override
    void printInfo() {
        System.out.println(getName() + ", " + getAge() + ", " + mtrNummer);
    }

}
