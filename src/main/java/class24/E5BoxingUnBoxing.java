package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {
       Integer number=new Integer(10);
       Integer number2=10;//converting primitive to a class
        int d=number2.intValue();//unboxing it into an int value.
        Integer c=10;//shortcut. AutoBoxing.
        int f=c;//now from class datatype to primitive datatype.
        System.out.println(f);
    }
}
