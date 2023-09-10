package class5;

import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What month were you born in");
        String month=input.next();
//use equalsIgnoreCase to print no matter the uppercase or lowercase
        if (month.equalsIgnoreCase("June")
                ||month.equalsIgnoreCase("July")
                ||month.equalsIgnoreCase("August")) {
            System.out.println("You were born in summer season");
        }else if(month.equalsIgnoreCase("March")
                ||month.equalsIgnoreCase("April")
                ||month.equalsIgnoreCase("May")) {
            System.out.println("You were born in the spring season");
        }else if(month.equalsIgnoreCase("November")
                ||month.equalsIgnoreCase("December")
                ||month.equalsIgnoreCase("January")){
            System.out.println("You were born in winter season");
        }else{
            System.out.println("You were born in fall season");
            //&&
            //Will combine the conditions so that it will give use true if all the conditions are true
       //instead of all of them having to be false to be false.
        }
    }
}
