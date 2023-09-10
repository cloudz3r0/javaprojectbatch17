package class5;

import java.util.Scanner;

public class E18SwitchVersion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double num1=scanner.nextDouble();
        double num2=scanner.nextDouble();
        System.out.println("Please enter your operator");
        char operator= scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Cant do problem");

        }
    }
}
