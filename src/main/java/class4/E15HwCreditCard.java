package class4;

import java.util.Scanner;

public class E15HwCreditCard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean credit = true;
    System.out.println("Do you have a credit card?");


    if (credit == true) {
      System.out.println("how much do you have?");


      double balance = scanner.nextDouble();

      if (balance > 1000) {
        System.out.println("Pay it off Immediately");
      } else {
        System.out.println("Spend more");
      }
    } else {
      System.out.println("I can get you started with one");


    }
  }

}