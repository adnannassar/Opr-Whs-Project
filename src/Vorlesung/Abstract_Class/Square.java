package Vorlesung.Abstract_Class;

public class Square extends Form implements VolumeInterface {
    private int width;

    public Square(String name, String color, int width) {
        super(name, color);
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double berechneFläche() {
        return width * width;
    }

    @Override
    public double berechneVolumen() {
        return 250;
    }
}
