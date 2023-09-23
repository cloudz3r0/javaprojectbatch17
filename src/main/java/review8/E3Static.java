package review8;

public class E3Static {
    public static final String country="Us";

    void printName(){
        System.out.println(country);
    }
    static void printCountry(){
        System.out.println(country);
    }

    public static void main(String[] args) {
        System.out.println(country);
    }
}
class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3Static.country);
        //can access in a different package by calling class name and variable.
    }
}
