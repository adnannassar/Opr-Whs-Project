package Vorlesung.StreamsAPI.MapExampleWithNoStreams;

public class MappingService {
    public static Student mapToStudent(DB_Student dbStudent){
        return new Student(dbStudent.getNote(), dbStudent.getName(), dbStudent.getAge());
    }

    public static MapedStudent mapToMapedStudent(DB_Student dbStudent){
        return new MapedStudent(dbStudent.getAge());
    }
}
