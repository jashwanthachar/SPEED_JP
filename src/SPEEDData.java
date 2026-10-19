import java.util.ArrayList;
import java.util.List;

public class SPEEDData {

    private List<Student> students;
    private List<Subject> subjects;
    private List<Task> tasks;
    private List<Project> projects;

    public SPEEDData() {
        students = new ArrayList<>();
        subjects = new ArrayList<>();
        tasks = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Project> getProjects() {
        return projects;
    }
}