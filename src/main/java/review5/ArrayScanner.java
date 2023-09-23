package review5;

import java.util.Scanner;

public class ArrayScanner {
    /*
    Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array and add a 0 next to it.
     */
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int []arr=new int[5];
        for (int i = 0; i < arr.length; i++) {//creates the values inputted by user.
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++)//this prints all values
            System.out.println(arr[i]+""+0);
    }
}
