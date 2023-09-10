package review2;

import java.util.Scanner;

public class E5ElseIf {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you");
        int age=scanner.nextInt();

        /*if age is greater than 60 then off 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount
        if none No Discounts
      */

        if(age>60){
            System.out.println("You get a 20% discount");
        }else if(age>50) {
            System.out.println("You get a 10% discount");

        }else if(age>40) {
            System.out.println("You get a 10% discount");

        }else{
            System.out.println("No discounts for you.  PLease try after 10 years");
        }
    }
}
