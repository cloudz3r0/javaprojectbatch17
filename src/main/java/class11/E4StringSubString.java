package class11;

public class E4StringSubString {
    public static void main(String[] args) {
        String str="Batch 17 is A great batch. Just kidding. Please don't take it seriously";
      String firstStr=str.substring(0,4); //first number will be included. But the second number wont be included
        //so this will print Batc.
        String subStr=str.substring(6,25);//specifying the range. use index. Starts at the first number.
        //the 6 spot is a space. So then 1 is the first letter
        //25 is . so w
        System.out.println(subStr);
        String subsubStr=str.substring(25,71);// if i put 70 it will print seriousl
        System.out.println(subsubStr);
    }
}
