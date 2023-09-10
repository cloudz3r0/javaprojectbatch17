package review1;

public class Example {
    public static void main(String[] args) {
        int age,price,noOfFans;
        age=15;
        price=10;
        noOfFans=5;

        String op1=age+" ";
        String op2=op1+price;
        String op3=op2+noOfFans;
        System.out.println(op3);
        System.out.println((age+price)+" "+noOfFans);
        System.out.println(age+price+" "+noOfFans);
        System.out.println(12+""+5*5);
        //the last print concatenates the values to 1225


    }
}
