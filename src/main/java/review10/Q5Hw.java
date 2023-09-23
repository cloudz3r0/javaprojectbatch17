package review10;

import java.util.Arrays;

public class Q5Hw {
    public static void main(String[] args) {
        //cat act=>act act
        String s1="Cat";
        String s2="Act";

        char [] c1=s1.toLowerCase().toCharArray();//{c,a,t}
        char [] c2=s2.toLowerCase().toCharArray();//{a,c,t}
        Arrays.sort(c1);//{a,c,t}
        Arrays.sort(c2);//{a,c,t}
       boolean isAnaGram= Arrays.equals(c1,c2);
        if(isAnaGram){
            System.out.println("Is anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
