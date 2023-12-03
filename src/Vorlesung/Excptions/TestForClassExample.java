package Vorlesung.Excptions;


public class TestForClassExample {
    public static void main(String[] args) {
        Example example = new Example();
        try {
            example.methode1(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Logic after!");

    }
}
