package Vorlesung.Abstract_Class;

public class Circle extends Form implements VolumeInterface {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFläche() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double berechneVolumen() {
        return 100;
    }
}
