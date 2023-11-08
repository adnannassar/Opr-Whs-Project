package Vorlesung.ObjectClass;

public class ToString {
    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        System.out.println(car);
    }

    static class Car {
        private String name;
        private int topSpeed;

        public Car(String name, int topSpeed) {
            this.name = name;
            this.topSpeed = topSpeed;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        @Override
        public String toString() {
            return "Car -> Name: " + name + ", Top Speed: " + topSpeed;
        }

    }
}
