public class Main {

    public static void main(String[] args) {

        // Creating Student objects
        Student student1 = new Student(
                "Jashwanth",
                "jash@speed.com",
                "CSE",
                2
        );

        Student student2 = new Student(
                "Rahul",
                "rahul@speed.com",
                "ECE",
                2
        );

        Student student3 = new Student(
                "Ananya",
                "ananya@speed.com",
                "AIML",
                2
        );

        // Inherited methods from User
        student1.displayUserInfo();
        student1.login();

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

        // Setter validation
        student1.setName("");

        System.out.println("Student name: " + student1.getName());

        // Subject
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

        System.out.println("Project: " + project1.getName());
        System.out.println("Description: " + project1.getDescription());
        System.out.println("Status: " + project1.getProjectStatus());

        project1.completeProject();

        System.out.println("Status after completion: " + project1.getProjectStatus());

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

        // Mentor
        Mentor mentor1 = new Mentor(
                "Dr. Kumar",
                "kumar@speed.com",
                "Java and AI"
        );

        mentor1.displayUserInfo();
        System.out.println("Specialization: " + mentor1.getSpecialization());

        mentor1.login();
        mentor1.guideStudent();

        // Task inheritance
        Assignment assignment1 = new Assignment("Java Assignment");
        CodingTask codingTask1 = new CodingTask("Build SPEED Feature");
        ProjectTask projectTask1 = new ProjectTask("Complete SPEED Project");

        assignment1.submitAssignment();
        codingTask1.writeCode();
        projectTask1.buildProject();
        // Polymorphism
Task taskA = new Assignment("Java Assignment");
Task taskB = new CodingTask("Build SPEED Feature");
Task taskC = new ProjectTask("Complete SPEED Project");

System.out.println("Assignment Priority: " + taskA.calculatePriority());
System.out.println("Coding Task Priority: " + taskB.calculatePriority());
System.out.println("Project Task Priority: " + taskC.calculatePriority());

// Method overloading
System.out.println("Priority with 1 day left: " + taskA.calculatePriority(1));
System.out.println("Priority with 5 days left: " + taskA.calculatePriority(5));
// Progress Calculator
StudentProgress progress = new StudentProgress(7, 10);

System.out.println(
        "Student Progress: " + progress.calculateProgress() + "%"
);
// Recommendation Engine
StudyRecommendation recommendation =
        new StudyRecommendation(35);

System.out.println(
        "Recommendation: " + recommendation.generateRecommendation()
);
// Notification Service
ConsoleNotification notification =
        new ConsoleNotification();

notification.sendNotification("Java assignment deadline is tomorrow.");
    }
}