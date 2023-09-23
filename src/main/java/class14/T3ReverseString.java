package class14;

public class T3ReverseString {
    /*
    Create a method that will take a String as a parameter
    and returns reverse string. Method should be available to all classes within your project
    and accessible by class name
     */
    public static String reverseString(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
       reverse=reverse+word.charAt(i);
        }
        return reverse;
    }
}
