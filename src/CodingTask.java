public class CodingTask extends Task {

    public CodingTask(String title) throws InvalidTaskException {
        super(title);
    }

    public void writeCode() {
        System.out.println("Coding task: " + getTitle());
    }

    @Override
    public String calculatePriority() {
        return "MEDIUM";
    }
}
