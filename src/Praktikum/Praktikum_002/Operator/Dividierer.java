package Praktikum.Praktikum_002.Operator;

public class Dividierer extends BinärerOperator {

    public Dividierer(double argument) {
        super(argument);
    }

    @Override
    public double wendeAn(double argument) {
     return new Dividierer(10).wendeAn(argument);
    }
}
