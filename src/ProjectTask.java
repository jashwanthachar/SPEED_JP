public class ProjectTask extends Task {

    public ProjectTask(String title) throws InvalidTaskException {
        super(title);
    }

    public void buildProject() {
        System.out.println("Project task: " + getTitle());
    }

    @Override
    public String calculatePriority() {
        return "LOW";
    }
}
