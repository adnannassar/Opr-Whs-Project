package Vorlesung.Lampdas.BasicExample;

public class Greeter {


    public void greet(Greeting greeting) {
        greeting.action();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting actionGerman  =  () -> {System.out.println("Hallo");};
        Greeting actionEnglish  = () -> {System.out.println("Hello");};

        greeter.greet(actionGerman);
        greeter.greet(actionEnglish);
    }


}
