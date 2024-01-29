package class29;

import java.util.Scanner;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
       Scanner input=new Scanner(System.in);
        System.out.println("Please enter the size of array");
       try {
           int size = input.nextInt();
           int[] arr = new int[size];
       }catch (Exception e){
           System.out.println("User must only enter a positive integer number.");//basically an if else.
           //try this code and if it succeeds then return the size. If the code fails then execute the catch then executes
           //the code afterwards.
       }
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
