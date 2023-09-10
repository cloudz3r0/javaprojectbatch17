package class3;

import java.sql.SQLOutput;

public class E9ElseIfStatement {
    public static void main(String[] args) {
        int day=1;
//!= not equal to sign
        //so basically this chaining if else statements so when you change the value. you print that one
       //so if you change 1 to 4 it will print its thursday instead of monday
        //I guess it's useful to have different prints but only want to print one line
        if(day==1) {
            System.out.println("Its Monday");
        }else if(day==2) {
            System.out.println("Its Tuesday lets not go to work");
        }else if(day==3) {
            System.out.println("Its wednesday");
        }else if(day==4) {
            System.out.println("Its thursday");
        }else if(day==5) {
            System.out.println("Friday");
        }else if(day==6) {
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Wrong day");
      //if you change the days value to 8 for example then it will print wrong day
        }
    }
}
