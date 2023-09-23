package class11;

public class E9StringSplit {
    public static void main(String[] args) {
        String str="Hi There how are you.I am Good. I am driving";
     String [] strs=str.split(" ");//makes this string above into a array.
        //splits them by each space
        System.out.println(strs.length);
        System.out.println(strs[9]);

    }
}

