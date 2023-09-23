package class17;
/*
Write a program to inherit class E
that has method print F which is static and call it in class F java
 */


public class E {

    static String name="Adrian";
    static void printF() {
        System.out.println("Hello");
    }
}

class F extends E {
    public static void main(String[] args) {

        printF();// since its static no object is needed to be created from inheritance
        System.out.println(name);//able to use static field from parent.

    }
}