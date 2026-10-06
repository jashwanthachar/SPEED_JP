public class StudentProgress implements ProgressCalculator {

    private int completedTasks;
    private int totalTasks;

    public StudentProgress(int completedTasks, int totalTasks) {
        this.completedTasks = completedTasks;
        this.totalTasks = totalTasks;
    }

    @Override
    public double calculateProgress() {
        if (totalTasks == 0) {
            return 0;
        }

        return ((double) completedTasks / totalTasks) * 100;
    }
}