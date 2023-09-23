package class11;

public class T2ReverseString {
    public static void main(String[] args) {
        String str = "Sunday";
       String reversed="";//this is to store all index values.
        System.out.println("Original is " + str);
        for (int i = str.length()-1; i >= 0; i--) {//index is 5 and the string length is 6. Needs
            //-1 because it will be out of bounds.
            //System.out.print(str.charAt(i)); can use this to print or the bottom one.

            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);
    }//Madina
}