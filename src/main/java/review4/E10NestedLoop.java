package review4;

public class E10NestedLoop {
    /*
    Write a program to print out the pattern:
syntax

syntax

syntax

syntax

syntax

syntax
     */
    public static void main(String[] args) {
        int rows=6;

        for (int index = 0; index < rows; index++) {//outerloop creates rows

            for (int j = 0; j < 1; j++) {
                System.out.println("syntax ");//innerloop creates columns, elements.
                //in this case it just prints syntax on each row
            }
            System.out.println();//move to next line after printing syntax once. Create spaces
        }
    }
}
