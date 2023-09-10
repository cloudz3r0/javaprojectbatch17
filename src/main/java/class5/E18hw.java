package class5;

import java.util.Scanner;

public class E18hw {
    public static void main(String[] args) {
        //HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user.
        //Please complete this assignment in 2 ways: using if statement and switch case.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        System.out.println("Please enter your operator");
        char operator= scanner.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Cant do problem");
        }
    }
}
