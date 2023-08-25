package class5;

import java.util.Scanner;

public class E11Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your height in inches");

        int height=scanner.nextInt();

                if(height>72) {
                    System.out.println("You are tall");

                }else if(height>=60&& height<=72)  {
                    System.out.println("You are average height");
//if i used || then if the number was greater than 60 it would be average height
                }else {
                    System.out.println("You are short");
                }
    }
}
