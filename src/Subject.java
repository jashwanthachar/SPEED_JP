public class Subject {

    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCredits(int credits) {
        if (credits > 0) {
            this.credits = credits;
        } else {
            System.out.println("Credits must be greater than 0");
        }
    }

    public String getSubjectInfo() {
        return name + " (" + code + ") - " + credits + " credits";
    }
}