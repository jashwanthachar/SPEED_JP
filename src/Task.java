public class Task {

    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void completeTask() {
        completed = true;
    }

    public String getTaskStatus() {
        if (completed) {
            return title + " - Completed";
        } else {
            return title + " - Pending";
        }
    }

    // Method for polymorphism
    public String calculatePriority() {
        return "MEDIUM";
    }

    // Method overloading
    public String calculatePriority(int daysLeft) {
        if (daysLeft <= 1) {
            return "HIGH";
        } else if (daysLeft <= 3) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
    }
}