package class3;

public class E1TypeCasting {
    public static void main(String[] args) {

        long age=12;
       // int myAge=age;
        byte number=10;
        int number2=number;
//get the value of number and store it into number two.
        System.out.println(number2);
        // you can store smaller values into bigger variable boxes
        float num1=15.6F;
        int num2;
        num2=(int)num1;
        //turned the 15.6F into 15 since we forced java to turn into a int value
        System.out.println(num2);
    }
}
