package class4;

import java.util.Scanner;

public class E10ScannerManyLines {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Full Name");
      String name =  scanner.nextLine();
        System.out.println("Your Full Name Is "+name);
//use scanner.nextLine(); to store many lines.
    }
}
