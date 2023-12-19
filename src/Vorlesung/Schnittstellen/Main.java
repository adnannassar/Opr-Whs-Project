package Vorlesung.Schnittstellen;

public class Main {
    public static void main(String[] args) {
        test(new Greeting());
        test(new GreetingInArabic());
    }

    static void test(Greeter g) {
           g.sayHallo();
    }
}


