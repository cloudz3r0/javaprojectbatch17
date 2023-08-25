package review4;

import java.util.Arrays;
import java.util.Scanner;

public class E8Arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=input.nextInt();//whatever user enters
        int [] numbers=new int[size];//will become the size of array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number");
            numbers[i]=input.nextInt();/*
            will loop with whatever number you put in the size
            then can insert as many numbers as the size user put in
            ex. 3 is the size of the array
            so you can put 3 numbers into the console.
            3 is size
            1
            2
            3
            you entered these numbers
            {1,2,3}
            */
        }
        System.out.println("You entered these numbers");//are outside loop just to show the new array
        System.out.println(Arrays.toString(numbers));//if to string isnt imported
        // you need to import the first import on this page.

    }
}
