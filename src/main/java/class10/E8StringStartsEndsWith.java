package class10;

public class E8StringStartsEndsWith {
    public static void main(String[] args) {
        String str ="Today is a java class";
        System.out.println(str.startsWith("T"));//boolean. Checks if the word starts with any letter or word
        System.out.println(str.startsWith("Today"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));
    }
}