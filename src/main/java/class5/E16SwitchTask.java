package class5;

import java.util.Scanner;

public class E16SwitchTask {
    public static void main(String[] args) {
      /*Ask user to enter their country and capture it.
      Once values are captured print which language user speaks.
      */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = scanner.nextLine();
        country=country.toLowerCase();//for lowercase values
        switch (country) {
            case "united states":
                System.out.println("english");
                break;
            case "egypt":
                System.out.println("Arabic");
                break;
            case "mexico":
                System.out.println("spanish");
                break;
            case "india":
                System.out.println("Hindi");
                break;
            case "iran":
                System.out.println("Farsi");
            default:
                System.out.println("i dont know their language");



        }
    }
}
