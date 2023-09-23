package class23;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
      setEmail(email);
      setUserName(userName);
      setPassword(password);
    }
    public Registration() {

    }
    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address. Use Yahoo email addresses.");
        }
    }

    void setUserName(String userName) {
        if (userName.length() < 6) {
            System.out.println("username is too short");
        } else {
            this.userName = userName;
        }

    }

    void setPassword(String password) {
        if (password.length() < 6 || password.contains(userName)) {
            System.out.println("password is too short or contains username");
        } else {
            this.password = password;
        }
    }

    public String getEmail() {

        return email;

    }

    public String getUserName() {

        return userName;

    }

    public String getPassword() {
        return password;
    }
}
