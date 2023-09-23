package review3;

import java.util.Scanner;

public class E9ForLoop {
    public static void main(String[] args) {
       /* Write a for loop that will print out a series of numbers starting at one less
       than x and ending at 0.
        */
        Scanner input=new Scanner (System.in);
        int x=input.nextInt();

        for (int index = x-1; index >=0 ; index--) {
            System.out.print(index+" ");
        }
    }
}
