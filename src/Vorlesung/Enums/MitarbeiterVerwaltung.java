package Vorlesung.Enums;

public class MitarbeiterVerwaltung {
    public static void main(String[] args) {
        Mitarbeiter m =
                new Mitarbeiter(
                        "Shaker",
                        25,
                        new Address("Teststr", 12345, "Dortmudn", 10),
                        Geschlecht.Mann
                );
    }




    static class Mitarbeiter {
        String name;
        int age;
        Address address;
        Geschlecht geschlecht;

        public Mitarbeiter(String name, int age, Address address, Geschlecht geschlecht) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.geschlecht = geschlecht;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Geschlecht getGeschlecht() {
            return geschlecht;
        }

        public void setGeschlecht(Geschlecht geschlecht) {
            this.geschlecht = geschlecht;
        }
    }

    static class Address{
        private String str;
        private int plz;
        private String ort;
        private  int hausnr;

        public Address(String str, int plt, String ort, int hausnr) {
            this.str = str;
            this.plz = plt;
            this.ort = ort;
            this.hausnr = hausnr;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public int getPlz() {
            return plz;
        }

        public void setPlz(int plz) {
            this.plz = plz;
        }

        public String getOrt() {
            return ort;
        }

        public void setOrt(String ort) {
            this.ort = ort;
        }

        public int getHausnr() {
            return hausnr;
        }

        public void setHausnr(int hausnr) {
            this.hausnr = hausnr;
        }
    }
}

