package class11;

public class T8StringPalindrome {
    public static void main(String[] args) {

        /*
        How would you check if String is palindrome or not? aba=> true
           Abbc =>false
         */
        String str="Tacocat";
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
      reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("This word is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        }
    }

