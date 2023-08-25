package review4;

import java.util.Scanner;

public class E9Joke {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Is it weekend");
        boolean weekend=input.nextBoolean();
        String hi;
        if(weekend){
            hi="Java";
        }else{
            hi="Manual testing";
            System.out.println("Manual testing");
    }
    }
}
