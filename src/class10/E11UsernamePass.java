package class10;

public class E11UsernamePass {
    public static void main(String[] args) {

        /*Store username, password and confirm password from a user and check following requirements:

        Username or Password cannot be  empty, if so→ message= ”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message= ”Password is too short”.
        Password cannot contain username if so, → message= ”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created” */
        String user = "User123";
        String pass = "Pass123";
        String conPass = "Pass234";

        if (user.isEmpty() || pass.isEmpty()) {//if one is true then this condition is true
            System.out.println("Username or Password cannot be entered");
        }else if (pass.length() <8) {
            System.out.println("Password is too short");
        }else if (pass.contains(user)) {//dont use equals. use contain instead incase it does use some of the username for pass
                    System.out.println("Password Cannot contain username");
        } else if (!pass.contains(conPass)) {
                    System.out.println("Password is not the same");
        } else {
                    System.out.println("Username and password have been created.");
                }
            }
        }





