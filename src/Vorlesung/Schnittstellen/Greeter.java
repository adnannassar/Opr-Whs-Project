package Vorlesung.Schnittstellen;

public interface Greeter{

    default void sayHalloInEnglish(){
        System.out.println("Hallo!");
    }
    public static final int x = 10;

    public abstract void sayHallo();

    void sayHolla();
}
