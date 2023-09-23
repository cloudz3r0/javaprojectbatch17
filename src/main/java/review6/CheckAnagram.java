package review6;

import java.util.Arrays;

public class CheckAnagram {
  static  String str1 = "Listen";
   static String str2 = "Silent";
   static boolean anagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

}
class Tester extends CheckAnagram{
    public static void main(String[] args) {
        char word[]= str1.toCharArray();
        char word2[]=str2.toCharArray();
        if(anagram(word,word2)){
            System.out.println("They are anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}