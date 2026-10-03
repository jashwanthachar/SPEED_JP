class Student {
    String name;
    String course;
    int year;

    void study() {
        System.out.println("Student is studying");
    }

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }
    void introduce() {
        System.out.println("Hello, my name is " + name);
    }
    void study(int hours) {
        System.out.println(name + " is studied for " + hours + " hours");
    }
    String getProfile() {
        return name + " - " + course + " - Year " + year;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.name = "Jashwanth";
        student1.course = "CSE";
        student1.year = 2;
        student2.name = "Rahul";
        student2.course = "ECE";
        student2.year = 2;
        student3.name = "Ananya";
        student3.course = "AIML";
        student3.year = 2;
        System.out.println(student3.name);
        System.out.println(student3.course);
        System.out.println(student3.year);
        student3.study(4);
        System.out.println(student3.getProfile());
    }
}