import java.util.HashSet;
import java.util.Set;

public class CourseRegistry {

    private Set<String> courses;

    public CourseRegistry() {
        courses = new HashSet<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public Set<String> getCourses() {
        return courses;
    }

    public int getCourseCount() {
        return courses.size();
    }
}