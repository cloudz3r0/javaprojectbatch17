package class5;

import java.util.Scanner;

public class E17SwitchTask {
    public static void main(String[] args) {
        /*Allow user to enter grade (A, B, or C etc...) and\
         then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.
*/
        Scanner scanner=new Scanner (System.in);
        System.out.println("What grade did you get");
        String grade=scanner.next();
        switch (grade){
            case "A":
                System.out.println("A -You did Excellent");
                break;
            case "B":
                System.out.println("B - You did well");
                break;
            case "C":
                System.out.println("C - You did okay");
                break;
            case "D":
                System.out.println("D - You did poorly");
            default:
                System.out.println("You failed");
        }

    }
}
