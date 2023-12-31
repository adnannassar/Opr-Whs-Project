package Klausur_27_09_2021;

public class Aufgabe_009 {

    public static void main(String[] args) {
        OnlineBanking ob = new OnlineBanking();
        ob.setzePINregel(pin -> pin.length() >= 5 && pin.charAt(0) != pin.charAt(pin.length() - 1));

        System.out.println("1234 --> " + ob.PINisValid("1234"));
        System.out.println("12341 --> " + ob.PINisValid("12341"));
        System.out.println("12345 --> " + ob.PINisValid("12345"));
        System.out.println("12342137981731 --> " + ob.PINisValid("52342123123"));
    }


    static public class OnlineBanking {
        private PINregel regel;

        public void setzePINregel(PINregel regel) {
            this.regel = regel;
        }


        public boolean PINisValid(String PIN) {
            return regel != null && regel.istZulaessig(PIN);
        }
    }

    @FunctionalInterface
    public interface PINregel {
        boolean istZulaessig(String pin);
    }
}
