package Klausur_01_01_2022;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class Aufgabe_006 {
    public static void main(String[] args) {

        KeinTreffer keinTreffer = new KeinTreffer();
        Onlineshop shop = new Onlineshop(keinTreffer);

        shop.suche("Pepsi");
        shop.suche("Cola");

        System.out.println(keinTreffer.listOfKeinTreffer());
    }

   static class Onlineshop {
        private Katalog katalog;
        private Suchprotokollierer suchprotokollierer;

        public Onlineshop(Suchprotokollierer suchprotokollierer) {
            katalog = new Katalog();
            this.suchprotokollierer = suchprotokollierer;
        }

        public List<Artikell> suche(String suchbegriff) {
            List<Artikell> treffer = katalog.suche(suchbegriff);
            suchprotokollierer.protokollierSuche(suchbegriff, treffer);
            return treffer;
        }
    }



   static class Katalog {
        private List<Artikell> artikells;

        public Katalog (){
            artikells = new ArrayList<>(Arrays.asList(
                    new Artikell("Cola"),
                    new Artikell("Pepsi"),
                    new Artikell("Cola")
            ));
        }


        public List<Artikell>
        suche(String suchbegriff) {
          return artikells.stream().filter(new Predicate<Artikell>() {
              @Override
              public boolean test(Artikell artikell) {
                  return artikell.name.equals(suchbegriff);
              }
          }).toList();
        }
    }

    static class Artikell {
            String name ;

        public Artikell(String name) {
            this.name = name;
        }
    }

    static interface Suchprotokollierer{
        void protokollierSuche(String suchbegriff,List<Artikell> katalogartikels);
    }

   static class KeinTreffer implements Suchprotokollierer{
        private Set<String> keinTrefferSet = new HashSet<>();
        @Override
        public void protokollierSuche(String suchbegriff, List<Artikell> katalogartikels) {
            if(!katalogartikels.isEmpty()){
                keinTrefferSet.add(suchbegriff);
            }
        }
        public List<String> listOfKeinTreffer(){
            return new LinkedList<String>(keinTrefferSet);
        }


    }

}


