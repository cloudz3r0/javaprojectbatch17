package class3;

public class E10ElseIfWithString {
    public static void main(String[] args) {
//similar to the E9ElseIfStatement we can do the same for non primitives data types
        //case sensitiveeee. "apple" != "Apple"
        String fruit="Apple";
        //string is a non-primitive so we cant use == or = sign
        //if(fruit="Mango")cant do this for strings. or == also cant use
        if(fruit.equals("Mango")) { //optimal way
            System.out.println("price is $5");
        }else if(fruit.equals("Orange")) {
            System.out.println("Price is $4");
        }else if(fruit.equals("Apple")) {
            System.out.println("Price is $1000");
        }else if(fruit.equals("Kiwi")) {
            System.out.println("Price is $6");
            // if you have the same name else if with a different print output. It will print the first print
        } else{
            System.out.println("this fruit isn't in stock");

        }
    }
}
