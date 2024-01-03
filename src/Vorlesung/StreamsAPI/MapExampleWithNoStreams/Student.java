package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

public class Student {
    private int note;

    private String name;

    private int age;

    public Student(int note, String name, int age) {
        this.note = note;
        this.name = name;
        this.age = age;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
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

    @Override
    public String toString() {
        return "Student{" +
                "note=" + note +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
