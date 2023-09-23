package class12;

public class T1Methods {
    void greater(int num, int num1) {
        if (num > num1) {
            System.out.println(num + "Is greater than" + num1);
        } else {
            System.out.println(num1 + "Is greater than " + num);
        }
    }
    void even(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    void palindrome(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0; i--) {
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("This word is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }


    }


