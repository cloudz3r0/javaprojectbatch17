package class16;

public class T1Tester {
    public static void main(String[] args) {
        new T1(1);//able to call protected in different class same package
        new T1("Hello");//able to call default in different class same package
new T1(20.0);//able to call public in everything
    }
}
