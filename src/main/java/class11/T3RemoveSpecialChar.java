package class11;

public class T3RemoveSpecialChar {
    public static void main(String[] args) {
       //write a program to remove the special characters.
        String str="Hi There how are you@#@%. I am good. How are you?";
        System.out.println(str.replaceAll("[@#%]",""));
        System.out.println(str.replaceAll("[#-%@]",""));

    }
}
