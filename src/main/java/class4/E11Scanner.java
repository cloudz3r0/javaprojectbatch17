package class4;

import java.util.Scanner;

public class E11Scanner
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        if (name.equals("Asghar")){
            System.out.println("java instructor");

        }else if(name.equals("Adrian")) {
            System.out.println("I live in Maryland");
        }else if(name.equals("Ava")) {
            System.out.println("Sexy Woman");
        }else{
            System.out.println("No");
        }
    }
}