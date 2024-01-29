package review6;

public class E4Replace {
    public static void main(String[] args) {

    //Replace Hello Syntax Friends to Welcome Syntax Family
    String str = "Hello Syntax friends";

    String newString = str.replace("Hello", "Welcome");
    String newString2 = newString.replace("friends", "family");
System.out.println(newString2);
}
}
