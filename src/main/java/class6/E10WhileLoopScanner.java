package class6;

import java.util.Scanner;

public class E10WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point");//10
        int start= scanner.nextInt();
        System.out.println("Please enter the ending point");//50
        int end=scanner.nextInt();
        System.out.println("Please enter the step process");//5
        //will print out from 10 in multiples of 5 until it gets to 50
        int step=scanner.nextInt();
        while(start<=end){
            System.out.print(start+" ");//will read from left to right
            start+=step;
        }
    }
}
