package review4;

import java.util.Scanner;

public class E15ForLoopScanner {
    /*
    Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

     */
    public static void main(String[] args) {
        String[] days = new String[7];
        Scanner input = new Scanner(System.in);
        //have to use +1 in print bc first value will be day 0
        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            days[i] = input.next();//each index will be what is inputted by user
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);
            //once all have been taken from user
            //this prints all those values out
        }
    }
}