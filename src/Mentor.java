public class Mentor extends User {

    private String specialization;

    public Mentor(String name, String email, String specialization) {
        super(name, email);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void guideStudent() {
        System.out.println(getName() + " is guiding students");
    }
}