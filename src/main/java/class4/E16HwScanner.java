package class4;

import java.util.Scanner;

public class E16HwScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many years have you worked?");
        byte years = scanner.nextByte();
        if (years >= 5) {
            System.out.println("Eligible");
            System.out.println("how much do you make?");
            int salary = scanner.nextInt();
            if (salary >= 50000) {
                System.out.println("You get a $5000 bonus");
            } else {
                System.out.println("You get a $3000 bonus");
            }
        } else {
            System.out.println("UnEligible");

        }
    }
}