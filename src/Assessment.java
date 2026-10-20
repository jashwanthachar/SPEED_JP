public class Assessment {

    private String name;
    private int marks;
    private int maxMarks;

    public Assessment(String name, int maxMarks) throws InvalidMarksException {
        if (maxMarks <= 0) {
            throw new InvalidMarksException("Maximum marks must be greater than zero.");
        }
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

    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > maxMarks) {
            throw new InvalidMarksException("Marks must be between 0 and " + maxMarks + ".");
        }
        this.marks = marks;
    }

    public double getPercentage() {
        return ((double) marks / maxMarks) * 100;
    }
}
