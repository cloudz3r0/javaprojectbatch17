package class11;

import java.util.Scanner;

public class HwConcatPartsOfString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy  If boy first half of fathers name and second half of mothers
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl        If girl. First half of mom and second half of fathers name.
Suggested baby name: MAIEL
 */
        System.out.println("Please enter dads name");
        String dad=input.next();
        System.out.println("Please enter mothers name");
        String mom=input.next();
        System.out.println("Please enter childs Gender");
        String gender=input.next();
String name="";
        if(gender.equalsIgnoreCase("Boy")) {
            name = dad.substring(0, dad.length() / 2) + mom.substring( mom.length() / 2);//so it takes first half of dads name with the 0 in front of it. takes second half of moms name
            //since theres no starting index for it. if there was it'd do the same as the first line.
        }else if(gender.equalsIgnoreCase("Girl")){
name=mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2);
            }else{
            System.out.println("Invalid");

        }
        System.out.println("Childs name is "+name);
}
    }

