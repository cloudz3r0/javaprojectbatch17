package class6;

import java.util.Scanner;

public class E10EndLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Please enter a number or -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered " + input);
    while(input!=-1){
        System.out.println("Please enter a number or -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered " + input);// it will keep printing
        //the prints until you enter -1 to stop the loop

    }
    }
}
/*
int input;
do{
System.out.println(Please enter a number and -1 to terminate)
input=scanner.nextInt();
System.out.println("You have entered "+input);
}while(input !=-1);
this will keep printing the first print until you enter -1.
 */