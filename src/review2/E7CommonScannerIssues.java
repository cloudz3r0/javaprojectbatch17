package review2;

import java.util.Scanner;

public class E7CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fName=scanner.nextLine();// if i use scanner.next and use one line of words. it will print the value in both prints
        System.out.println("Please enter your city");
        //scanner.nextline(); use if you use .next() to get to the next line
       String city=scanner.nextLine();
        System.out.println(fName+" "+city);
    }
}
