package review3;

import java.util.Scanner;
public class E4Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <=3; i++) {
            System.out.println("Hello world");
        }

//can enter all these codes into the loop to repeat the prints.
        //any code you can put it.
        //can use string with switch
        System.out.println("Please enter the name of the fruit");
        String fruit=input.next();
        switch(fruit){
            case "Orange":
                System.out.println("It is usually orange");
                break;
            case "Banana":
                System.out.println("Yellow bananas are good");
                break;
            case "Strawberry":
                System.out.println("I like red Strawberries");
                break;
            case "Blue Berry":
                System.out.println("Blue berries are good for heart");
                break;
            default:
                System.out.println("I dont like this fruit");



        }
    }
}
