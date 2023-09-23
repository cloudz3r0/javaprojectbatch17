package class12;

import java.util.Scanner;

public class Calculator {
    void add (){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();
        System.out.println("Please enter the second number");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of these numbers is "+sum);
//static makes it dedicated to the same class. cant be called upon or imported
    }
void subtract(){
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter first number");
    int num1=input.nextInt();
    System.out.println("Please enter the second number");
    int num2=input.nextInt();
    int sum= num1-num2;
    System.out.println("Subtraction of these numbers is "+sum);
}
void multiply(int number1,int number2){//parameters. Declaring variables but no values.
//if we want to use more than 2 we make an array.
        int result=number1*number2;
    System.out.println("The multiplication of these is "+result);
}
}
