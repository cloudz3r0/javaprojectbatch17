package class4;

import java.util.Scanner;
/*
Ask the user to enter his/her gender "Please enter your gender: M or F"
and their age "Please enter your age"

You have 2 conditions:

If age is above 25, then check if a user entered F
then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered F
then the output should be "Girl" otherwise it should say "Boy"
 */
public class E17GenderAgeScanner {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = input.next();
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age > 25) {
            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        } else {//if age is under 25 we can check the gender conditions.
            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }
    }
}
