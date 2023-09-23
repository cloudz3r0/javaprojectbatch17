package class11;

public class T9SwapStrings {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
    String str1="Hello";
    String str2="Hi world";
        System.out.println("Before swap");
        System.out.println(str1);
        System.out.println(str2);
    str1=str1+str2;//HelloWorld
str2=str1.substring(0,str1.length()-str2.length());
str1=str1.substring(str2.length());
        System.out.println("After Swap");
        System.out.println(str1);
        System.out.println(str2);
    }
}
