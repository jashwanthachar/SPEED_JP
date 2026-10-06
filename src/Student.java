public class Student {

    // Fields
    private String name;
    private String course;
    private int year;

    // Constructor
    public Student(String name, String course, int year) {
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Method
    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    // Method
    public void study(int hours) {
        System.out.println(name + " studied for " + hours + " hours");
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
    if (name != null && !name.isEmpty()) {
        this.name = name;
    } else {
        System.out.println("Name cannot be empty");
    }
}
    // Getter for course
    public String getCourse() {
        return course;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Method
    public String getProfile() {
        return name + " - " + course + " - Year " + year;
    }
}