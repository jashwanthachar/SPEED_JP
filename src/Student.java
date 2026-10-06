public class Student extends User {

    private String course;
    private int year;

    public Student(String name, String email, String course, int year) {
        super(name, email);
        this.course = course;
        this.year = year;
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