package Vorlesung.Schnittstellen.Example;

public class Student implements Person{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Student: " + name;
    }
}
