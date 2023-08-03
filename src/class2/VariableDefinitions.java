package class2;

     /*Name your program practice variables. Create 8 variables to store all different type
     of primitive data.
*/
//Use the recommended variable. Don't use int for small numbers
//use  camelCase for variables.
// PascalCase for class names
public class VariableDefinitions {
    public static void main(String[] args) {
        byte shortNumber=127;
        short  wholeNumber=9999;
        int mostUsedWholeNumber=467252344;
//use short for numbers greater than 127
        long largeNumberBox=1323434355322343352L;
//use L if the number is too long for long
        float mediumDecimalBox= 12532.5F;
        //use F if there's an error or the number is too long
        double largeDecimalBox=1354541.124432;
        char singleCharacterBox='G';
        boolean trueFalseBox=true;
//can reuse the same variable as many times as needed
        //array,string,class,interface
        System.out.println(shortNumber);
        System.out.println(mostUsedWholeNumber);
        System.out.println(wholeNumber);
        System.out.println(largeDecimalBox);
        System.out.println(largeNumberBox);
        System.out.println(mediumDecimalBox);
        System.out.println(singleCharacterBox);
        System.out.println(trueFalseBox);







    }
}
