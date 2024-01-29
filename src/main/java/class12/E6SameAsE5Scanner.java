package class12;

import java.util.Scanner;

public class E6SameAsE5Scanner {
    public static void main(String[] args) {
       
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below
            StringBuilder reversed = new StringBuilder(givenString);
            reversed.reverse();
            System.out.println("Word is "+givenString);
            System.out.println("Reversed is " + reversed);

            if (givenString.equalsIgnoreCase(reversed.toString())) {
                System.out.println("This word is a palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }


    }

