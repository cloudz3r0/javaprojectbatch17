package class4;

import java.util.Scanner;

public class E19NestedIfLargestNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = input.nextInt();
        System.out.println("Next Number");
        int num2 = input.nextInt();
        System.out.println("Next Number");
        int num3 = input.nextInt();
        if (num1 > num2) {//checks if num1 is greater than number 2
            if (num1 > num3) {//if true then it also checks if its greater than number 3
                System.out.println("The largest number is " + num1);
            } else {
                System.out.println("The largest number is " + num3);
            }
        } else {//if number one is less than the second number then it checks if its greater than number 3
            if (num2 > num3) {
                System.out.println("The largest number is " + num2);
            } else {
                System.out.println("The largest number is " + num3);
            }

        }
    }
}
