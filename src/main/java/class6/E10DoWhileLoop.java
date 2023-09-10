package class6;

import java.util.Scanner;

public class E10DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//takes input

        String input;

        do{
            System.out.println("Please enter your name or shutdown to close program");//ask user for input
            input=scanner.nextLine();// will create the value into scanner
            System.out.println("You are great "+input);

        }while(!input.equalsIgnoreCase("shutdown"));//this specific word will shut down the program
        //the !input means anything that isnt equal to shutdown will keep running
    }
}

