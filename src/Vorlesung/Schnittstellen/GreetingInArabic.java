package Vorlesung.Schnittstellen;

public class GreetingInArabic implements Greeter, Comparable{
    @Override
    public void sayHallo() {
        System.out.println("Mar7aba");
    }

    @Override
    public void sayHolla() {

    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
