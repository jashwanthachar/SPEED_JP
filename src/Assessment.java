public class Assessment {

    private String name;
    private int marks;
    private int maxMarks;

    public Assessment(String name, int maxMarks) {
        this.name = name;
        this.maxMarks = maxMarks;
        this.marks = 0;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= maxMarks) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public double getPercentage() {
        return ((double) marks / maxMarks) * 100;
    }
}