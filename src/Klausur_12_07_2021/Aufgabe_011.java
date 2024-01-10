package Klausur_12_07_2021;

public class Aufgabe_011 {
    enum Studiengang {
        IN_BA(6),
        WI_BA(6),
        WI_DUAL(6),
        MI_MA(4);

        int semester;

        Studiengang(int semester) {
            this.semester = semester;
        }

        boolean istBachelorstudiengang() {
            return this.semester > 4;
        }

        int regelstudienzeit() {
            return semester;
        }
    }

    public static void main(String[] args) {
        System.out.println(Studiengang.IN_BA.istBachelorstudiengang());
        System.out.println(Studiengang.IN_BA.regelstudienzeit());
        System.out.println(Studiengang.MI_MA.istBachelorstudiengang());
        System.out.println(Studiengang.MI_MA.regelstudienzeit());
    }
}
