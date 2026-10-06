public class Assignment extends Task {

    public Assignment(String title) {
        super(title);
    }

    public void submitAssignment() {
        System.out.println(getTitle() + " assignment submitted");
    }

    @Override
    public String calculatePriority() {
        return "HIGH";
    }
}