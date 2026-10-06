public class Project {

    private String name;
    private String description;
    private boolean completed;

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void completeProject() {
        completed = true;
    }

    public String getProjectStatus() {
        if (completed) {
            return name + " - Completed";
        } else {
            return name + " - In Progress";
        }
    }
}