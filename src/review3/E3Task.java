package review3;

import java.util.Scanner;

public class E3Task {
    public static void main(String[] args) {
       /* Ask the user to input two boolean values (true or false).
        Use the logical AND operator (&&) to determine if both are true.
                Display the result to the user.
                */
        Scanner input=new Scanner(System.in);
        System.out.println("enter your credit score if its good or bad");

        boolean goodCredit=input.nextBoolean();

        System.out.println("Do you have a good stable job?");
        boolean goodJob=input.nextBoolean();
//doesnt matter what cases are in true or false

        boolean loan=(goodJob&&goodCredit);
        System.out.println(loan+" Can get house");



    }
}
