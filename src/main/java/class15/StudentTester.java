package class15;

import class14.T3ReverseString;

public class StudentTester {
    public static void main(String[] args) {
       new Students("adrian",89.8,90.4,70.5).average();
       new Students("Ava",70.6,80.9,76.7).average();//called method directly
//if we're not using Students t1=new Students(){
        String reverse="";//practicing calling reverseString method from class14
        reverse =T3ReverseString.reverseString("Hello my friend");
        System.out.println(reverse);
    }
}
