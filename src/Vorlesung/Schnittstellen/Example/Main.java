package Vorlesung.Schnittstellen.Example;

public class Main {
   static Person p;

    public static void main(String[] args) {
        setP(new Student("Shaker"));
        printNameOfPerson();

        setP(new Lehrer("Zainab"));
        printNameOfPerson();
    }
    public static void setP(Person p) {
        Main.p = p;
    }

    public static void printNameOfPerson(){
        System.out.println(p.getName());
    }

}
