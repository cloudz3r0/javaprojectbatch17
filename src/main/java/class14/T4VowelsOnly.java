package class14;

public class T4VowelsOnly {
    /*
    create a method that will accept a string as a parameter
    and return a new String that consists only of vowels.
    Method should be available inside the class only
    where it was declared and executed by calling its name
     */
    private static String getVowels(String word){
     return word.replaceAll("[^aeiouAEIOU]","");//replace all letters that arent vowels
        //with empty space.
//^ basically means instead of replacing whats in the brackets. Instead you replace everything that isnt
        //inside the brackets.
    }

    public static void main(String[] args) {
        String word="HelloUAggyw";
        System.out.println("The original is "+word);
        System.out.println(getVowels(word));
    }
}
