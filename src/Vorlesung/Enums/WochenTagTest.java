package Vorlesung.Enums;

public class WochenTagTest {
    public static void main(String[] args) {
        if (Wochentag.SONNTAG.istWochenende()) {
            System.out.println("True");
        } else {
            System.out.println(Wochentag.SONNTAG.naechsterTag());
        }

        for(Wochentag t: Wochentag.values()){
            System.out.println(t);
        }
    }
}
