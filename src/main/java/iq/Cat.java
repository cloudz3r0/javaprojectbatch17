package iq;

public class Cat {
    String name;
    private static Cat catObject;

    private Cat(String name) {//stopped any classes from using this object.
        this.name = name;
    }

    public static Cat getCatObject() {
        if (catObject != null) {
            Cat c = new Cat("Meow");
            return c;
        }else{
            return catObject;
        }
    }

    public static void main(String[] args) {
        System.out.println(Level.LOW);
    }
}
