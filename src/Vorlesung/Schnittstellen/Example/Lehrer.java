package Vorlesung.Schnittstellen.Example;

public class Lehrer implements Person{
    private String name;

    public Lehrer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Lehrer: " + name;
    }
}
