package Vorlesung.Abstract_Class;

public class Triangle extends Form {
    private int a, b, c;

    public Triangle(String name, String color, int a, int b, int c) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double berechneFläche() {
        return a * b * c;
    }
}

