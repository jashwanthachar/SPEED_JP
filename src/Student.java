public class Student extends User {

    private String course;
    private int year;

    public Student(String name, String email, String course, int year)
            throws InvalidStudentException {
        super(validateName(name), email);
        if (course == null || course.trim().isEmpty() || year <= 0) {
            throw new InvalidStudentException("Course cannot be empty and year must be positive.");
        }
        this.course = course;
        this.year = year;
    }

    private static String validateName(String name) throws InvalidStudentException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidStudentException("Student name cannot be empty.");
        }
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + getName());
    }

    public void study(int hours) {
        System.out.println(getName() + " studied for " + hours + " hours");
    }

    public String getProfile() {
        return getName() + " - " + course + " - Year " + year;
    }
}
