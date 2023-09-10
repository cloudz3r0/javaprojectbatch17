package class8;

import java.util.Scanner;

public class E9Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while (true) {//to keep asking the question in a loop.
            System.out.println("Please enter the price of the item or -1 to terminate");
            double price = input.nextDouble();
            if (price == -1) {
                break;//used to terminate loop
            } else {

                total = total + price;
            }
            System.out.println("Your total bill is "+total);
        }
    }
}
