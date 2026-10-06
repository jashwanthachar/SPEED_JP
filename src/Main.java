public class Main {

    public static void main(String[] args) {

        // Creating objects using constructor
        Student student1 = new Student("Jashwanth", "CSE", 2);
        Student student2 = new Student("Rahul", "ECE", 2);
        Student student3 = new Student("Ananya", "AIML", 2);

        // Introducing students
        student1.introduce();
        student2.introduce();
        student3.introduce();

        // Students studying
        student1.study(5);
        student2.study(10);
        student3.study(4);

        // Display profiles
        System.out.println(student1.getProfile());
        System.out.println(student2.getProfile());
        System.out.println(student3.getProfile());

        // Getter
        System.out.println("Student 1 name: " + student1.getName());

        // Setter
        // Setter
        // Setter
student1.setName("");

System.out.println("Student name: " + student1.getName());

        Subject subject1 = new Subject("Data Structures", "DSA", 4);

        System.out.println(subject1.getName());
        System.out.println(subject1.getCode());
        System.out.println(subject1.getCredits());
        System.out.println(subject1.getSubjectInfo());

        subject1.setCredits(3);

        System.out.println(subject1.getSubjectInfo());
                // Project
        Project project1 = new Project(
                "SPEED Java Project",
                "Build a Java OOP project for SPEED"
        );

        // Task
Task task1 = new Task("Complete Java OOP");

System.out.println("Task: " + task1.getTitle());
System.out.println("Status: " + task1.getTaskStatus());

task1.completeTask();

System.out.println("Status after completion: " + task1.getTaskStatus());
// Assessment
Assessment assessment1 = new Assessment("Java OOP Test", 100);

System.out.println("Assessment: " + assessment1.getName());
System.out.println("Marks: " + assessment1.getMarks());
System.out.println("Max Marks: " + assessment1.getMaxMarks());
System.out.println("Percentage: " + assessment1.getPercentage());

assessment1.setMarks(85);

System.out.println("Updated Marks: " + assessment1.getMarks());
System.out.println("Updated Percentage: " + assessment1.getPercentage());

assessment1.setMarks(150);
    }
    
}
