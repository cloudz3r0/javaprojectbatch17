package class11;

public class E11Split {
    public static void main(String[] args) {
        String str = "Hi#There#how#are#you";
        String[] strArr = str.split("[#]");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);
        System.out.println(str.replaceAll("#"," "));//print string without #
    }
}
