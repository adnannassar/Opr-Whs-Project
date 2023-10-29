package Vorlesung.Abstract_Class;

public abstract class Form {
    private String name;
    private String color;


    public Form(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printNameAndColor() {
        System.out.println("Nama: " + name + " ,Color: " + color);
    }

    public abstract double berechneFläche();
}
