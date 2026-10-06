public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public String getEmail() {
        return email;
    }

    public void login() {
        System.out.println(name + " logged in");
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}