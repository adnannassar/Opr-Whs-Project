package Klausur_03_07_2023;

import java.util.*;

public class Afuagbe_006 {
    public static void main(String[] args) {

        FlugPortal flugPortal = new FlugPortal();

        WunschZeil wunschZeilFilter = new WunschZeil("Dortmund", "Münich", true);

        flugPortal.setFilter(wunschZeilFilter);

        flugPortal.addFlug(new Flug("Dortmund", "Münich", "Lufhansa", 150.99, false));
        flugPortal.addFlug(new Flug("Dortmund", "Münich", "Lufhansa", 200.99, true));
        flugPortal.addFlug(new Flug("Dortmund", "Münich", "Euro Wings", 99, true));


        System.out.println(flugPortal.sucheFlüge("Dortmund", "Münich"));

    }

    static class FlugPortal {
        private List<Flug> flüge;

        private Protokolierler protokolierler;

        public FlugPortal() {
            this.flüge = new ArrayList<>();
        }

        public void setFilter(Protokolierler protokolierler) {
            this.protokolierler = protokolierler;
        }

        void addFlug(Flug f) {
            this.flüge.add(f);
        }

        public List<Flug> sucheFlüge(String start, String ziel) {
           List<Flug> verbindungen = new ArrayList<>();
            Set<Flug> setTemp = new HashSet<>();
            for (Flug f : flüge) {
                if (protokolierler != null) {
                    if (protokolierler.filter(start, ziel, f.isDirekt)) {
                        setTemp.add(f);
                    }
                } else {
                    setTemp.add(f);
                }
            }
            verbindungen = new LinkedList<>(setTemp);
            return verbindungen;
        }
    }

    interface Protokolierler {
        boolean filter(String start, String ziel, boolean isDirket);
    }

    static class WunschZeil implements Protokolierler {
        String start, ziel;
        boolean dirket;

        public WunschZeil(String start, String ziel, boolean dirket) {
            this.start = start;
            this.ziel = ziel;
            this.dirket = dirket;
        }

        @Override
        public boolean filter(String start, String ziel, boolean isDirket) {
            return this.start.equals(start) && this.ziel.equals(ziel) && this.dirket == isDirket;
        }
    }


    static class Flug {
        String start, ziel, geselschaft;
        boolean isDirekt;
        double price;

        public Flug(String start, String ziel, String geselschaft, double price, boolean isDirekt) {
            this.start = start;
            this.ziel = ziel;
            this.geselschaft = geselschaft;
            this.price = price;
            this.isDirekt = isDirekt;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Flug flug = (Flug) o;
            return isDirekt == flug.isDirekt && Double.compare(price, flug.price) == 0 && Objects.equals(start, flug.start) && Objects.equals(ziel, flug.ziel) && Objects.equals(geselschaft, flug.geselschaft);
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, ziel, geselschaft, isDirekt, price);
        }

        @Override
        public String toString() {
            String flugAsString = "";
            if (isDirekt) {
                flugAsString += "Direkte ";
            } else {
                flugAsString += "Nicht direkte ";
            }
            return flugAsString + "Flug von " + start + " nach " + ziel + " via " + geselschaft
                    + " für " + price + "€\n";
        }
    }
}
