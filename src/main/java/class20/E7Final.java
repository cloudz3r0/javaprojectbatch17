package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE=10;
        //AGE=20;
        System.out.println(AGE);
    }
}
class Parent{
   final String color="red";

    final void marry(){//final makes the method not overridable.
        System.out.println("take our permission first");
    }
    }
class Child extends Parent {
   /*
    @Override

    void marry() {
        System.out.println("I want to marry someone else");
        */

    }
