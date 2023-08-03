package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the Scanner class so that we can use the codes
        //from those classes.
        Scanner input = new Scanner(System.in);//Scanner is a class. Can reuse codes from different classes
        //taking an input from the user and storing in an int name or any variable.
        String name = input.next();
        if (name.equals("Asghar")){
            System.out.println("Java Instructor");
    }else{
        System.out.println("I dont know you");
//so when i enter my name it will say i dont know you. if i put asghar it will put java inst.
      }
        //System.out.println("Hello "+name);
//can write on console. I put my name and in the console it said Hello Adrian.What i enter
        //on console. Will go into "name" variable

    }
}
