package review4;

public class E13Arrays {
    /*
    Write a program that creates an array of integers of size 11. Add the years 2010 to 2020
    to your array one by one using a for loop and then print all those values.
     */

    public static void main(String[] args) {

        int[] arr = new int[11];//created array

        for (int i = 0; i < arr.length; i++) {//made a loop up to 10. since 0 is the starting point

            System.out.println(2010+i);
            //keeps incrementing 2010 to which ever iteration of loop we're in
            /* So
            2010+0=2010
            2010+1=2011
            2010+2=2012
            2010+3=2013
            2010+4=2014
            goes all the way til 10.
             */
        }
    }
}
