package Praktikum.Praktikum_002.Operator;

public class Fakultät extends Operator {

    public Fakultät( double argument) {
        super(argument);
    }

    @Override
    public double wendeAn(double argument) {
        double fak = 1;
        for(int  i = 0 ; i<= argument; i++){
            fak *= i;
        }
        return fak;
    }
}
