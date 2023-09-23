package class11;

public class T7StringReverseAgain {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */
        String sen="Hello Java is Angry";
        String reverse="";
        System.out.println("Original is "+ sen);
        for (int i = sen.length()-1; i >=0 ; i--) {
            reverse=reverse+sen.charAt(i);
        }
        System.out.println("The reverse is "+reverse);
    }
}
