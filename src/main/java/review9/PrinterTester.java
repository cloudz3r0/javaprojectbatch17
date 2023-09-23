package review9;

import java.util.Scanner;

public class PrinterTester {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print(10,50,60,70);
        p.print(10);
        System.out.println(Math.abs(-15));
        Scanner c=new Scanner(System.in);
        c.nextByte();
        c.nextByte(2);
        //examples of method overloading.
    }
}
