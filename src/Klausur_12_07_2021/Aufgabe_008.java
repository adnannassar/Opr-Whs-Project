package Klausur_12_07_2021;

import Klausur_03_07_2023.Aufgabe_001;

public class Aufgabe_008 {
    enum Einheit{
        MUM(1000),
        MM(1),
        CM(10),
        DM(100),
        M(10) ,
        KM(0.1);

        double value;

        Einheit(double value) {
            this.value = value;
        }

        double value(){
            return value;
        }

        Einheit geeigneteEinheit(double v){
            return Einheit.MM;
        }
    }
    public static void main(String[] args) {
        Einheit.KM.geeigneteEinheit(Einheit.M.value());
    }
}
