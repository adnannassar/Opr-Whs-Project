package Vorlesung.Collection;

import java.util.Objects;

public class Car implements Comparable<Car> {
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
        return name + " " + topSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Car c = (Car) o;
        if (this.topSpeed == c.topSpeed && name.equals(c.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }
}
