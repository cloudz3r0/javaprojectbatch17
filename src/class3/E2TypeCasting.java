package class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        //byte->short->into->long->float->double
//converting float into int value.
        float box1=15.0F;

        int box2;
        box2=(int)box1; //type casting narrowing/explicit/manual
        //same thing. Specify with parentheses to store float value into int
        System.out.println(box2);

        int number=128; //128 is too big for byte. 127 is the max capacity. so if in had 127 it'd work
        byte number2;
        number2=(byte)number;
        System.out.println(number2);
        int number3=450;
        byte number4; //basically dont try to store bigger value boxes into small boxes.Will get a random value
        number4=(byte)number3;
        System.out.println(number4);
        double num1=500.4444;
        long num2;
        num2=(long)num1;
        System.out.println(num2);
    }
}
