package class11;

public class T5DoubleLoopCount {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphabets(abd AZ) characters are there in the String.
         */
        String str="Abudhwhab%^!$#@cmndkHUAgeGYDy";
int count=0;
int count2=0;
        String strUp=str.replaceAll("[a-z%^!%$@#]","");
        for (int i = 0; i <strUp.length() ; i++) {
            count++;
        }
        System.out.println("Number of upper case "+ count);
        String strLow=str.replaceAll("[A-Z^!%$@#]","");
        System.out.println(strUp.length());
        for (int i = 0; i <strLow.length() ; i++) {
            count2++;
        }
        System.out.println("Number of lower case "+ count2);
        System.out.println(strLow.length());

        }



        }






