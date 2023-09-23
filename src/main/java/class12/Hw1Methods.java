package class12;

public class Hw1Methods {
    /*
       Write a method to return whether given number is prime or not?*/
    boolean IsPrime(int num) {

        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        } else if (num % 2 == 00 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i++) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    /*Create  class Student that will have a method getGrade. Your method should accept the score of a student
    and return a grade:
            score > 90 - A
            score >80 - B
            score >70 - C
            score > 50 - D
            anything else - F*/

    char grades(int numb) {
        char result;
        if (numb > 90) {
            result = 'A';
        } else if (numb > 80) {
            result = 'B';
        } else if (numb > 70) {
            result = 'C';
        } else if (numb > 50) {
            result = 'D';

        } else {
            result = 'F';
        }
        return result;
    }


    /*Create a method that will say Hello in different language based
on the country that will passed when method is executed
 */
    void  lang(String country){
        if(country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if(country.equalsIgnoreCase("Spain")){
            System.out.println("Hola");
        }else if(country.equalsIgnoreCase("Mexico")){
            System.out.println("Que onda guey");
        }else if(country.equalsIgnoreCase("France")){
            System.out.println("Bonjour");
        }else{
            System.out.println("Dont know");
        }
    }
}
