package class4;

import java.util.Scanner;

public class E9ScannerChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Gender F/M");
        char gender=scanner.next().charAt(0);//the number will pick a letter. So 0 is the first letter
        System.out.println("Your Gender is "+gender);
    }
}
