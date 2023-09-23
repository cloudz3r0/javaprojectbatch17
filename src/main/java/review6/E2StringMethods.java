package review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str = "This is a java class";
        boolean starts = str.startsWith("T");//press cntrl Q on method to see that its a boolean
        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("java"));
        str.indexOf('a');
        int num = 'a';//every char/symbol has a number value.
        System.out.println(num);
        System.out.println(str.indexOf(97));//gives us the first a in the string sequence.
        //String.valueOf(12);
        char c=str.charAt(8);
        System.out.println(c);
    }
}
