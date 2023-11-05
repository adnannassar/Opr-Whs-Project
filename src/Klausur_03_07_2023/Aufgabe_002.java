package Klausur_03_07_2023;

public class Aufgabe_002 {
    public static void main(String[] args) {
        Zutat z1 = new Zutat("Milch", false);

        Zutat z2 = new Zutat("Erdbeeren", true);
        Zutat z3 = new Zutat("Zucker", true);
        Zutat z4 = new Zutat("Pektin", true);
        Zutat z5 = new Zutat("Ascorbinsäure", false);

        Zutat[] meal_1 = {z1};
        Zutat[] meal_2 = {z2, z3, z4, z5};

        Lebensmittel lebensmittel = new Lebensmittel();
        System.out.println("Test 1");
        System.out.println(lebensmittel.zutatentext(meal_1));
        System.out.println("Test 2");
        System.out.println(lebensmittel.zutatentext(meal_2));
        System.out.println("Test 3");
        System.out.println("Meal 2 ist vegan ? --> " + lebensmittel.istVegan(meal_2));
    }

    static class Lebensmittel {
        public final String zutatentext(Zutat[] zutaten) {
            String erg = "Es gibt Keine Zutaten!";
            if (zutaten != null && zutaten.length > 0) {
                erg = "";
                if (zutaten.length == 1) {
                    erg += "Zutat: " + zutaten[0].gibName();
                } else {
                    erg += "Zutaten: ";
                    for (int i = 0; i < zutaten.length; i++) {
                        erg += zutaten[i].gibName() + ", ";
                    }
                }
            }
            return erg;
        }

        public final boolean istVegan(Zutat[] zutaten) {
            if (zutaten != null && zutaten.length > 0) {
                for (int i = 0; i < zutaten.length; i++) {
                    if (!zutaten[i].istVegan()) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }


    }



}
