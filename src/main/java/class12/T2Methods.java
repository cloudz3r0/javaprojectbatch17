package class12;

public class T2Methods {
    /*
    create a method that will take two int numbers as input
    and return the larger number. Call the method in a different class
    and print the results
     */
    int larger(int num, int num2) {
        int result;
        if (num > num2) {
            result = num;
            //can also do return num1;
        } else {
            result = num2;
            //can also do return num2;
        }
        return result;
    }
    /*
    Create a method that creates an email. Based on users firstName, lastName,
    and email type, your method should return complete email address.
     */
    String createEmail(String fName, String lName, String Email) {
        return fName+lName+'@'+Email+".com";//directly return string into a variable




    }

}