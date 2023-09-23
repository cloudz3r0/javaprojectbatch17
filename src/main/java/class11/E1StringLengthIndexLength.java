package class11;

public class E1StringLengthIndexLength {
    public static void main(String[] args) {
      //string length is not the same as index length. String starts at 1. index start at 0
      //these are different ways to write.
        //each letter is in its own spot. 0,1,2,3,4,5,6. This phrase has 16 spots with numbers and spaces.
        String str = "Batch 17 is great.";
        System.out.println(str.charAt(0));//will print whatever letter is in the number in the order.
        System.out.println(str.charAt(4));
        int length=str.length();
        System.out.println(length);
        System.out.println("*****************");
        System.out.println(str.length());//the str.length is 18. -1 will make it 17 and print the .
        //a little confusing but theres 18 characters but the index starts at 0 making it 17 characters
        System.out.println(str.charAt(str.length()-1));//will give us .
        int lastIndex=str.length()-1;//if theres no -1 there will be an error and there wont be a result.
        System.out.println(lastIndex);//gives us index 17 for the length of the string.
        char c=str.charAt(lastIndex);
        System.out.println(c);//will be a . since its the 17th character.
    }
}

