package class29;

import java.util.Scanner;

public class Homework {
    //How would handle InputMismatchException? Input Mismatch
    // Exception when user enters mismatch value then programmer expected.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter an integer number");
        try {
            int number = scanner.nextInt();
            System.out.println(number+" is an integer number");
        }catch(Exception e){
            System.out.println("User must only enter integer number");
        }

    }
}

