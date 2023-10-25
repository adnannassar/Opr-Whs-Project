package Vorlesung.Klassen_Vererbung;

public class Person {

    private int age;

    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    // set --> write
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get --> read

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    void printInfo() {
        System.out.println(name + ", " + age);
    }
}
