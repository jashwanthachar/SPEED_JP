public class ProjectTask extends Task {

    public ProjectTask(String title) {
        super(title);
    }

    public void buildProject() {
        System.out.println("Project task: " + getTitle());
    }
}