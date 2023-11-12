package Vorlesung.Map;

import java.util.Objects;

public class Car {
    private String name;


    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Car c = (Car) o;
        if (name.equals(c.name)) {
            return true;
        } else {
            return false;
        }
    }
}
