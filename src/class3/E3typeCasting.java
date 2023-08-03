package class3;

public class E3typeCasting {
    public static void main(String[] args) {

        int number=100;// this works since 100 is in bytes range of numbers
        byte number2;
        number2=(byte)number;
        System.out.println(number2);
        short box1=2000;
        int box2=box1;   //implicit/auto. it will work since the value of short is small. can go into big box

        System.out.println(box2);
    }
}
