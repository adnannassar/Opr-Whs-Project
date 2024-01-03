package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

public class DB_Student {

    private int note;

    private String name;

    private int age;

    private String email;

    private String addresse;

    public DB_Student(int note, String name, int age, String email, String addresse) {
        this.note = note;
        this.name = name;
        this.age = age;
        this.email = email;
        this.addresse = addresse;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "DB_Student{" +
                "note=" + note +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", addresse='" + addresse + '\'' +
                '}';
    }
}

