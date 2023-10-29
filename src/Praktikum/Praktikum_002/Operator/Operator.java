package Praktikum.Praktikum_002.Operator;

public abstract class Operator {
    private double argument;

    public Operator(double argument) {
        this.argument = argument;
    }

    public abstract double wendeAn(double argument);

    public final String gibInfo() {
        return "<p>Operator</p><p>Beispielaufruf: new " +
                this.getClass().getSimpleName() + "(" + argument + ").wendeAn(" + 10.0+") = "
                + wendeAn(10) + "</p>";
    }

}
