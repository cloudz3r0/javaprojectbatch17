package class10;

public class E1StringDemo {
    public static void main(String[] args) {
        //we have created an object from the string class
        //and stored cat inside it.
        String obj=new String("Cat");

        //shortcut to create objs from String class
        String obj2="My Dog"; //String obj2=new String("Dog");
        int len=obj2.length();//tells you how many letters are in your string. Spaces are counted
        System.out.println(len);

    }
}
