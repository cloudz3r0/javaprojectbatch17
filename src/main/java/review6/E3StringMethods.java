package review6;

public class E3StringMethods {
    public static void main(String[] args) {
        String str="This is a java class";
       char[] arr= str.toCharArray();//creating an array for the string.
        for(char ch:arr){
            System.out.println(ch);
        }
    }
}
