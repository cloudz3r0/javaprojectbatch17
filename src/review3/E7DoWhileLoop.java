package review3;

import java.util.Scanner;

public class E7DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        do {

            System.out.println("Please enter price of item or -1 to stop");
            x = input.nextInt();
            if (x != -1) {
                sum = sum + x;}
                System.out.println("Your total bill is " + sum);


            }
            while (x != -1) ;


        }
    }
