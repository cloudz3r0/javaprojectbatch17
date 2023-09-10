package class5;

import java.util.Scanner;

public class E12Task {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        char day=6;
        if (day>=1 && day<=5) {//will be a range of 1-5 the number has to make them both true
            System.out.println("It is a weekday");
        }else if(day==6 || day==7){//only one of these needs to be true
            System.out.println("Its a weekend");


            }else {
            System.out.println("Invalid day");
        }

    }
}
