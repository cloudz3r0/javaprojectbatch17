package class11;

public class T4NoSpacesBothWays {
    public static void main(String[] args) {
      //Create a string with a sentence. Then remove all spaces
        String str="Hello I am Adrian Franco";
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("\\s",""));
    }
}
