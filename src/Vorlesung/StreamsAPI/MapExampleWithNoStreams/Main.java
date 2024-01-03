package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

public class Main {

    public static void main(String[] args) {
        DB_Student dbStudent = new DB_Student(3, "Student", 25, "stu.com", "Teststraße");
        System.out.println(dbStudent);
        Student st = MappingService.mapToStudent(dbStudent);

        System.out.println(st);

        MapedStudent ageStudent = MappingService.mapToMapedStudent(dbStudent);
        System.out.println(ageStudent);

    }
}
