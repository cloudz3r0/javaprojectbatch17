package class12;

import java.util.Scanner;

public class E1MethodsShortcut {
    public static void main(String[] args) {

            takeUserInput();
        System.out.println("Please enter details again");
        takeUserInput();
        }




        static void takeUserInput(){//void is called written type. the takeuser is a method.
        //parentheses are the parameters. brackets are the body for this code.
            Scanner input=new Scanner (System.in);
    System.out.println("Please enter your name");
    String name=input.nextLine();
    System.out.println("Please enter your age");
    int age=input.nextInt();
    System.out.println("Your name is "+name+" and your are "+age+" years old");
    }
}
