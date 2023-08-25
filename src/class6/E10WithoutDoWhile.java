package class6;

import java.util.Scanner;

public class E10WithoutDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Please enter a number or -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered " + input);
    while(input!=-1){
        System.out.println("Please enter a number or -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered " + input);// it will only print once so if u use
        //a number that isnt -1 it will run once and say you have entered +input
        //so you need to put the same lines after while to keep running it
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