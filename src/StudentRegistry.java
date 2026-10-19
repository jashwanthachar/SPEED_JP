import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentsByEmail;

    public StudentRegistry() {
        studentsByEmail = new HashMap<>();
    }

    public void registerStudent(Student student) {
        studentsByEmail.put(student.getEmail(), student);
    }

    public Student findStudent(String email) {
        return studentsByEmail.get(email);
    }

    public int getStudentCount() {
        return studentsByEmail.size();
    }
}