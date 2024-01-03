package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

public class MapedStudent {
    int age;

    public MapedStudent(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MapedStudent{" +
                "age=" + age +
                '}';
    }
}
