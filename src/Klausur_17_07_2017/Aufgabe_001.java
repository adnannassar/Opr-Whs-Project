package Klausur_17_07_2017;

public class Aufgabe_001 {
    public static void main(String[] args) {

    }

    abstract class Shopartikel {

        public boolean passtZu(String wort) {
            return check(wort);
        }

        public abstract boolean check(String wort);
    }

    class A extends Shopartikel {

        @Override
        public boolean check(String wort) {
            String[] array = {"Java", "OPR", "Eintrag"};
            // Enhanced For Loop <==> Erweiterte For Schleife!
            for (String str : array) {
                if (str.equals(wort)) {
                    return true;
                }
            }
            return false;

            /*
            for(int i = 0 ; i<array.length; i++){
                if (array[i].equals(wort)) {
                    return true;
                }
            }
            return false;
             */
        }
    }
}
