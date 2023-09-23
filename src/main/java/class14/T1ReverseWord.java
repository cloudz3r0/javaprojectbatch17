package class14;

public class T1ReverseWord {
    public static void main(String[] args) {
        /*How would you reverse a String word by word? for example
         input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
        */
        StringBuilder str = new StringBuilder("This is the sentence i want to reverse");
        str.reverse();
        System.out.println(str);


        System.out.println("======");

        String sb = "This is the sentence i want to reverse";
        String[] arr = sb.split(" ");
        for (int i = 0; i <= arr.length-1 ; i++) {
String word=arr[i];//this creates the words in array.
String reversed=(reverseSb(word));//this reverses it. From calling from the Static reverseSb
//reverses words but keeps them in same order
            System.out.print(reversed+" ");


        }
        System.out.println();
        String word="Hello my friend";
        String reverse="";
        reverse=reverseSb(word);
        System.out.println(reverse);

    }

    static String reverseSb(String inputStr) {//created the input parameter in (String inputStr)
        String reversed = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;//used return to be able to convert anything with the method into reverse
        //remember without return we would just be printing reverseSb(String);
    }
}









