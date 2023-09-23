package class11;

public class E10StringSplitSimilarToE9 {
    public static void main(String[] args) {


        String str = "Hi There how are you.I am Good. I am driving";
//String [] strs=str.split("[\\s]"); you.I are combined since theres no spaces between them

        String[] strs = str.split("[.\\s]");//makes it so you and I are separated.
        //splits them by each space
        System.out.println(strs.length);
        System.out.println(strs[4]);

    }
}