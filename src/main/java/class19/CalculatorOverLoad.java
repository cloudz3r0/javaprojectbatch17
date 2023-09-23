package class19;

public class CalculatorOverLoad {

    public void add(int num1, int num2){//we have two whole numbers being asked for here
        System.out.println(1);
        System.out.println(num1+num2);
    }
    public void add(int num1,int num2,int num3){//we have 3 whole numbers being asked for
        System.out.println(2);
        System.out.println(num1+num2+num3);
    }
    public void add(double num1,double num2){//now we have 2 decimals being asked for
        System.out.println(3);
        System.out.println(num1+num2);
    }
    public void add(int num1,double num2){//now we have whole number first then decimal second
        System.out.println(4);
        System.out.println(num1 +num2);
    }
    public void add(double num1,int num2){//decimal first then whole number
        System.out.println(5);
        System.out.println(num1+num2);
    }
}
